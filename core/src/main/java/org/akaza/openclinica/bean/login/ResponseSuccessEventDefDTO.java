/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.login;

public class ResponseSuccessEventDefDTO {

	private String name;
	private String message;
	private String eventDefOid;

	public String getEventDefOid() {
		return eventDefOid;
	}

	public void setEventDefOid(String eventDefOid) {
		this.eventDefOid = eventDefOid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
