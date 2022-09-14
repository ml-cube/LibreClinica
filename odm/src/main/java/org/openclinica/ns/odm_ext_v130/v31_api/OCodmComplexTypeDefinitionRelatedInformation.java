//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-RelatedInformation complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-RelatedInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MEDLINEIdentifier" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;element name="ResultsReference" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;element name="URLReference" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;element name="URLDescription" type="{http://www.cdisc.org/ns/odm/v1.3-api}text" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}RelatedInformationElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}RelatedInformationAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}RelatedInformationAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-RelatedInformation", propOrder = {
    "medlineIdentifier",
    "resultsReference",
    "urlReference",
    "urlDescription"
})
public class OCodmComplexTypeDefinitionRelatedInformation {

    @XmlElement(name = "MEDLINEIdentifier")
    protected String medlineIdentifier;
    @XmlElement(name = "ResultsReference")
    protected String resultsReference;
    @XmlElement(name = "URLReference")
    protected String urlReference;
    @XmlElement(name = "URLDescription")
    protected String urlDescription;

    /**
     * Recupera il valore della proprietà medlineIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEDLINEIdentifier() {
        return medlineIdentifier;
    }

    /**
     * Imposta il valore della proprietà medlineIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEDLINEIdentifier(String value) {
        this.medlineIdentifier = value;
    }

    /**
     * Recupera il valore della proprietà resultsReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultsReference() {
        return resultsReference;
    }

    /**
     * Imposta il valore della proprietà resultsReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultsReference(String value) {
        this.resultsReference = value;
    }

    /**
     * Recupera il valore della proprietà urlReference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLReference() {
        return urlReference;
    }

    /**
     * Imposta il valore della proprietà urlReference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLReference(String value) {
        this.urlReference = value;
    }

    /**
     * Recupera il valore della proprietà urlDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDescription() {
        return urlDescription;
    }

    /**
     * Imposta il valore della proprietà urlDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDescription(String value) {
        this.urlDescription = value;
    }

}
