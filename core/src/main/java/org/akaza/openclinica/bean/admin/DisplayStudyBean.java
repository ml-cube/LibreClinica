/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.bean.admin;

import org.akaza.openclinica.bean.core.AuditableEntityBean;
import org.akaza.openclinica.bean.managestudy.StudyBean;

import java.util.ArrayList;

/**
 * @author Jun Xu
 *
 * A class for display study list properly, group studies by parent and child
 * relationship
 */
public class DisplayStudyBean extends AuditableEntityBean {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1647152945517477770L;
	private StudyBean parent;
    private ArrayList<StudyBean> children;

    /**
     * @return Returns the children.
     */
    public ArrayList<StudyBean> getChildren() {
        return children;
    }

    /**
     * @param children
     *            The children to set.
     */
    public void setChildren(ArrayList<StudyBean> children) {
        this.children = children;
    }

    /**
     * @return Returns the parent.
     */
    public StudyBean getParent() {
        return parent;
    }

    /**
     * @param parent
     *            The parent to set.
     */
    public void setParent(StudyBean parent) {
        this.parent = parent;
    }
}
