//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-SubjectData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SubjectData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}InvestigatorRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}SiteRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditRecord",
    "signature",
    "investigatorRef",
    "siteRef",
    "annotation",
    "studyEventData"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionSubjectData.class
})
public class OriginalODMcomplexTypeDefinitionSubjectData {

    @XmlElement(name = "AuditRecord")
    protected ODMcomplexTypeDefinitionAuditRecord auditRecord;
    @XmlElement(name = "Signature")
    protected ODMcomplexTypeDefinitionSignature signature;
    @XmlElement(name = "InvestigatorRef")
    protected ODMcomplexTypeDefinitionInvestigatorRef investigatorRef;
    @XmlElement(name = "SiteRef")
    protected ODMcomplexTypeDefinitionSiteRef siteRef;
    @XmlElement(name = "Annotation")
    protected List<ODMcomplexTypeDefinitionAnnotation> annotation;
    @XmlElement(name = "StudyEventData")
    protected List<ODMcomplexTypeDefinitionStudyEventData> studyEventData;
    @XmlAttribute(name = "SubjectKey", required = true)
    protected String subjectKey;
    @XmlAttribute(name = "TransactionType")
    protected TransactionType transactionType;
    @XmlAttribute(name = "StudySubjectID", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String studySubjectID;
    @XmlAttribute(name = "UniqueIdentifier", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String uniqueIdentifier;
    @XmlAttribute(name = "Status", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String status;
    @XmlAttribute(name = "SecondaryID", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String secondaryID;
    @XmlAttribute(name = "DateOfBirth", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlAttribute(name = "YearOfBirth", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected BigInteger yearOfBirth;
    @XmlAttribute(name = "Sex", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected String sex;

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
     * Recupera il valore della proprietà investigatorRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public ODMcomplexTypeDefinitionInvestigatorRef getInvestigatorRef() {
        return investigatorRef;
    }

    /**
     * Imposta il valore della proprietà investigatorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInvestigatorRef }
     *     
     */
    public void setInvestigatorRef(ODMcomplexTypeDefinitionInvestigatorRef value) {
        this.investigatorRef = value;
    }

    /**
     * Recupera il valore della proprietà siteRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public ODMcomplexTypeDefinitionSiteRef getSiteRef() {
        return siteRef;
    }

    /**
     * Imposta il valore della proprietà siteRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSiteRef }
     *     
     */
    public void setSiteRef(ODMcomplexTypeDefinitionSiteRef value) {
        this.siteRef = value;
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
     * Gets the value of the studyEventData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventData> getStudyEventData() {
        if (studyEventData == null) {
            studyEventData = new ArrayList<ODMcomplexTypeDefinitionStudyEventData>();
        }
        return this.studyEventData;
    }

    /**
     * Recupera il valore della proprietà subjectKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectKey() {
        return subjectKey;
    }

    /**
     * Imposta il valore della proprietà subjectKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectKey(String value) {
        this.subjectKey = value;
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
     * Recupera il valore della proprietà studySubjectID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudySubjectID() {
        return studySubjectID;
    }

    /**
     * Imposta il valore della proprietà studySubjectID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudySubjectID(String value) {
        this.studySubjectID = value;
    }

    /**
     * Recupera il valore della proprietà uniqueIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    /**
     * Imposta il valore della proprietà uniqueIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueIdentifier(String value) {
        this.uniqueIdentifier = value;
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
     * Recupera il valore della proprietà secondaryID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryID() {
        return secondaryID;
    }

    /**
     * Imposta il valore della proprietà secondaryID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryID(String value) {
        this.secondaryID = value;
    }

    /**
     * Recupera il valore della proprietà dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Imposta il valore della proprietà dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà yearOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYearOfBirth() {
        return yearOfBirth;
    }

    /**
     * Imposta il valore della proprietà yearOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYearOfBirth(BigInteger value) {
        this.yearOfBirth = value;
    }

    /**
     * Recupera il valore della proprietà sex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Imposta il valore della proprietà sex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

}
