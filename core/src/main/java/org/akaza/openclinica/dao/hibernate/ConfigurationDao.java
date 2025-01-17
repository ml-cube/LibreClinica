/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.technicaladmin.ConfigurationBean;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

public class ConfigurationDao extends AbstractDomainDao<ConfigurationBean> {

    @Override
    public Class<ConfigurationBean> domainClass() {
        return ConfigurationBean.class;
    }

    public ArrayList<ConfigurationBean> findAll() {
        String query = "from " + getDomainClassName();
        Query<ConfigurationBean> q = getCurrentSession().createQuery(query, ConfigurationBean.class);
        return new ArrayList<>(q.list());
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    @Transactional
    public ConfigurationBean findByKey(String key) {
        String query = "from " + getDomainClassName() + " do where do.key = :key  ";
        Query<ConfigurationBean> q = getCurrentSession().createQuery(query, ConfigurationBean.class);
        q.setString("key", key);
        return q.uniqueResult();
    }

}
