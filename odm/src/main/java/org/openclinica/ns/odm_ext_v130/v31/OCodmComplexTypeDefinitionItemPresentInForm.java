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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-ItemPresentInForm complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ItemPresentInForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LeftItemText" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="RightItemText" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="ItemHeader" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="ItemSubHeader" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;element name="SectionLabel" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemResponse"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SimpleConditionalDisplay" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemPresentInFormAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemPresentInFormAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ItemPresentInForm", propOrder = {
    "leftItemText",
    "rightItemText",
    "itemHeader",
    "itemSubHeader",
    "sectionLabel",
    "itemResponse",
    "simpleConditionalDisplay"
})
public class OCodmComplexTypeDefinitionItemPresentInForm {

    @XmlElement(name = "LeftItemText")
    protected String leftItemText;
    @XmlElement(name = "RightItemText")
    protected String rightItemText;
    @XmlElement(name = "ItemHeader")
    protected String itemHeader;
    @XmlElement(name = "ItemSubHeader")
    protected String itemSubHeader;
    @XmlElement(name = "SectionLabel", required = true)
    protected String sectionLabel;
    @XmlElement(name = "ItemResponse", required = true)
    protected OCodmComplexTypeDefinitionItemResponse itemResponse;
    @XmlElement(name = "SimpleConditionalDisplay")
    protected OCodmComplexTypeDefinitionSimpleConditionalDisplay simpleConditionalDisplay;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "ParentItemOID")
    protected String parentItemOID;
    @XmlAttribute(name = "ColumnNumber")
    protected BigInteger columnNumber;
    @XmlAttribute(name = "PageNumber")
    protected String pageNumber;
    @XmlAttribute(name = "DefaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "PHI", required = true)
    protected String phi;
    @XmlAttribute(name = "ShowItem")
    protected String showItem;

    /**
     * Recupera il valore della proprietà leftItemText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftItemText() {
        return leftItemText;
    }

    /**
     * Imposta il valore della proprietà leftItemText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftItemText(String value) {
        this.leftItemText = value;
    }

    /**
     * Recupera il valore della proprietà rightItemText.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightItemText() {
        return rightItemText;
    }

    /**
     * Imposta il valore della proprietà rightItemText.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightItemText(String value) {
        this.rightItemText = value;
    }

    /**
     * Recupera il valore della proprietà itemHeader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemHeader() {
        return itemHeader;
    }

    /**
     * Imposta il valore della proprietà itemHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemHeader(String value) {
        this.itemHeader = value;
    }

    /**
     * Recupera il valore della proprietà itemSubHeader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSubHeader() {
        return itemSubHeader;
    }

    /**
     * Imposta il valore della proprietà itemSubHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSubHeader(String value) {
        this.itemSubHeader = value;
    }

    /**
     * Recupera il valore della proprietà sectionLabel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionLabel() {
        return sectionLabel;
    }

    /**
     * Imposta il valore della proprietà sectionLabel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionLabel(String value) {
        this.sectionLabel = value;
    }

    /**
     * Recupera il valore della proprietà itemResponse.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionItemResponse }
     *     
     */
    public OCodmComplexTypeDefinitionItemResponse getItemResponse() {
        return itemResponse;
    }

    /**
     * Imposta il valore della proprietà itemResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionItemResponse }
     *     
     */
    public void setItemResponse(OCodmComplexTypeDefinitionItemResponse value) {
        this.itemResponse = value;
    }

    /**
     * Recupera il valore della proprietà simpleConditionalDisplay.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionSimpleConditionalDisplay }
     *     
     */
    public OCodmComplexTypeDefinitionSimpleConditionalDisplay getSimpleConditionalDisplay() {
        return simpleConditionalDisplay;
    }

    /**
     * Imposta il valore della proprietà simpleConditionalDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionSimpleConditionalDisplay }
     *     
     */
    public void setSimpleConditionalDisplay(OCodmComplexTypeDefinitionSimpleConditionalDisplay value) {
        this.simpleConditionalDisplay = value;
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
     * Recupera il valore della proprietà parentItemOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentItemOID() {
        return parentItemOID;
    }

    /**
     * Imposta il valore della proprietà parentItemOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentItemOID(String value) {
        this.parentItemOID = value;
    }

    /**
     * Recupera il valore della proprietà columnNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnNumber() {
        return columnNumber;
    }

    /**
     * Imposta il valore della proprietà columnNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnNumber(BigInteger value) {
        this.columnNumber = value;
    }

    /**
     * Recupera il valore della proprietà pageNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Imposta il valore della proprietà pageNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumber(String value) {
        this.pageNumber = value;
    }

    /**
     * Recupera il valore della proprietà defaultValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * Imposta il valore della proprietà defaultValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**
     * Recupera il valore della proprietà phi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPHI() {
        return phi;
    }

    /**
     * Imposta il valore della proprietà phi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPHI(String value) {
        this.phi = value;
    }

    /**
     * Recupera il valore della proprietà showItem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowItem() {
        return showItem;
    }

    /**
     * Imposta il valore della proprietà showItem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowItem(String value) {
        this.showItem = value;
    }

}
