/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.domain.xform.dto;

import java.util.List;

public class Repeat {

    private String nodeset;
    private List<UserControl> usercontrol;
    private Label label;
    private String count;
    private String jrCount;
    private String jrNoAddRemove;
    private String appearance;
    private String ref;

    public Repeat() {
    }

    public String getJrNoAddRemove() {
        return jrNoAddRemove;
    }

    public void setJrNoAddRemove(String jrNoAddRemove) {
        this.jrNoAddRemove = jrNoAddRemove;
    }

    public String getJrCount() {
        return jrCount;
    }

    public void setJrCount(String jrCount) {
        this.jrCount = jrCount;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public List<UserControl> getUsercontrol() {
        return usercontrol;
    }

    public void setUsercontrol(List<UserControl> usercontrol) {
        this.usercontrol = usercontrol;
    }

    public String getNodeset() {
        return nodeset;
    }

    public void setNodeset(String nodeset) {
        this.nodeset = nodeset;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

}
