//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-FormDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-FormDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VersionDescription" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNotes" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}PresentInEventDefinition" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}FormDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}FormDetailsAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}FormDetailsAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-FormDetails", propOrder = {
    "versionDescription",
    "revisionNotes",
    "presentInEventDefinition"
})
public class OCodmComplexTypeDefinitionFormDetails {

    @XmlElement(name = "VersionDescription")
    protected String versionDescription;
    @XmlElement(name = "RevisionNotes")
    protected String revisionNotes;
    @XmlElement(name = "PresentInEventDefinition", required = true)
    protected List<OCodmComplexTypeDefinitionPresentInEventDefinition> presentInEventDefinition;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "ParentFormOID")
    protected String parentFormOID;

    /**
     * Recupera il valore della proprietà versionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * Imposta il valore della proprietà versionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionDescription(String value) {
        this.versionDescription = value;
    }

    /**
     * Recupera il valore della proprietà revisionNotes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNotes() {
        return revisionNotes;
    }

    /**
     * Imposta il valore della proprietà revisionNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNotes(String value) {
        this.revisionNotes = value;
    }

    /**
     * Gets the value of the presentInEventDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentInEventDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentInEventDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionPresentInEventDefinition }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionPresentInEventDefinition> getPresentInEventDefinition() {
        if (presentInEventDefinition == null) {
            presentInEventDefinition = new ArrayList<OCodmComplexTypeDefinitionPresentInEventDefinition>();
        }
        return this.presentInEventDefinition;
    }

    /**
     * Recupera il valore della proprietà formOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOID() {
        return formOID;
    }

    /**
     * Imposta il valore della proprietà formOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOID(String value) {
        this.formOID = value;
    }

    /**
     * Recupera il valore della proprietà parentFormOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFormOID() {
        return parentFormOID;
    }

    /**
     * Imposta il valore della proprietà parentFormOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFormOID(String value) {
        this.parentFormOID = value;
    }

}
