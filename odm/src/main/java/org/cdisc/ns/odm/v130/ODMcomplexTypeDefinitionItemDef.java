//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionItemDetails;
import org.openclinica.ns.odm_ext_v130.v31.OCodmComplexTypeDefinitionMultiSelectListRef;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ItemDef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Question" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ExternalQuestion" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}MeasurementUnitRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}RangeCheck" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}CodeListRef" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}Alias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ItemDefAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDef", propOrder = {
    "description",
    "question",
    "externalQuestion",
    "measurementUnitRef",
    "rangeCheck",
    "codeListRef",
    "role",
    "alias",
    "itemDefElementExtension"
})
public class ODMcomplexTypeDefinitionItemDef {

    @XmlElement(name = "Description")
    protected ODMcomplexTypeDefinitionDescription description;
    @XmlElement(name = "Question")
    protected ODMcomplexTypeDefinitionQuestion question;
    @XmlElement(name = "ExternalQuestion")
    protected ODMcomplexTypeDefinitionExternalQuestion externalQuestion;
    @XmlElement(name = "MeasurementUnitRef")
    protected List<ODMcomplexTypeDefinitionMeasurementUnitRef> measurementUnitRef;
    @XmlElement(name = "RangeCheck")
    protected List<ODMcomplexTypeDefinitionRangeCheck> rangeCheck;
    @XmlElement(name = "CodeListRef")
    protected ODMcomplexTypeDefinitionCodeListRef codeListRef;
    @XmlElement(name = "Role")
    protected List<ODMcomplexTypeDefinitionRole> role;
    @XmlElement(name = "Alias")
    protected List<ODMcomplexTypeDefinitionAlias> alias;
    @XmlElements({
        @XmlElement(name = "MultiSelectListRef", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionMultiSelectListRef.class),
        @XmlElement(name = "ItemDetails", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1", type = OCodmComplexTypeDefinitionItemDetails.class)
    })
    protected List<Object> itemDefElementExtension;
    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DataType", required = true)
    protected DataType dataType;
    @XmlAttribute(name = "Length")
    protected BigInteger length;
    @XmlAttribute(name = "SignificantDigits")
    protected BigInteger significantDigits;
    @XmlAttribute(name = "SASFieldName")
    protected String sasFieldName;
    @XmlAttribute(name = "SDSVarName")
    protected String sdsVarName;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Comment")
    protected String comment;
    @XmlAttribute(name = "FormOIDs", namespace = "http://www.openclinica.org/ns/odm_ext_v130/v3.1")
    protected String formOIDs;

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public ODMcomplexTypeDefinitionDescription getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDescription }
     *     
     */
    public void setDescription(ODMcomplexTypeDefinitionDescription value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà question.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionQuestion }
     *     
     */
    public ODMcomplexTypeDefinitionQuestion getQuestion() {
        return question;
    }

    /**
     * Imposta il valore della proprietà question.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionQuestion }
     *     
     */
    public void setQuestion(ODMcomplexTypeDefinitionQuestion value) {
        this.question = value;
    }

    /**
     * Recupera il valore della proprietà externalQuestion.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionExternalQuestion }
     *     
     */
    public ODMcomplexTypeDefinitionExternalQuestion getExternalQuestion() {
        return externalQuestion;
    }

    /**
     * Imposta il valore della proprietà externalQuestion.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionExternalQuestion }
     *     
     */
    public void setExternalQuestion(ODMcomplexTypeDefinitionExternalQuestion value) {
        this.externalQuestion = value;
    }

    /**
     * Gets the value of the measurementUnitRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnitRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnitRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionMeasurementUnitRef> getMeasurementUnitRef() {
        if (measurementUnitRef == null) {
            measurementUnitRef = new ArrayList<ODMcomplexTypeDefinitionMeasurementUnitRef>();
        }
        return this.measurementUnitRef;
    }

    /**
     * Gets the value of the rangeCheck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeCheck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeCheck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionRangeCheck }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionRangeCheck> getRangeCheck() {
        if (rangeCheck == null) {
            rangeCheck = new ArrayList<ODMcomplexTypeDefinitionRangeCheck>();
        }
        return this.rangeCheck;
    }

    /**
     * Recupera il valore della proprietà codeListRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionCodeListRef }
     *     
     */
    public ODMcomplexTypeDefinitionCodeListRef getCodeListRef() {
        return codeListRef;
    }

    /**
     * Imposta il valore della proprietà codeListRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionCodeListRef }
     *     
     */
    public void setCodeListRef(ODMcomplexTypeDefinitionCodeListRef value) {
        this.codeListRef = value;
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
     * {@link ODMcomplexTypeDefinitionRole }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionRole> getRole() {
        if (role == null) {
            role = new ArrayList<ODMcomplexTypeDefinitionRole>();
        }
        return this.role;
    }

    /**
     * Gets the value of the alias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAlias }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAlias> getAlias() {
        if (alias == null) {
            alias = new ArrayList<ODMcomplexTypeDefinitionAlias>();
        }
        return this.alias;
    }

    /**
     * Gets the value of the itemDefElementExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDefElementExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDefElementExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectListRef }
     * {@link OCodmComplexTypeDefinitionItemDetails }
     * 
     * 
     */
    public List<Object> getItemDefElementExtension() {
        if (itemDefElementExtension == null) {
            itemDefElementExtension = new ArrayList<Object>();
        }
        return this.itemDefElementExtension;
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
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà dataType.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getDataType() {
        return dataType;
    }

    /**
     * Imposta il valore della proprietà dataType.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setDataType(DataType value) {
        this.dataType = value;
    }

    /**
     * Recupera il valore della proprietà length.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Imposta il valore della proprietà length.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Recupera il valore della proprietà significantDigits.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSignificantDigits() {
        return significantDigits;
    }

    /**
     * Imposta il valore della proprietà significantDigits.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSignificantDigits(BigInteger value) {
        this.significantDigits = value;
    }

    /**
     * Recupera il valore della proprietà sasFieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASFieldName() {
        return sasFieldName;
    }

    /**
     * Imposta il valore della proprietà sasFieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASFieldName(String value) {
        this.sasFieldName = value;
    }

    /**
     * Recupera il valore della proprietà sdsVarName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSDSVarName() {
        return sdsVarName;
    }

    /**
     * Imposta il valore della proprietà sdsVarName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSDSVarName(String value) {
        this.sdsVarName = value;
    }

    /**
     * Recupera il valore della proprietà origin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Imposta il valore della proprietà origin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Recupera il valore della proprietà comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Imposta il valore della proprietà comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Recupera il valore della proprietà formOIDs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormOIDs() {
        return formOIDs;
    }

    /**
     * Imposta il valore della proprietà formOIDs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormOIDs(String value) {
        this.formOIDs = value;
    }

}
