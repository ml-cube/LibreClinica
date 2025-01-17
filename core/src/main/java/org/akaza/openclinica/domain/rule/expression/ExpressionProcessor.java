/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/* 
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).
 * For details see: https://I3LUNG.org/license
 *
 * Copyright 2003-2008 Akaza Research 
 */
package org.akaza.openclinica.domain.rule.expression;

import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * @author Krikor Krumlian
 * 
 */
public interface ExpressionProcessor {

    String isRuleAssignmentExpressionValid();

    String isRuleExpressionValid();

    boolean process();

    void setExpression(ExpressionBean e);

    String testEvaluateExpression();

    HashMap<String, String> testEvaluateExpression(HashMap<String, String> testValues);

    void setRespage(ResourceBundle respage);

}
