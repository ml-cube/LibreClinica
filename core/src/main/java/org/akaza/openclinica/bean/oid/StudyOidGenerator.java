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
 *
 * Copyright 2003-2008 Akaza Research
 */
package org.akaza.openclinica.bean.oid;

/**
 * Assumes we are getting the unique protocol id from a study, and truncating to
 * eight chars.
 *
 * @author thickerson
 *
 */
public class StudyOidGenerator extends OidGenerator {

    public int getArgumentLength() {
		return argumentLength;
	}

	private final int argumentLength = 1;

    @Override
    void verifyArgumentLength(String... keys) throws Exception {
        if (keys.length != argumentLength) {
            throw new Exception();
        }
    }

    @Override
    String createOid(String... keys) {
    	String oid = "S_";
        String uniqueProtocolID = keys[0];
        uniqueProtocolID = truncateTo8Chars(capitalize(stripNonAlphaNumeric(uniqueProtocolID)));

        if (uniqueProtocolID.length() == 0) {
            uniqueProtocolID = randomizeOid("");
        }
        oid = oid + uniqueProtocolID;
        return oid;
    }

}
