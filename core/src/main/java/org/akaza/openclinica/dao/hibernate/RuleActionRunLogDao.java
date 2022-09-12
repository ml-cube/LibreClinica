/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.rule.action.RuleActionRunLogBean;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Projections;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

public class RuleActionRunLogDao extends AbstractDomainDao<RuleActionRunLogBean> {

    @Override
    public Class<RuleActionRunLogBean> domainClass() {
        return RuleActionRunLogBean.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    @Transactional
    public Integer findCountByRuleActionRunLogBean(RuleActionRunLogBean ruleActionRunLog) {
        Long k =
            (Long) getCurrentSession().createCriteria(domainClass()).add(Example.create(ruleActionRunLog)).setProjection(Projections.rowCount()).list().get(0);
        return k.intValue();
    }

    // TODO update to CriteriaQuery
    @Transactional
    public void delete(int itemDataId) {
        String query = "delete from " + getDomainClassName() + " rarl where rarl.itemDataId = :itemDataId";
        Query<?> q = getCurrentSession().createQuery(query);
        q.setParameter("itemDataId", itemDataId);
        q.executeUpdate();
    }

}
