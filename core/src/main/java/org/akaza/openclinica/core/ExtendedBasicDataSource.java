/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.core;

import org.apache.commons.dbcp.BasicDataSource;

// TODO: this is candidate for removal, and use simply BasicDataSource directly
// TODO: I think BigStringTryClob was only relevant for Oracle
public class ExtendedBasicDataSource extends BasicDataSource {

    public void setBigStringTryClob(String value) {
        addConnectionProperty("SetBigStringTryClob", value);
    }
    
}
