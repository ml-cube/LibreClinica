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
public class ElementOIDBean implements Comparable<ElementOIDBean> {
    private String oid;

    public int compareTo(ElementOIDBean o) {
        return this.oid.compareTo(o.getOid());
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getOid() {
        return this.oid;
    }
}