/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.admin;

import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.akaza.openclinica.bean.admin.AuditEventBean;
import org.akaza.openclinica.bean.admin.TriggerBean;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.bean.submit.SubjectBean;
import org.akaza.openclinica.dao.core.AuditableEntityDAO;
import org.akaza.openclinica.dao.core.DAODigester;
import org.akaza.openclinica.dao.core.SQLFactory;
import org.akaza.openclinica.dao.core.TypeNames;
import org.akaza.openclinica.dao.login.UserAccountDAO;
import org.akaza.openclinica.dao.managestudy.StudyDAO;
import org.akaza.openclinica.dao.submit.SubjectDAO;

/**
 * @author jxu, thickerson
 * 
 * 
 */
public class AuditEventDAO extends AuditableEntityDAO<AuditEventBean> {
    // private DAODigester digester;

    public AuditEventDAO(DataSource ds) {
        super(ds);
    }

    public AuditEventDAO(DataSource ds, DAODigester digester) {
        super(ds);
        this.digester = digester;
    }

    @Override
    protected void setDigesterName() {
        digesterName = SQLFactory.getInstance().DAO_AUDITEVENT;
    }

    @Override
    public void setTypesExpected() {
        // NUMERIC DATE VARCHAR(500) NUMERIC NUMERIC VARCHAR(1000) VARCHAR(4000)
        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.TIMESTAMP);
        this.setTypeExpected(3, TypeNames.STRING);
        this.setTypeExpected(4, TypeNames.INT);
        this.setTypeExpected(5, TypeNames.INT);
        this.setTypeExpected(6, TypeNames.STRING);
        this.setTypeExpected(7, TypeNames.STRING);

    }

    /**
     * <p>
     * getEntityFromHashMap, the method that gets the object from the database
     * query.
     */
    public AuditEventBean getEntityFromHashMap(HashMap<String, Object> hm) {
        AuditEventBean eb = new AuditEventBean();
        // AUDIT_ID AUDIT_DATE AUDIT_TABLE USER_ID ENTITY_ID
        // REASON_FOR_CHANGE
        eb.setId(((Integer) hm.get("audit_id")).intValue());
        eb.setAuditDate((java.util.Date) hm.get("audit_date"));
        // eb.setAuditDate(new
        // Date(((java.sql.Timestamp)hm.get("audit_date")).getTime()));
        eb.setAuditTable((String) hm.get("audit_table"));
        eb.setUserId(((Integer) hm.get("user_id")).intValue());
        eb.setEntityId(((Integer) hm.get("entity_id")).intValue());
        eb.setReasonForChange(((String) hm.get("reason_for_change")).trim());
        eb.setActionMessage(((String) hm.get("action_message")).trim());

        return eb;
    }

    /**
     * <p>
     * getEntityFromHashMap, the method that gets the object from the database
     * query.
     */
    public AuditEventBean getEntityFromHashMap(HashMap<String, Object> hm, boolean hasValue, boolean hasColumnName, boolean hasContextIds) {
        AuditEventBean eb = new AuditEventBean();
        // AUDIT_ID AUDIT_DATE AUDIT_TABLE USER_ID ENTITY_ID
        // REASON_FOR_CHANGE ACTION_MESSAGE
        eb.setId(((Integer) hm.get("audit_id")).intValue());
        eb.setAuditDate((java.util.Date) hm.get("audit_date"));
        // used as a test, ignore and remove, tbh
        // java.text.SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy
        // hh:mm:ss");
        // logger.warn("** timestamp found: "+sdf.format(eb.getAuditDate()));
        // eb.setAuditDate(new
        // Date(((java.sql.Timestamp)hm.get("audit_date")).getTime()));
        eb.setAuditTable((String) hm.get("audit_table"));
        eb.setUserId(((Integer) hm.get("user_id")).intValue());
        eb.setEntityId(((Integer) hm.get("entity_id")).intValue());
        eb.setReasonForChange((String) hm.get("reason_for_change"));
        eb.setActionMessage((String) hm.get("action_message"));
        if (hasValue) {
            // logger.warn("*** has value");
            //
            eb.setOldValue((String) hm.get("old_value"));
            eb.setNewValue((String) hm.get("new_value"));
        }
        if (hasColumnName) {
            // logger.warn("*** has value");
            eb.setColumnName((String) hm.get("column_name"));
        }
        if (hasContextIds) {
            // logger.warn("*** has context ids");
            eb.setStudyId(((Integer) hm.get("study_id")).intValue());
            eb.setSubjectId(((Integer) hm.get("subject_id")).intValue());
            // logger.warn("*** set context ids: " +
            // eb.getStudyId() + " " +
            // eb.getSubjectId());
        }

        return eb;
    }

    public AuditEventBean setStudyAndSubjectInfo(AuditEventBean aeb) {
        if (aeb.getStudyId() > 0) {
            StudyDAO sdao = new StudyDAO(this.ds);
            StudyBean sbean = (StudyBean) sdao.findByPK(aeb.getStudyId());
            aeb.setStudyName(sbean.getName());
        }
        if (aeb.getSubjectId() > 0) {
            SubjectBean subbean = new SubjectBean();
            SubjectDAO subdao = new SubjectDAO(this.ds);
            subbean = (SubjectBean) subdao.findByPK(aeb.getSubjectId());
            aeb.setSubjectName(subbean.getName());
        }
        if (aeb.getUserId() > 0) {
            UserAccountBean updater = new UserAccountBean();
            UserAccountDAO uadao = new UserAccountDAO(this.ds);
            updater = (UserAccountBean) uadao.findByPK(aeb.getUserId());
            aeb.setUpdater(updater);
        }
        return aeb;
    }

    /**
     * getFinalEntityFromCollection, code created to place many of the functions
     * originally in findAllByUser here, so that it can be used efficiently by
     * findEventStatusLogByStudySubject.
     * 
     * @return an AuditEventBean, containing all the preset values
     */
    // public AuditEventBean getFinalEntityFromCollection() {
    // AuditEventBean eb = new AuditEventBean();
    //
    // return eb;
    // }
    /**
     * <p>
     * getEntityFromHashMap, the method that gets the object from the database
     * query.
     */
    public AuditEventBean getColumnNameFromHashMap(HashMap<String, Object> hm) {
        AuditEventBean eb = new AuditEventBean();

        eb.setColumnName((String) hm.get("column_name"));
        return eb;
    }

    public ArrayList<AuditEventBean> findAll() {
    	String queryName = "findAll";
    	return executeFindAllQuery(queryName);
    }

    /**
     * NOT IMPLEMENTED
     */
    public ArrayList<AuditEventBean>  findAll(String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
    	throw new RuntimeException("Not implemented");
    }

    public AuditEventBean findByPK(int id) {
    	String queryName = "findByPK";
    	return (AuditEventBean) executeFindByPKQuery(queryName);
    }

    /**
     * Creates a new row in the audit_log_event table
     */
    public AuditEventBean create(AuditEventBean sb) {
        HashMap<Integer, Object> variables = new HashMap<Integer, Object>();
        // INSERT INTO audit_event
        // (AUDIT_DATE,AUDIT_TABLE,USER_ID,ENTITY_ID,REASON_FOR_CHANGE,
        // ACTION_MESSAGE)
        // VALUES (NOW(),?,?,?,?,?)
        // needs to change, tbh 02/2009
        // new query needs to be
        // INSERT INTO audit_log_event(audit_id, audit_log_event_type_id,
        // audit_date, user_id, audit_table, entity_id, entity_name, old_value,
        // new_value)
        // VALUES (pk, ?, now(), NEW.update_id, ?, ?, ?, ?, ?);
        variables.put(new Integer(1), sb.getAuditTable());
        variables.put(new Integer(2), new Integer(sb.getUserId()));
        variables.put(new Integer(3), new Integer(sb.getEntityId()));
        variables.put(new Integer(4), sb.getReasonForChangeKey());
        variables.put(new Integer(5), sb.getActionMessageKey());

        this.executeUpdate(digester.getQuery("create"), variables);

        return sb;
    }

    public void createRowForJobConclusion(TriggerBean trigger, int eventTypeId) {
        AuditEventBean auditEvent = new AuditEventBean();
        auditEvent.setUserId(trigger.getUserAccount().getId());
        auditEvent.setEntityId(trigger.getDataset().getId());
        auditEvent.setAuditTable("datasets");
        auditEvent.setName(trigger.getFullName());
        auditEvent.setActionMessage("");
        auditEvent.setOldValue("");
        auditEvent.setNewValue("");
        auditEvent.setReasonForChange("");
        // need to set type_id either (success) or (failure), tbh
        // use custom SQL here?
        create(auditEvent);
    }

    public void createRowForUserAccount(UserAccountBean uab, String reasonForChange, String actionMessage) {
        // creator method for making a row in the audit table
        // for a user account, tbh
        // TODO doesn't work -- set it up by adding rows to context and values
        AuditEventBean aeb = new AuditEventBean();
        aeb.setUserId(uab.getId());
        aeb.setEntityId(uab.getId());
        aeb.setAuditTable("__user_account");
        aeb.setReasonForChange(reasonForChange);
        aeb.setActionMessage(actionMessage);
        create(aeb);

    }

    public void createRowForFailedLogin(UserAccountBean uab) {
        createRowForUserAccount(uab, "__unsuccessful_login_attempt", "__failed_login");
    }

    public void createRowForLogin(UserAccountBean uab) {
        createRowForUserAccount(uab, "__successful_login", "__logged_in");
    }

    public void createRowForPasswordRequest(UserAccountBean uab) {
        createRowForUserAccount(uab, "__requested_password", "__requested_password");
    }

    public void createRowForJobExecution(TriggerBean triggerBean, String reasonForChange, String actionMessage) {
        AuditEventBean auditEventBean = new AuditEventBean();
        auditEventBean.setUserId(triggerBean.getUserAccount().getId());
        auditEventBean.setEntityId(triggerBean.getDataset().getId());
        auditEventBean.setAuditTable(triggerBean.getFullName());
        // 
        auditEventBean.setReasonForChange(reasonForChange);
        auditEventBean.setActionMessage(actionMessage);
        create(auditEventBean);
    }

    public void createRowForExtractDataJobSuccess(TriggerBean triggerBean) {
        createRowForJobExecution(triggerBean, "__job_fired_success", "__job_fired_success");
    }

	public void createRowForExtractDataJobSuccess(TriggerBean triggerBean, String message) {
		createRowForJobExecution(triggerBean, "__job_fired_success", message);
	}

    public void createRowForExtractDataJobFailure(TriggerBean triggerBean) {
        createRowForJobExecution(triggerBean, "__job_fired_fail", "__job_fired_fail");
    }

	public void createRowForExtractDataJobFailure(TriggerBean triggerBean, String message) {
        createRowForJobExecution(triggerBean, "__job_fired_fail", message);
    }

    public ArrayList<AuditEventBean> findAllByAuditTable(String tableName) {
        HashMap<Integer, Object> variables = variables(tableName);
        String queryName = "findAllByAuditTable";
        return executeFindAllQuery(queryName, variables);
    }

    public ArrayList<AuditEventBean> findAggregatesByTableName(String tableName) {
        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.LONG);
        this.setTypeExpected(2, TypeNames.STRING);
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), tableName);

        String sql = digester.getQuery("findAggregatesByTableName");
        logger.debug("sql is: " + sql);
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        logger.debug("size is: " + alist.size());

        ArrayList<AuditEventBean> al = new ArrayList<>();

        for (HashMap<String, Object> map : alist) {
			logger.debug("has next..");
            AuditEventBean eb = this.getColumnNameFromHashMap(map);
            logger.debug("got bean");
            al.add(eb);
        }

        return al;

    }
    
    public ArrayList<AuditEventBean> findAllByStudyId(int studyId) {
        /*
         * select ae. , aev.old_value, aev.new_value, aev.column_name,
         * aec.study_id, aec.subject_id from audit_event ae, audit_event_values
         * aev, audit_event_context aec where ae.audit_id=aev.audit_id and
         * ae.audit_id = aec.audit_id and aec.study_id=? order by ae.audit_date
         */

        ArrayList<AuditEventBean> al = this.findAllByEntityName(studyId, "findAllByStudyId");

        return al;
    }

    public ArrayList<AuditEventBean> findAllByStudyIdAndLimit(int studyId) {
        /*
         * select ae. , aev.old_value, aev.new_value, aev.column_name,
         * aec.study_id, aec.subject_id from audit_event ae, audit_event_values
         * aev, audit_event_context aec where ae.audit_id=aev.audit_id and
         * ae.audit_id = aec.audit_id and aec.study_id=? order by ae.audit_date
         */

        ArrayList<AuditEventBean> al = this.findAllByEntityName(studyId, "findAllByStudyIdAndLimit");

        return al;
    }

    public ArrayList<AuditEventBean> findAllByEntityName(int entityId, String digesterName) {

        this.unsetTypeExpected();

        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.TIMESTAMP);
        this.setTypeExpected(3, TypeNames.STRING);
        this.setTypeExpected(4, TypeNames.INT);
        this.setTypeExpected(5, TypeNames.INT);
        this.setTypeExpected(6, TypeNames.STRING);
        this.setTypeExpected(7, TypeNames.STRING); // action_message
        this.setTypeExpected(8, TypeNames.STRING); // old_value
        this.setTypeExpected(9, TypeNames.STRING); // new_value
        this.setTypeExpected(10, TypeNames.STRING); // column_name
        this.setTypeExpected(11, TypeNames.INT); // study_id
        this.setTypeExpected(12, TypeNames.INT); // subject_id
        
        HashMap<Integer, Object> variables = variables(entityId);

        String sql = digester.getQuery(digesterName);
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<AuditEventBean> al = new ArrayList<>();
        AuditEventBean ebCheck = new AuditEventBean();
        HashMap<Integer, AuditEventBean> AuditEventHashMap = new HashMap<>();
        AuditEventBean eb = new AuditEventBean();
        for (HashMap<String, Object> nextEb : alist) {
            eb = this.getEntityFromHashMap(nextEb, true, true, true);

            ebCheck = AuditEventHashMap.get(eb.getId());
            if (ebCheck == null) {
                AuditEventHashMap.put(eb.getId(), eb);
                al.add(eb);
            } else {
            	// update changes
                HashMap<String, String> changes = ebCheck.getChanges();
                changes.put(eb.getColumnName(), eb.getNewValue());
            }

        }// end of first iterator loop        
        for (AuditEventBean newAEBean : al) {
            newAEBean = this.setStudyAndSubjectInfo(newAEBean);
        }// end of second iterator loop

        return al;
    }

    public ArrayList<AuditEventBean> findAllByUserId(int userId) {
        /*
         * select ae. , aev.old_value, aev.new_value, aev.column_name from
         * audit_event ae, audit_event_values aev where ae.audit_id=aev.audit_id
         * and ae.user_id=? order by ae.audit_date; NEWER QUERY : select ae. ,
         * aev.old_value, aev.new_value, aev.column_name, aec.study_id,
         * aec.subject_id from audit_event ae, audit_event_values aev,
         * audit_event_context aec where ae.audit_id=aev.audit_id and
         * ae.audit_id = aec.audit_id and ae.user_id=? order by ae.audit_date
         */
        this.unsetTypeExpected();

        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.TIMESTAMP);
        this.setTypeExpected(3, TypeNames.STRING);
        this.setTypeExpected(4, TypeNames.INT);
        this.setTypeExpected(5, TypeNames.INT);
        this.setTypeExpected(6, TypeNames.STRING);
        this.setTypeExpected(7, TypeNames.STRING); // action_message
        this.setTypeExpected(8, TypeNames.STRING); // old_value
        this.setTypeExpected(9, TypeNames.STRING); // new_value
        this.setTypeExpected(10, TypeNames.STRING); // column_name
        this.setTypeExpected(11, TypeNames.INT); // study_id
        this.setTypeExpected(12, TypeNames.INT); // subject_id
        HashMap<Integer, Object> variables = variables(userId);

        String sql = digester.getQuery("findAllByUserId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<AuditEventBean> al = new ArrayList<>();
        AuditEventBean ebCheck = new AuditEventBean();
        HashMap<Integer, AuditEventBean> AuditEventHashMap = new HashMap<>();
        AuditEventBean eb = new AuditEventBean();
        for (HashMap<String, Object> nextEb : alist) {
            eb = this.getEntityFromHashMap(nextEb, true, true, true);
            // currently added here, but is there repeated work?
            // create a method instead to just add the names to the ids
            // found in the context, tbh
            ebCheck = AuditEventHashMap.get(eb.getId());
            if (ebCheck == null) {
                AuditEventHashMap.put(new Integer(eb.getId()), eb);
                logger.warn("Put into hashmap: " + eb.getId());
                al.add(eb);
            } else {
                HashMap<String, String> changes = ebCheck.getChanges();
                changes.put(eb.getColumnName(), eb.getNewValue());
            }
        }// end of first iterator loop
        for(AuditEventBean newAEBean: al) {
            newAEBean = this.setStudyAndSubjectInfo(newAEBean);

        }// end of second iterator loop
        // add check for the context here, add in study name and subject name
        // if necessary

        return al;
    }

    public ArrayList<AuditEventBean> findEventStatusLogByStudySubject(int studySubjectId) {

        /*
         * select ae. , aev.old_value, aev.new_value from audit_event ae,
         * audit_event_values aev, study_event se where
         * ae.audit_table='STUDY_EVENT' and ae.audit_id=aev.audit_id and
         * aev.column_name='Subject Event Status ID' and
         * ae.entity_id=study_event.study_event_id and
         * study_event.study_subject_id=?
         */
        this.unsetTypeExpected();

        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.TIMESTAMP);
        this.setTypeExpected(3, TypeNames.STRING);
        this.setTypeExpected(4, TypeNames.INT);
        this.setTypeExpected(5, TypeNames.INT);
        this.setTypeExpected(6, TypeNames.STRING);
        this.setTypeExpected(7, TypeNames.STRING); // action_message
        this.setTypeExpected(8, TypeNames.STRING); // old_value
        this.setTypeExpected(9, TypeNames.STRING); // new_value
        this.setTypeExpected(10, TypeNames.STRING); // column name
        HashMap<Integer, Object> variables = variables(studySubjectId);
        logger.debug("&&& querying study log...");
        String query = digester.getQuery("findEventStatusLogByStudySubject");
        
        ArrayList<HashMap<String, Object>> alist = this.select(query, variables);
        ArrayList<AuditEventBean> al = new ArrayList<>();
        logger.debug("&&& about to get entities from HM...");
        for (HashMap<String, Object> nextEb : alist) {
            AuditEventBean eb = this.getEntityFromHashMap(nextEb, true, true, false);
            al.add(eb);
        }
        logger.debug("&&& returning array list...");
        return al;

    }

    /**
     * Updates a AuditEvent
     */
    public AuditEventBean update(AuditEventBean eb) {
        return eb;
    }

    /**
     * NOT IMPLEMENTED
     */
    public ArrayList<AuditEventBean> findAllByPermission(Object objCurrentUser, int intActionType, String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
       throw new RuntimeException("Not implemented");
    }

    /**
     * NOT IMPLEMENTED
     */
    public ArrayList<AuditEventBean> findAllByPermission(Object objCurrentUser, int intActionType) {
    	throw new RuntimeException("Not implemented");
    }

	@Override
	public AuditEventBean emptyBean() {
		return new AuditEventBean();
	}
}
