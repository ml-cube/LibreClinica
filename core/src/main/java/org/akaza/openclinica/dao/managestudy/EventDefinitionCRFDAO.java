/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.managestudy;

import java.sql.Types;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.sql.DataSource;

import org.akaza.openclinica.bean.core.EntityBean;
import org.akaza.openclinica.bean.managestudy.EventDefinitionCRFBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.bean.managestudy.StudyEventBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.submit.CRFVersionBean;
import org.akaza.openclinica.dao.core.AuditableEntityDAO;
import org.akaza.openclinica.dao.core.DAODigester;
import org.akaza.openclinica.dao.core.SQLFactory;
import org.akaza.openclinica.dao.core.TypeNames;
import org.akaza.openclinica.domain.SourceDataVerification;
import org.apache.commons.lang.StringUtils;

/**
 * @author jxu
 * 
 */
public class EventDefinitionCRFDAO extends AuditableEntityDAO<EventDefinitionCRFBean> {
    // private DAODigester digester;

    private void setQueryNames() {
        getCurrentPKName = "getCurrentPK";
        getNextPKName = "getNextPK";
        findAllByStudyName = "findAllByStudy";
    }

    public EventDefinitionCRFDAO(DataSource ds) {
        super(ds);
        setQueryNames();
    }

    public EventDefinitionCRFDAO(DataSource ds, DAODigester digester) {
        super(ds);
        this.digester = digester;
        setQueryNames();
    }

    @Override
    protected void setDigesterName() {
        digesterName = SQLFactory.getInstance().DAO_EVENTDEFINITIONCRF;
    }

    @Override
    public void setTypesExpected() {
        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.INT);
        this.setTypeExpected(3, TypeNames.INT);
        this.setTypeExpected(4, TypeNames.INT);
        this.setTypeExpected(5, TypeNames.BOOL);

        this.setTypeExpected(6, TypeNames.BOOL);
        this.setTypeExpected(7, TypeNames.BOOL);
        this.setTypeExpected(8, TypeNames.BOOL);
        this.setTypeExpected(9, TypeNames.STRING);
        this.setTypeExpected(10, TypeNames.INT);

