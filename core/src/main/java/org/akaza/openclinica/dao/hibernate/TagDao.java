/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.hibernate;

import org.akaza.openclinica.domain.datamap.Tag;

public class TagDao extends AbstractDomainDao<Tag> {

    @Override
    Class<Tag> domainClass() {
        // TODO Auto-generated method stub
        return Tag.class;
    }

    
}
