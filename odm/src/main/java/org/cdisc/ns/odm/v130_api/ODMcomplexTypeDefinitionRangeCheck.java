//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130_api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-RangeCheck complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-RangeCheck"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}CheckValue" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}FormalExpression" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}MeasurementUnitRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3-api}ErrorMessage" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3-api}RangeCheckElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}RangeCheckAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3-api}RangeCheckAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-RangeCheck", propOrder = {
    "checkValue",
    "formalExpression",
    "measurementUnitRef",
    "errorMessage"
})
public class ODMcomplexTypeDefinitionRangeCheck {

    @XmlElement(name = "CheckValue")
    protected List<ODMcomplexTypeDefinitionCheckValue> checkValue;
    @XmlElement(name = "FormalExpression")
    protected List<ODMcomplexTypeDefinitionFormalExpression> formalExpression;
    @XmlElement(name = "MeasurementUnitRef")
    protected ODMcomplexTypeDefinitionMeasurementUnitRef measurementUnitRef;
    @XmlElement(name = "ErrorMessage")
    protected ODMcomplexTypeDefinitionErrorMessage errorMessage;
    @XmlAttribute(name = "Comparator", required = true)
    protected Comparator comparator;
    @XmlAttribute(name = "SoftHard", required = true)
    protected SoftOrHard softHard;

    /**
     * Gets the value of the checkValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionCheckValue }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionCheckValue> getCheckValue() {
        if (checkValue == null) {
            checkValue = new ArrayList<ODMcomplexTypeDefinitionCheckValue>();
        }
        return this.checkValue;
    }

    /**
     * Gets the value of the formalExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formalExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormalExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionFormalExpression }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionFormalExpression> getFormalExpression() {
        if (formalExpression == null) {
            formalExpression = new ArrayList<ODMcomplexTypeDefinitionFormalExpression>();
        }
        return this.formalExpression;
    }

    /**
     * Recupera il valore della proprietà measurementUnitRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public ODMcomplexTypeDefinitionMeasurementUnitRef getMeasurementUnitRef() {
        return measurementUnitRef;
    }

    /**
     * Imposta il valore della proprietà measurementUnitRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     *     
     */
    public void setMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        this.measurementUnitRef = value;
    }

    /**
     * Recupera il valore della proprietà errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionErrorMessage }
     *     
     */
    public ODMcomplexTypeDefinitionErrorMessage getErrorMessage() {
        return errorMessage;
    }

    /**
     * Imposta il valore della proprietà errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionErrorMessage }
     *     
     */
    public void setErrorMessage(ODMcomplexTypeDefinitionErrorMessage value) {
        this.errorMessage = value;
    }

    /**
     * Recupera il valore della proprietà comparator.
     * 
     * @return
     *     possible object is
     *     {@link Comparator }
     *     
     */
    public Comparator getComparator() {
        return comparator;
    }

    /**
     * Imposta il valore della proprietà comparator.
     * 
     * @param value
     *     allowed object is
     *     {@link Comparator }
     *     
     */
    public void setComparator(Comparator value) {
        this.comparator = value;
    }

    /**
     * Recupera il valore della proprietà softHard.
     * 
     * @return
     *     possible object is
     *     {@link SoftOrHard }
     *     
     */
    public SoftOrHard getSoftHard() {
        return softHard;
    }

    /**
     * Imposta il valore della proprietà softHard.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftOrHard }
     *     
     */
    public void setSoftHard(SoftOrHard value) {
        this.softHard = value;
    }

}