        this.setTypeExpected(11, TypeNames.INT);
        this.setTypeExpected(12, TypeNames.INT);
        this.setTypeExpected(13, TypeNames.DATE);
        this.setTypeExpected(14, TypeNames.DATE);
        this.setTypeExpected(15, TypeNames.INT);
        this.setTypeExpected(16, TypeNames.INT);
        this.setTypeExpected(17, TypeNames.BOOL);
        // Issue 3212
        this.setTypeExpected(18, TypeNames.BOOL);
        this.setTypeExpected(19, TypeNames.INT); // source_data_verification_id
        this.setTypeExpected(20, TypeNames.STRING); // selected_version_ids
        this.setTypeExpected(21, TypeNames.INT); // parent_id
        this.setTypeExpected(22, TypeNames.BOOL);  // participant_crf
        this.setTypeExpected(23, TypeNames.BOOL);  // allow_anonymous_submission
        this.setTypeExpected(24, TypeNames.STRING); // submission_url
    }

    /**
     * <p>
     * getEntityFromHashMap, the method that gets the object from the database
     * query.
     */
    @Override
    public EventDefinitionCRFBean getEntityFromHashMap(HashMap<String, Object> hm) {
        EventDefinitionCRFBean eb = new EventDefinitionCRFBean();
        super.setEntityAuditInformation(eb, hm);
        // EVENT_DEFINITION_CRF_ID STUDY_EVENT_DEFINITION_ID STUDY_ID
        // CRF_ID REQUIRED_CRF DOUBLE_ENTRY REQUIRE_ALL_TEXT_FILLED
        // DECISION_CONDITIONS DEFAULT_VERSION_ID STATUS_ID OWNER_ID
        // DATE_CREATED DATE_UPDATED UPDATE_ID
        eb.setId(((Integer) hm.get("event_definition_crf_id")).intValue());
        eb.setStudyEventDefinitionId(((Integer) hm.get("study_event_definition_id")).intValue());
        eb.setStudyId(((Integer) hm.get("study_id")).intValue());
        eb.setCrfId(((Integer) hm.get("crf_id")).intValue());
        eb.setRequiredCRF(((Boolean) hm.get("required_crf")).booleanValue());
        eb.setDoubleEntry(((Boolean) hm.get("double_entry")).booleanValue());
        eb.setRequireAllTextFilled(((Boolean) hm.get("require_all_text_filled")).booleanValue());
        eb.setDecisionCondition(((Boolean) hm.get("decision_conditions")).booleanValue());
        eb.setNullValues((String) hm.get("null_values"));
        eb.setDefaultVersionId(((Integer) hm.get("default_version_id")).intValue());
        eb.setOrdinal(((Integer) hm.get("ordinal")).intValue());
        eb.setElectronicSignature(((Boolean) hm.get("electronic_signature")).booleanValue());
        // issue 3212
        eb.setHideCrf(((Boolean) hm.get("hide_crf")));
        int sdvId = (Integer) hm.get("source_data_verification_code");
        eb.setSourceDataVerification(SourceDataVerification.getByCode(sdvId > 0 ? sdvId : 3));
        String selectedVersionIds = (String) hm.get("selected_version_ids");
        eb.setSelectedVersionIds(selectedVersionIds != null ? selectedVersionIds : "");
        int parentId = (Integer) hm.get("parent_id");
        eb.setParentId(parentId > 0 ? parentId : 0);
        eb.setParticipantForm(((Boolean) hm.get("participant_form")).booleanValue());
        eb.setAllowAnonymousSubmission(((Boolean) hm.get("allow_anonymous_submission")).booleanValue());
        eb.setSubmissionUrl(((String) hm.get("submission_url")));
        return eb;
    }

    @Override
    public ArrayList<EventDefinitionCRFBean> findAll() {
        this.setTypesExpected();
        ArrayList<HashMap<String, Object>> alist = this.select(digester.getQuery("findAll"));
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllByDefinition(int definitionId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));

        String sql = digester.getQuery("findAllByDefinition");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    
    
    /**
     * Find all EventDefinitionCRFBean for the StudyBean.
     * 
     * @param study
     * @param definitionId
     * @return
     */
    public ArrayList<EventDefinitionCRFBean> findAllByDefinition(StudyBean study, int definitionId) {
        return study.isSite(study.getParentStudyId()) ? findAllByDefinitionAndSiteIdAndParentStudyId(definitionId, study.getId(), study.getParentStudyId())
            : findAllParentsByDefinition(definitionId);
    }

    /**
     * Find all EventDefinitionCRFBean which have no parent
     * EventDefinitionCRFBean.
     * 
     * @param definitionId
     * @return
     */
    public ArrayList<EventDefinitionCRFBean> findAllParentsByDefinition(int definitionId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));

        String sql = digester.getQuery("findAllParentsByDefinition");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    /**
     * Find all EventDefinitionCRFBean for the site
     * 
     * @param definitionId
     * @param siteId
     * @param parentStudyId
     * @return
     */
    public ArrayList<EventDefinitionCRFBean> findAllByDefinitionAndSiteIdAndParentStudyId(int definitionId, int siteId, int parentStudyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));
        variables.put(new Integer(2), new Integer(siteId));
        variables.put(new Integer(3), new Integer(parentStudyId));
        variables.put(new Integer(4), new Integer(definitionId));
        variables.put(new Integer(5), new Integer(siteId));

        String sql = digester.getQuery("findAllByDefinitionAndSiteIdAndParentStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    
    public ArrayList<EventDefinitionCRFBean> findAllByCrfDefinitionInSiteOnly(int definitionId, int crfId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));
        variables.put(new Integer(2), new Integer(crfId));

        String sql = digester.getQuery("findAllByCrfDefinitionInSiteOnly");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList <EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }
    
    
    public ArrayList<EventDefinitionCRFBean> findAllActiveSitesAndStudiesPerParentStudy(int parentStudyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(parentStudyId));
        variables.put(new Integer(2), new Integer(parentStudyId));

        String sql = digester.getQuery("findAllActiveSitesAndStudiesPerParentStudy");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList <EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }
    
    public ArrayList<EventDefinitionCRFBean> findAllSubmissionUriAndStudyId(String submissionUri, int studyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new String(submissionUri));
        variables.put(new Integer(2), new Integer(studyId));
        variables.put(new Integer(3), new Integer(studyId));

        String sql = digester.getQuery("findAllSubmissionUriAndStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList <EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    
    
    
    
    public ArrayList<EventDefinitionCRFBean> findAllByCRF(int crfId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(crfId));

        String sql = digester.getQuery("findByCRFId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    @Override
    public ArrayList<EventDefinitionCRFBean> findAll(String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();

        return al;
    }

    @Override
    public EntityBean findByPK(int ID) {
        EventDefinitionCRFBean eb = new EventDefinitionCRFBean();
        this.setTypesExpected();

        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(ID));

        String sql = digester.getQuery("findByPK");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        if (alist != null && alist.size() > 0) {
            eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(alist.get(0));
        }

        return eb;
    }

    /**
     * Creates a new studysubject
     */
    @Override
    public EventDefinitionCRFBean create(EventDefinitionCRFBean sb) {
        HashMap<Integer, Object> variables = new HashMap<>();
		HashMap<Integer, Integer> nullVars = new HashMap<>();
        int id = getNextPK();
        // INSERT INTO EVENT_DEFINITION_CRF
        // (EVENT_DEFINITION_CRF_ID,STUDY_EVENT_DEFINITION_ID,STUDY_ID,CRF_ID,
        // REQUIRED_CRF,
        // DOUBLE_ENTRY,REQUIRE_ALL_TEXT_FILLED,DECISION_CONDITIONS,
        // NULL_VALUES,DEFAULT_VERSION_ID,STATUS_ID,OWNER_ID,DATE_CREATED,ordinal,
        // ELECTRONIC_SIGNATURE,HIDE_CRF,SOURCE_DATA_VERIFICATION_ID,
        // SELECTED_VERSION_IDS, PARENT_ID)
        // VALUES (?,?,?,?,?,?,?,?,?,?,?,?,NOW(),?,?,?,?,?,?)
        variables.put(new Integer(1), new Integer(id));
        variables.put(new Integer(2), new Integer(sb.getStudyEventDefinitionId()));
        variables.put(new Integer(3), new Integer(sb.getStudyId()));
        variables.put(new Integer(4), new Integer(sb.getCrfId()));
        variables.put(new Integer(5), new Boolean(sb.isRequiredCRF()));
        variables.put(new Integer(6), new Boolean(sb.isDoubleEntry()));
        variables.put(new Integer(7), new Boolean(sb.isRequireAllTextFilled()));
        variables.put(new Integer(8), new Boolean(sb.isDecisionCondition()));
        variables.put(new Integer(9), sb.getNullValues());
        variables.put(new Integer(10), new Integer(sb.getDefaultVersionId()));
        variables.put(new Integer(11), new Integer(sb.getStatus().getId()));
        variables.put(new Integer(12), new Integer(sb.getOwnerId()));
        variables.put(new Integer(13), new Integer(sb.getOrdinal()));
        variables.put(new Integer(14), new Boolean(sb.isElectronicSignature()));
        variables.put(new Integer(15), new Boolean(sb.isHideCrf()));
        variables.put(new Integer(16), new Integer(sb.getSourceDataVerification().getCode()));
        variables.put(new Integer(17), sb.getSelectedVersionIds());
        if (sb.getParentId() == 0) {
            nullVars.put(new Integer(18), new Integer(Types.INTEGER));
            variables.put(new Integer(18), null);
        } else {
            variables.put(new Integer(18), new Integer(sb.getParentId()));
        }
        variables.put(new Integer(19), new Boolean(sb.isParticipantForm()));
        if (sb.isParticipantForm()){
        variables.put(new Integer(20), new Boolean(sb.isAllowAnonymousSubmission()));
        }else{
            sb.setAllowAnonymousSubmission(false);
        	variables.put(new Integer(20), new Boolean(sb.isAllowAnonymousSubmission()));        	
        }
        if(sb.isAllowAnonymousSubmission()){
            if (sb.getSubmissionUrl()==null) sb.setSubmissionUrl("");
            variables.put(new Integer(21), sb.getSubmissionUrl());
        }else{
           sb.setSubmissionUrl("");
        	variables.put(new Integer(21), sb.getSubmissionUrl());
        }
        
        this.executeUpdate(digester.getQuery("create"), variables, nullVars);

        if (isQuerySuccessful()) {
            sb.setId(id);
        }

        return sb;
    }

    /**
     * Updates a Study event
     */
    @Override
    public EventDefinitionCRFBean update(EventDefinitionCRFBean sb) {
        HashMap<Integer, Object> variables = new HashMap<>();
		HashMap<Integer, Integer> nullVars = new HashMap<>();
        // UPDATE EVENT_DEFINITION_CRF SET
        // STUDY_EVENT_DEFINITION_ID=?,STUDY_ID=?,CRF_ID=?, REQUIRED_CRF=?,
        // DOUBLE_ENTRY=?,REQUIRE_ALL_TEXT_FILLED=?,DECISION_CONDITIONS=?,
        // NULL_VALUES=?,DEFAULT_VERSION_ID=?,STATUS_ID=?,DATE_UPDATED=?,UPDATE_ID=?,
        // ordinal=?,ELECTRONIC_SIGNATURE=? HIDE_CRF=?,
        // SOURCE_DATA_VERIFICATION_ID=?, Selected_version_ids=?, parent_id=?
        // WHERE EVENT_DEFINITION_CRF_ID=?
        variables.put(new Integer(1), new Integer(sb.getStudyEventDefinitionId()));
        variables.put(new Integer(2), new Integer(sb.getStudyId()));
        variables.put(new Integer(3), new Integer(sb.getCrfId()));
        variables.put(new Integer(4), new Boolean(sb.isRequiredCRF()));
        variables.put(new Integer(5), new Boolean(sb.isDoubleEntry()));
        variables.put(new Integer(6), new Boolean(sb.isRequireAllTextFilled()));
        variables.put(new Integer(7), new Boolean(sb.isDecisionCondition()));
        variables.put(new Integer(8), sb.getNullValues());
        variables.put(new Integer(9), new Integer(sb.getDefaultVersionId()));
        variables.put(new Integer(10), new Integer(sb.getStatus().getId()));
        variables.put(new Integer(11), new java.util.Date());// DATE_Updated
        variables.put(new Integer(12), new Integer(sb.getUpdater().getId()));
        variables.put(new Integer(13), new Integer(sb.getOrdinal()));
        variables.put(new Integer(14), new Boolean(sb.isElectronicSignature()));
        variables.put(new Integer(15), new Boolean(sb.isHideCrf()));
        variables.put(new Integer(16), new Integer(sb.getSourceDataVerification().getCode()));
        variables.put(new Integer(17), sb.getSelectedVersionIds());
        if (sb.getParentId() == 0) {
            nullVars.put(new Integer(18), new Integer(Types.INTEGER));
            variables.put(new Integer(18), null);
        } else {
            variables.put(new Integer(18), new Integer(sb.getParentId()));
        }
        variables.put(new Integer(19), new Boolean(sb.isParticipantForm()));
        if (sb.isParticipantForm()){
        variables.put(new Integer(20), new Boolean(sb.isAllowAnonymousSubmission()));
        }else{
            sb.setAllowAnonymousSubmission(false);
        	variables.put(new Integer(20), new Boolean(sb.isAllowAnonymousSubmission()));        	
        }
        if(sb.isAllowAnonymousSubmission()){
        variables.put(new Integer(21), sb.getSubmissionUrl());
        }else{
           sb.setSubmissionUrl("");
        	variables.put(new Integer(21), sb.getSubmissionUrl());
        }
        variables.put(new Integer(22), new Integer(sb.getId()));

        String sql = digester.getQuery("update");
        this.executeUpdate(sql, variables, nullVars);

        return sb;
    }

    @Override
    public ArrayList<EventDefinitionCRFBean> findAllByPermission(Object objCurrentUser, int intActionType, String strOrderByColumn, boolean blnAscendingSort, String strSearchPhrase) {
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();

        return al;
    }

    @Override
    public ArrayList<EventDefinitionCRFBean> findAllByPermission(Object objCurrentUser, int intActionType) {
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();

        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findByDefaultVersion(int versionId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(versionId));

        String sql = digester.getQuery("findByDefaultVersion");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllByEventDefinitionId(int eventDefinitionId) {
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(eventDefinitionId));

        return executeFindAllQuery("findAllByEventDefinitionId", variables);
    }

    public ArrayList<EventDefinitionCRFBean> findAllByEventDefinitionIdAndOrdinal(int eventDefinitionId, int ordinal) {
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(eventDefinitionId));
        variables.put(new Integer(2), new Integer(ordinal));

        return executeFindAllQuery("findAllByEventDefinitionIdAndOrdinal", variables);
    }

    /**
     * Find all EventDefinitionCRFBean for the StudyBean.
     * 
     * @param study
     * @param eventDefinitionId
     * @return
     */
    public ArrayList<EventDefinitionCRFBean> findAllByEventDefinitionId(StudyBean study, int eventDefinitionId) {
        return study.isSite(study.getParentStudyId()) ? findAllByEventDefinitionIdAndSiteIdAndParentStudyId(eventDefinitionId, study.getId(),
                study.getParentStudyId()) : findAllParentsByEventDefinitionId(eventDefinitionId);
    }

    public ArrayList<EventDefinitionCRFBean> findAllParentsByEventDefinitionId(int definitionId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));

        String sql = digester.getQuery("findAllParentsByEventDefinitionId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllByEventDefinitionIdAndSiteIdAndParentStudyId(int definitionId, int siteId, int parentStudyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));
        variables.put(new Integer(2), new Integer(siteId));
        variables.put(new Integer(3), new Integer(parentStudyId));
        variables.put(new Integer(4), new Integer(definitionId));
        variables.put(new Integer(5), new Integer(siteId));

        String sql = digester.getQuery("findAllByEventDefinitionIdAndSiteIdAndParentStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllActiveByEventDefinitionId(int eventDefinitionId) {
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(eventDefinitionId));

        return executeFindAllQuery("findAllActiveByEventDefinitionId", variables);
    }

    /**
     * Find all active EventDefinitionCRFBean for the StudyBean and the
     * study_event_definition_id
     * 
     * @param study
     * @param eventDefinitionId
     * @return
     */
    public ArrayList<EventDefinitionCRFBean> findAllActiveByEventDefinitionId(StudyBean study, int eventDefinitionId) {
        if (study.isSite(study.getParentStudyId())) {
            return findAllActiveByEventDefinitionIdAndSiteIdAndParentStudyId(eventDefinitionId, study.getId(), study.getParentStudyId());
        } else {
            return findAllActiveParentsByEventDefinitionId(eventDefinitionId);
        }
    }

    
    public ArrayList<EventDefinitionCRFBean> findAllActiveByEventDefinitionIdandStudyId(int definitionId , int studyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));
        variables.put(new Integer(2), new Integer(studyId));

        String sql = digester.getQuery("findAllActiveByEventDefinitionIdandStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }
    
    
    
    
    public ArrayList<EventDefinitionCRFBean> findAllDefIdandStudyId(Integer studyEventDefnId, Integer studyId) {
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefnId));
        variables.put(new Integer(2), new Integer(studyId));
        return executeFindAllQuery("findAllDefIdandStudyId", variables);
    }

    public ArrayList<EventDefinitionCRFBean> findAllDefnIdandStudyIdForSite(Integer studyEventDefnId, Integer studyId) {
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefnId));
        variables.put(new Integer(2), new Integer(studyId));
        return executeFindAllQuery("findAllDefnIdandStudyIdForSite", variables);
    }

    
    
    public ArrayList<EventDefinitionCRFBean> findAllCrfMigrationDoesNotPerform(CRFVersionBean sourceCrfVersionBean , CRFVersionBean targetCrfVersionBean ,ArrayList<String> studyEventDefnlist ,ArrayList<String>  sitelist) {
        HashMap<Integer, Object> variables = new HashMap<>();
        String eventStr =StringUtils.join(studyEventDefnlist, ",");
        String siteStr =StringUtils.join(sitelist, ",");
        variables.put(new Integer(1), new Integer(sourceCrfVersionBean.getId()));
        variables.put(2, eventStr);
        variables.put(3, siteStr);
        variables.put(4, String.valueOf(sourceCrfVersionBean.getId()));
        variables.put(5, String.valueOf(targetCrfVersionBean.getId()));

        return executeFindAllQuery("findAllCrfMigrationDoesNotPerform", variables);
    }

    
        
    public ArrayList<EventDefinitionCRFBean> findAllActiveParentsByEventDefinitionId(int definitionId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));

        String sql = digester.getQuery("findAllActiveParentsByEventDefinitionId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllActiveByEventDefinitionIdAndSiteIdAndParentStudyId(int definitionId, int siteId, int parentStudyId) {
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(definitionId));
        variables.put(new Integer(2), new Integer(siteId));
        variables.put(new Integer(3), new Integer(parentStudyId));
        variables.put(new Integer(4), new Integer(definitionId));
        variables.put(new Integer(5), new Integer(siteId));

        String sql = digester.getQuery("findAllActiveByEventDefinitionIdAndSiteIdAndParentStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        for(HashMap<String, Object> hm : alist) {
            EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            al.add(eb);
        }
        return al;
    }

    public ArrayList<EventDefinitionCRFBean> findAllActiveNonHiddenByEventDefinitionIdAndStudy(int definitionId, StudyBean study) {
        ArrayList<EventDefinitionCRFBean> al = new ArrayList<>();
        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        if (study.getParentStudyId() > 0) {
            variables.put(new Integer(1), new Integer(definitionId));
            variables.put(new Integer(2), new Integer(study.getId()));
            variables.put(new Integer(3), new Integer(definitionId));

            String sql = digester.getQuery("findAllActiveNonHiddenByEventDefinitionIdAndSite");
            ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
            for(HashMap<String, Object> hm : alist) {
                EventDefinitionCRFBean eb = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
                al.add(eb);
            }
        }
        return al;
    }

    /**
     * isRequiredInDefinition, looks at a specific EventCRF and determines if
     * it's required or not
     * 
     * @return boolean to tell us if it's required or not.
     */
    public boolean isRequiredInDefinition(int crfVersionId, StudyEventBean studyEvent) {
        StudyBean study = new StudyDAO(this.ds).findByStudySubjectId(studyEvent.getStudySubjectId());
        int studyEventId = studyEvent.getId();

        /*
         * select distinct event_definition_crf.study_id,
         * event_definition_crf.required_crf, event_definition_crf.parent_id
         * from event_definition_crf, event_crf, crf_version, study_event where
         * crf_version.crf_version_id = 29 and crf_version.crf_version_id =
         * event_crf.crf_version_id and crf_version.crf_id =
         * event_definition_crf.crf_id and
         * event_definition_crf.study_event_definition_id =
         * study_event.study_event_definition_id and study_event.study_event_id
         * = 91
         */

        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.BOOL);
        this.setTypeExpected(2, TypeNames.INT);
        this.setTypeExpected(3, TypeNames.INT);
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(2), new Integer(studyEventId));
        variables.put(new Integer(1), new Integer(crfVersionId));

        String sql = digester.getQuery("isRequiredInDefinition");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        Boolean answer = false;
        Boolean siteR = false;
        Boolean studyR = false;
        Boolean isExisted = false;
        for(HashMap<String, Object> hm : alist) {
            Integer dbStudyId = (Integer) hm.get("study_id");
            Integer parentId = (Integer) hm.get("parent_id");
            if (dbStudyId == study.getId()) {
                if (parentId != null && parentId > 0) {
                    siteR = (Boolean) hm.get("required_crf");
                    isExisted = true;
                } else {
                    studyR = (Boolean) hm.get("required_crf");
                }
            } else if (dbStudyId == study.getParentStudyId()) {
                studyR = (Boolean) hm.get("required_crf");
            }
        }
        if (study.isSite(study.getParentStudyId()) && isExisted) {
            answer = siteR;
        } else {
            answer = studyR;
        }

        logger.debug("We are returning " + answer.toString() + " for crfVersionId " + crfVersionId + " and studyEventId " + studyEventId);
        return answer.booleanValue();
    }

    /**
     * @param study
     * @param studyEventId
     * @param crfVersionId
     * @return
     */
    public EventDefinitionCRFBean findByStudyEventIdAndCRFVersionId(StudyBean study, int studyEventId, int crfVersionId) {
        EventDefinitionCRFBean edc = new EventDefinitionCRFBean();

        if (study.isSite(study.getParentStudyId())) {
            edc = this.findByStudyEventIdAndCRFVersionIdAndSiteIdAndParentStudyId(studyEventId, crfVersionId, study.getId(), study.getParentStudyId());
        } else {
            edc = this.findForStudyByStudyEventIdAndCRFVersionId(studyEventId, crfVersionId);
        }
        return edc;
    }

    /**
     * Find the EventDefinitionCRFBean of a study. So this
     * EventDefinitionCRFBean has no parent.
     * 
     * @param studyEventId
     *            The requested study event id.
     * @param crfVersionId
     *            The requested CRF version id.
     * @return The event definition crf which defines the study event and crf
     *         version.
     */
    public EventDefinitionCRFBean findForStudyByStudyEventIdAndCRFVersionId(int studyEventId, int crfVersionId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventId));
        variables.put(new Integer(2), new Integer(crfVersionId));

        String sql = digester.getQuery("findForStudyByStudyEventIdAndCRFVersionId");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    public EventDefinitionCRFBean findByStudyEventIdAndCRFVersionIdAndSiteIdAndParentStudyId(int studyEventId, int crfVersionId, int siteId, int parentStudyId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventId));
        variables.put(new Integer(2), new Integer(crfVersionId));
        variables.put(new Integer(3), new Integer(siteId));
        variables.put(new Integer(4), new Integer(parentStudyId));
        variables.put(new Integer(5), new Integer(siteId));

        String sql = digester.getQuery("findByStudyEventIdAndCRFVersionIdAndSiteIdAndParentStudyId");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    /**
     * @param studyEventDefinitionId
     *            The study event definition of the desired event definition
     *            crf.
     * @param crfId
     *            The CRF of the desired event definition crf.
     * @return The event definition crf for the specified study event definition
     *         and CRF.
     */
    public EventDefinitionCRFBean findByStudyEventDefinitionIdAndCRFId(int studyEventDefinitionId, int crfId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefinitionId));
        variables.put(new Integer(2), new Integer(crfId));

        String sql = digester.getQuery("findByStudyEventDefinitionIdAndCRFId");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    public EventDefinitionCRFBean findByStudyEventDefinitionIdAndCRFIdAndStudyId(int studyEventDefinitionId, int crfId, int studyId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefinitionId));
        variables.put(new Integer(2), new Integer(crfId));
        variables.put(new Integer(3), new Integer(studyId));

        String sql = digester.getQuery("findByStudyEventDefinitionIdAndCRFIdAndStudyId");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    /**
     * Find EventDefinitionCRFBean for the StudyBean.
     * 
     * @param study
     * @param studyEventDefinitionId
     * @param crfId
     * @return
     */
    public EventDefinitionCRFBean findByStudyEventDefinitionIdAndCRFId(StudyBean study, int studyEventDefinitionId, int crfId) {
        return study.isSite(study.getParentStudyId()) ? findByStudyEventDefinitionIdAndCRFIdAndSiteIdAndParentStudyId(studyEventDefinitionId, crfId,
                study.getId(), study.getParentStudyId()) : findForStudyByStudyEventDefinitionIdAndCRFId(studyEventDefinitionId, crfId);
    }

    /**
     * Find EventDefinitionCRFBean for a study. So this EventDefinitionCRFBean
     * has no parent.
     * 
     * @param studyEventDefinitionId
     * @param crfId
     * @return
     */
    public EventDefinitionCRFBean findForStudyByStudyEventDefinitionIdAndCRFId(int studyEventDefinitionId, int crfId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefinitionId));
        variables.put(new Integer(2), new Integer(crfId));

        String sql = digester.getQuery("findForStudyByStudyEventDefinitionIdAndCRFId");

        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    public EventDefinitionCRFBean findByStudyEventDefinitionIdAndCRFIdAndSiteIdAndParentStudyId(int studyEventDefinitionId, int crfId, int siteId,
            int parentStudyId) {
        EventDefinitionCRFBean answer = new EventDefinitionCRFBean();

        this.setTypesExpected();
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(studyEventDefinitionId));
        variables.put(new Integer(2), new Integer(crfId));
        variables.put(new Integer(3), new Integer(siteId));
        variables.put(new Integer(4), new Integer(parentStudyId));
        variables.put(new Integer(5), new Integer(siteId));

        String sql = digester.getQuery("findByStudyEventDefinitionIdAndCRFIdAndSiteIdAndParentStudyId");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            answer = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
        }

        return answer;
    }

    public Set<String> findHiddenCrfIdsBySite(StudyBean study) {
        Set<String> ids = new TreeSet<String>();
        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.INT);
        this.setTypeExpected(3, TypeNames.STRING);
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(study.getId()));
        String sql = digester.getQuery("findHiddenCrfIdAndNamesBySite");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            ids.add(hm.get("study_event_definition_id") + "_" + hm.get("crf_id"));
        }

        return ids;
    }

    public Set<String> findHiddenCrfNamesBySite(StudyBean study) {
        Set<String> names = new TreeSet<String>();
        this.unsetTypeExpected();
        this.setTypeExpected(1, TypeNames.INT);
        this.setTypeExpected(2, TypeNames.INT);
        this.setTypeExpected(3, TypeNames.STRING);
        HashMap<Integer, Object> variables = new HashMap<>();
        variables.put(new Integer(1), new Integer(study.getId()));
        String sql = digester.getQuery("findHiddenCrfIdAndNamesBySite");
        ArrayList<HashMap<String, Object>> alist = this.select(sql, variables);
        for(HashMap<String, Object> hm : alist) {
            names.add(hm.get("study_event_definition_id") + "_" + hm.get("name"));
        }

        return names;
    }

    /**
     * Loads all {@link EventDefinitionCRFBean} associated to the list of
     * {@link StudyEventDefinitionBean}
     * 
     * @return
     */
    public Map<Integer, SortedSet<EventDefinitionCRFBean>> buildEventDefinitionCRFListByStudyEventDefinition(Integer studySubjectId, Integer siteId,
            Integer parentStudyId) {
        this.setTypesExpected(); // <== Must be called first

        HashMap<Integer, Object> param = new HashMap<Integer, Object>();
        int i = 1;
        param.put(i++, studySubjectId);
        param.put(i++, siteId);
        param.put(i++, parentStudyId);
        param.put(i++, studySubjectId);
        param.put(i++, siteId);

        ArrayList<HashMap<String, Object>> selectResult = select(digester.getQuery("buildEventDefinitionCRFListByStudyEventDefinition"), param);

        Map<Integer, SortedSet<EventDefinitionCRFBean>> result = new HashMap<Integer, SortedSet<EventDefinitionCRFBean>>();
        for(HashMap<String, Object> hm : selectResult) {
            EventDefinitionCRFBean bean = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            Integer studyEventDefinitionId = bean.getStudyEventDefinitionId();

            if (!result.containsKey(studyEventDefinitionId)) {
                result.put(studyEventDefinitionId, new TreeSet<EventDefinitionCRFBean>(new EventDefinitionCRFComparator()));
            }
            result.get(studyEventDefinitionId).add(bean);

        }

        return result;
    }

    public Map<Integer, SortedSet<EventDefinitionCRFBean>> buildEventDefinitionCRFListByStudyEventDefinitionForStudy(Integer studySubjectId) {
        this.setTypesExpected(); // <== Must be called first

        HashMap<Integer, Object> param = new HashMap<Integer, Object>();
        int i = 1;
        param.put(i++, studySubjectId);

        ArrayList<HashMap<String, Object>> selectResult = select(digester.getQuery("buildEventDefinitionCRFListByStudyEventDefinitionForStudy"), param);

        Map<Integer, SortedSet<EventDefinitionCRFBean>> result = new HashMap<Integer, SortedSet<EventDefinitionCRFBean>>();
        for(HashMap<String, Object> hm : selectResult) {
            EventDefinitionCRFBean bean = (EventDefinitionCRFBean) this.getEntityFromHashMap(hm);
            Integer studyEventDefinitionId = bean.getStudyEventDefinitionId();

            if (!result.containsKey(studyEventDefinitionId)) {
                result.put(studyEventDefinitionId, new TreeSet<EventDefinitionCRFBean>(new EventDefinitionCRFComparator()));
            }
            result.get(studyEventDefinitionId).add(bean);

        }

        return result;
    }

    private class EventDefinitionCRFComparator implements Comparator<EventDefinitionCRFBean> {

        @Override
        public int compare(EventDefinitionCRFBean o1, EventDefinitionCRFBean o2) {
            Integer ord1 = o1.getOrdinal();
            Integer ord2 = o2.getOrdinal();
            /*
             * There are DB entries with same ordinal, that cause one of the
             * beans to not be added to the set. To avoid that this method will
             * return -1 when comparing them.
             */
            int comparison = ord1.compareTo(ord2);
            return comparison == 0 ? -1 : comparison;
        }

    }

	@Override
	public EventDefinitionCRFBean emptyBean() {
		return new EventDefinitionCRFBean();
	}

}