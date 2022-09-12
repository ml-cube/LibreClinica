/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.exception;

/**
 * Subclass of OpenClinicaException
 *
 * @author ywang (Mar. 2008)
 *
 */
public class ScoreException extends OpenClinicaException {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4587135032315735800L;

	public ScoreException(String message, String errorId) {
        super(message, errorId);
    }
}