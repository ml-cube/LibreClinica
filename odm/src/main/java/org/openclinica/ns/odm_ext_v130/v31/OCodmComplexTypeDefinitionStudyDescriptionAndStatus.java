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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-StudyDescriptionAndStatus complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-StudyDescriptionAndStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StudySytemStatus" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="PrincipalInvestigator" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="DetailedDescription" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Sponsor" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="Collaborators" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="StudyPhase" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="ProtocolType" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="ProtocolVerificationDate" type="{http://www.cdisc.org/ns/odm/v1.3}date" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Selection" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Timing" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Allocation" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Masking" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Control" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="InterventionModel" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="StudyClassification" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyDescriptionAndStatusElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyDescriptionAndStatusAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}StudyDescriptionAndStatusAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-StudyDescriptionAndStatus", propOrder = {
    "studySytemStatus",
    "principalInvestigator",
    "detailedDescription",
    "sponsor",
    "collaborators",
    "studyPhase",
    "protocolType",
    "protocolVerificationDate",
    "purpose",
    "duration",
    "selection",
    "timing",
    "allocation",
    "masking",
    "control",
    "interventionModel",
    "studyClassification"
})
public class OCodmComplexTypeDefinitionStudyDescriptionAndStatus {

    @XmlElement(name = "StudySytemStatus", required = true)
    protected String studySytemStatus;
    @XmlElement(name = "PrincipalInvestigator", required = true)
    protected String principalInvestigator;
    @XmlElement(name = "DetailedDescription")
    protected String detailedDescription;
    @XmlElement(name = "Sponsor", required = true)
    protected String sponsor;
    @XmlElement(name = "Collaborators")
    protected String collaborators;
    @XmlElement(name = "StudyPhase", required = true)
    protected String studyPhase;
    @XmlElement(name = "ProtocolType")
    protected String protocolType;
    @XmlElement(name = "ProtocolVerificationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar protocolVerificationDate;
    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlElement(name = "Duration")
    protected String duration;
    @XmlElement(name = "Selection")
    protected String selection;
    @XmlElement(name = "Timing")
    protected String timing;
    @XmlElement(name = "Allocation")
    protected String allocation;
    @XmlElement(name = "Masking")
    protected String masking;
    @XmlElement(name = "Control")
    protected String control;
    @XmlElement(name = "InterventionModel")
    protected String interventionModel;
    @XmlElement(name = "StudyClassification")
    protected String studyClassification;
    @XmlAttribute(name = "OfficialTitle")
    protected String officialTitle;
    @XmlAttribute(name = "SecondaryIDs")
    protected String secondaryIDs;
    @XmlAttribute(name = "DateCreated")
    protected XMLGregorianCalendar dateCreated;
    @XmlAttribute(name = "StartDate", required = true)
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "StudyCompletionDate")
    protected XMLGregorianCalendar studyCompletionDate;

    /**
     * Recupera il valore della proprietà studySytemStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudySytemStatus() {
        return studySytemStatus;
    }

    /**
     * Imposta il valore della proprietà studySytemStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudySytemStatus(String value) {
        this.studySytemStatus = value;
    }

    /**
     * Recupera il valore della proprietà principalInvestigator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrincipalInvestigator() {
        return principalInvestigator;
    }

    /**
     * Imposta il valore della proprietà principalInvestigator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrincipalInvestigator(String value) {
        this.principalInvestigator = value;
    }

    /**
     * Recupera il valore della proprietà detailedDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedDescription() {
        return detailedDescription;
    }

    /**
     * Imposta il valore della proprietà detailedDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedDescription(String value) {
        this.detailedDescription = value;
    }

    /**
     * Recupera il valore della proprietà sponsor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsor() {
        return sponsor;
    }

    /**
     * Imposta il valore della proprietà sponsor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsor(String value) {
        this.sponsor = value;
    }

    /**
     * Recupera il valore della proprietà collaborators.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaborators() {
        return collaborators;
    }

    /**
     * Imposta il valore della proprietà collaborators.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaborators(String value) {
        this.collaborators = value;
    }

    /**
     * Recupera il valore della proprietà studyPhase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyPhase() {
        return studyPhase;
    }

    /**
     * Imposta il valore della proprietà studyPhase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyPhase(String value) {
        this.studyPhase = value;
    }

    /**
     * Recupera il valore della proprietà protocolType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * Imposta il valore della proprietà protocolType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolType(String value) {
        this.protocolType = value;
    }

    /**
     * Recupera il valore della proprietà protocolVerificationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProtocolVerificationDate() {
        return protocolVerificationDate;
    }

    /**
     * Imposta il valore della proprietà protocolVerificationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProtocolVerificationDate(XMLGregorianCalendar value) {
        this.protocolVerificationDate = value;
    }

    /**
     * Recupera il valore della proprietà purpose.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Imposta il valore della proprietà purpose.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Recupera il valore della proprietà duration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Imposta il valore della proprietà duration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Recupera il valore della proprietà selection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelection() {
        return selection;
    }

    /**
     * Imposta il valore della proprietà selection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelection(String value) {
        this.selection = value;
    }

    /**
     * Recupera il valore della proprietà timing.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiming() {
        return timing;
    }

    /**
     * Imposta il valore della proprietà timing.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiming(String value) {
        this.timing = value;
    }

    /**
     * Recupera il valore della proprietà allocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocation() {
        return allocation;
    }

    /**
     * Imposta il valore della proprietà allocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocation(String value) {
        this.allocation = value;
    }

    /**
     * Recupera il valore della proprietà masking.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasking() {
        return masking;
    }

    /**
     * Imposta il valore della proprietà masking.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasking(String value) {
        this.masking = value;
    }

    /**
     * Recupera il valore della proprietà control.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControl() {
        return control;
    }

    /**
     * Imposta il valore della proprietà control.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControl(String value) {
        this.control = value;
    }

    /**
     * Recupera il valore della proprietà interventionModel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterventionModel() {
        return interventionModel;
    }

    /**
     * Imposta il valore della proprietà interventionModel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterventionModel(String value) {
        this.interventionModel = value;
    }

    /**
     * Recupera il valore della proprietà studyClassification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyClassification() {
        return studyClassification;
    }

    /**
     * Imposta il valore della proprietà studyClassification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyClassification(String value) {
        this.studyClassification = value;
    }

    /**
     * Recupera il valore della proprietà officialTitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficialTitle() {
        return officialTitle;
    }

    /**
     * Imposta il valore della proprietà officialTitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficialTitle(String value) {
        this.officialTitle = value;
    }

    /**
     * Recupera il valore della proprietà secondaryIDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIDs() {
        return secondaryIDs;
    }

    /**
     * Imposta il valore della proprietà secondaryIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIDs(String value) {
        this.secondaryIDs = value;
    }

    /**
     * Recupera il valore della proprietà dateCreated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Imposta il valore della proprietà dateCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Recupera il valore della proprietà startDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Imposta il valore della proprietà startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Recupera il valore della proprietà studyCompletionDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudyCompletionDate() {
        return studyCompletionDate;
    }

    /**
     * Imposta il valore della proprietà studyCompletionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudyCompletionDate(XMLGregorianCalendar value) {
        this.studyCompletionDate = value;
    }

}
