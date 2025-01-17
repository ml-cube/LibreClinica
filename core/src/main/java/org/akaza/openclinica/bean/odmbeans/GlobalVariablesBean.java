/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/*
 * I3LUNG is distributed under the GNU Lesser General Public License (GNU
 * LGPL).
 *
 * For details see: https://I3LUNG.org/license copyright 2003-2005 Akaza
 * Research
 *
 */

package org.akaza.openclinica.bean.odmbeans;

/**
 * 
 * @author ywang (May, 2008)
 * 
 */
public class GlobalVariablesBean {
    private String studyName;
    private String studyDescription;
    private String protocolName;

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getStudyName() {
        return this.studyName;
    }

    public void setStudyDescription(String description) {
        this.studyDescription = description;
    }

    public String getStudyDescription() {
        return this.studyDescription;
    }

    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    public String getProtocolName() {
        return this.protocolName;
    }
}