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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ywang (May, 2008)
 * 
 */

public class MetaDataVersionProtocolBean {
    private List<ElementRefBean> studyEventRefs;
    
    public MetaDataVersionProtocolBean() {
        studyEventRefs = new ArrayList<ElementRefBean>();
    }

    public void setStudyEventRefs(List<ElementRefBean> sers) {
        this.studyEventRefs = sers;
    }

    public List<ElementRefBean> getStudyEventRefs() {
        return this.studyEventRefs;
    }
}