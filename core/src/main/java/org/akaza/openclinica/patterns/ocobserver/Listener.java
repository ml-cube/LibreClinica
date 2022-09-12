/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.patterns.ocobserver;

public interface Listener {
	public void setObserver(Observer o);
	public Observer getObserver();
	
}
