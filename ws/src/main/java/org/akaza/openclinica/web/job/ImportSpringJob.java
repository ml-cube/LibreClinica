/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.job;

import org.akaza.openclinica.bean.rule.XmlSchemaValidationHelper;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * Import Spring Job, a job running asynchronously on the Tomcat server using Spring and Quartz.
 * 
 * @author thickerson, 04/2009
 * 
 */
// TODO duplicate of the version in the web module?
public class ImportSpringJob extends QuartzJobBean {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());

    XmlSchemaValidationHelper schemaValidator = new XmlSchemaValidationHelper();
    public static final String DIR_PATH = "scheduled_data_import";

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
    
    }
}
