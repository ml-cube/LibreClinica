/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.controller;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.akaza.openclinica.web.restful.ODMClinicaDataResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping(value = "/auth/api/v1/clinicaldata")
@ResponseStatus(value = org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR)
public class ODMClinicalDataController {

	protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

	@Autowired
	ODMClinicaDataResource odmClinicaDataResource;

	@RequestMapping(value = "/json/view/{studyOID}/{studySubjectIdentifier}/{studyEventOID}/{formVersionOID}", method = RequestMethod.GET)
	public @ResponseBody
	JsonNode getClinicalData(
			@PathVariable("studyOID") String studyOID,
			@PathVariable("formVersionOID") String formVersionOID,
			@PathVariable("studyEventOID") String studyEventOID,
			@PathVariable("studySubjectIdentifier") String studySubjectIdentifier,
			@RequestParam(value = "includeDNs", defaultValue = "n", required = false) String includeDns,
			@RequestParam(value = "includeAudits", defaultValue = "n", required = false) String includeAudits,
			HttpServletRequest request) throws Exception {

		ResourceBundleProvider.updateLocale(new Locale("en_US"));

		String result = odmClinicaDataResource.getODMClinicaldata(
				studyOID,formVersionOID,studyEventOID,studySubjectIdentifier,includeDns,includeAudits,request);
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readTree(result);

	}

}
