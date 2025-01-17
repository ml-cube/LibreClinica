/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.managestudy;

import java.util.ArrayList;
import java.util.Date;

import org.akaza.openclinica.bean.admin.CRFBean;
import org.akaza.openclinica.bean.core.Role;
import org.akaza.openclinica.bean.core.Status;
import org.akaza.openclinica.bean.managestudy.EventDefinitionCRFBean;
import org.akaza.openclinica.bean.managestudy.StudyEventBean;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.submit.CRFVersionBean;
import org.akaza.openclinica.bean.submit.EventCRFBean;
import org.akaza.openclinica.bean.submit.ItemDataBean;
import org.akaza.openclinica.control.SpringServletAccess;
import org.akaza.openclinica.control.core.SecureController;
import org.akaza.openclinica.dao.admin.CRFDAO;
import org.akaza.openclinica.dao.managestudy.EventDefinitionCRFDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDAO;
import org.akaza.openclinica.dao.managestudy.StudyEventDefinitionDAO;
import org.akaza.openclinica.dao.service.StudyParameterValueDAO;
import org.akaza.openclinica.dao.submit.CRFVersionDAO;
import org.akaza.openclinica.dao.submit.EventCRFDAO;
import org.akaza.openclinica.dao.submit.ItemDataDAO;
import org.akaza.openclinica.service.managestudy.EventDefinitionCrfTagService;
import org.akaza.openclinica.view.Page;
import org.akaza.openclinica.web.InsufficientPermissionException;

/**
 * @author jxu
 *
 * Restores a removed study event definition and all its related data
 */
public class RestoreEventDefinitionServlet extends SecureController {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5199358800249601464L;
	EventDefinitionCrfTagService eventDefinitionCrfTagService = null;
    /**
     *
     */
    @Override
    public void mayProceed() throws InsufficientPermissionException {
        checkStudyLocked(Page.LIST_DEFINITION_SERVLET, respage.getString("current_study_locked"));
        if (ub.isSysAdmin()) {
            return;
        }

        if (currentRole.getRole().equals(Role.STUDYDIRECTOR) || currentRole.getRole().equals(Role.COORDINATOR)) {
            return;
        }

        addPageMessage(respage.getString("no_have_correct_privilege_current_study") + respage.getString("change_study_contact_sysadmin"));
        throw new InsufficientPermissionException(Page.LIST_DEFINITION_SERVLET, resexception.getString("not_study_director"), "1");

    }

