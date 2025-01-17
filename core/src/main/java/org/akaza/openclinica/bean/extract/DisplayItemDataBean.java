/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.extract;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author jxu
 *
 * To display dataset->item row on dataset html browser page
 */
public class DisplayItemDataBean {
    private String subjectName;
    private String studyLabel;
    private String subjectDob;
    private String subjectGender;
    private String subjectUniqueId;
    private String subjectStatus;
    private String subjectAgeAtEvent;
    private String subjectSecondaryId;
    private ArrayList<String> eventValues = new ArrayList<>();
    private ArrayList<String> itemValues = new ArrayList<>();
    // private ArrayList groupNames = new ArrayList();
    // was a hashmap with class id as the key, tbh
    private HashMap<Integer, String> groupNames = new HashMap<>();

    public HashMap<Integer, String> getGroupNames() {
        return groupNames;
    }

    public void setGroupName(Integer classId, String groupName) {
        groupNames.put(classId, groupName);
    }

    /**
     * @return Returns the eventValues.
     */
    public ArrayList<String> getEventValues() {
        return eventValues;
    }

    /**
     * @param eventValues
     *            The eventValues to set.
     */
    public void setEventValues(ArrayList<String> eventValues) {
        this.eventValues = eventValues;
    }

    /**
     * @return Returns the subjectDob.
     */
    public String getSubjectDob() {
        return subjectDob;
    }

    /**
     * @param subjectDob
     *            The subjectDob to set.
     */
    public void setSubjectDob(String subjectDob) {
        this.subjectDob = subjectDob;
    }

    /**
     * @return Returns the subjectGender.
     */
    public String getSubjectGender() {
        return subjectGender;
    }

    /**
     * @param subjectGender
     *            The subjectGender to set.
     */
    public void setSubjectGender(String subjectGender) {
        this.subjectGender = subjectGender;
    }

    /**
     * @return Returns the itemValues.
     */
    public ArrayList<String> getItemValues() {
        return itemValues;
    }

    /**
     * @param itemValues
     *            The itemValues to set.
     */
    public void setItemValues(ArrayList<String> itemValues) {
        this.itemValues = itemValues;
    }

    /**
     * @return Returns the studyLabel.
     */
    public String getStudyLabel() {
        return studyLabel;
    }

    /**
     * @param studyLabel
     *            The studyLabel to set.
     */
    public void setStudyLabel(String studyLabel) {
        this.studyLabel = studyLabel;
    }

    /**
     * @return Returns the subjectName.
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * @param subjectName
     *            The subjectName to set.
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectAgeAtEvent() {
        return subjectAgeAtEvent;
    }

    public void setSubjectAgeAtEvent(String subjectAgeAtEvent) {
        this.subjectAgeAtEvent = subjectAgeAtEvent;
    }

    public String getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(String subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public String getSubjectUniqueId() {
        return subjectUniqueId;
    }

    public void setSubjectUniqueId(String subjectUniqueId) {
        this.subjectUniqueId = subjectUniqueId;
    }

    public String getSubjectSecondaryId() {
        return subjectSecondaryId;
    }

    public void setSubjectSecondaryId(String subjectSecondaryId) {
        this.subjectSecondaryId = subjectSecondaryId;
    }
}
