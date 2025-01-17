/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.submit;

import java.io.Serializable;

/**
 * @author ssachs
 */
public class ResponseOptionBean implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 949231303630146100L;

	/**
     * This will be displayed to the user.
     */
    private String text;

    /**
     * This will be stored in the database.
     */
    private String value;

    /**
     * <code>true</code> if the option was selected - either via form
     * submission or storage in the db <code>false</code> otherwise
     */
    private boolean selected;

    public ResponseOptionBean() {
        text = "";
        value = "";
        selected = false;
    }

    /**
     * @return Returns the text.
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     *            The text to set.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return Returns the value.
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     *            The value to set.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return Returns the selected.
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected
     *            The selected to set.
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
