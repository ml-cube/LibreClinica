/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.akaza.openclinica.bean.admin.CRFBean;
import org.akaza.openclinica.bean.core.Role;
import org.akaza.openclinica.bean.core.SubjectEventStatus;
import org.akaza.openclinica.bean.login.StudyUserRoleBean;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.bean.managestudy.EventDefinitionCRFBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.bean.managestudy.StudyEventBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.managestudy.StudySubjectBean;
import org.akaza.openclinica.bean.submit.CRFVersionBean;
import org.akaza.openclinica.bean.submit.EventCRFBean;
import org.akaza.openclinica.controller.helper.HelperObject;
import org.akaza.openclinica.controller.helper.ReportLog;
import org.akaza.openclinica.controller.helper.TransferObject;
import org.akaza.openclinica.core.EmailEngine;
import org.akaza.openclinica.core.OpenClinicaMailSender;
import org.akaza.openclinica.dao.admin.AuditDAO;
import org.akaza.openclinica.dao.admin.CRFDAO;
import org.akaza.openclinica.dao.core.CoreResources;
import org.akaza.openclinica.dao.hibernate.CrfVersionDao;
import org.akaza.openclinica.dao.hibernate.EventCrfDao;
import org.akaza.openclinica.dao.hibernate.StudyEventDao;
import org.akaza.openclinica.dao.hibernate.StudySubjectDao;
import org.akaza.openclinica.dao.login.UserAccountDAO;
import org.akaza.openclinica.dao.managestudy.EventDefinitionCRFDAO;
import org.akaza.openclinica.dao.managestudy.StudyDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDefinitionDAO;
import org.akaza.openclinica.dao.managestudy.StudySubjectDAO;
import org.akaza.openclinica.dao.submit.CRFVersionDAO;
import org.akaza.openclinica.dao.submit.EventCRFDAO;
import org.akaza.openclinica.domain.Status;
import org.akaza.openclinica.domain.datamap.CrfVersion;
import org.akaza.openclinica.domain.datamap.EventCrf;
import org.akaza.openclinica.domain.datamap.StudyEvent;
import org.akaza.openclinica.domain.datamap.StudySubject;
import org.akaza.openclinica.exception.OpenClinicaSystemException;
import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.apache.commons.io.IOUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BatchCRFMigrationController implements Runnable {

    @Autowired
    private DataSource dataSource;

    @Autowired
    OpenClinicaMailSender openClinicaMailSender;

    @Autowired
    private EventCrfDao eventCrfDao;

    @Autowired
    private StudySubjectDao studySubjectDao;

    @Autowired
    private StudyEventDao studyEventDao;

    @Autowired
    private CrfVersionDao crfVersionDao;

    @Autowired
    private SessionFactory sessionFactory;

    private HelperObject helperObject;

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    ResourceBundle resterms;
    ReportLog reportLog;
    StudyBean stBean;
    CRFBean cBean;
    UserAccountBean userAccountBean;

    public BatchCRFMigrationController() {
        super();
    }

    public BatchCRFMigrationController(HelperObject helperObject) {
        this.helperObject = helperObject;
    }

    @RequestMapping(value = "/forms/migrate/{filename}/downloadLogFile")
    public void getLogFile(@PathVariable("filename") String fileName, HttpServletResponse response) throws Exception {

        String batchFormMigrationRelDir = getFilePath() + File.separator;
        File fileToDownload = getFile(fileName, batchFormMigrationRelDir);

        if (fileToDownload != null && fileToDownload.exists()) {
            try (InputStream inputStream = Files.newInputStream(fileToDownload.toPath())) {
                response.setContentType("application/force-download");
                response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
                IOUtils.copy(inputStream, response.getOutputStream());
                response.flushBuffer();
            } catch (Exception e) {
                logger.debug("Request could not be completed at this moment. Please try again.", e);
                throw e;
            }
        }
    }

    /**
     * @api {post} /pages/auth/api/v1/forms/migrate/run/ Batch CRF Version Migration Run
     * @apiName runAuthMigration
     * @apiPermission Authenticate using api-key. admin
     * @apiVersion 3.8.0
     * @apiParam {String} studyOID is the Target Study OID.
     * @apiParam {String} sourceFormVersion Form Version OID From.
     * @apiParam {String} targetFormVersion Form Version OID To.
     * @apiParam {String} studyEventDefs List Of Event Definitions , when left blank, implies all events within
     *           target study.
     * @apiParam {String} sites List Of Sites , when left blank, implies all sites including target study
     * @apiGroup Form
     * @apiDescription This api will execute crf version migration and return an email with link of a file that include
     *                 details of the transaction.
     * @apiParamExample {json} Request-Example:
     *                  {
     *                  "studyOID" : "S_BL101" ,
     *                  "sourceFormVersion" : "F_GROUPS_ADVER_V221" ,
     *                  "targetFormVersion" : "F_GROUPS_ADVER_V22" ,
     *                  "studyEventDefs" : [] ,
     *                  "sites" : []
     *                  }
     * 
     * @apiErrorExample {json} Error-Response:
     *                  HTTP/1.1 406 NOT ACCEPTABLE
     *                  {
     *                  "errors": ["Current CRF version and New CRF version can not be same."],
     *                  "reportPreview": null,
     *                  "subjectCount": 0,
     *                  "eventCrfCount": 0,
     *                  "canNotMigrate": [],
     *                  "logs": []
     *                  }
     * 
     * @apiSuccessExample {json} Success-Response:
     *                    HTTP/1.1 200 OK
     *                    {
     *                    "errors": [],
     *                    "reportPreview":
     *                    "Batch CRF version migration is running. You will receive an email once the process is complete"
     *                    ,
     *                    "subjectCount": 8,
     *                    "eventCrfCount": 12,
     *                    "canNotMigrate": [],
     *                    "logs": []
     *                    }
     */

    @Produces(MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/auth/api/v1/forms/migrate/run", method = RequestMethod.POST)
    public ResponseEntity<ReportLog> runAuthMigration(@RequestBody TransferObject transferObject, HttpServletRequest request) throws Exception {

        ResponseEntity<HelperObject> res = runPreviewTest(transferObject, request);
        HelperObject helperObject = res.getBody();
        helperObject.setRequest(request);
        fillHelperObject(helperObject);
        ReportLog reportLog = helperObject.getReportLog();

        String str = "";
        if (reportLog.getSubjectCount() != 0 && reportLog.getEventCrfCount() != 0 && reportLog.getErrors().size() == 0) {
            BatchCRFMigrationController bcmController = new BatchCRFMigrationController(helperObject);
            Thread thread = new Thread(bcmController);
            thread.start();
            str = resterms.getString("Batch_CRF_version_migration_is_running_You_will_receive_an_email_once_the_process_is_complete");
            reportLog.setReportPreview(str);
            return new ResponseEntity<ReportLog>(reportLog, org.springframework.http.HttpStatus.OK);
        } else if (reportLog.getErrors().size() > 0) {
            return new ResponseEntity<ReportLog>(reportLog, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        } else {
            str = resterms.getString("Migration_did_not_run_due_to_no_affected_subject");
            reportLog.setReportPreview(str);
            return new ResponseEntity<ReportLog>(reportLog, org.springframework.http.HttpStatus.OK);
        }
    }

    @Produces(MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/api/v1/forms/migrate/run", method = RequestMethod.POST)
    public @ResponseBody String runMigration(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TransferObject transferObject = getUIComponents(request);
        String crfId = request.getParameter("crfId");

        ResponseEntity<HelperObject> res = runPreviewTest(transferObject, request);
        HelperObject helperObject = res.getBody();
        fillHelperObject(helperObject);
        helperObject.setRequest(request);
        ReportLog reportLog = helperObject.getReportLog();

        String pageMessages = null;
        if (reportLog.getSubjectCount() != 0 && reportLog.getEventCrfCount() != 0 && reportLog.getErrors().size() == 0) {
            BatchCRFMigrationController bcmController = new BatchCRFMigrationController(helperObject);
            Thread thread = new Thread(bcmController);
            thread.start();

            pageMessages = resterms.getString("Batch_CRF_version_migration_is_running_You_will_receive_an_email_once_the_process_is_complete");
            return (String) redirect(request, response, "/ListCRF?module=manage" + "&isFromCRFVersionBatchChange=" + pageMessages);
        } else {
            pageMessages = resterms.getString("Error_in_Running_Migration_Please_try_again");
            return (String) redirect(request, response, "/BatchCRFMigration?module=manage&crfId=" + crfId + "&isFromCRFVersionBatchChange=" + pageMessages);
        }
    }

    /**
     * @api {post} /pages/auth/api/v1/forms/migrate/preview Batch CRF Version Migration Preview
     * @apiName runAuthPreview
     * @apiPermission Authenticate using api-key. admin
     * @apiVersion 3.8.0
     * @apiParam {String} studyOID is the Target Study OID.
     * @apiParam {String} sourceFormVersion Form Version OID From.
     * @apiParam {String} targetFormVersion Form Version OID To.
     * @apiParam {String} studyEventDefs List Of Event Definitions , when left blank, implies all events within
     *           target study.
     * @apiParam {String} sites List Of Sites , when left blank, implies all sites including target study
     * @apiGroup Form
     * @apiDescription This api is a summary report for crf version migration and returns json object of report log.
     * @apiParamExample {json} Request-Example:
     *                  {
     *                  "studyOID" : "S_BL101" ,
     *                  "sourceFormVersion" : "F_GROUPS_ADVER_V221" ,
     *                  "targetFormVersion" : "F_GROUPS_ADVER_V22" ,
     *                  "studyEventDefs" : [] ,
     *                  "sites" : []
     *                  }
     * 
     * @apiErrorExample {json} Error-Response:
     *                  HTTP/1.1 406 NOT ACCEPTABLE
     *                  {
     *                  "errors": ["The OID of the Target Study that you provided is invalid."],
     *                  "reportPreview": null,
     *                  "subjectCount": 0,
     *                  "eventCrfCount": 0,
     *                  "canNotMigrate": [],
     *                  "logs": []
     *                  }
     * 
     * @apiSuccessExample {json} Success-Response:
     *                    HTTP/1.1 200 OK
     *                    {
     *                    "errors": [],
     *                    "reportPreview": null,
     *                    "subjectCount": 8,
     *                    "eventCrfCount": 12,
     *                    "canNotMigrate": [],
     *                    "logs": []
     *                    }
     */
    @Produces(MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/auth/api/v1/forms/migrate/preview", method = RequestMethod.POST)
    public ResponseEntity<ReportLog> runAuthPreview(@RequestBody TransferObject transferObject, HttpServletRequest request) throws Exception {

        ResponseEntity<HelperObject> res = runPreviewTest(transferObject, request);
        HelperObject helperObject = res.getBody();

        return new ResponseEntity<ReportLog>(helperObject.getReportLog(), org.springframework.http.HttpStatus.OK);
    }

    @Produces(MediaType.APPLICATION_JSON)
    @RequestMapping(value = "/api/v1/forms/migrate/preview", method = RequestMethod.POST)
    public @ResponseBody ReportLog runPreview(HttpServletRequest request, HttpServletResponse response) throws Exception {
        TransferObject transferObject = getUIComponents(request);

        ResponseEntity<HelperObject> res = runPreviewTest(transferObject, request);
        HelperObject helperObject = res.getBody();
        helperObject.getReportLog().setReportPreview(toStringHtmlFormat(helperObject.getReportLog(), resterms));
        return helperObject.getReportLog();
    }

    public void executeMigrationAction(HelperObject helperObject, EventCRFBean eventCRFBean) {
        Session session = helperObject.getSession();

        EventCrf eventCrf = helperObject.getEventCrfDao().findById(eventCRFBean.getId());
        StudyEvent studyEvent = helperObject.getStudyEventDao().findById(eventCRFBean.getStudyEventId());
        CrfVersion crfVersion = helperObject.getCrfVersionDao().findById(helperObject.getTargetCrfVersionBean().getId());
        StudySubject studySubject = helperObject.getStudySubjectDao().findById(eventCRFBean.getStudySubjectId());

        eventCrf.setSdvStatus(false);
        eventCrf.setDateUpdated(new Date());
        eventCrf.setSdvUpdateId(helperObject.getUserAccountBean().getId());
        eventCrf.setUpdateId(helperObject.getUserAccountBean().getId());
        eventCrf.setCrfVersion(crfVersion);
        session.saveOrUpdate(eventCrf);

        String status_before_update = null;
        SubjectEventStatus eventStatus = null;

        // event signed, check if subject is signed as well

        if (studySubject.getStatus() == Status.SIGNED) {
            status_before_update = auditDao().findLastStatus("study_subject", studySubject.getStudySubjectId(), "8");
            if (status_before_update != null && status_before_update.length() == 1) {
                int subject_status = Integer.parseInt(status_before_update);
                Status status = Status.getByCode(subject_status);
                studySubject.setStatus(status);
            }
            studySubject.setUpdateId(helperObject.getUserAccountBean().getId());
            session.saveOrUpdate(studySubject);

        }

        studyEvent.setUpdateId(helperObject.getUserAccountBean().getId());
        studyEvent.setDateUpdated(new Date());

        status_before_update = auditDao().findLastStatus("study_event", studyEvent.getStudyEventId(), "8");
        if (status_before_update != null && status_before_update.length() == 1) {
            int status = Integer.parseInt(status_before_update);
            eventStatus = SubjectEventStatus.get(status);
            studyEvent.setSubjectEventStatusId(eventStatus.getId());
        }

        session.saveOrUpdate(studyEvent);
    }

    public ResponseEntity<HelperObject> runPreviewTest(TransferObject transferObject, HttpServletRequest request) throws Exception {
        HelperObject helperObject = new HelperObject();

        Locale locale = request.getLocale();
        resterms = ResourceBundleProvider.getTermsBundle(locale);
        UserAccountBean userAccountBean = getCurrentUser(request);
        ReportLog reportLog = new ReportLog();

        String studyOid = transferObject.getStudyOID();
        String sourceCrfVersion = transferObject.getSourceFormVersion();
        String targetCrfVersion = transferObject.getTargetFormVersion();
        ArrayList<String> studyEventDefnlist = transferObject.getStudyEventDefs();
        ArrayList<String> studyEventDefnlistFiltered = new ArrayList<>();
        ArrayList<String> sitelist = transferObject.getSites();
        ArrayList<String> sitelistFiltered = new ArrayList<>();

        CRFVersionBean sourceCrfVersionBean = cvdao().findByOid(sourceCrfVersion);
        CRFVersionBean targetCrfVersionBean = cvdao().findByOid(targetCrfVersion);

        StudyBean stBean = sdao().findByOid(studyOid);
		if (stBean == null || !stBean.getStatus().isAvailable() || stBean.getParentStudyId() != 0) {
            reportLog.getErrors().add(resterms.getString("The_OID_of_the_Target_Study_that_you_provided_is_invalid"));
            helperObject.setReportLog(reportLog);
            return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        }
        StudyUserRoleBean suRole = uadao().findRoleByUserNameAndStudyId(userAccountBean.getName(), stBean.getId());
        Role r = suRole.getRole();
        if (!suRole.isActive() || !(r.equals(Role.STUDYDIRECTOR) || r.equals(Role.COORDINATOR))) {
            reportLog.getErrors().add(resterms.getString("You_do_not_have_permission_to_perform_CRF_version_migration_in_this_study"));
            helperObject.setReportLog(reportLog);
            return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        }
        if (sourceCrfVersionBean == null || targetCrfVersionBean == null) {
            if (sourceCrfVersion.equals("-1") || targetCrfVersion.equals("-1")) {
                reportLog.getErrors().add(resterms.getString("Current_CRF_version_and_New_CRF_version_should_be_selected"));
            } else {
                reportLog.getErrors().add(resterms.getString("The_OID_of_the_CRF_Version_that_you_provided_is_invalid"));
            }
            helperObject.setReportLog(reportLog);
            return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        }
        if (sourceCrfVersionBean.getId() == targetCrfVersionBean.getId()) {
            reportLog.getErrors().add(resterms.getString("Current_CRF_version_and_New_CRF_version_can_not_be_same"));
            helperObject.setReportLog(reportLog);
            return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        }
		if (sourceCrfVersionBean.getCrfId() != targetCrfVersionBean.getCrfId() || !sourceCrfVersionBean.getStatus().isAvailable() || !targetCrfVersionBean.getStatus().isAvailable()) {
            reportLog.getErrors().add(resterms.getString("The_OID_of_the_CRF_Version_that_you_provided_is_invalid"));
            helperObject.setReportLog(reportLog);
            return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
        }

        CRFBean cBean = cdao().findByPK(sourceCrfVersionBean.getCrfId());

        if (sitelist.size() == 0) {
            ArrayList<StudyBean> listOfSites = sdao().findAllByParent(stBean.getId());
            sitelist.add(stBean.getOid());
            for (StudyBean s : listOfSites) {
                if (s.getStatus().isAvailable()) {
                    sitelist.add(s.getOid());
                }
            }
        } else {
            for (String site : sitelist) {
                StudyBean siteBean = sdao().findByOid(site.trim());
                if (siteBean == null || getParentStudy(siteBean).getId() != stBean.getId()) {
                    reportLog.getErrors().add(resterms.getString("The_OID_of_the_Site_that_you_provided_is_invalid"));
                    helperObject.setReportLog(reportLog);
                    return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
                } else if (siteBean.getStatus().isAvailable()) {
                    sitelistFiltered.add(site);
                }
            }
            sitelist = sitelistFiltered;
        }

        if (studyEventDefnlist.size() == 0) {
            ArrayList<StudyEventDefinitionBean> listOfDefn = seddao().findAllByStudy(stBean);
            for (StudyEventDefinitionBean d : listOfDefn) {
                if (d.getStatus().isAvailable()) {
                    studyEventDefnlist.add(d.getOid());
                }
            }
        } else {
            for (String studyEventDefn : studyEventDefnlist) {
                StudyEventDefinitionBean sedefnBean = seddao().findByOid(studyEventDefn);
                if (sedefnBean == null || sedefnBean.getStudyId() != stBean.getId()) {
                    reportLog.getErrors().add(resterms.getString("The_OID_of_the_Event_that_you_provided_is_invalid"));
                    helperObject.setReportLog(reportLog);
                    return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.NOT_ACCEPTABLE);
                } else if (sedefnBean.getStatus().isAvailable()) {
                    studyEventDefnlistFiltered.add(studyEventDefn);
                }
            }
            studyEventDefnlist = studyEventDefnlistFiltered;

        }

        int eventCrfCount = ssdao().getTotalEventCrfCountForCrfMigration(sourceCrfVersionBean, targetCrfVersionBean, studyEventDefnlist, sitelist);
        reportLog.setEventCrfCount(eventCrfCount);

        int subjectCount = ssdao().getTotalCountStudySubjectForCrfMigration(sourceCrfVersionBean, targetCrfVersionBean, studyEventDefnlist, sitelist);
        reportLog.setSubjectCount(subjectCount);

        List<EventDefinitionCRFBean> crfMigrationDoesNotPerformList = edcdao().findAllCrfMigrationDoesNotPerform(sourceCrfVersionBean, targetCrfVersionBean,
                studyEventDefnlist, sitelist);
        for (EventDefinitionCRFBean crfMigrationDoesNotPerform : crfMigrationDoesNotPerformList) {
            StudyEventDefinitionBean seddBean = seddao().findByPK(crfMigrationDoesNotPerform.getStudyEventDefinitionId());
            StudyBean sssBean = sdao().findByPK(crfMigrationDoesNotPerform.getStudyId());
            reportLog.getCanNotMigrate().add(
                    resterms.getString("CRF_Version_Migration_cannot_be_performed_for") + " " + sssBean.getName() + " " + seddBean.getName() + ". "
                            + resterms.getString("Both_CRF_versions_are_not_available_at_the_Site"));
        }

        List<EventCRFBean> eventCrfListToMigrate = ecdao().findAllCRFMigrationReportList(sourceCrfVersionBean, targetCrfVersionBean, studyEventDefnlist,
                sitelist);

        helperObject.setReportLog(reportLog);
        helperObject.setStBean(stBean);
        helperObject.setcBean(cBean);
        helperObject.setEventCrfListToMigrate(eventCrfListToMigrate);
        helperObject.setSourceCrfVersionBean(sourceCrfVersionBean);
        helperObject.setTargetCrfVersionBean(targetCrfVersionBean);
        helperObject.setUserAccountBean(userAccountBean);

        return new ResponseEntity<HelperObject>(helperObject, org.springframework.http.HttpStatus.OK);

    }

    private StudyBean getParentStudy(StudyBean study) {
        if (study.getParentStudyId() == 0) {
            return study;
        } else {
            return sdao().findByPK(study.getParentStudyId());
        }
    }

    private StudyDAO sdao() {
        return new StudyDAO(dataSource);
    }

    private EventCRFDAO ecdao() {
        return new EventCRFDAO(dataSource);
    }

    private StudyEventDAO sedao() {
        return new StudyEventDAO(dataSource);
    }

    private StudyEventDefinitionDAO seddao() {
        return new StudyEventDefinitionDAO(dataSource);
    }

    private StudySubjectDAO ssdao() {
        return new StudySubjectDAO(dataSource);
    }

    private EventDefinitionCRFDAO edcdao() {
        return new EventDefinitionCRFDAO(dataSource);
    }

    private UserAccountDAO uadao() {
        return new UserAccountDAO(dataSource);
    }

    private CRFDAO cdao() {
        return new CRFDAO(dataSource);
    }

    private CRFVersionDAO cvdao() {
        return new CRFVersionDAO(dataSource);
    }

    private AuditDAO auditDao() {
        return new AuditDAO(dataSource);
    }

    private UserAccountBean getCurrentUser(HttpServletRequest request) {
        return (UserAccountBean) request.getSession().getAttribute("userBean");
    }

    private File createLogFile(String fileName) {
        new File(getFilePath()).mkdir();
        String logFileName = getFilePath() + File.separator + fileName;
        return new File(logFileName);
    }

    private String getFilePath() {
        return CoreResources.getField("filePath") + "crf_version_migration_batch_log_file";
    }

    private File getFile(String fileName, String relDirectory) {

        String basePath = getFilePath();

        String normalisedFilePath = Paths.get(relDirectory + fileName).normalize().toString();

        File file = new File(basePath, normalisedFilePath);
        try {
            if (file.getCanonicalPath().startsWith(basePath)) {
                return file;
            } else {
                return null;
            }
        } catch (IOException e) {
            logger.debug(e.getMessage(), e);
            throw new OpenClinicaSystemException("Unable to read file", e);
        }
    }

    private PrintWriter openFile(File file) throws FileNotFoundException, UnsupportedEncodingException {
        return new PrintWriter(file.getPath(), "UTF-8");
    }

    private void closeFile(PrintWriter writer) {
        writer.close();
    }

    private String getReportUrl(String filename, String urlBase) {
        return urlBase + "/pages/forms/migrate/" + filename + "/downloadLogFile";
    }

    public TransferObject getUIComponents(HttpServletRequest request) {

        String selectedSites = request.getParameter("selectedSites");
        String selectedEvents = request.getParameter("selectedEvents");

        List<String> selectedSiteList = Arrays.asList(selectedSites.split(","));
        List<String> selectedEventList = Arrays.asList(selectedEvents.split(","));
        ArrayList<String> selectedSiteArrayList = new ArrayList<>(selectedSiteList);
        ArrayList<String> selectedEventArrayList = new ArrayList<>(selectedEventList);

        if (selectedSiteArrayList.contains("-1")) {
            selectedSiteArrayList.clear();
        }
        if (selectedEventArrayList.contains("-1")) {
            selectedEventArrayList.clear();
        }

        TransferObject transferObject = new TransferObject();
        transferObject.setSites(selectedSiteArrayList);
        transferObject.setStudyEventDefs(selectedEventArrayList);
        transferObject.setSourceFormVersion(request.getParameter("selectedSourceVersion"));
        transferObject.setTargetFormVersion(request.getParameter("selectedTargetVersion"));
        transferObject.setStudyOID(request.getParameter("studyOid"));

        return transferObject;
    }

    public String toStringTextFormat(ReportLog reportLog, ResourceBundle resterms, StudyBean stBean, CRFBean cBean) {

        StringBuffer text1 = new StringBuffer();
        for (String migrationPerform : reportLog.getCanNotMigrate()) {
            text1.append(migrationPerform).append('\n');
        }
        StringBuffer text2 = new StringBuffer();
        for (String error : reportLog.getErrors()) {
            text2.append(error).append('\n');
        }

        StringBuffer text3 = new StringBuffer();
        for (String log : reportLog.getLogs()) {
            text3.append(log).append('\n');
        }
        StringBuilder sb = new StringBuilder();
        sb.append(resterms.getString("Study") + ": " + stBean.getName() + "\n");
        sb.append(resterms.getString("CRF") + ": " + cBean.getName() + "\n\n");
        sb.append(resterms.getString("Migration_Summary") + ":\n" + resterms.getString("Number_of_Subjects_affected_by_migration") + ": "
                + reportLog.getSubjectCount() + "\n");
        sb.append(resterms.getString("Number_of_Event_CRF_affected_by_migration") + ": " + reportLog.getEventCrfCount() + "\n");
        sb.append(text1 + "\n");


        if (reportLog.getErrors().size() != 0) {
            sb.append(resterms.getString("Errors") + ":\n" + text2 + "\n");
        }
        sb.append(resterms.getString("Report_Log") + ":\n"
                + resterms.getString("CRF_Name__Origin_Version__Target_Version__Subject_ID__Site__Event__Event_Ordinal") + "\n" + text3);
        return sb.toString();
    }

    public String toStringHtmlFormat(ReportLog reportLog, ResourceBundle resterms) {

        StringBuffer text1 = new StringBuffer();
        for (String migrationPerform : reportLog.getCanNotMigrate()) {
            text1.append(migrationPerform).append("<br>");
        }
        StringBuffer text2 = new StringBuffer();
        for (String error : reportLog.getErrors()) {
            text2.append(error).append("<br>");
        }

        StringBuffer text3 = new StringBuffer();
        for (String log : reportLog.getLogs()) {
            text3.append(log).append("<br>");
        }
        StringBuilder sb = new StringBuilder();

        sb.append("<br>");
        if (reportLog.getErrors().size() == 0) {
            sb.append("<font size=\"3\" color=\"#D4A718\"><b>");
            sb.append(resterms.getString("Migration_Summary") + ":");
            sb.append("</b></font>");
            sb.append("<br>");
            sb.append("<br>");

            sb.append(resterms.getString("Number_of_Subjects_to_be_affected_by_migration") + ": " + reportLog.getSubjectCount() + "<br>");
            sb.append(resterms.getString("Number_of_Event_CRF_to_be_affected_by_migration") + ": " + reportLog.getEventCrfCount() + "<br>");
            sb.append("<br>");
            sb.append(text1 + "<br>");
        }

        if (reportLog.getErrors().size() != 0) {
            sb.append("<font size=\"3\" color=\"#D4A718\" ><b>");
            sb.append(resterms.getString("Errors") + ":");
            sb.append("</b></font>");
            sb.append("<br>");

            sb.append("<font color=\"red\"><b>");
            sb.append(text2);
            sb.append("</b></font>");
            sb.append("<br>");
        }

        return sb.toString();
    }

    private Object redirect(HttpServletRequest request, HttpServletResponse response, String location) {
        try {
            response.sendRedirect(request.getContextPath() + location);
        } catch (Exception e) {
            logger.debug(Arrays.toString(e.getStackTrace()));
        }

        return null;
    }

    @Override
    public void run() {
        dataSource = helperObject.getDataSource();
        cBean = helperObject.getcBean();
        reportLog = helperObject.getReportLog();
        stBean = helperObject.getStBean();
        resterms = helperObject.getResterms();
        userAccountBean = helperObject.getUserAccountBean();
        openClinicaMailSender = helperObject.getOpenClinicaMailSender();
        sessionFactory = helperObject.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        helperObject.setSession(session);
        int i = 0;
        for (EventCRFBean eventCrfToMigrate : helperObject.getEventCrfListToMigrate()) {
            i++;
            executeMigrationAction(helperObject, eventCrfToMigrate);

            if (i % 50 == 0) {
                session.flush();
                session.clear();
            }

            StudySubjectBean ssBean = ssdao().findByPK(eventCrfToMigrate.getStudySubjectId());
            StudyBean sBean = sdao().findByPK(ssBean.getStudyId());
            StudyEventBean seBean = sedao().findByPK(eventCrfToMigrate.getStudyEventId());
            StudyEventDefinitionBean sedBean = seddao().findByPK(seBean.getStudyEventDefinitionId());
            reportLog.getLogs().add(
                    cBean.getName() + "," + helperObject.getSourceCrfVersionBean().getName() + "," + helperObject.getTargetCrfVersionBean().getName() + ","
                            + ssBean.getLabel() + ","
                            + sBean.getName() + "," + sedBean.getName() + "," + seBean.getSampleOrdinal());
        }
        tx.commit();
        session.close();

        String fileName = new SimpleDateFormat("_yyyy-MM-dd-hhmmssSaa'.txt'").format(new Date());
        fileName = "logFile" + fileName;
        File file = createLogFile(fileName);
        PrintWriter writer = null;
        try {
            writer = openFile(file);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            logger.error("Error in creating file for logging report: ", e);
        } finally {
            writer.print(toStringTextFormat(reportLog, resterms, stBean, cBean));
            closeFile(writer);
        }
        String reportUrl = getReportUrl(fileName, helperObject.getUrlBase());
        String fullName = userAccountBean.getFirstName() + " " + userAccountBean.getLastName();
        StringBuilder body = new StringBuilder();
        body.append(resterms.getString("Dear") + " " + fullName + ",<br><br>" + resterms.getString("Batch_CRF_version_migration_has_finished_running") + "<br>"
                + resterms.getString("Study") + ": " + stBean.getName() + "<br>" + resterms.getString("CRF") + ": " + cBean.getName() + "<br><br>"
                + resterms.getString("A_summary_report_of_the_migration_is_available_here") + ":<br>" + reportUrl + "<br><br>"
                + resterms.getString("Thank_you_Your_OpenClinica_System"));

        logger.info(body.toString());
        openClinicaMailSender.sendEmail(userAccountBean.getEmail(), EmailEngine.getAdminEmail(), resterms.getString("Batch_Migration_Complete_For") + " "
                + stBean.getName(), body.toString(), true);
    }

    public void fillHelperObject(HelperObject helperObject) {
       helperObject.setUrlBase(CoreResources.getField("sysURL").split("/MainMenu")[0]);
       helperObject.setOpenClinicaMailSender(openClinicaMailSender);
       helperObject.setDataSource(dataSource);
       helperObject.setResterms(resterms);
       helperObject.setEventCrfDao(eventCrfDao);
       helperObject.setStudyEventDao(studyEventDao);
       helperObject.setStudySubjectDao(studySubjectDao);
       helperObject.setCrfVersionDao(crfVersionDao);
       helperObject.setSessionFactory(sessionFactory);
   }

}
