/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.domain;

/**
 * @author ssachs
 */
public class EntityBeanColumn {
    private String name;
    private boolean showLink;

    public EntityBeanColumn() {
        name = "";
        showLink = true;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the showLink.
     */
    public boolean isShowLink() {
        return showLink;
    }

    /**
     * @param showLink
     *            The showLink to set.
     */
    public void setShowLink(boolean showLink) {
        this.showLink = showLink;
    }
}