    @Override
    public void processRequest() throws Exception {
        String idString = request.getParameter("id");

        int defId = Integer.valueOf(idString.trim()).intValue();
        StudyEventDefinitionDAO sdao = new StudyEventDefinitionDAO(sm.getDataSource());
        StudyEventDefinitionBean sed = (StudyEventDefinitionBean) sdao.findByPK(defId);
        // find all CRFs
        EventDefinitionCRFDAO edao = new EventDefinitionCRFDAO(sm.getDataSource());
        ArrayList<EventDefinitionCRFBean> eventDefinitionCRFs = edao.findAllByDefinition(defId);

        CRFVersionDAO cvdao = new CRFVersionDAO(sm.getDataSource());
        CRFDAO cdao = new CRFDAO(sm.getDataSource());
        for (int i = 0; i < eventDefinitionCRFs.size(); i++) {
            EventDefinitionCRFBean edc = eventDefinitionCRFs.get(i);
            ArrayList<CRFVersionBean> versions = cvdao.findAllByCRF(edc.getCrfId());
            edc.setVersions(versions);
            CRFBean crf = cdao.findByPK(edc.getCrfId());
            edc.setCrfName(crf.getName());
            CRFVersionBean defaultVersion = cvdao.findByPK(edc.getDefaultVersionId());
            edc.setDefaultVersionName(defaultVersion.getName());
            CRFBean cBean = cdao.findByPK(edc.getCrfId());                
            String crfPath=sed.getOid()+"."+cBean.getOid();
            edc.setOffline(getEventDefinitionCrfTagService().getEventDefnCrfOfflineStatus(2,crfPath,true));

        }

        // finds all events
        StudyEventDAO sedao = new StudyEventDAO(sm.getDataSource());
        StudyParameterValueDAO spvdao = new StudyParameterValueDAO(sm.getDataSource());    
        ArrayList<StudyEventBean> events = sedao.findAllByDefinition(sed.getId());

        String action = request.getParameter("action");
        if (idString == null || idString.trim().isEmpty()) {
            addPageMessage(respage.getString("please_choose_a_SED_to_restore"));
            forwardPage(Page.LIST_DEFINITION_SERVLET);
        } else {
            if ("confirm".equalsIgnoreCase(action)) {
                if (!sed.getStatus().equals(Status.DELETED)) {
                    addPageMessage(respage.getString("this_SED_cannot_be_restored") + " " + respage.getString("please_contact_sysadmin_for_more_information"));
                    forwardPage(Page.LIST_DEFINITION_SERVLET);
                    return;
                }
                String participateFormStatus = spvdao.findByHandleAndStudy(sed.getStudyId(), "participantPortal").getValue();
                request.setAttribute("participateFormStatus",participateFormStatus );
                if (participateFormStatus.equals("enabled")) baseUrl();
                            
                request.setAttribute("definitionToRestore", sed);
                request.setAttribute("eventDefinitionCRFs", eventDefinitionCRFs);
                request.setAttribute("events", events);
                forwardPage(Page.RESTORE_DEFINITION);
            } else {
                logger.info("submit to restore the definition");
                // restore definition
                sed.setStatus(Status.AVAILABLE);
                sed.setUpdater(ub);
                sed.setUpdatedDate(new Date());
                sdao.update(sed);

                // restore all crfs
                for (int j = 0; j < eventDefinitionCRFs.size(); j++) {
                    EventDefinitionCRFBean edc = (EventDefinitionCRFBean) eventDefinitionCRFs.get(j);
                    if (edc.getStatus().equals(Status.AUTO_DELETED)) {
                        edc.setStatus(Status.AVAILABLE);
                        edc.setUpdater(ub);
                        edc.setUpdatedDate(new Date());
                        edao.update(edc);
                    }
                }
                // restore all events

                EventCRFDAO ecdao = new EventCRFDAO(sm.getDataSource());

                for (int j = 0; j < events.size(); j++) {
                    StudyEventBean event = (StudyEventBean) events.get(j);
                    if (event.getStatus().equals(Status.AUTO_DELETED)) {
                        event.setStatus(Status.AVAILABLE);
                        event.setUpdater(ub);
                        event.setUpdatedDate(new Date());
                        sedao.update(event);

                        ArrayList<EventCRFBean> eventCRFs = ecdao.findAllByStudyEvent(event);
                        // remove all the item data
                        ItemDataDAO iddao = new ItemDataDAO(sm.getDataSource());
                        for (int k = 0; k < eventCRFs.size(); k++) {
                            EventCRFBean eventCRF = (EventCRFBean) eventCRFs.get(k);
                            if (eventCRF.getStatus().equals(Status.AUTO_DELETED)) {
                                eventCRF.setStatus(Status.AVAILABLE);
                                eventCRF.setUpdater(ub);
                                eventCRF.setUpdatedDate(new Date());
                                ecdao.update(eventCRF);

                                ArrayList<ItemDataBean> itemDatas = iddao.findAllByEventCRFId(eventCRF.getId());
                                for (int a = 0; a < itemDatas.size(); a++) {
                                    ItemDataBean item = (ItemDataBean) itemDatas.get(a);
                                    if (item.getStatus().equals(Status.AUTO_DELETED)) {
                                        item.setStatus(Status.AVAILABLE);
                                        item.setUpdater(ub);
                                        item.setUpdatedDate(new Date());
                                        iddao.update(item);
                                    }
                                }
                            }
                        }
                    }
                }
                String emailBody =
                    respage.getString("the_SED") + " " + sed.getName() + "(" + respage.getString("and_all_associated_event_data_restored_to_study")
                        + currentStudy.getName() + ".";

                addPageMessage(emailBody);

//                sendEmail(emailBody);
                forwardPage(Page.LIST_DEFINITION_SERVLET);
            }

        }

    }

    public EventDefinitionCrfTagService getEventDefinitionCrfTagService() {
        eventDefinitionCrfTagService=
         this.eventDefinitionCrfTagService != null ? eventDefinitionCrfTagService : (EventDefinitionCrfTagService) SpringServletAccess.getApplicationContext(context).getBean("eventDefinitionCrfTagService");

         return eventDefinitionCrfTagService;
     }

}
