/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.pform.widget;

import org.akaza.openclinica.bean.submit.CRFVersionBean;
import org.akaza.openclinica.bean.submit.ItemGroupBean;
import org.akaza.openclinica.web.pform.dto.Bind;
import org.akaza.openclinica.web.pform.dto.UserControl;

public class GroupWidget extends BaseWidget {
	private ItemGroupBean itemGroup = null;
	private CRFVersionBean version = null;
	private String expression = null;

	public GroupWidget(ItemGroupBean itemGroup, CRFVersionBean version, String expression) {
		this.itemGroup = itemGroup;
		this.version = version;
		this.expression = expression;
	}

	@Override
	public Bind getBinding() {
		Bind binding = new Bind();
		String relevant = expression;
		if (relevant != null)
			binding.setRelevant(relevant);

		binding.setNodeSet("/" + version.getOid() + "/" + itemGroup.getOid());
		return binding;
	}

	@Override
	public UserControl getUserControl() {
		// TODO Auto-generated method stub
		return null;
	}

}
