/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.restful;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.jersey.api.view.Viewable;
/**
 *  Rest service for ODM metadata
 *  usage ROOT_CONTEXT/rest/metadata/{format}/{mode}/{STUDYOID}
 *  format:xml/ json
 *  mode:view
 * @author jnyayapathi
 *
 */
@Path("/metadata")
@Component
@Scope("prototype")
public class ODMMetadataRestResource {

	  private static final Logger LOGGER = LoggerFactory.getLogger(ODMMetadataRestResource.class);

private MetadataCollectorResource metadataCollectorResource;


	public MetadataCollectorResource getMetadataCollectorResource() {
	return metadataCollectorResource;
}


public void setMetadataCollectorResource(
		MetadataCollectorResource metadataCollectorResource) {
	this.metadataCollectorResource = metadataCollectorResource;
}


	/**
	 * @api {get} /rest/metadata/xml/view/:study/:event/:form Retrieve CDISC ODM case report form definitions - XML
	 * @apiVersion 3.8.0
	 * @apiName GetODM
	 * @apiGroup Study
	 * @apiPermission user
	 *
	 * @apiDescription Retrieve CDISC ODM XML study definition. Use asterisks in place of OIDs as wildcards
	 *
	 * @apiParam {String} study Study or Site OID. Use '*' for all.
	 * @apiParam {String} event Study Event Definition OID. Use '*' for all.
	 * @apiParam {String} form Case Report Form Version OID. Use '*' for all.
	 *
	 * @apiExample Example usage - gets all forms in a study:
	 * curl -i demo2.eclinicalhosting.com/OpenClinica9/rest/metadata/xml/view/S_NCT02438/SE_ABC/F_123
	 *
	 * @apiSuccess {String}   ODM            The study metadata in ODM XML.
	 *
	 * @apiSuccessExample {xml} Example success (xml):
	 *     HTTP/1.1 200 Success
	 *     {
	 *       "odm": "study ODM XML metadata here"
	 *     }
	 *
	 * @apiError NoAccessRight Only authenticated users can access the data.
	 * @apiError NotFound   The resource was not found.
	 *
	 * @apiErrorExample Response (example):
	 *     HTTP/1.1 401 Not Authenticated
	 *     {
	 *       "error": "NoAccessRight"
	 *     }
	 */
	@GET
	@Path("/xml/view/{studyOID}")
	@Produces(MediaType.TEXT_XML)
	public String getODMMetadata(@PathParam("studyOID") String studyOID ){
		LOGGER.debug("returning here........"+studyOID);
		//return "ODM";

		return metadataCollectorResource.collectODMMetadata(studyOID);
	}



	/**
	 * @api {get} /rest/metadata/json/view/:study/:event/:form Retrieve CDISC ODM case report form definitions - JSON
	 * @apiVersion 3.8.0
	 * @apiName GetODMJSON
	 * @apiGroup Study
	 * @apiPermission user
	 *
	 * @apiDescription Retrieve CDISC ODM JSON study definition. Use asterisks in place of OIDs as wildcards
	 *
	 * @apiParam {String} study Study or Site OID. Use '*' for all.
	 * @apiParam {String} event Study Event Definition OID. Use '*' for all.
	 * @apiParam {String} form Case Report Form Version OID. Use '*' for all.
	 *
	 * @apiExample Example usage - gets all forms in a study:
	 * curl -i demo2.eclinicalhosting.com/OpenClinica9/rest/metadata/json/view/S_NCT02438/SE_ABC/F_123
	 *
	 * @apiSuccess {String}   ODM            The form(s) in ODM JSON.
	 *
	 * @apiSuccessExample {json} Example success (json):
	 *     HTTP/1.1 200 Success
	 *     {
	 *       "odm": "study ODM metadata here"
	 *     }
	 *
	 * @apiError NoAccessRight Only authenticated users can access the data.
	 * @apiError NotFound   The resource was not found.
	 *
	 * @apiErrorExample Response (example):
	 *     HTTP/1.1 401 Not Authenticated
	 *     {
	 *       "error": "NoAccessRight"
	 *     }
	 */
	@GET
	@Path("/json/view/{studyOID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getODMMetadataJson(@PathParam("studyOID") String studyOID ){
		LOGGER.debug("returning here........"+studyOID);
		//return "ODM";

		return metadataCollectorResource.collectODMMetadataJson(studyOID);
	}


