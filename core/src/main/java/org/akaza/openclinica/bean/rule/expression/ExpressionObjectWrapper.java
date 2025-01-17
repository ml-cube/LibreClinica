/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.rule.expression;

import org.akaza.openclinica.bean.managestudy.StudyBean;
import org.akaza.openclinica.bean.rule.RuleSetBean;

import java.util.HashMap;

import javax.sql.DataSource;

public class ExpressionObjectWrapper {

    DataSource ds;
    StudyBean studyBean;
    ExpressionBean expressionBean;
    RuleSetBean ruleSet;

    // This will carry item/value pairs used in DataEntry Rule Execution
    HashMap<String, String> itemsAndTheirValues = new HashMap<String, String>();

    public ExpressionObjectWrapper(DataSource ds, StudyBean studyBean, ExpressionBean expressionBean) {
        super();
        this.ds = ds;
        this.studyBean = studyBean;
        this.expressionBean = expressionBean;
    }

    public ExpressionObjectWrapper(DataSource ds, StudyBean studyBean, ExpressionBean expressionBean, RuleSetBean ruleSet) {
        super();
        this.ds = ds;
        this.studyBean = studyBean;
        this.expressionBean = expressionBean;
        this.ruleSet = ruleSet;
    }

    public ExpressionObjectWrapper(DataSource ds, StudyBean studyBean, ExpressionBean expressionBean, RuleSetBean ruleSet,
            HashMap<String, String> itemsAndTheirValues) {
        super();
        this.ds = ds;
        this.studyBean = studyBean;
        this.expressionBean = expressionBean;
        this.ruleSet = ruleSet;
        this.itemsAndTheirValues = itemsAndTheirValues;
    }

    /**
     * @return the expressionBean
     */
    public ExpressionBean getExpressionBean() {
        return expressionBean;
    }

    /**
     * @param expressionBean
     *            the expressionBean to set
     */
    public void setExpressionBean(ExpressionBean expressionBean) {
        this.expressionBean = expressionBean;
    }

    /**
     * @return the ds
     */
    public DataSource getDs() {
        return ds;
    }

    /**
     * @param ds
     *            the ds to set
     */
    public void setDs(DataSource ds) {
        this.ds = ds;
    }

    /**
     * @return the studyBean
     */
    public StudyBean getStudyBean() {
        return studyBean;
    }

    /**
     * @param studyBean
     *            the studyBean to set
     */
    public void setStudyBean(StudyBean studyBean) {
        this.studyBean = studyBean;
    }

    /**
     * @return the ruleSet
     */
    public RuleSetBean getRuleSet() {
        return ruleSet;
    }

    /**
     * @param ruleSet
     *            the ruleSet to set
     */
    public void setRuleSet(RuleSetBean ruleSet) {
        this.ruleSet = ruleSet;
    }

    /**
     * @return the itemsAndTheirValues
     */
    public HashMap<String, String> getItemsAndTheirValues() {
        return itemsAndTheirValues;
    }

    /**
     * @param itemsAndTheirValues
     *            the itemsAndTheirValues to set
     */
    public void setItemsAndTheirValues(HashMap<String, String> itemsAndTheirValues) {
        this.itemsAndTheirValues = itemsAndTheirValues;
    }

}
