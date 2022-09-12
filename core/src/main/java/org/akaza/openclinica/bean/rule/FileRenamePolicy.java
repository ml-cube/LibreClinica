/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.rule;

import java.io.File;
import java.io.InputStream;

public interface FileRenamePolicy {

    public File rename(File f, InputStream content);

}
