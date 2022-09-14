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
 * <p>Classe Java per OCodmComplexTypeDefinition-ItemGroupDetails complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-ItemGroupDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}PresentInForm" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}ItemGroupDetailsElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}ItemGroupDetailsAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}ItemGroupDetailsAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-ItemGroupDetails", propOrder = {
    "presentInForm"
})
public class OCodmComplexTypeDefinitionItemGroupDetails {

    @XmlElement(name = "PresentInForm", required = true)
    protected List<OCodmComplexTypeDefinitionPresentInForm> presentInForm;
    @XmlAttribute(name = "ItemGroupOID", required = true)
    protected String itemGroupOID;

    /**
     * Gets the value of the presentInForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentInForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentInForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionPresentInForm }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionPresentInForm> getPresentInForm() {
        if (presentInForm == null) {
            presentInForm = new ArrayList<OCodmComplexTypeDefinitionPresentInForm>();
        }
        return this.presentInForm;
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

}
