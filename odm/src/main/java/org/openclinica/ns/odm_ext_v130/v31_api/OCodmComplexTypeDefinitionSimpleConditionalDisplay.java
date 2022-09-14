//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-SimpleConditionalDisplay complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-SimpleConditionalDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControlItemName" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/&gt;
 *         &lt;element name="OptionValue" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/&gt;
 *         &lt;element name="Message" type="{http://www.cdisc.org/ns/odm/v1.3-api}text"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SimpleConditionalDisplayElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SimpleConditionalDisplayAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SimpleConditionalDisplayAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-SimpleConditionalDisplay", propOrder = {
    "controlItemName",
    "optionValue",
    "message"
})
public class OCodmComplexTypeDefinitionSimpleConditionalDisplay {

    @XmlElement(name = "ControlItemName", required = true)
    protected String controlItemName;
    @XmlElement(name = "OptionValue", required = true)
    protected String optionValue;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Recupera il valore della proprietà controlItemName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlItemName() {
        return controlItemName;
    }

    /**
     * Imposta il valore della proprietà controlItemName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlItemName(String value) {
        this.controlItemName = value;
    }

    /**
     * Recupera il valore della proprietà optionValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * Imposta il valore della proprietà optionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionValue(String value) {
        this.optionValue = value;
    }

    /**
     * Recupera il valore della proprietà message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Imposta il valore della proprietà message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
