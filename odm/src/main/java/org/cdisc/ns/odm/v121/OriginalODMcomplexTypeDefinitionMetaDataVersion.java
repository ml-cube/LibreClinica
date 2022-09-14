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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-MetaDataVersion complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionPreIncludeElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Include" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Protocol" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FormDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ImputationMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Presentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "include",
    "protocol",
    "studyEventDef",
    "formDef",
    "itemGroupDef",
    "itemDef",
    "codeList",
    "imputationMethod",
    "presentation"
})
@XmlSeeAlso({
    ODMcomplexTypeDefinitionMetaDataVersion.class
})
public class OriginalODMcomplexTypeDefinitionMetaDataVersion {

    @XmlElement(name = "Include")
    protected ODMcomplexTypeDefinitionInclude include;
    @XmlElement(name = "Protocol")
    protected ODMcomplexTypeDefinitionProtocol protocol;
    @XmlElement(name = "StudyEventDef")
    protected List<ODMcomplexTypeDefinitionStudyEventDef> studyEventDef;
    @XmlElement(name = "FormDef")
    protected List<ODMcomplexTypeDefinitionFormDef> formDef;
    @XmlElement(name = "ItemGroupDef")
    protected List<ODMcomplexTypeDefinitionItemGroupDef> itemGroupDef;
    @XmlElement(name = "ItemDef")
    protected List<ODMcomplexTypeDefinitionItemDef> itemDef;
    @XmlElement(name = "CodeList")
    protected List<ODMcomplexTypeDefinitionCodeList> codeList;
    @XmlElement(name = "ImputationMethod")
    protected List<ODMcomplexTypeDefinitionImputationMethod> imputationMethod;
    @XmlElement(name = "Presentation")
    protected List<ODMcomplexTypeDefinitionPresentation> presentation;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Description")
    protected String description;

    /**
     * Recupera il valore della proprietà include.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public ODMcomplexTypeDefinitionInclude getInclude() {
        return include;
    }

    /**
     * Imposta il valore della proprietà include.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionInclude }
     *     
     */
    public void setInclude(ODMcomplexTypeDefinitionInclude value) {
        this.include = value;
    }

    /**
     * Recupera il valore della proprietà protocol.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public ODMcomplexTypeDefinitionProtocol getProtocol() {
        return protocol;
    }

    /**
     * Imposta il valore della proprietà protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionProtocol }
     *     
     */
    public void setProtocol(ODMcomplexTypeDefinitionProtocol value) {
        this.protocol = value;
    }

    /**
     * Gets the value of the studyEventDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyEventDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyEventDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudyEventDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudyEventDef> getStudyEventDef() {
        if (studyEventDef == null) {
            studyEventDef = new ArrayList<ODMcomplexTypeDefinitionStudyEventDef>();
        }
        return this.studyEventDef;
    }

    /**
     * Gets the value of the formDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormDef> getFormDef() {
        if (formDef == null) {
            formDef = new ArrayList<ODMcomplexTypeDefinitionFormDef>();
        }
        return this.formDef;
    }

    /**
     * Gets the value of the itemGroupDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemGroupDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemGroupDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemGroupDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemGroupDef> getItemGroupDef() {
        if (itemGroupDef == null) {
            itemGroupDef = new ArrayList<ODMcomplexTypeDefinitionItemGroupDef>();
        }
        return this.itemGroupDef;
    }

    /**
     * Gets the value of the itemDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionItemDef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionItemDef> getItemDef() {
        if (itemDef == null) {
            itemDef = new ArrayList<ODMcomplexTypeDefinitionItemDef>();
        }
        return this.itemDef;
    }

    /**
     * Gets the value of the codeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCodeList }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCodeList> getCodeList() {
        if (codeList == null) {
            codeList = new ArrayList<ODMcomplexTypeDefinitionCodeList>();
        }
        return this.codeList;
    }

    /**
     * Gets the value of the imputationMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imputationMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImputationMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionImputationMethod }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionImputationMethod> getImputationMethod() {
        if (imputationMethod == null) {
            imputationMethod = new ArrayList<ODMcomplexTypeDefinitionImputationMethod>();
        }
        return this.imputationMethod;
    }

    /**
     * Gets the value of the presentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionPresentation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionPresentation> getPresentation() {
        if (presentation == null) {
            presentation = new ArrayList<ODMcomplexTypeDefinitionPresentation>();
        }
        return this.presentation;
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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
