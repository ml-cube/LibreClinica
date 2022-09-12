/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.extract;

import java.util.ArrayList;

/**
 * @author jxu
 *
 */
public class TextReportBean extends ReportBean<String> {
    protected String end;
    protected String sep;

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < metadata.size(); i++) {
            ArrayList<String> row = metadata.get(i);
            for (int j = 0; j < row.size(); j++) {
                buffer.append(row.get(j));
                buffer.append(sep);
            }
            buffer.append(end);
        }

        for (int i = 0; i < data.size(); i++) {
            ArrayList<String> row = data.get(i);
            for (int j = 0; j < row.size(); j++) {
                String s = ((String)row.get(j)).replaceAll("\\s", " ");
                buffer.append(s);
                buffer.append(sep);
            }
            buffer.append(end);
        }
        return buffer.toString();

    }
}
