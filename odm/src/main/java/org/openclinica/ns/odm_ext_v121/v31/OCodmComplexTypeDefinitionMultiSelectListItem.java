//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v121.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.cdisc.ns.odm.v121.ODMcomplexTypeDefinitionDecode;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-MultiSelectListItem complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-MultiSelectListItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Decode"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectListItemElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectListItemAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectListItemAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-MultiSelectListItem", propOrder = {
    "decode"
})
public class OCodmComplexTypeDefinitionMultiSelectListItem {

    @XmlElement(name = "Decode", namespace = "http://www.cdisc.org/ns/odm/v1.2", required = true)
    protected ODMcomplexTypeDefinitionDecode decode;
    @XmlAttribute(name = "CodedOptionValue", required = true)
    protected String codedOptionValue;

    /**
     * Recupera il valore della proprietà decode.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public ODMcomplexTypeDefinitionDecode getDecode() {
        return decode;
    }

    /**
     * Imposta il valore della proprietà decode.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDecode }
     *     
     */
    public void setDecode(ODMcomplexTypeDefinitionDecode value) {
        this.decode = value;
    }

    /**
     * Recupera il valore della proprietà codedOptionValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedOptionValue() {
        return codedOptionValue;
    }

    /**
     * Imposta il valore della proprietà codedOptionValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedOptionValue(String value) {
        this.codedOptionValue = value;
    }

}