	/**
	 * @api {get} /rest/metadata/:html/print/:study/:event/:form Retrieve printable blank case report forms
	 * @apiVersion 3.8.0
	 * @apiName GetPrintableCRF
	 * @apiGroup Study
	 * @apiPermission user
	 *
	 * @apiDescription Annotated case report forms in printable HTML format. Use asterisks in place of OIDs as wildcards
	 *
	 * @apiParam {String} study Study or Site OID. Use '*' for all.
	 * @apiParam {String} event Study Event Definition OID. Use '*' for all.
	 * @apiParam {String} form Case Report Form Version OID. Use '*' for all.
	 *
	 * @apiExample Example usage - gets all forms in a study:
	 * curl -i demo2.eclinicalhosting.com/OpenClinica9/rest/metadata/html/print/S_NCT02438/SE_ABC/F_123
	 *
	 * @apiSuccess {String}   ODM            The form(s) in HTML.
	 *
	 * @apiSuccessExample {html} Example success (html):
	 *     HTTP/1.1 200 Success
	 *     {
	 *       "odm": "forms displayed here"
	 *     }
	 *
	 * @apiError NoAccessRight Only authenticated users can access the data.
	 * @apiError NotFound   The resource was not found.
	 *
	 * @apiErrorExample Response (example):
	 *     HTTP/1.1 401 Not Authenticated
	 *     {
	 *       "error": "NoAccessRight"
	 *     }
	 */
  @GET
  @Path("/html/print/{studyOID}/{eventOID}/{formVersionOID}")
  public Viewable getPrintCRFController(
    @Context HttpServletRequest request,
    @Context HttpServletResponse response,
    @PathParam("studyOID") String studyOID,
    @PathParam("eventOID") String eventOID,
    @PathParam("formVersionOID") String formVersionOID
    ) throws Exception {
      request.setAttribute("studyOID", studyOID);
      request.setAttribute("eventOID", eventOID);
      request.setAttribute("formVersionOID", formVersionOID);
      return new Viewable("/WEB-INF/jsp/printcrf.jsp", null);
  }


//  @GET
 // @Path("/pdf/print/{studyOID}/{eventOID}/{formVersionOID}")
  //JN: Commenting out this part of pdf generation written by Nick as the approach might be different. Look for these files in mercurial repo for history.
 /*	public javax.ws.rs.core.Response getPdf(@PathParam("studyOID") String studyOID,@PathParam("formVersionOID") String formVersionOID,
 	    @PathParam("eventOID") String eventOID, @Context HttpServletRequest request, @Context HttpServletResponse response ) {
      JSON json = metadataCollectorResource.collectODMMetadataJson(studyOID,formVersionOID);
      try {
		getPrintServer(request, response, json, studyOID, eventOID, formVersionOID);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return javax.ws.rs.core.Response.ok().type("application/pdf").build();
 }*/

 /*
   @GET
  @Path("/pdf/print/{studyOID}/{eventOID}/{formVersionOID}")
 	public javax.ws.rs.core.Response getPdf2(@PathParam("studyOID") String studyOID,@PathParam("formVersionOID") String formVersionOID,
 	    @Context HttpServletRequest request, @Context HttpServletResponse response ) {
      JSON json = metadataCollectorResource.collectODMMetadataJson(studyOID,formVersionOID);
      try {
		getPrintServer(request, response, json);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      File file = new File("...");
      return javax.ws.rs.core.Response.ok(file, MediaType.APPLICATION_OCTET_STREAM)
            .header("content-disposition", "attachment; filename =" + file.getName())
            .build();
 	}
 	*/


  @GET
	@Path("/xml/view/{studyOID}/{studyEventDefinitionOId}/{formVersionOID}")
	@Produces(MediaType.TEXT_XML)
	public String getODMMetadataWithFormVersionOID(@PathParam("studyOID") String studyOID,@PathParam("formVersionOID") String formVersionOID ){
		LOGGER.debug("returning here........"+formVersionOID);
		return metadataCollectorResource.collectODMMetadataForForm(studyOID,formVersionOID);
	}


    @GET
 	@Path("/json/view/{studyOID}/{studyEventDefinitionOId}/{formVersionOID}")
 	@Produces(MediaType.APPLICATION_JSON)
 	public String getODMMetadataJson(@PathParam("studyOID") String studyOID,@PathParam("formVersionOID") String formVersionOID ){
 		LOGGER.debug("returning here........"+formVersionOID);
    	return metadataCollectorResource.collectODMMetadataJsonString(studyOID,formVersionOID);
 	}


 /**/

}
