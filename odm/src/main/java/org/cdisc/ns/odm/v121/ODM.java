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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Study" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AdminData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ReferenceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ClinicalData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ODMElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ODMAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ODMAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "study",
    "adminData",
    "referenceData",
    "clinicalData",
    "association",
    "signature"
})
@XmlRootElement(name = "ODM")
public class ODM {

    @XmlElement(name = "Study")
    protected List<ODMcomplexTypeDefinitionStudy> study;
    @XmlElement(name = "AdminData")
    protected List<ODMcomplexTypeDefinitionAdminData> adminData;
    @XmlElement(name = "ReferenceData")
    protected List<ODMcomplexTypeDefinitionReferenceData> referenceData;
    @XmlElement(name = "ClinicalData")
    protected List<ODMcomplexTypeDefinitionClinicalData> clinicalData;
    @XmlElement(name = "Association")
    protected List<ODMcomplexTypeDefinitionAssociation> association;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected List<SignatureType> signature;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "FileType", required = true)
    protected FileType fileType;
    @XmlAttribute(name = "Granularity")
    protected Granularity granularity;
    @XmlAttribute(name = "Archival")
    protected YesOnly archival;
    @XmlAttribute(name = "FileOID", required = true)
    protected String fileOID;
    @XmlAttribute(name = "CreationDateTime", required = true)
    protected XMLGregorianCalendar creationDateTime;
    @XmlAttribute(name = "PriorFileOID")
    protected String priorFileOID;
    @XmlAttribute(name = "AsOfDateTime")
    protected XMLGregorianCalendar asOfDateTime;
    @XmlAttribute(name = "ODMVersion")
    protected String odmVersion;
    @XmlAttribute(name = "Originator")
    protected String originator;
    @XmlAttribute(name = "SourceSystem")
    protected String sourceSystem;
    @XmlAttribute(name = "SourceSystemVersion")
    protected String sourceSystemVersion;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the study property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the study property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionStudy }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionStudy> getStudy() {
        if (study == null) {
            study = new ArrayList<ODMcomplexTypeDefinitionStudy>();
        }
        return this.study;
    }

    /**
     * Gets the value of the adminData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adminData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdminData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAdminData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAdminData> getAdminData() {
        if (adminData == null) {
            adminData = new ArrayList<ODMcomplexTypeDefinitionAdminData>();
        }
        return this.adminData;
    }

    /**
     * Gets the value of the referenceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionReferenceData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionReferenceData> getReferenceData() {
        if (referenceData == null) {
            referenceData = new ArrayList<ODMcomplexTypeDefinitionReferenceData>();
        }
        return this.referenceData;
    }

    /**
     * Gets the value of the clinicalData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clinicalData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClinicalData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionClinicalData }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionClinicalData> getClinicalData() {
        if (clinicalData == null) {
            clinicalData = new ArrayList<ODMcomplexTypeDefinitionClinicalData>();
        }
        return this.clinicalData;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ODMcomplexTypeDefinitionAssociation }
     * 
     * 
     */
    public List<ODMcomplexTypeDefinitionAssociation> getAssociation() {
        if (association == null) {
            association = new ArrayList<ODMcomplexTypeDefinitionAssociation>();
        }
        return this.association;
    }

    /**
     * Gets the value of the signature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureType }
     * 
     * 
     */
    public List<SignatureType> getSignature() {
        if (signature == null) {
            signature = new ArrayList<SignatureType>();
        }
        return this.signature;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà fileType.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFileType() {
        return fileType;
    }

    /**
     * Imposta il valore della proprietà fileType.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFileType(FileType value) {
        this.fileType = value;
    }

    /**
     * Recupera il valore della proprietà granularity.
     * 
     * @return
     *     possible object is
     *     {@link Granularity }
     *     
     */
    public Granularity getGranularity() {
        return granularity;
    }

    /**
     * Imposta il valore della proprietà granularity.
     * 
     * @param value
     *     allowed object is
     *     {@link Granularity }
     *     
     */
    public void setGranularity(Granularity value) {
        this.granularity = value;
    }

    /**
     * Recupera il valore della proprietà archival.
     * 
     * @return
     *     possible object is
     *     {@link YesOnly }
     *     
     */
    public YesOnly getArchival() {
        return archival;
    }

    /**
     * Imposta il valore della proprietà archival.
     * 
     * @param value
     *     allowed object is
     *     {@link YesOnly }
     *     
     */
    public void setArchival(YesOnly value) {
        this.archival = value;
    }

    /**
     * Recupera il valore della proprietà fileOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileOID() {
        return fileOID;
    }

    /**
     * Imposta il valore della proprietà fileOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileOID(String value) {
        this.fileOID = value;
    }

    /**
     * Recupera il valore della proprietà creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Imposta il valore della proprietà creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Recupera il valore della proprietà priorFileOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorFileOID() {
        return priorFileOID;
    }

    /**
     * Imposta il valore della proprietà priorFileOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorFileOID(String value) {
        this.priorFileOID = value;
    }

    /**
     * Recupera il valore della proprietà asOfDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAsOfDateTime() {
        return asOfDateTime;
    }

    /**
     * Imposta il valore della proprietà asOfDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAsOfDateTime(XMLGregorianCalendar value) {
        this.asOfDateTime = value;
    }

    /**
     * Recupera il valore della proprietà odmVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODMVersion() {
        return odmVersion;
    }

    /**
     * Imposta il valore della proprietà odmVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODMVersion(String value) {
        this.odmVersion = value;
    }

    /**
     * Recupera il valore della proprietà originator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Imposta il valore della proprietà originator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

    /**
     * Recupera il valore della proprietà sourceSystem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Imposta il valore della proprietà sourceSystem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Recupera il valore della proprietà sourceSystemVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystemVersion() {
        return sourceSystemVersion;
    }

    /**
     * Imposta il valore della proprietà sourceSystemVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystemVersion(String value) {
        this.sourceSystemVersion = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

}
