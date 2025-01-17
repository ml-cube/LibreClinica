/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Jun Xu
 * 
 * NI NoInformation No information whatsoever can be inferred from this
 * exceptional value. This is the most general exceptional value. It is also the
 * default exceptional value.
 * 
 * NA not applicable No proper value is applicable in this context (e.g., last
 * menstrual period for a male).
 * 
 * UNK unknown A proper value is applicable, but not known.
 * 
 * NASK not asked This information has not been sought (e.g., patient was not
 * asked)
 * 
 * ASKU asked but unknown Information was sought but not found (e.g., patient
 * was asked but didn't know)
 * 
 * NAV temporarily unavailable Information is not available at this time but it
 * is expected that it will be available later.
 * 
 * OTH other The actual value is not an element in the value domain of a
 * variable. (e.g., concept not provided by required code system).
 * 
 * PINF positive infinity Positive infinity of numbers.
 * 
 * NINF negative infinity Negative infinity of numbers.
 * 
 * MSK masked There is information on this item available but it has not been
 * provided by the sender due to security, privacy or other reasons. There may
 * be an alternate mechanism for gaining access to this information. Note: using
 * this null flavor does provide information that may be a breach of
 * confidentiality. Its primary purpose is for those circumstances where it is
 * necessary to inform the receiver that the information does exist.
 * 
 * NP not present Value is not present in a message. This is only defined in
 * messages, never in application data! All values not present in the message
 * must be replaced by the applicable default, or no-information (NI) as the
 * default of all defaults.
 * 
 */

// Internationalized description in Term.getDescription()
public class NullValue extends Term {
    /**
	 * 
	 */
	private static final long serialVersionUID = 5622065318952364131L;
	public static final NullValue INVALID = new NullValue(0, "invalid", "invalid");
    public static final NullValue NI = new NullValue(1, "NI", "no_information");
    public static final NullValue NA = new NullValue(2, "NA", "not_applicable");
    public static final NullValue UNK = new NullValue(3, "UNK", "unknown");
    public static final NullValue NASK = new NullValue(4, "NASK", "not_asked");
    public static final NullValue ASKU = new NullValue(5, "ASKU", "asked_but_unknown");
    public static final NullValue NAV = new NullValue(6, "NAV", "not_available");
    public static final NullValue OTH = new NullValue(7, "OTH", "other");
    public static final NullValue PINF = new NullValue(8, "PINF", "positive_infinity");
    public static final NullValue NINF = new NullValue(9, "NINF", "negative_infinity");
    public static final NullValue MSK = new NullValue(10, "MSK", "masked");
    public static final NullValue NP = new NullValue(11, "NP", "not_present");
    public static final NullValue NPE = new NullValue(12, "NPE", "not_performed");

    private static final NullValue[] members = { NI, NA, UNK, NASK, ASKU, NAV, OTH, PINF, NINF, MSK, NP, NPE };

    public static final List<NullValue> list = Arrays.asList(members);

    private NullValue(int id, String name, String description) {
        super(id, name, description);
    }

    private NullValue() {
    }

    public static boolean contains(int id) {
        return Term.contains(id, list);
    }

    public static NullValue get(int id) {
    	Optional<NullValue> o = list.stream().filter(r -> r.getId() == id).findFirst();
    	NullValue t = o.orElse(new NullValue());
        if (!t.isActive()) {
            return INVALID;
        } else {
            return t;
        }
    }

    public static NullValue getByName(String name) {
        for (int i = 0; i < list.size(); i++) {
            NullValue temp = (NullValue) list.get(i);
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return INVALID;
    }

    public static ArrayList<NullValue> toArrayList() {
        return new ArrayList<>(list);
    }

    @Override
    public String getName() {
        return name;
    }
    
    /**
     * Converts a list of {@link NullValue} to a comma separated string of their names.
     * 
     * @param values list of  {@link NullValue}
     * @return comma separated string of the names
     * @see NullValue#listFromString(String)
     */
    public static String listToString(ArrayList<NullValue> values) {
    	String result;
    	if(values != null) {
    		result = values.stream().map(n -> n.getName()).collect(Collectors.joining(","));
    	} else {
    		result = "";
    	}
    	return result;
    }
    
    /**
     * Converts a comma separated list of null value names to a list of {@link NullValue}.
     * 
     * @param values comma separated list of null value names
     * @param filterActive indicates if only active values should be returned
     * @return list with {@link NullValue}
     * @see NullValue#getName()}
     * @see NullValue#listToString(ArrayList)
     */
    public static ArrayList<NullValue> listFromString(String values, boolean filterActive) {
    	if(values == null) {
    		values = "";
    	}
    	Stream<NullValue> map = Arrays.stream(values.split(",")).map(v -> NullValue.getByName(v));
    	if(filterActive) {
    		map = map.filter(v -> v.isActive());
    	}
        return new ArrayList<>(map.collect(Collectors.toList()));
    }
}
