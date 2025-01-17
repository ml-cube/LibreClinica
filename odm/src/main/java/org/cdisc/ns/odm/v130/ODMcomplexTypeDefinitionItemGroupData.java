//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ItemGroupData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemGroupData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDataStarGroup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemGroupDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemGroupData", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "itemDataGroup",
    "itemDataStarGroup"
})
public class ODMcomplexTypeDefinitionItemGroupData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "ItemData")
    protected List<ODMcomplexTypeDefinitionItemData> itemDataGroup;
    @XmlElementRefs({
        @XmlElementRef(name = "ItemDataBase64Binary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataHexFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataInteger", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataAny", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataURI", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDouble", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataHexBinary", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataDurationDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataIncompleteDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialDate", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataPartialTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataIntervalDatetime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataTime", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataString", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataBoolean", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataFloat", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ItemDataBase64Float", namespace = "http://www.cdisc.org/ns/odm/v1.3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> itemDataStarGroup;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;

    /**
     * Recupera il valore della proprietà auditRecord.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public ODMcomplexTypeDefinitionAuditRecord getAuditRecord() {
        return auditRecord;
    }

    /**
     * Imposta il valore della proprietà auditRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionAuditRecord }
     *     
     */
    public void setAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        this.auditRecord = value;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public ODMcomplexTypeDefinitionSignature getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSignature }
     *     
     */
    public void setSignature(ODMcomplexTypeDefinitionSignature value) {
        this.signature = value;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAnnotation> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<ODMcomplexTypeDefinitionAnnotation>();
        }
        return this.annotation;
    }

    /**
     * Gets the value of the itemDataGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemData> getItemDataGroup() {
        if (itemDataGroup == null) {
            itemDataGroup = new ArrayList<ODMcomplexTypeDefinitionItemData>();
        }
        return this.itemDataGroup;
    }

    /**
     * Gets the value of the itemDataStarGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataStarGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataStarGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Binary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataURI }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDouble }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataHexBinary }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataDurationDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIncompleteDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataPartialTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataIntervalDatetime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataTime }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataString }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBoolean }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataFloat }{@code >}
     * {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDataBase64Float }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getItemDataStarGroup() {
        if (itemDataStarGroup == null) {
            itemDataStarGroup = new ArrayList<JAXBElement<?>>();
        }
        return this.itemDataStarGroup;
    }

    /**
     * Recupera il valore della proprietà itemGroupOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    /**
     * Imposta il valore della proprietà itemGroupOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    /**
     * Recupera il valore della proprietà itemGroupRepeatKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    /**
     * Imposta il valore della proprietà itemGroupRepeatKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    /**
     * Recupera il valore della proprietà transactionType.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Imposta il valore della proprietà transactionType.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

}
