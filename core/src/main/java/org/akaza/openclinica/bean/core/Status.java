/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// Internationalized name and description in Term.getName and
// Term.getDescription()

public class Status extends Term implements Comparable<Status> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5659497816528109135L;
	// waiting for the db to come in sync with our set of terms...
    public static final Status INVALID = new Status(0, "invalid");
    public static final Status AVAILABLE = new Status(1, "available");
    public static final Status UNAVAILABLE = new Status(2, "unavailable");
    public static final Status PRIVATE = new Status(3, "private");
    public static final Status PENDING = new Status(4, "pending");
    public static final Status DELETED = new Status(5, "removed");
    public static final Status LOCKED = new Status(6, "locked");
    public static final Status AUTO_DELETED = new Status(7, "auto-removed");
    public static final Status SIGNED = new Status(8, "signed");
    public static final Status FROZEN = new Status(9, "frozen");
    public static final Status SOURCE_DATA_VERIFICATION = new Status(10, "source_data_verification");
    public static final Status RESET = new Status(11, "reset");

    private static final Status[] members =
        { INVALID, AVAILABLE, PENDING, PRIVATE, UNAVAILABLE, LOCKED, DELETED, AUTO_DELETED, SIGNED, FROZEN, SOURCE_DATA_VERIFICATION,RESET };
    private static List<Status> list = Arrays.asList(members);  

    private static final Status[] activeMembers = { AVAILABLE, SIGNED, DELETED, AUTO_DELETED };
    private static List<Status> activeList = Arrays.asList(activeMembers);  

    private static final Status[] studySubjectDropDownMembers = { AVAILABLE, SIGNED, DELETED, AUTO_DELETED };
    private static List<Status> studySubjectDropDownList = Arrays.asList(studySubjectDropDownMembers);

    private static final Status[] subjectDropDownMembers = { AVAILABLE, DELETED };
    private static List<Status> subjectDropDownList = Arrays.asList(subjectDropDownMembers);

    private static final Status[] studyUpdateMembers = { PENDING, AVAILABLE, FROZEN, LOCKED };
    private static List<Status> studyUpdateMembersList = Arrays.asList(studyUpdateMembers);

    //Solve the problem with the get() method...
    private static final Map<Integer, String> membersMap = new HashMap<Integer, String>();
    static {
        membersMap.put(0, "invalid");
        membersMap.put(1, "available");
        membersMap.put(2, "unavailable");
        membersMap.put(3, "private");
        membersMap.put(4, "pending");
        membersMap.put(5, "removed");
        membersMap.put(6, "locked");
        membersMap.put(7, "auto-removed");
        membersMap.put(8, "signed");
        membersMap.put(9, "frozen");
        membersMap.put(10, "source_data_verification");
        membersMap.put(11, "reset");
    }

    private Status(int id, String name) {
        super(id, name);
    }

    private Status() {
    }

    public static boolean contains(int id) {
        return Term.contains(id, list);
    }

    public static Status get(int id) {
    	Optional<Status> o = list.stream().filter(r -> r.getId() == id).findFirst();
    	return o.orElse(new Status());
    }

    public static Status getFromMap(int id) {
        if (id < 0 || id > membersMap.size() - 1) {
            return Status.INVALID;
        }
        return get(id);
    }
    
    public static Status getByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            Status temp = (Status) list.get(i);
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return INVALID;
    }

    public static ArrayList<Status> toArrayList() {
        return new ArrayList<>(list);
    }

    public static ArrayList<Status> toActiveArrayList() {
        return new ArrayList<>(activeList);
    }

    public static ArrayList<Status> toDropDownArrayList() {
        return new ArrayList<>(studySubjectDropDownList);
    }

    public static ArrayList<Status> toStudyUpdateMembersList() {
        return new ArrayList<>(studyUpdateMembersList);
    }

    public static ArrayList<Status> toSubjectDropDownArrayList() {
        return new ArrayList<>(subjectDropDownList);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Status o) {
        Status arg = (Status) o;

        return name.compareTo(arg.getName());
    }

    public boolean isInvalid() {
        return this == Status.INVALID;
    }

    public boolean isAvailable() {
        return this == Status.AVAILABLE;
    }

    public boolean isPending() {
        return this == Status.PENDING;
    }

    public boolean isPrivate() {
        return this == Status.PRIVATE;
    }

    public boolean isUnavailable() {
        return this == Status.UNAVAILABLE;
    }

    public boolean isDeleted() {
        return this == Status.DELETED || this == Status.AUTO_DELETED;
    }

    public boolean isLocked() {
        return this == Status.LOCKED;
    }

    public boolean isSigned() {
        return this == Status.SIGNED;
    }

    public boolean isFrozen() {
        return this == Status.FROZEN;
    }

    /* public static void main(String[] args) {
         int[] nums = {0,1,2,3,4,5,6,7,8,9};
         Status stat;

         for(int tmp : nums){
              stat = (Status) get(tmp);
         }
     }*/

}
