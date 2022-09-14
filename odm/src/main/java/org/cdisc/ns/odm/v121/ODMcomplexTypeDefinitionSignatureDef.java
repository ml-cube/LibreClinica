//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-SignatureDef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SignatureDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Meaning"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}LegalReason"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SignatureDefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SignatureDef", propOrder = {
    "meaning",
    "legalReason"
})
public class ODMcomplexTypeDefinitionSignatureDef {

    @XmlElement(name = "Meaning", required = true)
    protected ODMcomplexTypeDefinitionMeaning meaning;
    @XmlElement(name = "LegalReason", required = true)
    protected ODMcomplexTypeDefinitionLegalReason legalReason;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Methodology")
    protected SignMethod methodology;

    /**
     * Recupera il valore della proprietà meaning.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public ODMcomplexTypeDefinitionMeaning getMeaning() {
        return meaning;
    }

    /**
     * Imposta il valore della proprietà meaning.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeaning }
     *     
     */
    public void setMeaning(ODMcomplexTypeDefinitionMeaning value) {
        this.meaning = value;
    }

    /**
     * Recupera il valore della proprietà legalReason.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public ODMcomplexTypeDefinitionLegalReason getLegalReason() {
        return legalReason;
    }

    /**
     * Imposta il valore della proprietà legalReason.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLegalReason }
     *     
     */
    public void setLegalReason(ODMcomplexTypeDefinitionLegalReason value) {
        this.legalReason = value;
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
     * Recupera il valore della proprietà methodology.
     * 
     * @return
     *     possible object is
     *     {@link SignMethod }
     *     
     */
    public SignMethod getMethodology() {
        return methodology;
    }

    /**
     * Imposta il valore della proprietà methodology.
     * 
     * @param value
     *     allowed object is
     *     {@link SignMethod }
     *     
     */
    public void setMethodology(SignMethod value) {
        this.methodology = value;
    }

}
