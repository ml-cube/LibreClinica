/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.web.pform.dto;

import java.util.List;

public class Model {
	private List<Bind> bind;
	private String instance = "initialvalueinmodeldto";
	
	public String getInstance() {
		return instance;
	}
	
	public void setInstance(String instance) {
		this.instance = instance;
	}
	
	public List<Bind> getBind() {
		return bind;
	}
	
	public void setBind(List<Bind> bind) {
		this.bind = bind;
	}
		
	public Bind getBindByNodeSet(String nodeSet) {
		if (bind != null) {
			for (int i = 0; i < bind.size(); i++) {
				if (bind.get(i).getNodeSet().equals(nodeSet)) {
					return bind.get(i);
				}
			}
		}
		return null;
	}
}