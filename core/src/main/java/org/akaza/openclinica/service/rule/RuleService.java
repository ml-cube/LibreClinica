/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/* 
 * GNU Lesser General Public License (GNU LGPL).
 * For details see: https://I3LUNG.org/license
 *
 * I3LUNG is distributed under the
 * Copyright 2003-2008 Akaza Research 
 */
package org.akaza.openclinica.service.rule;

import javax.sql.DataSource;

import org.akaza.openclinica.bean.rule.RuleBean;
import org.akaza.openclinica.bean.rule.RuleSetBean;
import org.akaza.openclinica.dao.rule.RuleDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RuleService {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());
    DataSource ds;
    private RuleDAO ruleDao;

    public RuleService(DataSource ds) {
        this.ds = ds;
    }

    public boolean enableRules(RuleSetBean ruleSet) {
        return true;
    }

    public boolean disableRules() {
        return true;

    }

    public RuleBean saveRule(RuleBean ruleBean) {
        return (RuleBean) getRuleDao().create(ruleBean);
    }

    public RuleBean updateRule(RuleBean ruleBean) {
        return (RuleBean) getRuleDao().update(ruleBean);
    }

    private RuleDAO getRuleDao() {
        ruleDao = this.ruleDao != null ? ruleDao : new RuleDAO(ds);
        return ruleDao;
    }

}
