/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.restful;

import java.util.LinkedHashMap;
import java.util.Locale;

import org.akaza.openclinica.bean.odmbeans.OdmClinicalDataBean;
import org.akaza.openclinica.service.extract.GenerateClinicalDataService;

/**
 * 
 * @author jnyayapathi
 *
 */
public class ClinicalDataCollectorResource {
	private GenerateClinicalDataService generateClinicalDataService;
	
	public LinkedHashMap<String,OdmClinicalDataBean> generateClinicalData(String studyOID,String studySubjOID,String studyEventOID,String formVersionOID,boolean includeDNs,boolean includeAudits,Locale locale, int userId){
	
	return getGenerateClinicalDataService().getClinicalData(studyOID, studySubjOID,studyEventOID,formVersionOID,includeDNs,includeAudits,locale, userId);
		
		
	}

	public GenerateClinicalDataService getGenerateClinicalDataService() {
		return generateClinicalDataService;
	}

	public void setGenerateClinicalDataService(
			GenerateClinicalDataService generateClinicalDataService) {
		this.generateClinicalDataService = generateClinicalDataService;
	}
}
