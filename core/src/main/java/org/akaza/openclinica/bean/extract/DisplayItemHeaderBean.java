/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.extract;

import org.akaza.openclinica.bean.submit.ItemBean;

/**
 * @author jxu
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class DisplayItemHeaderBean {
    private String itemHeaderName;
    private ItemBean item;

    /**
     * @return Returns the item.
     */
    public ItemBean getItem() {
        return item;
    }

    /**
     * @param item
     *            The item to set.
     */
    public void setItem(ItemBean item) {
        this.item = item;
    }

    /**
     * @return Returns the itemHeaderName.
     */
    public String getItemHeaderName() {
        return itemHeaderName;
    }

    /**
     * @param itemHeaderName
     *            The itemHeaderName to set.
     */
    public void setItemHeaderName(String itemHeaderName) {
        this.itemHeaderName = itemHeaderName;
    }
}
