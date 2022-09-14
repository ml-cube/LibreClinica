//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-KeySet complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-KeySet"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}KeySetElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}KeySetAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}KeySetAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-KeySet")
public class ODMcomplexTypeDefinitionKeySet {

    @XmlAttribute(name = "StudyOID", required = true)
    protected String studyOID;
    @XmlAttribute(name = "SubjectKey")
    protected String subjectKey;
    @XmlAttribute(name = "StudyEventOID")
    protected String studyEventOID;
    @XmlAttribute(name = "StudyEventRepeatKey")
    protected String studyEventRepeatKey;
    @XmlAttribute(name = "FormOID")
    protected String formOID;
    @XmlAttribute(name = "FormRepeatKey")
    protected String formRepeatKey;
    @XmlAttribute(name = "ItemGroupOID")
    protected String itemGroupOID;
    @XmlAttribute(name = "ItemGroupRepeatKey")
    protected String itemGroupRepeatKey;
    @XmlAttribute(name = "ItemOID")
    protected String itemOID;
    @XmlAttribute(name = "OID")
    protected String oid;

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
     * Recupera il valore della proprietà formRepeatKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormRepeatKey() {
        return formRepeatKey;
    }

    /**
     * Imposta il valore della proprietà formRepeatKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormRepeatKey(String value) {
        this.formRepeatKey = value;
    }

    /**
     * Recupera il valore della proprietà itemGroupOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupOID() {
        return itemGroupOID;
    }

    /**
     * Imposta il valore della proprietà itemGroupOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupOID(String value) {
        this.itemGroupOID = value;
    }

    /**
     * Recupera il valore della proprietà itemGroupRepeatKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupRepeatKey() {
        return itemGroupRepeatKey;
    }

    /**
     * Imposta il valore della proprietà itemGroupRepeatKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupRepeatKey(String value) {
        this.itemGroupRepeatKey = value;
    }

    /**
     * Recupera il valore della proprietà itemOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemOID() {
        return itemOID;
    }

    /**
     * Imposta il valore della proprietà itemOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemOID(String value) {
        this.itemOID = value;
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

}
