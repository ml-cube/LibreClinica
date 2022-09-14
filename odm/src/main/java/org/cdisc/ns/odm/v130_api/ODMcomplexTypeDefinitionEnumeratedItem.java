//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-EnumeratedItem complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-EnumeratedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}EnumeratedItemElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}EnumeratedItemAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}CodeListItemAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-EnumeratedItem")
public class ODMcomplexTypeDefinitionEnumeratedItem {

    @XmlAttribute(name = "CodedValue", required = true)
    protected String codedValue;
    @XmlAttribute(name = "Rank")
    protected BigDecimal rank;

    /**
     * Recupera il valore della proprietà codedValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodedValue() {
        return codedValue;
    }

    /**
     * Imposta il valore della proprietà codedValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodedValue(String value) {
        this.codedValue = value;
    }

    /**
     * Recupera il valore della proprietà rank.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRank() {
        return rank;
    }

    /**
     * Imposta il valore della proprietà rank.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRank(BigDecimal value) {
        this.rank = value;
    }

}
