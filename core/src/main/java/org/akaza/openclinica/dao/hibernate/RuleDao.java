/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.rule.RuleBean;
import org.hibernate.query.Query;

public class RuleDao extends AbstractDomainDao<RuleBean> {

    @Override
    public Class<RuleBean> domainClass() {
        return RuleBean.class;
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public RuleBean findByOid(RuleBean ruleBean) {
        String query = "from " + getDomainClassName() + " rule  where rule.oid = :oid and  rule.studyId = :studyId ";
        Query<RuleBean> q = getCurrentSession().createQuery(query, RuleBean.class);
        q.setString("oid", ruleBean.getOid());
        q.setInteger("studyId", ruleBean.getStudyId());
        return q.uniqueResult();
    }

    // TODO update to CriteriaQuery 
    @SuppressWarnings("deprecation")
    public RuleBean findByOid(String oid, Integer studyId) {
        String query = "from " + getDomainClassName() + " rule  where rule.oid = :oid and  rule.studyId = :studyId ";
        Query<RuleBean> q = getCurrentSession().createQuery(query, RuleBean.class);
        q.setString("oid", oid);
        q.setInteger("studyId", studyId);
        return q.uniqueResult();
    }

}
