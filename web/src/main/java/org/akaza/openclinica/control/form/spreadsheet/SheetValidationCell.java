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
 * copyright 2003-2011 Akaza Research
 */
package org.akaza.openclinica.control.form.spreadsheet;


/**
 * <p>Class contains final SheetValidationType initialized with Constructor.</p>
 *
 */
//ywang (Aug., 2011)
public class SheetValidationCell {
    private final SheetValidationType type;
    private SheetArgumentCell sheetArgumentCell;

    /**
     * SheetValidationType has been set as NONE.
     * @param sheetCell
     */
    public SheetValidationCell(SheetCell sheetCell) {
        this.type = SheetValidationType.NONE;
        this.sheetArgumentCell = new SheetArgumentCell(sheetCell);
    }

    public SheetValidationCell(SheetValidationType sheetValidationType, SheetCell sheetCell) {
        this.type = sheetValidationType;
        this.sheetArgumentCell = new SheetArgumentCell(sheetCell);
    }

    public SheetArgumentCell getSheetArgumentCell() {
        return sheetArgumentCell;
    }

    public void setSheetArgumentCell(SheetArgumentCell sheetArgumentCell) {
        this.sheetArgumentCell = sheetArgumentCell;
    }

    public SheetValidationType getType() {
        return type;
    }
}