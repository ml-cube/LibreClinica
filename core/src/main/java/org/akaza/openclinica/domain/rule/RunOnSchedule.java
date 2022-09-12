/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.rule;

public class RunOnSchedule {

	private String runTime;

	
	public RunOnSchedule() {
		super();
	}


	public RunOnSchedule(String runTime){
		this.runTime=runTime;
		
	}


	public String getRunTime() {
		return runTime;
	}


	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}


	
	

	
	
	
	
}
