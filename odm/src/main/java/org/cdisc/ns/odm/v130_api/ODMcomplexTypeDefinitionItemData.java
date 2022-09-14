//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31_api.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v130.v31_api.OCodmComplexTypeDefinitionDiscrepancyNotes;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ItemData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}MeasurementUnitRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}ItemDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}ItemDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}ItemDataAttributeSharedDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}ItemDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemData", propOrder = {
    "auditRecord",
    "signature",
    "measurementUnitRef",
    "annotation",
    "itemDataElementExtension"
})
public class ODMcomplexTypeDefinitionItemData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "MeasurementUnitRef")
    protected ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElements({
        @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1-api", type = OCodmComplexTypeDefinitionAuditLogs.class),
        @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1-api", type = OCodmComplexTypeDefinitionDiscrepancyNotes.class)
    })
    protected List<Object> itemDataElementExtension;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "IsNull")
    protected YesOnly isNull;
    @XmlAttribute(name = "ReasonForNull", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1-api")
    protected String reasonForNull;

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
     * Recupera il valore della proprietà measurementUnitRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public ODMcomplexTypeDefinitionMeasurementUnitRef getMeasurementUnitRef() {
        return measurementUnitRef;
    }

    /**
     * Imposta il valore della proprietà measurementUnitRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public void setMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        this.measurementUnitRef = value;
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
     * Gets the value of the itemDataElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDataElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDataElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<Object> getItemDataElementExtension() {
        if (itemDataElementExtension == null) {
            itemDataElementExtension = new ArrayList<Object>();
        }
        return this.itemDataElementExtension;
    }

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
     * Recupera il valore della proprietà itemOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOID() {
        return itemOID;
    }

    /**
     * Imposta il valore della proprietà itemOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOID(String value) {
        this.itemOID = value;
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

    /**
     * Recupera il valore della proprietà isNull.
     * 
     * @return
     *     possible object is
     *     {@link YesOnly }
     *     
     */
    public YesOnly getIsNull() {
        return isNull;
    }

    /**
     * Imposta il valore della proprietà isNull.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOnly }
     *     
     */
    public void setIsNull(YesOnly value) {
        this.isNull = value;
    }

    /**
     * Recupera il valore della proprietà reasonForNull.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForNull() {
        return reasonForNull;
    }

    /**
     * Imposta il valore della proprietà reasonForNull.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForNull(String value) {
        this.reasonForNull = value;
    }

}
