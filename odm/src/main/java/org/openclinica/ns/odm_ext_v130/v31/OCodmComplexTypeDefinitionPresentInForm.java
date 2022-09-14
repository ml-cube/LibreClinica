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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-PresentInForm complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-PresentInForm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}ItemGroupRepeat" minOccurs="0"/&gt;
 *         &lt;element name="ItemGroupHeader" type="{http://www.cdisc.org/ns/odm/v1.3}text" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}PresentInFormAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-PresentInForm", propOrder = {
    "itemGroupRepeat",
    "itemGroupHeader"
})
public class OCodmComplexTypeDefinitionPresentInForm {

    @XmlElement(name = "ItemGroupRepeat")
    protected OCodmComplexTypeDefinitionItemGroupRepeat itemGroupRepeat;
    @XmlElement(name = "ItemGroupHeader")
    protected String itemGroupHeader;
    @XmlAttribute(name = "FormOID", required = true)
    protected String formOID;
    @XmlAttribute(name = "ShowGroup")
    protected String showGroup;

    /**
     * Recupera il valore della proprietà itemGroupRepeat.
     * 
     * @return
     *     possible object is
     *     {@link OCodmComplexTypeDefinitionItemGroupRepeat }
     *     
     */
    public OCodmComplexTypeDefinitionItemGroupRepeat getItemGroupRepeat() {
        return itemGroupRepeat;
    }

    /**
     * Imposta il valore della proprietà itemGroupRepeat.
     * 
     * @param value
     *     allowed object is
     *     {@link OCodmComplexTypeDefinitionItemGroupRepeat }
     *     
     */
    public void setItemGroupRepeat(OCodmComplexTypeDefinitionItemGroupRepeat value) {
        this.itemGroupRepeat = value;
    }

    /**
     * Recupera il valore della proprietà itemGroupHeader.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemGroupHeader() {
        return itemGroupHeader;
    }

    /**
     * Imposta il valore della proprietà itemGroupHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemGroupHeader(String value) {
        this.itemGroupHeader = value;
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
     * Recupera il valore della proprietà showGroup.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowGroup() {
        return showGroup;
    }

    /**
     * Imposta il valore della proprietà showGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowGroup(String value) {
        this.showGroup = value;
    }

}
