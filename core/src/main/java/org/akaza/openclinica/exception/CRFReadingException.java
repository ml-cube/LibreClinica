/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.exception;

/**
 * @author sshamim
 *
 */
public class CRFReadingException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 8163759260095010460L;
	public String message;

    public CRFReadingException() {
        message = "";
    }

    public CRFReadingException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
