//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-StudyEventData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-StudyEventData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}FormData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}StudyEventDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-StudyEventData", propOrder = {
    "auditRecord",
    "signature",
    "annotation",
    "formData",
    "studyEventDataElementExtension"
})
public class ODMcomplexTypeDefinitionStudyEventData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "FormData")
    protected List<ODMcomplexTypeDefinitionFormData> formData;
    @XmlElements({
        @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionAuditLogs.class),
        @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionDiscrepancyNotes.class)
    })
    protected List<Object> studyEventDataElementExtension;
    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "StudyEventLocation", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String studyEventLocation;
    @XmlAttribute(name = "StartDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String startDate;
    @XmlAttribute(name = "EndDate", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String endDate;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String status;
    @XmlAttribute(name = "SubjectAgeAtEvent", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected BigInteger subjectAgeAtEvent;

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
     * Gets the value of the formData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormData> getFormData() {
        if (formData == null) {
            formData = new ArrayList<ODMcomplexTypeDefinitionFormData>();
        }
        return this.formData;
    }

    /**
     * Gets the value of the studyEventDataElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventDataElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventDataElementExtension().add(newItem);
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
    public List<Object> getStudyEventDataElementExtension() {
        if (studyEventDataElementExtension == null) {
            studyEventDataElementExtension = new ArrayList<Object>();
        }
        return this.studyEventDataElementExtension;
    }

    /**
     * Recupera il valore della proprietà studyEventOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventOID() {
        return studyEventOID;
    }

    /**
     * Imposta il valore della proprietà studyEventOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventOID(String value) {
        this.studyEventOID = value;
    }

    /**
     * Recupera il valore della proprietà studyEventRepeatKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventRepeatKey() {
        return studyEventRepeatKey;
    }

    /**
     * Imposta il valore della proprietà studyEventRepeatKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventRepeatKey(String value) {
        this.studyEventRepeatKey = value;
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
     * Recupera il valore della proprietà studyEventLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyEventLocation() {
        return studyEventLocation;
    }

    /**
     * Imposta il valore della proprietà studyEventLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyEventLocation(String value) {
        this.studyEventLocation = value;
    }

    /**
     * Recupera il valore della proprietà startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Imposta il valore della proprietà startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Recupera il valore della proprietà endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Imposta il valore della proprietà endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà subjectAgeAtEvent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubjectAgeAtEvent() {
        return subjectAgeAtEvent;
    }

    /**
     * Imposta il valore della proprietà subjectAgeAtEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubjectAgeAtEvent(BigInteger value) {
        this.subjectAgeAtEvent = value;
    }

}
