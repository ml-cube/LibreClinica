/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */

package org.akaza.openclinica.logic.score.function;

import org.apache.commons.math.stat.StatUtils;

public class Max extends AbstractFunction {
    public Max() {
        super();
    }

    /**
     * If one argument is "", then the value of this function will be "" too.
     *
     * @see Function#execute
     */

    public void execute() {
        logger.info("Execute the function Max... ");

        double[] values = new double[argumentCount()];
        for (int i = 0; i < argumentCount(); i++) {
            String arg = getArgument(i).toString();
            if (arg == null || arg.length() == 0) {
                value = "";
                return;
            }
            try {
                values[i] = Double.parseDouble(arg);
            } catch (Exception e) {
                errors.put(new Integer(errorCount++), "Unparseable number:" + " " + arg + " " + "in evaluation of" + " Max(); ");
            }
        }
        if (errors.size() > 0) {
            logger.error("The following errors happended when Max() evaluation was performed: " + errors);
            value = "";
            return;
        }

        if (values != null && values.length > 0) {
            double v = StatUtils.max(values);
            value = Double.toString(v);
        } else {
            value = "";
        }
    }

}
