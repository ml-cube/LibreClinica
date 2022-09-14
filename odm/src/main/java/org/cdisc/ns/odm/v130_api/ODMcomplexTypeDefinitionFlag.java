//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-Flag complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Flag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}FlagValue"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}FlagType" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}FlagElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}FlagAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Flag", propOrder = {
    "flagValue",
    "flagType"
})
public class ODMcomplexTypeDefinitionFlag {

    @XmlElement(name = "FlagValue", required = true)
    protected ODMcomplexTypeDefinitionFlagValue flagValue;
    @XmlElement(name = "FlagType")
    protected ODMcomplexTypeDefinitionFlagType flagType;

    /**
     * Recupera il valore della proprietà flagValue.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public ODMcomplexTypeDefinitionFlagValue getFlagValue() {
        return flagValue;
    }

    /**
     * Imposta il valore della proprietà flagValue.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagValue }
     *     
     */
    public void setFlagValue(ODMcomplexTypeDefinitionFlagValue value) {
        this.flagValue = value;
    }

    /**
     * Recupera il valore della proprietà flagType.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public ODMcomplexTypeDefinitionFlagType getFlagType() {
        return flagType;
    }

    /**
     * Imposta il valore della proprietà flagType.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionFlagType }
     *     
     */
    public void setFlagType(ODMcomplexTypeDefinitionFlagType value) {
        this.flagType = value;
    }

}
