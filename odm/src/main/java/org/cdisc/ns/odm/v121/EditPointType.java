//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EditPointType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EditPointType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Monitoring"/&gt;
 *     &lt;enumeration value="DataManagement"/&gt;
 *     &lt;enumeration value="DBAudit"/&gt;
 *     &lt;maxLength value="14"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EditPointType")
@XmlEnum
public enum EditPointType {

    @XmlEnumValue("Monitoring")
    MONITORING("Monitoring"),
    @XmlEnumValue("DataManagement")
    DATA_MANAGEMENT("DataManagement"),
    @XmlEnumValue("DBAudit")
    DB_AUDIT("DBAudit");
    private final String value;

    EditPointType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EditPointType fromValue(String v) {
        for (EditPointType c: EditPointType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
