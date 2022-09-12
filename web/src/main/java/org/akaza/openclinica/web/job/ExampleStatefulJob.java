/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.PersistJobDataAfterExecution;

/**
 * establishing stateful-ness on the Java side to avoid locking, etc
 */
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class ExampleStatefulJob
    extends ExampleSpringJob {

    public ExampleStatefulJob() {
        super();
    }
}
