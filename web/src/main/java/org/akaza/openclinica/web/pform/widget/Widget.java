/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.pform.widget;

import org.akaza.openclinica.web.pform.dto.Bind;
import org.akaza.openclinica.web.pform.dto.UserControl;

public interface Widget {
	
	public static final String APPEARANCE_FULL = "full";
	public static final String APPEARANCE_COMPACT = "compact";
	public static final String APPEARANCE_MINIMAL = "minimal";
	public static final String APPEARANCE_MULTILINE = "multiline";
	public static final String APPEARANCE_HORIZONTAL = "horizontal";
	public static final String APPEARANCE_HORIZONTAL_COMPACT = "horizontal-compact";
	
	public static final String APPEARANCE_MONTH_YEAR = "month-year";
	public static final String APPEARANCE_YEAR = "year";
	public static final String APPEARANCE_LABEL = "label";
	public static final String APPEARANCE_LIKERT = "likert";
	public static final String APPEARANCE_LIST_NOLABEL = "list-nolabel";
	public static final String APPEARANCE_TABLE_LIST = "table-list";
	
	
	public UserControl getUserControl();
	public Bind getBinding();
}
