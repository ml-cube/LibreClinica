//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MethodType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Computation"/&gt;
 *     &lt;enumeration value="Imputation"/&gt;
 *     &lt;enumeration value="Transpose"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MethodType")
@XmlEnum
public enum MethodType {

    @XmlEnumValue("Computation")
    COMPUTATION("Computation"),
    @XmlEnumValue("Imputation")
    IMPUTATION("Imputation"),
    @XmlEnumValue("Transpose")
    TRANSPOSE("Transpose"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    MethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodType fromValue(String v) {
        for (MethodType c: MethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
