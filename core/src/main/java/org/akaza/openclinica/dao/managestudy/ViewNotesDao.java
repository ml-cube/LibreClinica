/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.managestudy;

import java.util.List;

import org.akaza.openclinica.bean.managestudy.DiscrepancyNoteBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.service.DiscrepancyNotesSummary;
import org.akaza.openclinica.service.managestudy.ViewNotesFilterCriteria;
import org.akaza.openclinica.service.managestudy.ViewNotesSortCriteria;

/**
 * @author Doug Rodrigues (douglas.rodrigues@openclinica.com)
 *
 */
public interface ViewNotesDao {

    List<DiscrepancyNoteBean> findAllDiscrepancyNotes(StudyBean currentStudy, ViewNotesFilterCriteria filter,
            ViewNotesSortCriteria sort);

    DiscrepancyNotesSummary calculateNotesSummary(StudyBean currentStudy, ViewNotesFilterCriteria filter);


}
