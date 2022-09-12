/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.view;

/**
 * @author ssachs
 */
public class Link {
    private String caption = "";
    private String url = "";

    /**
     * @param caption
     *            The caption to set.
     * @param url
     *            The url to set.
     */
    public Link(String caption, String url) {
        this.caption = caption;
        this.url = url;
    }

    /**
     * @return Returns the caption.
     */
    public String getCaption() {
        return caption;
    }

    /**
     * @param caption
     *            The caption to set.
     */
    public void setCaption(String caption) {
        this.caption = caption;
    }

    /**
     * @return Returns the url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     *            The url to set.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
