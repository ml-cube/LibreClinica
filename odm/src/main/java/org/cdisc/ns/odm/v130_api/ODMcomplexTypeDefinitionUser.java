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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-User complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-User"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}LoginName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}DisplayName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}FullName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}FirstName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}LastName" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Organization" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Email" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Picture" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Pager" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Fax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Phone" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}LocationRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}Certificate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}UserElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}UserAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}UserAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-User", propOrder = {
    "loginName",
    "displayName",
    "fullName",
    "firstName",
    "lastName",
    "organization",
    "address",
    "email",
    "picture",
    "pager",
    "fax",
    "phone",
    "locationRef",
    "certificate"
})
public class ODMcomplexTypeDefinitionUser {

    @XmlElement(name = "LoginName")
    protected ODMcomplexTypeDefinitionLoginName loginName;
    @XmlElement(name = "DisplayName")
    protected ODMcomplexTypeDefinitionDisplayName displayName;
    @XmlElement(name = "FullName")
    protected ODMcomplexTypeDefinitionFullName fullName;
    @XmlElement(name = "FirstName")
    protected ODMcomplexTypeDefinitionFirstName firstName;
    @XmlElement(name = "LastName")
    protected ODMcomplexTypeDefinitionLastName lastName;
    @XmlElement(name = "Organization")
    protected ODMcomplexTypeDefinitionOrganization organization;
    @XmlElement(name = "Address")
    protected List<ODMcomplexTypeDefinitionAddress> address;
    @XmlElement(name = "Email")
    protected List<ODMcomplexTypeDefinitionEmail> email;
    @XmlElement(name = "Picture")
    protected ODMcomplexTypeDefinitionPicture picture;
    @XmlElement(name = "Pager")
    protected ODMcomplexTypeDefinitionPager pager;
    @XmlElement(name = "Fax")
    protected List<ODMcomplexTypeDefinitionFax> fax;
    @XmlElement(name = "Phone")
    protected List<ODMcomplexTypeDefinitionPhone> phone;
    @XmlElement(name = "LocationRef")
    protected List<ODMcomplexTypeDefinitionLocationRef> locationRef;
    @XmlElement(name = "Certificate")
    protected List<ODMcomplexTypeDefinitionCertificate> certificate;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "UserType")
    protected UserType userType;

    /**
     * Recupera il valore della proprietà loginName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public ODMcomplexTypeDefinitionLoginName getLoginName() {
        return loginName;
    }

    /**
     * Imposta il valore della proprietà loginName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLoginName }
     *     
     */
    public void setLoginName(ODMcomplexTypeDefinitionLoginName value) {
        this.loginName = value;
    }

    /**
     * Recupera il valore della proprietà displayName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public ODMcomplexTypeDefinitionDisplayName getDisplayName() {
        return displayName;
    }

    /**
     * Imposta il valore della proprietà displayName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDisplayName }
     *     
     */
    public void setDisplayName(ODMcomplexTypeDefinitionDisplayName value) {
        this.displayName = value;
    }

    /**
     * Recupera il valore della proprietà fullName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public ODMcomplexTypeDefinitionFullName getFullName() {
        return fullName;
    }

    /**
     * Imposta il valore della proprietà fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFullName }
     *     
     */
    public void setFullName(ODMcomplexTypeDefinitionFullName value) {
        this.fullName = value;
    }

    /**
     * Recupera il valore della proprietà firstName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public ODMcomplexTypeDefinitionFirstName getFirstName() {
        return firstName;
    }

    /**
     * Imposta il valore della proprietà firstName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFirstName }
     *     
     */
    public void setFirstName(ODMcomplexTypeDefinitionFirstName value) {
        this.firstName = value;
    }

    /**
     * Recupera il valore della proprietà lastName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public ODMcomplexTypeDefinitionLastName getLastName() {
        return lastName;
    }

    /**
     * Imposta il valore della proprietà lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLastName }
     *     
     */
    public void setLastName(ODMcomplexTypeDefinitionLastName value) {
        this.lastName = value;
    }

    /**
     * Recupera il valore della proprietà organization.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public ODMcomplexTypeDefinitionOrganization getOrganization() {
        return organization;
    }

    /**
     * Imposta il valore della proprietà organization.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionOrganization }
     *     
     */
    public void setOrganization(ODMcomplexTypeDefinitionOrganization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAddress }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAddress> getAddress() {
        if (address == null) {
            address = new ArrayList<ODMcomplexTypeDefinitionAddress>();
        }
        return this.address;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionEmail }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionEmail> getEmail() {
        if (email == null) {
            email = new ArrayList<ODMcomplexTypeDefinitionEmail>();
        }
        return this.email;
    }

    /**
     * Recupera il valore della proprietà picture.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public ODMcomplexTypeDefinitionPicture getPicture() {
        return picture;
    }

    /**
     * Imposta il valore della proprietà picture.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPicture }
     *     
     */
    public void setPicture(ODMcomplexTypeDefinitionPicture value) {
        this.picture = value;
    }

    /**
     * Recupera il valore della proprietà pager.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public ODMcomplexTypeDefinitionPager getPager() {
        return pager;
    }

    /**
     * Imposta il valore della proprietà pager.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionPager }
     *     
     */
    public void setPager(ODMcomplexTypeDefinitionPager value) {
        this.pager = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFax }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFax> getFax() {
        if (fax == null) {
            fax = new ArrayList<ODMcomplexTypeDefinitionFax>();
        }
        return this.fax;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPhone }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPhone> getPhone() {
        if (phone == null) {
            phone = new ArrayList<ODMcomplexTypeDefinitionPhone>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the locationRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionLocationRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionLocationRef> getLocationRef() {
        if (locationRef == null) {
            locationRef = new ArrayList<ODMcomplexTypeDefinitionLocationRef>();
        }
        return this.locationRef;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCertificate }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCertificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<ODMcomplexTypeDefinitionCertificate>();
        }
        return this.certificate;
    }

    /**
     * Recupera il valore della proprietà oid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOID() {
        return oid;
    }

    /**
     * Imposta il valore della proprietà oid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOID(String value) {
        this.oid = value;
    }

    /**
     * Recupera il valore della proprietà userType.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Imposta il valore della proprietà userType.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUserType(UserType value) {
        this.userType = value;
    }

}
