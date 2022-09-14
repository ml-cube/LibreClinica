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
 * <p>Classe Java per EventActionType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EventActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RunOnStatus" type="{http://www.openclinica.org/ns/rules/v3.1}RunOnType" minOccurs="0"/&gt;
 *         &lt;element name="EventDestination" type="{http://www.openclinica.org/ns/rules/v3.1}EventDestinationType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}DiscrepancyNoteActionAttributeType"/&gt;
 *       &lt;attribute name="OID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventActionType", propOrder = {
    "runOnStatus",
    "eventDestination"
})
public class EventActionType {

    @XmlElement(name = "RunOnStatus")
    protected RunOnType runOnStatus;
    @XmlElement(name = "EventDestination", required = true)
    protected List<EventDestinationType> eventDestination;
    @XmlAttribute(name = "OID")
    protected String oid;
    @XmlAttribute(name = "IfExpressionEvaluates")
    protected String ifExpressionEvaluates;

    /**
     * Recupera il valore della proprietà runOnStatus.
     * 
     * @return
     *     possible object is
     *     {@link RunOnType }
     *     
     */
    public RunOnType getRunOnStatus() {
        return runOnStatus;
    }

    /**
     * Imposta il valore della proprietà runOnStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link RunOnType }
     *     
     */
    public void setRunOnStatus(RunOnType value) {
        this.runOnStatus = value;
    }

    /**
     * Gets the value of the eventDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDestinationType }
     * 
     * 
     */
    public List<EventDestinationType> getEventDestination() {
        if (eventDestination == null) {
            eventDestination = new ArrayList<EventDestinationType>();
        }
        return this.eventDestination;
    }

    /**
     * Recupera il valore della proprietà oid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Imposta il valore della proprietà oid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
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
