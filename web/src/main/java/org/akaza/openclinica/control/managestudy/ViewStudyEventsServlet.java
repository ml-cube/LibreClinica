/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.managestudy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.akaza.openclinica.bean.core.SubjectEventStatus;
import org.akaza.openclinica.bean.managestudy.StudyEventBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.managestudy.StudySubjectBean;
import org.akaza.openclinica.bean.submit.EventCRFBean;
import org.akaza.openclinica.control.core.SecureController;
import org.akaza.openclinica.control.form.FormProcessor;
import org.akaza.openclinica.control.form.Validator;
import org.akaza.openclinica.control.submit.SubmitDataServlet;
import org.akaza.openclinica.dao.managestudy.StudyEventDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDefinitionDAO;
import org.akaza.openclinica.dao.managestudy.StudySubjectDAO;
import org.akaza.openclinica.dao.submit.EventCRFDAO;
import org.akaza.openclinica.i18n.core.LocaleResolver;
import org.akaza.openclinica.view.Page;
import org.akaza.openclinica.web.InsufficientPermissionException;
import org.akaza.openclinica.web.bean.EntityBeanTable;
import org.akaza.openclinica.web.bean.StudyEventRow;

/**
 * @author jxu
 *
 * Handles user request of "view study events"
 */
public class ViewStudyEventsServlet extends SecureController {

    /**
	 * 
	 */
	private static final long serialVersionUID = 4508482824320959374L;

	Locale locale;
    // < ResourceBundlerestext;

    public static final String INPUT_STARTDATE = "startDate";

    public static final String INPUT_ENDDATE = "endDate";

    public static final String INPUT_DEF_ID = "definitionId";

    public static final String INPUT_STATUS_ID = "statusId";

    public static final String STATUS_MAP = "statuses";

    public static final String DEFINITION_MAP = "definitions";

    public static final String PRINT = "print";

    /**
     * Checks whether the user has the right permission to proceed function
     */
    @Override
    public void mayProceed() throws InsufficientPermissionException {

        locale = LocaleResolver.getLocale(request);
        // < restext =
        // ResourceBundle.getBundle("org.akaza.openclinica.i18n.notes",locale);

        if (ub.isSysAdmin()) {
            return;
        }

        if (SubmitDataServlet.mayViewData(ub, currentRole)) {
            return;
        }

        addPageMessage(respage.getString("no_have_correct_privilege_current_study") + respage.getString("change_study_contact_sysadmin"));
        throw new InsufficientPermissionException(Page.MENU_SERVLET, restext.getString("not_correct_role"), "1");
    }

    @Override
    public void processRequest() throws Exception {
        FormProcessor fp = new FormProcessor(request);
        // checks which module requests are from
        String module = fp.getString(MODULE);
        request.setAttribute(MODULE, module);

        int sedId = fp.getInt("sedId");
        int statusId = fp.getInt(INPUT_STATUS_ID);
        int definitionId = fp.getInt(INPUT_DEF_ID);
        Date startDate = fp.getDate(INPUT_STARTDATE);
        Date endDate = fp.getDate(INPUT_ENDDATE);

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        String defaultStartDateString = month + "/01/" + year;
        Date defaultStartDate = new Date();

        defaultStartDate = new SimpleDateFormat("MM/dd/yy").parse(defaultStartDateString);
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        defaultStartDateString = dateFormatter.format(defaultStartDate);

        cal.setTime(defaultStartDate);
        cal.add(Calendar.DATE, 30);
        Date defaultEndDate = cal.getTime();

        if (!fp.isSubmitted()) {
            logger.info("not submitted");
            HashMap<String, Object> presetValues = new HashMap<>();

            presetValues.put(INPUT_STARTDATE, local_df.format(defaultStartDate));
            presetValues.put(INPUT_ENDDATE, local_df.format(defaultEndDate));
            startDate = defaultStartDate;
            endDate = defaultEndDate;
            setPresetValues(presetValues);
        } else {
            Validator v = new Validator(request);
            v.addValidation(INPUT_STARTDATE, Validator.IS_A_DATE);
            v.addValidation(INPUT_ENDDATE, Validator.IS_A_DATE);
            errors = v.validate();
            if (!errors.isEmpty()) {
                setInputMessages(errors);
                startDate = defaultStartDate;
                endDate = defaultEndDate;
            }
            fp.addPresetValue(INPUT_STARTDATE, fp.getString(INPUT_STARTDATE));
            fp.addPresetValue(INPUT_ENDDATE, fp.getString(INPUT_ENDDATE));
            fp.addPresetValue(INPUT_DEF_ID, fp.getInt(INPUT_DEF_ID));
            fp.addPresetValue(INPUT_STATUS_ID, fp.getInt(INPUT_STATUS_ID));
            setPresetValues(fp.getPresetValues());
        }

        request.setAttribute(STATUS_MAP, SubjectEventStatus.toArrayList());

        StudyEventDefinitionDAO seddao = new StudyEventDefinitionDAO(sm.getDataSource());
        ArrayList<StudyEventDefinitionBean> definitions = seddao.findAllByStudy(currentStudy);
        request.setAttribute(DEFINITION_MAP, definitions);

        ArrayList<ViewEventDefinitionBean> allEvents = genTables(fp, definitions, startDate, endDate, sedId, definitionId, statusId);

        request.setAttribute("allEvents", allEvents);

        // for print version
        String queryUrl =
            INPUT_STARTDATE + "=" + local_df.format(startDate) + "&" + INPUT_ENDDATE + "=" + local_df.format(endDate) + "&" + INPUT_DEF_ID + "=" + definitionId
                + "&" + INPUT_STATUS_ID + "=" + statusId + "&" + "sedId=" + sedId + "&submitted=" + fp.getInt("submitted");
        request.setAttribute("queryUrl", queryUrl);
        if ("yes".equalsIgnoreCase(fp.getString(PRINT))) {
            allEvents = genEventsForPrint(fp, definitions, startDate, endDate, sedId, definitionId, statusId);
            request.setAttribute("allEvents", allEvents);
            forwardPage(Page.VIEW_STUDY_EVENTS_PRINT);
        } else {
            forwardPage(Page.VIEW_STUDY_EVENTS);
        }

    }

