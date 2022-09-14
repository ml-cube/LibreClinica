//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ShowActionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ShowActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Run" type="{http://www.openclinica.org/ns/rules/v3.1}ActionRunType" minOccurs="0"/&gt;
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationProperty" type="{http://www.openclinica.org/ns/rules/v3.1}PropertyType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteActionAttributeType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShowActionType", propOrder = {
    "run",
    "message",
    "destinationProperty"
})
public class ShowActionType {

    @XmlElement(name = "Run")
    protected ActionRunType run;
    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "DestinationProperty", required = true)
    protected List<PropertyType> destinationProperty;
    @XmlAttribute(name = "IfExpressionEvaluates")
    protected String ifExpressionEvaluates;

    /**
     * Recupera il valore della proprietà run.
     * 
     * @return
     *     possible object is
     *     {@link ActionRunType }
     *     
     */
    public ActionRunType getRun() {
        return run;
    }

    /**
     * Imposta il valore della proprietà run.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionRunType }
     *     
     */
    public void setRun(ActionRunType value) {
        this.run = value;
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

    /**
     * Gets the value of the destinationProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyType }
     * 
     * 
     */
    public List<PropertyType> getDestinationProperty() {
        if (destinationProperty == null) {
            destinationProperty = new ArrayList<PropertyType>();
        }
        return this.destinationProperty;
    }

    /**
     * Recupera il valore della proprietà ifExpressionEvaluates.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfExpressionEvaluates() {
        return ifExpressionEvaluates;
    }

    /**
     * Imposta il valore della proprietà ifExpressionEvaluates.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfExpressionEvaluates(String value) {
        this.ifExpressionEvaluates = value;
    }

}
