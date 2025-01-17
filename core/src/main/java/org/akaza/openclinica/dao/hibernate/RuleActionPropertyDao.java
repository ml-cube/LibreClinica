/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import java.util.ArrayList;

import org.akaza.openclinica.domain.rule.action.PropertyBean;
import org.hibernate.query.Query;

public class RuleActionPropertyDao extends AbstractDomainDao<PropertyBean> {

    @Override
    public Class<PropertyBean> domainClass() {
        return PropertyBean.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public ArrayList <PropertyBean> findByOid(String itemOid , String groupOid) {
        String query = "from " + getDomainClassName() +  "  where oc_oid = :itemOid OR oc_oid=:groupOid ";
        Query<PropertyBean> q = getCurrentSession().createQuery(query, PropertyBean.class);
        q.setString("itemOid", itemOid);
        q.setString("groupOid", groupOid);
        return new ArrayList<>(q.list());
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public ArrayList <PropertyBean> findByOid(String Oid) {
        String query = "from " + getDomainClassName() +  "  where oc_oid=:Oid ";
        Query<PropertyBean> q = getCurrentSession().createQuery(query, PropertyBean.class);
        q.setString("Oid", Oid);
        return new ArrayList<>(q.list());
    }


}
