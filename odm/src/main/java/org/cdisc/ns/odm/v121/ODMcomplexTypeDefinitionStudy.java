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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-Study complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-Study"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}GlobalVariables"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}BasicDefinitions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}StudyElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}StudyAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-Study", propOrder = {
    "globalVariables",
    "basicDefinitions",
    "metaDataVersion"
})
public class ODMcomplexTypeDefinitionStudy {

    @XmlElement(name = "GlobalVariables", required = true)
    protected ODMcomplexTypeDefinitionGlobalVariables globalVariables;
    @XmlElement(name = "BasicDefinitions")
    protected ODMcomplexTypeDefinitionBasicDefinitions basicDefinitions;
    @XmlElement(name = "MetaDataVersion")
    protected List<ODMcomplexTypeDefinitionMetaDataVersion> metaDataVersion;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;

    /**
     * Recupera il valore della proprietà globalVariables.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionGlobalVariables }
     *     
     */
    public ODMcomplexTypeDefinitionGlobalVariables getGlobalVariables() {
        return globalVariables;
    }

    /**
     * Imposta il valore della proprietà globalVariables.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionGlobalVariables }
     *     
     */
    public void setGlobalVariables(ODMcomplexTypeDefinitionGlobalVariables value) {
        this.globalVariables = value;
    }

    /**
     * Recupera il valore della proprietà basicDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionBasicDefinitions }
     *     
     */
    public ODMcomplexTypeDefinitionBasicDefinitions getBasicDefinitions() {
        return basicDefinitions;
    }

    /**
     * Imposta il valore della proprietà basicDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionBasicDefinitions }
     *     
     */
    public void setBasicDefinitions(ODMcomplexTypeDefinitionBasicDefinitions value) {
        this.basicDefinitions = value;
    }

    /**
     * Gets the value of the metaDataVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaDataVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaDataVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionMetaDataVersion }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionMetaDataVersion> getMetaDataVersion() {
        if (metaDataVersion == null) {
            metaDataVersion = new ArrayList<ODMcomplexTypeDefinitionMetaDataVersion>();
        }
        return this.metaDataVersion;
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
