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

public class MetaDataVersionIncludeBean {
    private String studyOID;
    private String metaDataVersionOID;

    public void setStudyOID(String studyoid) {
        this.studyOID = studyoid;
    }

    public String getStudyOID() {
        return this.studyOID;
    }

    public void setMetaDataVersionOID(String metadataVersionOID) {
        this.metaDataVersionOID = metadataVersionOID;
    }

    public String getMetaDataVersionOID() {
        return this.metaDataVersionOID;
    }
}