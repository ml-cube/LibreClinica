/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.exception;

/**
 * Description: this exception will be thrown in the class CdiscOdmXmlBean when
 * multiple values are found for one item. If this exception is thrown, it means
 * either the database integrity is not consistent or my understanding of the
 * tables has flaw.
 *
 * @author ywang
 */

public class MultipleItemValuesFoundInXMLParsingException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -8856306424785385578L;

	public MultipleItemValuesFoundInXMLParsingException() {
        super();
    }

    public MultipleItemValuesFoundInXMLParsingException(String mesg) {
        super(mesg);
    }
}