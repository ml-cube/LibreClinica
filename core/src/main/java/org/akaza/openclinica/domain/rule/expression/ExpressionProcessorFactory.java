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

import org.akaza.openclinica.exception.OpenClinicaSystemException;

/**
 * @author Krikor Krumlian
 * 
 */
public class ExpressionProcessorFactory {

    public static ExpressionProcessor createExpressionProcessor(ExpressionObjectWrapper expressionWrapper) {

        ExpressionProcessor ep = null;

        switch (expressionWrapper.getExpressionBean().getContext()) {
        case OC_RULES_V1: {
            ep = new OpenClinicaV1ExpressionProcessor(expressionWrapper);
            break;
        }
        default:
            throw new OpenClinicaSystemException("Context : " + expressionWrapper.getExpressionBean().getContext() + " not Valid");
        }

        return ep;

    }

}
