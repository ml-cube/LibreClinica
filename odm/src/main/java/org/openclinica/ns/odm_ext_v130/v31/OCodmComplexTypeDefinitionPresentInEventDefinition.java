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


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-PresentInEventDefinition complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-PresentInEventDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInEventDefinitionAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-PresentInEventDefinition")
public class OCodmComplexTypeDefinitionPresentInEventDefinition {

    @XmlAttribute(name = "StudyEventOID", required = true)
    protected String studyEventOID;
    @XmlAttribute(name = "IsDefaultVersion")
    protected String isDefaultVersion;
    @XmlAttribute(name = "NullValues")
    protected String nullValues;
    @XmlAttribute(name = "PasswordRequired")
    protected String passwordRequired;
    @XmlAttribute(name = "DoubleDataEntry")
    protected String doubleDataEntry;
    @XmlAttribute(name = "HideCRF")
    protected String hideCRF;
    @XmlAttribute(name = "SourceDataVerification")
    protected String sourceDataVerification;

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
     * Recupera il valore della proprietà isDefaultVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * Imposta il valore della proprietà isDefaultVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDefaultVersion(String value) {
        this.isDefaultVersion = value;
    }

    /**
     * Recupera il valore della proprietà nullValues.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNullValues() {
        return nullValues;
    }

    /**
     * Imposta il valore della proprietà nullValues.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNullValues(String value) {
        this.nullValues = value;
    }

    /**
     * Recupera il valore della proprietà passwordRequired.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordRequired() {
        return passwordRequired;
    }

    /**
     * Imposta il valore della proprietà passwordRequired.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordRequired(String value) {
        this.passwordRequired = value;
    }

    /**
     * Recupera il valore della proprietà doubleDataEntry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoubleDataEntry() {
        return doubleDataEntry;
    }

    /**
     * Imposta il valore della proprietà doubleDataEntry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoubleDataEntry(String value) {
        this.doubleDataEntry = value;
    }

    /**
     * Recupera il valore della proprietà hideCRF.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHideCRF() {
        return hideCRF;
    }

    /**
     * Imposta il valore della proprietà hideCRF.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHideCRF(String value) {
        this.hideCRF = value;
    }

    /**
     * Recupera il valore della proprietà sourceDataVerification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDataVerification() {
        return sourceDataVerification;
    }

    /**
     * Imposta il valore della proprietà sourceDataVerification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDataVerification(String value) {
        this.sourceDataVerification = value;
    }

}
