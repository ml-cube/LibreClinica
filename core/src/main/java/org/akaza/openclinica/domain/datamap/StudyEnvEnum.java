/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.datamap;

/**
 * Created by yogi on 4/27/17.
 */

/**
 * Enum representing the types of environment to which the protocol can be published
 */

public enum StudyEnvEnum {
    PROD("PROD"), TEST("TEST"), NOT_PUBLISHED("");
    private String env;

    StudyEnvEnum(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return env;
    }
}
