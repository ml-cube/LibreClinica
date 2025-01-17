/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.rule.RuleSetBean;
import org.akaza.openclinica.domain.rule.RuleSetRuleAuditBean;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class RuleSetRuleAuditDao extends AbstractDomainDao<RuleSetRuleAuditBean> {

    @Override
    public Class<RuleSetRuleAuditBean> domainClass() {
        return RuleSetRuleAuditBean.class;
    }

    // TODO update to CriteriaQuery 
    public ArrayList<RuleSetRuleAuditBean> findAllByRuleSet(RuleSetBean ruleSet) {
        String query = "from " + getDomainClassName() + " ruleSetRuleAudit  where ruleSetRuleAudit.ruleSetRuleBean.ruleSetBean = :ruleSet  ";
        Query<RuleSetRuleAuditBean> q = getCurrentSession().createQuery(query, RuleSetRuleAuditBean.class);
        q.setParameter("ruleSet", ruleSet);
        return new ArrayList<>(q.list());
    }
}
