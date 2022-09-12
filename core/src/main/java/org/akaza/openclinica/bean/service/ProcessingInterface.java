/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.service;

/**
 * ProcessingFunction, by Tom Hickerson, 09/2010
 * Interface of the pre- and post-processing functions determined by the
 * new extract data interface
 * Currently only implementing one post-processing function per XSL type
 * Future implementations will be with multiple pre- and post-functions
 * @author thickerson
 *
 */
public interface ProcessingInterface {
    ProcessingResultType run();

}
