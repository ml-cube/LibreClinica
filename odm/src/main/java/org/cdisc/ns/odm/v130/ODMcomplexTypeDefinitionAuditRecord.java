//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-AuditRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-AuditRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}UserRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}LocationRef"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}DateTimeStamp"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}ReasonForChange" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.3}SourceID" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}AuditRecordAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-AuditRecord", propOrder = {
    "userRef",
    "locationRef",
    "dateTimeStamp",
    "reasonForChange",
    "sourceID"
})
public class ODMcomplexTypeDefinitionAuditRecord {

    @XmlElement(name = "UserRef", required = true)
    protected ODMcomplexTypeDefinitionUserRef userRef;
    @XmlElement(name = "LocationRef", required = true)
    protected ODMcomplexTypeDefinitionLocationRef locationRef;
    @XmlElement(name = "DateTimeStamp", required = true)
    protected ODMcomplexTypeDefinitionDateTimeStamp dateTimeStamp;
    @XmlElement(name = "ReasonForChange")
    protected ODMcomplexTypeDefinitionReasonForChange reasonForChange;
    @XmlElement(name = "SourceID")
    protected ODMcomplexTypeDefinitionSourceID sourceID;
    @XmlAttribute(name = "EditPoint")
    protected EditPointType editPoint;
    @XmlAttribute(name = "UsedImputationMethod")
    protected YesOrNo usedImputationMethod;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Recupera il valore della proprietà userRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public ODMcomplexTypeDefinitionUserRef getUserRef() {
        return userRef;
    }

    /**
     * Imposta il valore della proprietà userRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionUserRef }
     *     
     */
    public void setUserRef(ODMcomplexTypeDefinitionUserRef value) {
        this.userRef = value;
    }

    /**
     * Recupera il valore della proprietà locationRef.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public ODMcomplexTypeDefinitionLocationRef getLocationRef() {
        return locationRef;
    }

    /**
     * Imposta il valore della proprietà locationRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionLocationRef }
     *     
     */
    public void setLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        this.locationRef = value;
    }

    /**
     * Recupera il valore della proprietà dateTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public ODMcomplexTypeDefinitionDateTimeStamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Imposta il valore della proprietà dateTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionDateTimeStamp }
     *     
     */
    public void setDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        this.dateTimeStamp = value;
    }

    /**
     * Recupera il valore della proprietà reasonForChange.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public ODMcomplexTypeDefinitionReasonForChange getReasonForChange() {
        return reasonForChange;
    }

    /**
     * Imposta il valore della proprietà reasonForChange.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionReasonForChange }
     *     
     */
    public void setReasonForChange(ODMcomplexTypeDefinitionReasonForChange value) {
        this.reasonForChange = value;
    }

    /**
     * Recupera il valore della proprietà sourceID.
     * 
     * @return
     *     possible object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public ODMcomplexTypeDefinitionSourceID getSourceID() {
        return sourceID;
    }

    /**
     * Imposta il valore della proprietà sourceID.
     * 
     * @param value
     *     allowed object is
     *     {@link ODMcomplexTypeDefinitionSourceID }
     *     
     */
    public void setSourceID(ODMcomplexTypeDefinitionSourceID value) {
        this.sourceID = value;
    }

    /**
     * Recupera il valore della proprietà editPoint.
     * 
     * @return
     *     possible object is
     *     {@link EditPointType }
     *     
     */
    public EditPointType getEditPoint() {
        return editPoint;
    }

    /**
     * Imposta il valore della proprietà editPoint.
     * 
     * @param value
     *     allowed object is
     *     {@link EditPointType }
     *     
     */
    public void setEditPoint(EditPointType value) {
        this.editPoint = value;
    }

    /**
     * Recupera il valore della proprietà usedImputationMethod.
     * 
     * @return
     *     possible object is
     *     {@link YesOrNo }
     *     
     */
    public YesOrNo getUsedImputationMethod() {
        return usedImputationMethod;
    }

    /**
     * Imposta il valore della proprietà usedImputationMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOrNo }
     *     
     */
    public void setUsedImputationMethod(YesOrNo value) {
        this.usedImputationMethod = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
