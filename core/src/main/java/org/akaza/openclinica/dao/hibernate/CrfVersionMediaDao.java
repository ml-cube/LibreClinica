/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import java.util.ArrayList;
import org.akaza.openclinica.domain.datamap.CrfVersionMedia;
import org.hibernate.query.Query;

public class CrfVersionMediaDao extends AbstractDomainDao<CrfVersionMedia> {

    @Override
    Class<CrfVersionMedia> domainClass() {
        // TODO Auto-generated method stub
        return CrfVersionMedia.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public ArrayList<CrfVersionMedia> findByCrfVersionId(int crf_version_id) {
        String query = "from " + getDomainClassName() + " crf_version_media  where crf_version_media.crfVersion.crfVersionId = :crfversionid ";
        Query<CrfVersionMedia> q = getCurrentSession().createQuery(query, CrfVersionMedia.class);
        q.setInteger("crfversionid", crf_version_id);
        return new ArrayList<>(q.list());
    }
}
