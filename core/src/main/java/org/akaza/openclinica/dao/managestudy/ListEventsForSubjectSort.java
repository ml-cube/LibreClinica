/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.managestudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListEventsForSubjectSort implements CriteriaCommand {
    List<Sort> sorts = new ArrayList<Sort>();
    HashMap<String, String> columnMapping = new HashMap<String, String>();

    public ListEventsForSubjectSort() {
        columnMapping.put("studySubject.label", "label");
        columnMapping.put("studySubject.status", "status_id");
        columnMapping.put("enrolledAt", "ST.unique_identifier");
        columnMapping.put("studySubject.createdDate", "SS.date_created");
    }

    public void addSort(String property, String order) {
        sorts.add(new Sort(property, order));
    }

    public List<Sort> getSorts() {
        return sorts;
    }

    public String execute(String criteria) {
        String theCriteria = "";
        for (Sort sort : sorts) {
            if (theCriteria.length() == 0) {
                theCriteria += buildCriteriaInitial(criteria, sort.getProperty(), sort.getOrder());
            } else {
                theCriteria += buildCriteria(criteria, sort.getProperty(), sort.getOrder());
            }

        }

        return theCriteria;
    }

    private String buildCriteriaInitial(String criteria, String property, String order) {
        if (order.equals(Sort.ASC)) {
            criteria = criteria + " order by " + columnMapping.get(property) + " asc ";
        } else if (order.equals(Sort.DESC)) {
            criteria = criteria + " order by " + columnMapping.get(property) + " desc ";
        }
        return criteria;
    }

    private String buildCriteria(String criteria, String property, String order) {
        if (order.equals(Sort.ASC)) {
            criteria = criteria + " , " + columnMapping.get(property) + " asc ";
        } else if (order.equals(Sort.DESC)) {
            criteria = criteria + " , " + columnMapping.get(property) + " desc ";
        }
        return criteria;
    }

    private static class Sort {
        public final static String ASC = "asc";
        public final static String DESC = "desc";

        private final String property;
        private final String order;

        public Sort(String property, String order) {
            this.property = property;
            this.order = order;
        }

        public String getProperty() {
            return property;
        }

        public String getOrder() {
            return order;
        }
    }
}
