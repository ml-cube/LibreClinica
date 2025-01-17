/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.user.UserType;
import org.hibernate.query.Query;

public class UserTypeDao extends AbstractDomainDao<UserType> {
	
    @Override
    public Class<UserType> domainClass() {
        return UserType.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public UserType findByUserTypeId(Integer userTypeId) {
        getSessionFactory().getStatistics().logSummary();
        String query = "from " + getDomainClassName() + " do  where do.userTypeId = :user_type_id";
        Query<UserType> q = getCurrentSession().createQuery(query, UserType.class);
        q.setInteger("user_type_id", userTypeId);
        return q.uniqueResult();
    }

}
