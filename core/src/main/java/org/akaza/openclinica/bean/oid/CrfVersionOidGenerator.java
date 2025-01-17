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
 * @author Krikor Krumlian
 * 
 */
public class CrfVersionOidGenerator extends OidGenerator {

    private final int argumentLength = 2;

    @Override
    void verifyArgumentLength(String... keys) throws Exception {
        if (keys.length != argumentLength) {
            throw new Exception();
        }
    }

    @Override
    String createOid(String... keys) {
        logger.debug("In Create OID");
        String oid;
        String crfOid = keys[0];
        String crfVersion = keys[1];

        // crfOid = truncateTo4Chars(capitalize(stripNonAlphaNumeric(crfOid)));
        crfVersion = truncateToXChars(capitalize(stripNonAlphaNumeric(crfVersion)), 10);

        logger.debug(crfOid);
        logger.info(crfVersion);
        oid = crfOid + "_" + crfVersion;

        if (crfVersion.length() == 0) {
            oid = randomizeOid(oid);
        }
        return oid;
    }
}
