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
 * <p>Classe Java per ODMcomplexTypeDefinition-GlobalVariables complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-GlobalVariables"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}StudyName"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}StudyDescription"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}ProtocolName"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}GlobalVariablesElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}GlobalVariablesAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-GlobalVariables", propOrder = {
    "studyName",
    "studyDescription",
    "protocolName"
})
public class ODMcomplexTypeDefinitionGlobalVariables {

    @XmlElement(name = "StudyName", required = true)
    protected ODMcomplexTypeDefinitionStudyName studyName;
    @XmlElement(name = "StudyDescription", required = true)
    protected ODMcomplexTypeDefinitionStudyDescription studyDescription;
    @XmlElement(name = "ProtocolName", required = true)
    protected ODMcomplexTypeDefinitionProtocolName protocolName;

    /**
     * Recupera il valore della proprietà studyName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStudyName }
     *     
     */
    public ODMcomplexTypeDefinitionStudyName getStudyName() {
        return studyName;
    }

    /**
     * Imposta il valore della proprietà studyName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStudyName }
     *     
     */
    public void setStudyName(ODMcomplexTypeDefinitionStudyName value) {
        this.studyName = value;
    }

    /**
     * Recupera il valore della proprietà studyDescription.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionStudyDescription }
     *     
     */
    public ODMcomplexTypeDefinitionStudyDescription getStudyDescription() {
        return studyDescription;
    }

    /**
     * Imposta il valore della proprietà studyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionStudyDescription }
     *     
     */
    public void setStudyDescription(ODMcomplexTypeDefinitionStudyDescription value) {
        this.studyDescription = value;
    }

    /**
     * Recupera il valore della proprietà protocolName.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionProtocolName }
     *     
     */
    public ODMcomplexTypeDefinitionProtocolName getProtocolName() {
        return protocolName;
    }

    /**
     * Imposta il valore della proprietà protocolName.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionProtocolName }
     *     
     */
    public void setProtocolName(ODMcomplexTypeDefinitionProtocolName value) {
        this.protocolName = value;
    }

}
