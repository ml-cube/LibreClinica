/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control.form;

// TODO duplicate of the version in the web module?
public class ValidatorRegularExpression {
    private String description;
    private String regularExpression;

    public ValidatorRegularExpression(String description, String regularExpression) {
        this.description = description;
        this.regularExpression = regularExpression;
    }

    /**
     * @return Returns the description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     *            The description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Returns the regularExpression.
     */
    public String getRegularExpression() {
        return regularExpression;
    }

    /**
     * @param regularExpression
     *            The regularExpression to set.
     */
    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }
}