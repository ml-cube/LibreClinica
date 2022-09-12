/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.datamap.DiscrepancyNoteType;
import org.hibernate.query.Query;

public class DiscrepancyNoteTypeDao extends AbstractDomainDao<DiscrepancyNoteType> {

    @Override
    public Class<DiscrepancyNoteType> domainClass() {
        return DiscrepancyNoteType.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public DiscrepancyNoteType findByDiscrepancyNoteTypeId(Integer discrepancyNoteTypeId) {
        String query = "from " + getDomainClassName() + " do  where do.discrepancyNoteTypeId = :discrepancynotetypeid";
        Query<DiscrepancyNoteType> q = getCurrentSession().createQuery(query, DiscrepancyNoteType.class);
        q.setInteger("discrepancynotetypeid", discrepancyNoteTypeId);
        return q.uniqueResult();
    }

}
