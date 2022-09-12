/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.extract;

/**
 * @author jxu
 */
public class TabReportBean extends TextReportBean {
    public TabReportBean() {
        end = "\n";// ending character
        sep = "\t";// seperating character
    }
}
