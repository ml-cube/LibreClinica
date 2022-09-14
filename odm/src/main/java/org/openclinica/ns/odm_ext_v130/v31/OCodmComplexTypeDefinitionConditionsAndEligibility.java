//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-ConditionsAndEligibility complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ConditionsAndEligibility"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Conditions" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Keywords" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="EligibilityCriteria" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="Sex" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}Age" minOccurs="0"/&gt;
 *         &lt;element name="HealthyVolunteersAccepted" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedTotalEnrollment" type="{http://www.cdisc.org/ns/odm/v1.3}integer"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ConditionsAndEligibilityAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ConditionsAndEligibility", propOrder = {
    "conditions",
    "keywords",
    "eligibilityCriteria",
    "sex",
    "age",
    "healthyVolunteersAccepted",
    "expectedTotalEnrollment"
})
public class OCodmComplexTypeDefinitionConditionsAndEligibility {

    @XmlElement(name = "Conditions")
    protected String conditions;
    @XmlElement(name = "Keywords")
    protected String keywords;
    @XmlElement(name = "EligibilityCriteria")
    protected String eligibilityCriteria;
    @XmlElement(name = "Sex")
    protected String sex;
    @XmlElement(name = "Age")
    protected OCodmComplexTypeDefinitionAge age;
    @XmlElement(name = "HealthyVolunteersAccepted")
    protected String healthyVolunteersAccepted;
    @XmlElement(name = "ExpectedTotalEnrollment", required = true)
    protected BigInteger expectedTotalEnrollment;

    /**
     * Recupera il valore della proprietà conditions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditions() {
        return conditions;
    }

    /**
     * Imposta il valore della proprietà conditions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditions(String value) {
        this.conditions = value;
    }

    /**
     * Recupera il valore della proprietà keywords.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Imposta il valore della proprietà keywords.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Recupera il valore della proprietà eligibilityCriteria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEligibilityCriteria() {
        return eligibilityCriteria;
    }

    /**
     * Imposta il valore della proprietà eligibilityCriteria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEligibilityCriteria(String value) {
        this.eligibilityCriteria = value;
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

    /**
     * Recupera il valore della proprietà age.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public OCodmComplexTypeDefinitionAge getAge() {
        return age;
    }

    /**
     * Imposta il valore della proprietà age.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionAge }
     *     
     */
    public void setAge(OCodmComplexTypeDefinitionAge value) {
        this.age = value;
    }

    /**
     * Recupera il valore della proprietà healthyVolunteersAccepted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthyVolunteersAccepted() {
        return healthyVolunteersAccepted;
    }

    /**
     * Imposta il valore della proprietà healthyVolunteersAccepted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthyVolunteersAccepted(String value) {
        this.healthyVolunteersAccepted = value;
    }

    /**
     * Recupera il valore della proprietà expectedTotalEnrollment.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedTotalEnrollment() {
        return expectedTotalEnrollment;
    }

    /**
     * Imposta il valore della proprietà expectedTotalEnrollment.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedTotalEnrollment(BigInteger value) {
        this.expectedTotalEnrollment = value;
    }

}
