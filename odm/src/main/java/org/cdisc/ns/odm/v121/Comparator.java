//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Comparator.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="Comparator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="EQ"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOTIN"/&gt;
 *     &lt;maxLength value="5"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Comparator")
@XmlEnum
public enum Comparator {

    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
    IN,
    NOTIN;

    public String value() {
        return name();
    }

    public static Comparator fromValue(String v) {
        return valueOf(v);
    }

}
