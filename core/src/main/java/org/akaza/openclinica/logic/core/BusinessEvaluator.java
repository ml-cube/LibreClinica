/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/*
 * Created on Sep 1, 2005
 *
 *
 */
package org.akaza.openclinica.logic.core;

import org.akaza.openclinica.bean.core.EntityBean;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author thickerson
 *
 *
 */
public abstract class BusinessEvaluator implements Runnable {
    protected ArrayList<BusinessRule> ruleSet;
    protected boolean hasBeenUpdated;
    protected EntityBean businessObject;

    // the 'subject' that shall be affected:
    // could be subject, crf, etc.

    public BusinessEvaluator(EntityBean o) {
        ruleSet = new ArrayList<>();
        hasBeenUpdated = true;
        businessObject = o;
    }

    public void run() {
        if (hasBeenUpdated) {
            evaluateRuleSet();
        }
    }

    protected void evaluateRuleSet() {
        synchronized (this) {
            for (Iterator<BusinessRule> it = ruleSet.iterator(); it.hasNext();) {
                BusinessRule bRule = it.next();
                if (bRule.isPropertyTrue(bRule.getClass().getName())) {
                    bRule.doAction(businessObject);
                }
            }
            hasBeenUpdated = false;
        }
    }

    protected abstract void assertRuleSet();
}
