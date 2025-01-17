//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-CodeList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-CodeList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ExternalCodeList"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}EnumeratedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeList", propOrder = {
    "codeListItem",
    "externalCodeList",
    "enumeratedItem"
})
public class ODMcomplexTypeDefinitionCodeList {

    @XmlElement(name = "CodeListItem")
    protected List<ODMcomplexTypeDefinitionCodeListItem> codeListItem;
    @XmlElement(name = "ExternalCodeList")
    protected ODMcomplexTypeDefinitionExternalCodeList externalCodeList;
    @XmlElement(name = "EnumeratedItem")
    protected List<ODMcomplexTypeDefinitionEnumeratedItem> enumeratedItem;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DataType", required = true)
    protected CLDataType dataType;
    @XmlAttribute(name = "SASFormatName")
    protected String sasFormatName;

    /**
     * Gets the value of the codeListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCodeListItem }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCodeListItem> getCodeListItem() {
        if (codeListItem == null) {
            codeListItem = new ArrayList<ODMcomplexTypeDefinitionCodeListItem>();
        }
        return this.codeListItem;
    }

    /**
     * Recupera il valore della proprietà externalCodeList.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionExternalCodeList }
     *     
     */
    public ODMcomplexTypeDefinitionExternalCodeList getExternalCodeList() {
        return externalCodeList;
    }

    /**
     * Imposta il valore della proprietà externalCodeList.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionExternalCodeList }
     *     
     */
    public void setExternalCodeList(ODMcomplexTypeDefinitionExternalCodeList value) {
        this.externalCodeList = value;
    }

    /**
     * Gets the value of the enumeratedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeratedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeratedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionEnumeratedItem }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionEnumeratedItem> getEnumeratedItem() {
        if (enumeratedItem == null) {
            enumeratedItem = new ArrayList<ODMcomplexTypeDefinitionEnumeratedItem>();
        }
        return this.enumeratedItem;
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
     * Recupera il valore della proprietà dataType.
     * 
     * @return
     *     possible object is
     *     {@link CLDataType }
     *     
     */
    public CLDataType getDataType() {
        return dataType;
    }

    /**
     * Imposta il valore della proprietà dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link CLDataType }
     *     
     */
    public void setDataType(CLDataType value) {
        this.dataType = value;
    }

    /**
     * Recupera il valore della proprietà sasFormatName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASFormatName() {
        return sasFormatName;
    }

    /**
     * Imposta il valore della proprietà sasFormatName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASFormatName(String value) {
        this.sasFormatName = value;
    }

}
