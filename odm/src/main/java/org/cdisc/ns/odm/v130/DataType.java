//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DataType.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DataType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="integer"/&gt;
 *     &lt;enumeration value="float"/&gt;
 *     &lt;enumeration value="date"/&gt;
 *     &lt;enumeration value="datetime"/&gt;
 *     &lt;enumeration value="time"/&gt;
 *     &lt;enumeration value="text"/&gt;
 *     &lt;enumeration value="string"/&gt;
 *     &lt;enumeration value="double"/&gt;
 *     &lt;enumeration value="URI"/&gt;
 *     &lt;enumeration value="boolean"/&gt;
 *     &lt;enumeration value="hexBinary"/&gt;
 *     &lt;enumeration value="base64Binary"/&gt;
 *     &lt;enumeration value="hexFloat"/&gt;
 *     &lt;enumeration value="base64Float"/&gt;
 *     &lt;enumeration value="partialDate"/&gt;
 *     &lt;enumeration value="partialTime"/&gt;
 *     &lt;enumeration value="partialDatetime"/&gt;
 *     &lt;enumeration value="durationDatetime"/&gt;
 *     &lt;enumeration value="intervalDatetime"/&gt;
 *     &lt;enumeration value="incompleteDatetime"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataType")
@XmlEnum
public enum DataType {

    @XmlEnumValue("integer")
    INTEGER("integer"),
    @XmlEnumValue("float")
    FLOAT("float"),
    @XmlEnumValue("date")
    DATE("date"),
    @XmlEnumValue("datetime")
    DATETIME("datetime"),
    @XmlEnumValue("time")
    TIME("time"),
    @XmlEnumValue("text")
    TEXT("text"),
    @XmlEnumValue("string")
    STRING("string"),
    @XmlEnumValue("double")
    DOUBLE("double"),
    URI("URI"),
    @XmlEnumValue("boolean")
    BOOLEAN("boolean"),
    @XmlEnumValue("hexBinary")
    HEX_BINARY("hexBinary"),
    @XmlEnumValue("base64Binary")
    BASE_64_BINARY("base64Binary"),
    @XmlEnumValue("hexFloat")
    HEX_FLOAT("hexFloat"),
    @XmlEnumValue("base64Float")
    BASE_64_FLOAT("base64Float"),
    @XmlEnumValue("partialDate")
    PARTIAL_DATE("partialDate"),
    @XmlEnumValue("partialTime")
    PARTIAL_TIME("partialTime"),
    @XmlEnumValue("partialDatetime")
    PARTIAL_DATETIME("partialDatetime"),
    @XmlEnumValue("durationDatetime")
    DURATION_DATETIME("durationDatetime"),
    @XmlEnumValue("intervalDatetime")
    INTERVAL_DATETIME("intervalDatetime"),
    @XmlEnumValue("incompleteDatetime")
    INCOMPLETE_DATETIME("incompleteDatetime");
    private final String value;

    DataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataType fromValue(String v) {
        for (DataType c: DataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
