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
 * For details see: https://I3LUNG.org/license copyright 2003-2010 Akaza
 * Research
 *
 */

package org.akaza.openclinica.bean.odmbeans;



/**
 *
 * @author ywang (March, 2010)
 *
 */
public class MultiSelectListItemBean  {
    private String codedOptionValue;
    private TranslatedTextBean decode;
    
    public String getCodedOptionValue() {
        return codedOptionValue;
    }
    public void setCodedOptionValue(String codedOptionValue) {
        this.codedOptionValue = codedOptionValue;
    }
    public TranslatedTextBean getDecode() {
        return decode;
    }
    public void setDecode(TranslatedTextBean decode) {
        this.decode = decode;
    }
}