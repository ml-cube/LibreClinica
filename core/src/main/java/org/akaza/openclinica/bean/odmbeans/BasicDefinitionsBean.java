/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/*
 * I3LUNG is distributed under the GNU Lesser General Public License (GNU
 * LGPL).
 *
 * For details see: https://I3LUNG.org/license copyright 2003-2005 Akaza
 * Research
 *
 */

package org.akaza.openclinica.bean.odmbeans;

import java.util.ArrayList;

/**
 *
 * @author ywang (May, 2009)
 *
 */
public class BasicDefinitionsBean extends ElementOIDBean {
    private ArrayList<MeasurementUnitBean> measurementUnits;

    public BasicDefinitionsBean() {
        this.measurementUnits = new ArrayList<MeasurementUnitBean>();
    }

    public ArrayList<MeasurementUnitBean> getMeasurementUnits() {
        return measurementUnits;
    }

    public void setMeasurementUnits(ArrayList<MeasurementUnitBean> measurementUnits) {
        this.measurementUnits = measurementUnits;
    }

}
