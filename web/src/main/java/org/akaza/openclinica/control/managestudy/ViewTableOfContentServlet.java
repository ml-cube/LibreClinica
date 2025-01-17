/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.managestudy;

import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.DataSource;

import org.akaza.openclinica.bean.admin.CRFBean;
import org.akaza.openclinica.bean.core.Role;
import org.akaza.openclinica.bean.managestudy.StudyEventDefinitionBean;
import org.akaza.openclinica.bean.submit.CRFVersionBean;
import org.akaza.openclinica.bean.submit.DisplayTableOfContentsBean;
import org.akaza.openclinica.bean.submit.EventCRFBean;
import org.akaza.openclinica.bean.submit.SectionBean;
import org.akaza.openclinica.control.core.SecureController;
import org.akaza.openclinica.control.form.FormProcessor;
import org.akaza.openclinica.control.submit.TableOfContentsServlet;
import org.akaza.openclinica.dao.admin.CRFDAO;
import org.akaza.openclinica.dao.submit.CRFVersionDAO;
import org.akaza.openclinica.dao.submit.SectionDAO;
import org.akaza.openclinica.view.Page;
import org.akaza.openclinica.web.InsufficientPermissionException;

/**
 * To view the table of content of an event CRF
 *
 * @author jxu
 */
public class ViewTableOfContentServlet extends SecureController {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8099405927721278164L;

	/**
     * Checks whether the user has the correct privilege
     */
    @Override
    public void mayProceed() throws InsufficientPermissionException {
        if (ub.isSysAdmin()) {
            return;
        }
        if (currentRole.getRole().equals(Role.STUDYDIRECTOR) || currentRole.getRole().equals(Role.COORDINATOR)
            || currentRole.getRole().equals(Role.INVESTIGATOR) || currentRole.getRole().equals(Role.RESEARCHASSISTANT) || currentRole.getRole().equals(Role.RESEARCHASSISTANT2)) {
            return;
        }

        addPageMessage(respage.getString("no_have_correct_privilege_current_study") + " " + respage.getString("change_study_contact_sysadmin"));
        throw new InsufficientPermissionException(Page.MENU_SERVLET, resexception.getString("not_director"), "1");

    }

    @Override
    public void processRequest() throws Exception {
        FormProcessor fp = new FormProcessor(request);
        int crfVersionId = fp.getInt("crfVersionId");
        // YW <<
        int sedId = fp.getInt("sedId");
        request.setAttribute("sedId", new Integer(sedId) + "");
        // YW >>
        DisplayTableOfContentsBean displayBean = getDisplayBean(sm.getDataSource(), crfVersionId);
        request.setAttribute("toc", displayBean);
        forwardPage(Page.VIEW_TABLE_OF_CONTENT);
    }

    public static DisplayTableOfContentsBean getDisplayBean(DataSource ds, int crfVersionId) {
        DisplayTableOfContentsBean answer = new DisplayTableOfContentsBean();

        ArrayList<SectionBean> sections = getSections(crfVersionId, ds);
        answer.setSections(sections);

        CRFVersionDAO cvdao = new CRFVersionDAO(ds);
        CRFVersionBean cvb = (CRFVersionBean) cvdao.findByPK(crfVersionId);
        answer.setCrfVersion(cvb);

        CRFDAO cdao = new CRFDAO(ds);
        CRFBean cb = (CRFBean) cdao.findByPK(cvb.getCrfId());
        answer.setCrf(cb);

        answer.setEventCRF(new EventCRFBean());

        answer.setStudyEventDefinition(new StudyEventDefinitionBean());

        return answer;
    }

    public static ArrayList<SectionBean> getSections(int crfVersionId, DataSource ds) {
        SectionDAO sdao = new SectionDAO(ds);

        HashMap<Integer, Integer> numItemsBySectionId = sdao.getNumItemsBySectionId();
        ArrayList<SectionBean> sections = sdao.findAllByCRFVersionId(crfVersionId);

        for (int i = 0; i < sections.size(); i++) {
            SectionBean sb = (SectionBean) sections.get(i);

            int sectionId = sb.getId();
            Integer key = new Integer(sectionId);
            sb.setNumItems(TableOfContentsServlet.getIntById(numItemsBySectionId, key));
            sections.set(i, sb);
        }

        return sections;
    }

}
