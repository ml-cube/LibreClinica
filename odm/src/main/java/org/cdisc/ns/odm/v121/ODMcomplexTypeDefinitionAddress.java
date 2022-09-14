//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-Address complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StreetName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}City" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StateProv" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Country" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}PostalCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}OtherText" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}AddressElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}AddressAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Address", propOrder = {
    "streetName",
    "city",
    "stateProv",
    "country",
    "postalCode",
    "otherText"
})
public class ODMcomplexTypeDefinitionAddress {

    @XmlElement(name = "StreetName")
    protected List<ODMcomplexTypeDefinitionStreetName> streetName;
    @XmlElement(name = "City")
    protected ODMcomplexTypeDefinitionCity city;
    @XmlElement(name = "StateProv")
    protected ODMcomplexTypeDefinitionStateProv stateProv;
    @XmlElement(name = "Country")
    protected ODMcomplexTypeDefinitionCountry country;
    @XmlElement(name = "PostalCode")
    protected ODMcomplexTypeDefinitionPostalCode postalCode;
    @XmlElement(name = "OtherText")
    protected ODMcomplexTypeDefinitionOtherText otherText;

    /**
     * Gets the value of the streetName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStreetName }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStreetName> getStreetName() {
        if (streetName == null) {
            streetName = new ArrayList<ODMcomplexTypeDefinitionStreetName>();
        }
        return this.streetName;
    }

    /**
     * Recupera il valore della proprietà city.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCity }
     *     
     */
    public ODMcomplexTypeDefinitionCity getCity() {
        return city;
    }

    /**
     * Imposta il valore della proprietà city.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCity }
     *     
     */
    public void setCity(ODMcomplexTypeDefinitionCity value) {
        this.city = value;
    }

    /**
     * Recupera il valore della proprietà stateProv.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStateProv }
     *     
     */
    public ODMcomplexTypeDefinitionStateProv getStateProv() {
        return stateProv;
    }

    /**
     * Imposta il valore della proprietà stateProv.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStateProv }
     *     
     */
    public void setStateProv(ODMcomplexTypeDefinitionStateProv value) {
        this.stateProv = value;
    }

    /**
     * Recupera il valore della proprietà country.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCountry }
     *     
     */
    public ODMcomplexTypeDefinitionCountry getCountry() {
        return country;
    }

    /**
     * Imposta il valore della proprietà country.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCountry }
     *     
     */
    public void setCountry(ODMcomplexTypeDefinitionCountry value) {
        this.country = value;
    }

    /**
     * Recupera il valore della proprietà postalCode.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPostalCode }
     *     
     */
    public ODMcomplexTypeDefinitionPostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Imposta il valore della proprietà postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPostalCode }
     *     
     */
    public void setPostalCode(ODMcomplexTypeDefinitionPostalCode value) {
        this.postalCode = value;
    }

    /**
     * Recupera il valore della proprietà otherText.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionOtherText }
     *     
     */
    public ODMcomplexTypeDefinitionOtherText getOtherText() {
        return otherText;
    }

    /**
     * Imposta il valore della proprietà otherText.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionOtherText }
     *     
     */
    public void setOtherText(ODMcomplexTypeDefinitionOtherText value) {
        this.otherText = value;
    }

}
