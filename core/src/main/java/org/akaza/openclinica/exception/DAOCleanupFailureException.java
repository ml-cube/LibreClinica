/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.exception;

/**
 * @author thickerson
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class DAOCleanupFailureException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1154837643190835688L;
	public String message;

    public DAOCleanupFailureException() {
        message = "";
    }

    public DAOCleanupFailureException(String message) {
        this.message = message;
    }
}
