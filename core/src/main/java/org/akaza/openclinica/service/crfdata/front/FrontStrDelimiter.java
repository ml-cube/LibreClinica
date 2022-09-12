/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * copyright 2003-2011 Akaza Research
 */
package org.akaza.openclinica.service.crfdata.front;

/**
 * <P>For chain up elements so string could be passed to the front-end</P>
 */
//ywang (Aug, 2011)
public enum FrontStrDelimiter {
    NONE(""), INNER("---");

    private String code;

    FrontStrDelimiter(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}