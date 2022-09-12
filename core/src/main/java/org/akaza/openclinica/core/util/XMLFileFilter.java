/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.core.util;

import java.io.File;
import java.io.FilenameFilter;
/**
 * For filtering the files in a directory for xml files.
 * @author jnyayapathi
 *
 */

/** Rules to Follow to add classes/methods to Util package:
 * No repeating the code. 
 * Make a class/method do just one thing. 
 * No business logic code. 
 * Don't write code that isn't needed. 
 * No Coupling. 
 * Be more Modular 
 * Write code like your code is an External API 
 */
public class XMLFileFilter implements FilenameFilter {

	public boolean accept(File arg0, String name) {
		// TODO Auto-generated method stub
		return (name.endsWith(".xml"));

	}

}