    /**
     *
     * @param fp
     * @param definitions
     * @param startDate
     * @param endDate
     * @param sedId
     * @param definitionId
     * @param statusId
     * @return
     */
    private ArrayList<ViewEventDefinitionBean> genTables(FormProcessor fp, ArrayList<StudyEventDefinitionBean> definitions, Date startDate, Date endDate, int sedId, int definitionId, int statusId) {
        StudyEventDAO sedao = new StudyEventDAO(sm.getDataSource());
        EventCRFDAO ecdao = new EventCRFDAO(sm.getDataSource());
        ArrayList<ViewEventDefinitionBean> allEvents = new ArrayList<>();
        definitions = findDefinitionById(definitions, definitionId);
        // YW <<
        StudySubjectDAO ssdao = new StudySubjectDAO(sm.getDataSource());
        ArrayList<StudySubjectBean> studySubjects = ssdao.findAllByStudyId(currentStudy.getId());
        // YW >>
        for (int i = 0; i < definitions.size(); i++) {
            ViewEventDefinitionBean ved = new ViewEventDefinitionBean();
            StudyEventDefinitionBean sed = (StudyEventDefinitionBean) definitions.get(i);

            ved.setDefinition(sed);

            // YW <<
            ArrayList<StudyEventBean> events = new ArrayList<>();
            for (int s = 0; s < studySubjects.size(); ++s) {
                StudySubjectBean ssb = studySubjects.get(s);
                ArrayList<StudyEventBean> evts = sedao.findAllWithSubjectLabelByStudySubjectAndDefinition(ssb, sed.getId());

                for (int v = 0; v < evts.size(); ++v) {
                    StudyEventBean seb = (StudyEventBean)evts.get(v);
                    if(!(currentRole.isDirector() || currentRole.isCoordinator()) && seb.getSubjectEventStatus().isLocked()){
                        seb.setEditable(false);
                    }
                    events.add(seb);
                }
            }

            int subjectScheduled = 0;
            int subjectCompleted = 0;
            int subjectDiscontinued = 0;
            events = findEventByStatusAndDate(events, statusId, startDate, endDate);

            Date firstStartDateForScheduled = null;
            Date lastCompletionDate = null;
            // find the first firstStartDateForScheduled
            for (int k = 0; k < events.size(); k++) {
                StudyEventBean se = (StudyEventBean) events.get(k);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.SCHEDULED)) {
                    firstStartDateForScheduled = se.getDateStarted();
                    break;
                }

            }
            // find the first lastCompletionDate
            for (int k = 0; k < events.size(); k++) {
                StudyEventBean se = (StudyEventBean) events.get(k);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.COMPLETED) && se.getDateEnded()!=null) {
                    lastCompletionDate = se.getDateEnded();
                    break;
                }
            }

            for (int j = 0; j < events.size(); j++) {
                StudyEventBean se = (StudyEventBean) events.get(j);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.SCHEDULED)) {
                    subjectScheduled++;
                    if (se.getDateStarted().before(new Date())) {
                        ArrayList<EventCRFBean> eventCRFs = ecdao.findAllByStudyEvent(se);
                        if (eventCRFs.isEmpty()) {
                            se.setScheduledDatePast(true);
                        }
                    }
                    if (firstStartDateForScheduled == null) {
                        firstStartDateForScheduled = se.getDateStarted();
                    } else if (se.getDateStarted().before(firstStartDateForScheduled)) {
                        firstStartDateForScheduled = se.getDateStarted();
                    }
                } else if (se.getSubjectEventStatus().equals(SubjectEventStatus.COMPLETED)) {
                    subjectCompleted++;
                    if (lastCompletionDate == null) {
                        lastCompletionDate = se.getDateEnded();
                    } else if (se.getDateEnded()!=null && se.getDateEnded().after(lastCompletionDate)) {
                        lastCompletionDate = se.getDateEnded();
                    }
                } else if (se.getSubjectEventStatus().getId() > 4) {
                    // dropped out/stopped/skipped/relapse
                    subjectDiscontinued++;
                }
            }

            ved.setSubjectCompleted(subjectCompleted);
            ved.setSubjectScheduled(subjectScheduled);
            ved.setSubjectDiscontinued(subjectDiscontinued);
            ved.setFirstScheduledStartDate(firstStartDateForScheduled);
            ved.setLastCompletionDate(lastCompletionDate);

            EntityBeanTable table;
            if (sedId == sed.getId()) {// apply finding function or ordering
                // function
                // to a specific table
                table = fp.getEntityBeanTable();
            } else {
                table = new EntityBeanTable();
            }
            table.setSortingIfNotExplicitlySet(1, false);// sort by event
            // start date,
            // desc
            ArrayList<StudyEventRow> allEventRows = StudyEventRow.generateRowsFromBeans(events);

            String[] columns =
                { resword.getString("study_subject_ID"), resword.getString("event_date_started"), resword.getString("subject_event_status"),
                    resword.getString("actions") };
            table.setColumns(new ArrayList<String>(Arrays.asList(columns)));
            table.hideColumnLink(3);
            HashMap<String, Object> args = new HashMap<>();
            args.put("sedId", new Integer(sed.getId()).toString());
            args.put("definitionId", new Integer(definitionId).toString());
            args.put("statusId", new Integer(statusId).toString());
            args.put("startDate", local_df.format(startDate));
            args.put("endDate", local_df.format(endDate));
            table.setQuery("ViewStudyEvents", args);
            table.setRows(allEventRows);
            table.computeDisplay();

            ved.setStudyEventTable(table);



            if (!events.isEmpty()) {
                allEvents.add(ved);
            }
        }

        //A. Hamid.
        return allEvents;
    }

    /**
     * Generates an arraylist of study events for printing
     *
     * @param fp
     * @param definitions
     * @param startDate
     * @param endDate
     * @param sedId
     * @param definitionId
     * @param statusId
     * @return
     */
    private ArrayList<ViewEventDefinitionBean> genEventsForPrint(FormProcessor fp, ArrayList<StudyEventDefinitionBean> definitions, Date startDate, Date endDate, int sedId, int definitionId, int statusId) {
        StudyEventDAO sedao = new StudyEventDAO(sm.getDataSource());
        EventCRFDAO ecdao = new EventCRFDAO(sm.getDataSource());
        ArrayList<ViewEventDefinitionBean> allEvents = new ArrayList<>();
        definitions = findDefinitionById(definitions, definitionId);
        // YW <<
        StudySubjectDAO ssdao = new StudySubjectDAO(sm.getDataSource());
        ArrayList<StudySubjectBean> studySubjects = ssdao.findAllByStudyId(currentStudy.getId());
        // YW >>
        for (int i = 0; i < definitions.size(); i++) {
            ViewEventDefinitionBean ved = new ViewEventDefinitionBean();
            StudyEventDefinitionBean sed = definitions.get(i);

            ved.setDefinition(sed);

            // YW <<
            ArrayList<StudyEventBean> events = new ArrayList<>();
            for (int s = 0; s < studySubjects.size(); ++s) {
                StudySubjectBean ssb = (StudySubjectBean) studySubjects.get(s);
                ArrayList<StudyEventBean> evts = sedao.findAllWithSubjectLabelByStudySubjectAndDefinition(ssb, sed.getId());

                for (int v = 0; v < evts.size(); ++v) {
                    events.add(evts.get(v));
                }
            }
            // YW >>

            int subjectScheduled = 0;
            int subjectCompleted = 0;
            int subjectDiscontinued = 0;
            events = findEventByStatusAndDate(events, statusId, startDate, endDate);

            Date firstStartDateForScheduled = null;
            Date lastCompletionDate = null;
            // find the first firstStartDateForScheduled
            for (int k = 0; k < events.size(); k++) {
                StudyEventBean se = events.get(k);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.SCHEDULED)) {
                    firstStartDateForScheduled = se.getDateStarted();
                    break;
                }

            }
            // find the first lastCompletionDate
            for (int k = 0; k < events.size(); k++) {
                StudyEventBean se = events.get(k);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.COMPLETED)) {
                    lastCompletionDate = se.getDateEnded();
                    break;
                }
            }

            for (int j = 0; j < events.size(); j++) {
                StudyEventBean se = events.get(j);
                if (se.getSubjectEventStatus().equals(SubjectEventStatus.SCHEDULED)) {
                    subjectScheduled++;
                    if (se.getDateStarted().before(new Date())) {
                        ArrayList<EventCRFBean> eventCRFs = ecdao.findAllByStudyEvent(se);
                        if (eventCRFs.isEmpty()) {
                            se.setScheduledDatePast(true);
                        }
                    }
                    if (firstStartDateForScheduled == null) {
                        firstStartDateForScheduled = se.getDateStarted();
                    } else if (se.getDateStarted().before(firstStartDateForScheduled)) {
                        firstStartDateForScheduled = se.getDateStarted();
                    }
                } else if (se.getSubjectEventStatus().equals(SubjectEventStatus.COMPLETED)) {
                    subjectCompleted++;
                    if (lastCompletionDate == null) {
                        lastCompletionDate = se.getDateEnded();
                    } else if (se.getDateEnded().after(lastCompletionDate)) {
                        lastCompletionDate = se.getDateEnded();
                    }
                } else if (se.getSubjectEventStatus().getId() > 4) {
                    // dropped out/stopped/skipped/relapse
                    subjectDiscontinued++;
                }

            }
            ved.setSubjectCompleted(subjectCompleted);
            ved.setSubjectScheduled(subjectScheduled);
            ved.setSubjectDiscontinued(subjectDiscontinued);
            ved.setFirstScheduledStartDate(firstStartDateForScheduled);
            ved.setLastCompletionDate(lastCompletionDate);

            ved.setStudyEvents(events);

            if (!events.isEmpty()) {
                allEvents.add(ved);
            }
        }
        return allEvents;
    }

    /**
     *
     * @param definitions
     * @param definitionId
     * @return
     */
    private ArrayList<StudyEventDefinitionBean> findDefinitionById(ArrayList<StudyEventDefinitionBean> definitions, int definitionId) {
        if (definitionId > 0) {
            for (int i = 0; i < definitions.size(); i++) {
                StudyEventDefinitionBean sed = (StudyEventDefinitionBean) definitions.get(i);
                if (sed.getId() == definitionId) {
                    ArrayList<StudyEventDefinitionBean> a = new ArrayList<>();
                    a.add(sed);
                    return a;
                }
            }
        }
        return definitions;
    }

    /**
     *
     * @param events
     * @param statusId
     * @param startDate
     * @param endDate
     * @return
     */
    private ArrayList<StudyEventBean> findEventByStatusAndDate(ArrayList<StudyEventBean> events, int statusId, Date startDate, Date endDate) {
        ArrayList<StudyEventBean> a = new ArrayList<>();
        for (int i = 0; i < events.size(); i++) {
            StudyEventBean se = events.get(i);
            if (!se.getDateStarted().before(startDate) && !se.getDateStarted().after(endDate)) {
                a.add(se);
            }
        }
        ArrayList<StudyEventBean> b = new ArrayList<>();
        if (statusId > 0) {
            for (int i = 0; i < a.size(); i++) {
                StudyEventBean se = (StudyEventBean) a.get(i);
                if (se.getSubjectEventStatus().getId() == statusId) {
                    b.add(se);
                }
            }
            return b;
        }
        return a;
    }
}
