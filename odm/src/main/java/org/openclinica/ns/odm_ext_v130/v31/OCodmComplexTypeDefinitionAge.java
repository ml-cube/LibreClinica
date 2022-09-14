//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-Age complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-Age"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.cdisc.org/ns/odm/v1.3&gt;text"&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AgeAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}AgeAttributeExtension"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-Age", propOrder = {
    "value"
})
public class OCodmComplexTypeDefinitionAge {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "MinimumAge")
    protected String minimumAge;
    @XmlAttribute(name = "MaximumAge")
    protected String maximumAge;

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà minimumAge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumAge() {
        return minimumAge;
    }

    /**
     * Imposta il valore della proprietà minimumAge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumAge(String value) {
        this.minimumAge = value;
    }

    /**
     * Recupera il valore della proprietà maximumAge.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumAge() {
        return maximumAge;
    }

    /**
     * Imposta il valore della proprietà maximumAge.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumAge(String value) {
        this.maximumAge = value;
    }

}
