/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
/*
 * I3LUNG is distributed under the GNU Lesser General Public License (GNU
 * LGPL).
 *
 * For details see: https://I3LUNG.org/license copyright 2003-2010 Akaza
 * Research
 *
 */

package org.akaza.openclinica.bean.odmbeans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ywang (March, 2010)
 *
 */
public class OdmAdminDataBean extends ElementOIDBean {
    private String studyOID;
    private String metaDataVersionOID;
    private List<UserBean> users = new ArrayList<UserBean>();
    private List<LocationBean> locations = new ArrayList<LocationBean>();
    
    public List<UserBean> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<UserBean> users) {
        this.users = users;
    }
    public List<LocationBean> getLocations() {
        return locations;
    }
    public void setLocations(ArrayList<LocationBean> locations) {
        this.locations = locations;
    }
    public String getStudyOID() {
        return studyOID;
    }
    public void setStudyOID(String studyOID) {
        this.studyOID = studyOID;
    }
    public String getMetaDataVersionOID() {
        return metaDataVersionOID;
    }
    public void setMetaDataVersionOID(String metaDataVersionOID) {
        this.metaDataVersionOID = metaDataVersionOID;
    }
}