//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ItemRef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ItemRefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemRefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemRefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemRef")
public class ODMcomplexTypeDefinitionItemRef {

    @XmlAttribute(name = "ItemOID", required = true)
    protected String itemOID;
    @XmlAttribute(name = "OrderNumber")
    protected BigInteger orderNumber;
    @XmlAttribute(name = "Mandatory", required = true)
    protected YesOrNo mandatory;
    @XmlAttribute(name = "KeySequence")
    protected BigInteger keySequence;
    @XmlAttribute(name = "ImputationMethodOID")
    protected String imputationMethodOID;
    @XmlAttribute(name = "Role")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> role;
    @XmlAttribute(name = "RoleCodeListOID")
    protected String roleCodeListOID;

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
     * Recupera il valore della proprietà orderNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderNumber() {
        return orderNumber;
    }

    /**
     * Imposta il valore della proprietà orderNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderNumber(BigInteger value) {
        this.orderNumber = value;
    }

    /**
     * Recupera il valore della proprietà mandatory.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getMandatory() {
        return mandatory;
    }

    /**
     * Imposta il valore della proprietà mandatory.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setMandatory(YesOrNo value) {
        this.mandatory = value;
    }

    /**
     * Recupera il valore della proprietà keySequence.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKeySequence() {
        return keySequence;
    }

    /**
     * Imposta il valore della proprietà keySequence.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKeySequence(BigInteger value) {
        this.keySequence = value;
    }

    /**
     * Recupera il valore della proprietà imputationMethodOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImputationMethodOID() {
        return imputationMethodOID;
    }

    /**
     * Imposta il valore della proprietà imputationMethodOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImputationMethodOID(String value) {
        this.imputationMethodOID = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRole() {
        if (role == null) {
            role = new ArrayList<String>();
        }
        return this.role;
    }

    /**
     * Recupera il valore della proprietà roleCodeListOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCodeListOID() {
        return roleCodeListOID;
    }

    /**
     * Imposta il valore della proprietà roleCodeListOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCodeListOID(String value) {
        this.roleCodeListOID = value;
    }

}
