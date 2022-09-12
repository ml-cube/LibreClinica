/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.xform.dto;

import java.util.List;

public class Model {
    private Itext itext;
    private List<Bind> bind;
    private List<String> instance;// = "initialvalueinmodeldto";

    public Itext getItext() {
        return itext;
    }

    public void setItext(Itext itext) {
        this.itext = itext;
    }

    public List<String> getInstance() {
        return instance;
    }

    public void setInstance(List<String> instance) {
        this.instance = instance;
    }

    public List<Bind> getBind() {
        return bind;
    }

    public void setBind(List<Bind> bind) {
        this.bind = bind;
    }

    public Bind getBindByNodeSet(String nodeSet) {
        if (bind != null) {
            for (int i = 0; i < bind.size(); i++) {
                if (bind.get(i).getNodeSet().equals(nodeSet)) {
                    return bind.get(i);
                }
            }
        }
        return null;
    }
}