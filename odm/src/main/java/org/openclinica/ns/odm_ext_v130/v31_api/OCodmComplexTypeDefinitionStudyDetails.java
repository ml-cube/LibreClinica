//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-StudyDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-StudyDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDescriptionAndStatus"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}ConditionsAndEligibility"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}FacilityInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}RelatedInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyParameterConfiguration"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDetailsAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}StudyDetailsAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-StudyDetails", propOrder = {
    "studyDescriptionAndStatus",
    "conditionsAndEligibility",
    "facilityInformation",
    "relatedInformation",
    "studyParameterConfiguration"
})
public class OCodmComplexTypeDefinitionStudyDetails {

    @XmlElement(name = "StudyDescriptionAndStatus", required = true)
    protected OCodmComplexTypeDefinitionStudyDescriptionAndStatus studyDescriptionAndStatus;
    @XmlElement(name = "ConditionsAndEligibility", required = true)
    protected OCodmComplexTypeDefinitionConditionsAndEligibility conditionsAndEligibility;
    @XmlElement(name = "FacilityInformation")
    protected OCodmComplexTypeDefinitionFacilityInformation facilityInformation;
    @XmlElement(name = "RelatedInformation")
    protected OCodmComplexTypeDefinitionRelatedInformation relatedInformation;
    @XmlElement(name = "StudyParameterConfiguration", required = true)
    protected OCodmComplexTypeDefinitionStudyParameterConfiguration studyParameterConfiguration;
    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;

    /**
     * Recupera il valore della proprietà studyDescriptionAndStatus.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionStudyDescriptionAndStatus }
     *     
     */
    public OCodmComplexTypeDefinitionStudyDescriptionAndStatus getStudyDescriptionAndStatus() {
        return studyDescriptionAndStatus;
    }

    /**
     * Imposta il valore della proprietà studyDescriptionAndStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionStudyDescriptionAndStatus }
     *     
     */
    public void setStudyDescriptionAndStatus(OCodmComplexTypeDefinitionStudyDescriptionAndStatus value) {
        this.studyDescriptionAndStatus = value;
    }

    /**
     * Recupera il valore della proprietà conditionsAndEligibility.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionConditionsAndEligibility }
     *     
     */
    public OCodmComplexTypeDefinitionConditionsAndEligibility getConditionsAndEligibility() {
        return conditionsAndEligibility;
    }

    /**
     * Imposta il valore della proprietà conditionsAndEligibility.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionConditionsAndEligibility }
     *     
     */
    public void setConditionsAndEligibility(OCodmComplexTypeDefinitionConditionsAndEligibility value) {
        this.conditionsAndEligibility = value;
    }

    /**
     * Recupera il valore della proprietà facilityInformation.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionFacilityInformation }
     *     
     */
    public OCodmComplexTypeDefinitionFacilityInformation getFacilityInformation() {
        return facilityInformation;
    }

    /**
     * Imposta il valore della proprietà facilityInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionFacilityInformation }
     *     
     */
    public void setFacilityInformation(OCodmComplexTypeDefinitionFacilityInformation value) {
        this.facilityInformation = value;
    }

    /**
     * Recupera il valore della proprietà relatedInformation.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionRelatedInformation }
     *     
     */
    public OCodmComplexTypeDefinitionRelatedInformation getRelatedInformation() {
        return relatedInformation;
    }

    /**
     * Imposta il valore della proprietà relatedInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionRelatedInformation }
     *     
     */
    public void setRelatedInformation(OCodmComplexTypeDefinitionRelatedInformation value) {
        this.relatedInformation = value;
    }

    /**
     * Recupera il valore della proprietà studyParameterConfiguration.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionStudyParameterConfiguration }
     *     
     */
    public OCodmComplexTypeDefinitionStudyParameterConfiguration getStudyParameterConfiguration() {
        return studyParameterConfiguration;
    }

    /**
     * Imposta il valore della proprietà studyParameterConfiguration.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionStudyParameterConfiguration }
     *     
     */
    public void setStudyParameterConfiguration(OCodmComplexTypeDefinitionStudyParameterConfiguration value) {
        this.studyParameterConfiguration = value;
    }

    /**
     * Recupera il valore della proprietà studyOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyOID() {
        return studyOID;
    }

    /**
     * Imposta il valore della proprietà studyOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyOID(String value) {
        this.studyOID = value;
    }

}
