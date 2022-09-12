/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import java.util.List;

import org.akaza.openclinica.domain.datamap.EventDefinitionCrfItemTag;
import org.hibernate.query.Query;

public class EventDefinitionCrfItemTagDao extends AbstractDomainDao<EventDefinitionCrfItemTag> {

    @Override
    Class<EventDefinitionCrfItemTag> domainClass() {
        // TODO Auto-generated method stub
        return EventDefinitionCrfItemTag.class;
    }

    // TODO update to CriteriaQuery 
    public List<EventDefinitionCrfItemTag> findAllByCrfPath(int tag_id, String crfPath, boolean active) {

        String query = " from " + getDomainClassName() + "  where " + " tag_id= " + tag_id + " and active=" + active + " and path LIKE '" + crfPath + ".%'";

        Query<EventDefinitionCrfItemTag> q = getCurrentSession().createQuery(query, EventDefinitionCrfItemTag.class);
        return q.list();
    }

    // TODO update to CriteriaQuery 
    public EventDefinitionCrfItemTag findByItemPath(int tag_id, boolean active, String itemPath) {

        String query = " from " + getDomainClassName() + "  where " + " tag_id= " + tag_id + " and active=" + active + " and path= '" + itemPath + "'";

        Query<EventDefinitionCrfItemTag> q = getCurrentSession().createQuery(query, EventDefinitionCrfItemTag.class);
        return q.uniqueResult();
    }

}
