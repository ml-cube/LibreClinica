//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.odm_ext_v130.v31_api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per OCodmComplexTypeDefinition-SubjectGroupData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-SubjectGroupData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SubjectGroupDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SubjectGroupDataAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1-api}SubjectGroupDataAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-SubjectGroupData")
public class OCodmComplexTypeDefinitionSubjectGroupData {

    @XmlAttribute(name = "StudyGroupClassID", required = true)
    protected String studyGroupClassID;
    @XmlAttribute(name = "StudyGroupClassName")
    protected String studyGroupClassName;
    @XmlAttribute(name = "StudyGroupName")
    protected String studyGroupName;

    /**
     * Recupera il valore della proprietà studyGroupClassID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassID() {
        return studyGroupClassID;
    }

    /**
     * Imposta il valore della proprietà studyGroupClassID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassID(String value) {
        this.studyGroupClassID = value;
    }

    /**
     * Recupera il valore della proprietà studyGroupClassName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupClassName() {
        return studyGroupClassName;
    }

    /**
     * Imposta il valore della proprietà studyGroupClassName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupClassName(String value) {
        this.studyGroupClassName = value;
    }

    /**
     * Recupera il valore della proprietà studyGroupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudyGroupName() {
        return studyGroupName;
    }

    /**
     * Imposta il valore della proprietà studyGroupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudyGroupName(String value) {
        this.studyGroupName = value;
    }

}
