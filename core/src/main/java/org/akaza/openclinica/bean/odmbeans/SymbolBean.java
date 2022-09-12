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
public class SymbolBean {
    private ArrayList<TranslatedTextBean> translatedTexts;

    public SymbolBean() {
        this.translatedTexts = new ArrayList<TranslatedTextBean>();
    }

    public ArrayList<TranslatedTextBean> getTranslatedText() {
        return translatedTexts;
    }

    public void setTranslatedText(ArrayList<TranslatedTextBean> translatedTexts) {
        this.translatedTexts = translatedTexts;
    }

}