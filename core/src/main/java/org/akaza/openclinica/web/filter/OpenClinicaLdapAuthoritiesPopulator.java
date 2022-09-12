/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.web.filter;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;

/**
 * Adds the <code>ROLE_USER</code> to all LDAP users which succeed on authenticating.
 *
 * @author Doug Rodrigues (drodrigues@openclinica.com)
 */
public class OpenClinicaLdapAuthoritiesPopulator implements LdapAuthoritiesPopulator {

    public Collection<GrantedAuthority> getGrantedAuthorities(DirContextOperations userData, String username) {
        Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>(1);
        auths.add(new SimpleGrantedAuthority("ROLE_USER"));
        return auths;
    }

}
