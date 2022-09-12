/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.service.managestudy;

import java.util.List;

import org.akaza.openclinica.bean.login.StudyUserRoleBean;
import org.akaza.openclinica.bean.login.UserAccountBean;
import org.akaza.openclinica.bean.managestudy.DisplayStudyEventBean;
import org.akaza.openclinica.bean.managestudy.StudySubjectBean;

/**
 * @author Doug Rodrigues (douglas.rodrigues@openclinica.com)
 *
 */
public interface StudySubjectService {

    /**
     *
     * @param studySubject
     * @param userAccount
     * @param currentRole
     * @return
     */
    List<DisplayStudyEventBean> getDisplayStudyEventsForStudySubject(StudySubjectBean studySubject,
            UserAccountBean userAccount, StudyUserRoleBean currentRole);

}
