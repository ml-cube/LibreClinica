//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-FacilityInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-FacilityInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FacilityName" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityCity" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityState" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityCountry" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactName" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactDegree" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactPhone" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="FacilityContactEmail" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}FacilityInformationAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-FacilityInformation", propOrder = {
    "facilityName",
    "facilityCity",
    "facilityState",
    "postalCode",
    "facilityCountry",
    "facilityContactName",
    "facilityContactDegree",
    "facilityContactPhone",
    "facilityContactEmail"
})
public class OCodmComplexTypeDefinitionFacilityInformation {

    @XmlElement(name = "FacilityName")
    protected String facilityName;
    @XmlElement(name = "FacilityCity")
    protected String facilityCity;
    @XmlElement(name = "FacilityState")
    protected String facilityState;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "FacilityCountry")
    protected String facilityCountry;
    @XmlElement(name = "FacilityContactName")
    protected String facilityContactName;
    @XmlElement(name = "FacilityContactDegree")
    protected String facilityContactDegree;
    @XmlElement(name = "FacilityContactPhone")
    protected String facilityContactPhone;
    @XmlElement(name = "FacilityContactEmail")
    protected String facilityContactEmail;

    /**
     * Recupera il valore della proprietà facilityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityName() {
        return facilityName;
    }

    /**
     * Imposta il valore della proprietà facilityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityName(String value) {
        this.facilityName = value;
    }

    /**
     * Recupera il valore della proprietà facilityCity.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCity() {
        return facilityCity;
    }

    /**
     * Imposta il valore della proprietà facilityCity.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCity(String value) {
        this.facilityCity = value;
    }

    /**
     * Recupera il valore della proprietà facilityState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityState() {
        return facilityState;
    }

    /**
     * Imposta il valore della proprietà facilityState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityState(String value) {
        this.facilityState = value;
    }

    /**
     * Recupera il valore della proprietà postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Imposta il valore della proprietà postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Recupera il valore della proprietà facilityCountry.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityCountry() {
        return facilityCountry;
    }

    /**
     * Imposta il valore della proprietà facilityCountry.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityCountry(String value) {
        this.facilityCountry = value;
    }

    /**
     * Recupera il valore della proprietà facilityContactName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactName() {
        return facilityContactName;
    }

    /**
     * Imposta il valore della proprietà facilityContactName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactName(String value) {
        this.facilityContactName = value;
    }

    /**
     * Recupera il valore della proprietà facilityContactDegree.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactDegree() {
        return facilityContactDegree;
    }

    /**
     * Imposta il valore della proprietà facilityContactDegree.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactDegree(String value) {
        this.facilityContactDegree = value;
    }

    /**
     * Recupera il valore della proprietà facilityContactPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactPhone() {
        return facilityContactPhone;
    }

    /**
     * Imposta il valore della proprietà facilityContactPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactPhone(String value) {
        this.facilityContactPhone = value;
    }

    /**
     * Recupera il valore della proprietà facilityContactEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityContactEmail() {
        return facilityContactEmail;
    }

    /**
     * Imposta il valore della proprietà facilityContactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityContactEmail(String value) {
        this.facilityContactEmail = value;
    }

}
