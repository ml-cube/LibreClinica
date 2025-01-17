/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.akaza.openclinica.bean.core.Role;
import org.akaza.openclinica.bean.extract.DatasetBean;
import org.akaza.openclinica.bean.extract.ExtractPropertyBean;
import org.akaza.openclinica.bean.login.StudyUserRoleBean;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.dao.core.CoreResources;
import org.akaza.openclinica.dao.extract.DatasetDAO;
import org.akaza.openclinica.i18n.core.LocaleResolver;
import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.akaza.openclinica.service.extract.ExtractUtils;
import org.akaza.openclinica.service.extract.XsltTriggerService;
import org.akaza.openclinica.web.SQLInitServlet;
import org.apache.commons.dbcp.BasicDataSource;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("extractController")
@RequestMapping("/extract")
public class ExtractController {
    @Autowired
    @Qualifier("sidebarInit")
    private SidebarInit sidebarInit;

    @Autowired
    @Qualifier("dataSource")
    private BasicDataSource dataSource;

    private DatasetDAO datasetDao;

    @Autowired
    private Scheduler scheduler;

    public static String TRIGGER_GROUP_NAME = "XsltTriggers";
    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    public ExtractController() {

    }

    /**
     * process the page from whence you came, i.e. extract a dataset
     * @param id, the id of the extract properties bean, gained from Core Resources
     * @param datasetId, the id of the dataset, found through DatasetDAO
     * @param request, http request
     * @return model map, but more importantly, creates a quartz job which runs right away and generates all output there
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelMap processSubmit(@RequestParam("id") String id,
                                  @RequestParam("datasetId") String datasetId, HttpServletRequest request, HttpServletResponse response) {
        if(!mayProceed(request)) {
            try {
                response.sendRedirect(request.getContextPath() + "/MainMenu?message=authentication_failed");
            } catch (Exception e) {
                logger.error("Error in redirecting the response: ", e);
            }
            return null;
        }

        ModelMap map = new ModelMap();
        ResourceBundleProvider.updateLocale(LocaleResolver.getLocale(request));
        // String datasetId = (String)request.getAttribute("datasetId");
        // String id = (String)request.getAttribute("id");
        logger.debug("found both id " + id + " and dataset " + datasetId);
        ExtractUtils extractUtils = new ExtractUtils();
        // get extract id
        // get dataset id
        // if id is a number and dataset id is a number ...
        datasetDao = new DatasetDAO(dataSource);
        UserAccountBean userBean = (UserAccountBean) request.getSession().getAttribute("userBean");
        CoreResources cr =  new CoreResources();

        ExtractPropertyBean epBean = cr.findExtractPropertyBeanById(new Integer(id).intValue(),datasetId);

        DatasetBean dsBean = (DatasetBean)datasetDao.findByPK(new Integer(datasetId).intValue());
        // set the job in motion
        String[] files = epBean.getFileName();
        String exportFileName;
        int  cnt = 0;
        JobDetailFactoryBean jobDetailBean = new JobDetailFactoryBean();
        SimpleTrigger simpleTrigger = null;
        //TODO: if files and export names size is not same... throw an error
        dsBean.setName(dsBean.getName().replaceAll(" ", "_"));
    	String[] exportFiles= epBean.getExportFileName();
    	 String pattern = "yyyy" + File.separator + "MM" + File.separator + "dd" + File.separator + "HHmmssSSS" + File.separator;
         SimpleDateFormat sdfDir = new SimpleDateFormat(pattern);
    	int i =0;
    	String[] temp = new String[exportFiles.length];
    	//JN: The following logic is for comma separated variables, to avoid the second file be treated as a old file and deleted.
    	while(i<exportFiles.length)
    	{
    		temp[i] = resolveVars(exportFiles[i],dsBean,sdfDir, SQLInitServlet.getField("filePath"), extractUtils);
    		i++;
    	}
    	epBean.setDoNotDelFiles(temp);
    	epBean.setExportFileName(temp);

        XsltTriggerService xsltService = new XsltTriggerService();

        // TODO get a user bean somehow?
        String generalFileDir = SQLInitServlet.getField("filePath");

        generalFileDir = generalFileDir + "datasets" + File.separator + dsBean.getId() + File.separator + sdfDir.format(new java.util.Date());

        exportFileName = epBean.getExportFileName()[cnt];


        // need to set the dataset path here, tbh
        logger.debug("found odm xml file path " + generalFileDir);
        // next, can already run jobs, translations, and then add a message to be notified later
        //JN all the properties need to have the variables...
        String xsltPath = SQLInitServlet.getField("filePath") + "xslt" + File.separator +files[cnt];
        String endFilePath = epBean.getFileLocation();
        endFilePath  = getEndFilePath(endFilePath,dsBean,sdfDir, SQLInitServlet.getField("filePath"), extractUtils);
      //  exportFileName = resolveVars(exportFileName,dsBean,sdfDir);
        if(epBean.getPostProcExportName()!=null)
        {
        	//String preProcExportPathName = getEndFilePath(epBean.getPostProcExportName(),dsBean,sdfDir);
        	String preProcExportPathName = resolveVars(epBean.getPostProcExportName(),dsBean,sdfDir, SQLInitServlet.getField("filePath"), extractUtils);
        	epBean.setPostProcExportName(preProcExportPathName);
        }
        if(epBean.getPostProcLocation()!=null)
        {
        	String prePocLoc = getEndFilePath(epBean.getPostProcLocation(),dsBean,sdfDir, SQLInitServlet.getField("filePath"), extractUtils);
        	epBean.setPostProcLocation(prePocLoc);
        }
        setAllProps(epBean,dsBean,sdfDir, extractUtils);
        // also need to add the status fields discussed w/ cc:
        // result code, user message, optional URL, archive message, log file message
        // asdf table: sort most recent at top
        logger.debug("found xslt file name " + xsltPath);

        // String xmlFilePath = generalFileDir + ODMXMLFileName;
         simpleTrigger = xsltService.generateXsltTrigger(xsltPath,
        		 generalFileDir, // xml_file_path
                endFilePath + File.separator,
                exportFileName,
                dsBean.getId(),
                epBean, userBean, LocaleResolver.getLocale(request).getLanguage(),cnt,  SQLInitServlet.getField("filePath") + "xslt",TRIGGER_GROUP_NAME);
        // System.out.println("just set locale: " + LocaleResolver.getLocale(request).getLanguage());

        cnt++;
        jobDetailBean = new JobDetailFactoryBean();
        jobDetailBean.setGroup(TRIGGER_GROUP_NAME);
        jobDetailBean.setName(simpleTrigger.getKey().getName()+System.currentTimeMillis());
        jobDetailBean.setJobClass(org.akaza.openclinica.job.XsltStatefulJob.class);
        jobDetailBean.setJobDataMap(simpleTrigger.getJobDataMap());
        jobDetailBean.setDurability(true); // need durability? YES - we will want to see if it's finished
        jobDetailBean.afterPropertiesSet(); // fixes the job details and initializes the job detail object property

        try {
            Date dateStart = scheduler.scheduleJob(jobDetailBean.getObject(), simpleTrigger);
            logger.debug("== found job date: " + dateStart.toString());

        } catch (SchedulerException se) {
            logger.error("Error while accessing job date: ", se);
        }

        request.setAttribute("datasetId", datasetId);
        // set the job name here in the user's session, so that we can ping the scheduler to pull it out later
        if(jobDetailBean!=null)
        request.getSession().setAttribute("jobName", jobDetailBean.getObject().getKey().getName());
        if(simpleTrigger!= null)
        request.getSession().setAttribute("groupName", TRIGGER_GROUP_NAME);

        request.getSession().setAttribute("datasetId", new Integer(dsBean.getId()));
        return map;
    }

    private ExtractPropertyBean setAllProps(ExtractPropertyBean epBean,DatasetBean dsBean,SimpleDateFormat sdfDir, ExtractUtils extractUtils) {



    	return extractUtils.setAllProps(epBean, dsBean, sdfDir,  SQLInitServlet.getField("filePath"));


	}


    //TODO: ${linkURL} needs to be added
    /**
     *
     * for dateTimePattern, the directory structure is created. "yyyy" + File.separator + "MM" + File.separator + "dd" + File.separator,
     * to resolve location
     * @param filePath TODO
     * @param extractUtils TODO
     */
    private String getEndFilePath(String endFilePath,DatasetBean dsBean,SimpleDateFormat sdfDir, String filePath, ExtractUtils extractUtils){
    	return extractUtils.getEndFilePath(endFilePath, dsBean, sdfDir, filePath);
    }

    /**
     * Returns the datetime based on pattern :"yyyy-MM-dd-HHmmssSSS", typically for resolving file name
     * @param endFilePath
     * @param dsBean
     * @param sdfDir
     * @param filePath TODO
     * @param extractUtils TODO
     * @return
     */
    private String resolveVars(String endFilePath,DatasetBean dsBean,SimpleDateFormat sdfDir, String filePath, ExtractUtils extractUtils){
        return extractUtils.resolveVars(endFilePath, dsBean, sdfDir, filePath);

   }
    public SidebarInit getSidebarInit() {
        return sidebarInit;
    }

    public void setSidebarInit(SidebarInit sidebarInit) {
        this.sidebarInit = sidebarInit;
    }

    private boolean mayProceed(HttpServletRequest request) {

       StudyUserRoleBean currentRole = (StudyUserRoleBean)request.getSession().getAttribute("userRole");
       Role r = currentRole.getRole();

       if (r.equals(Role.STUDYDIRECTOR) || r.equals(Role.COORDINATOR) || r.equals(Role.MONITOR)
               || currentRole.getRole().equals(Role.INVESTIGATOR) ) {
           return true;
       }
       return false;
   }

}
