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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionAuditLogs;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionDiscrepancyNotes;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionSubjectGroupData;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-SubjectData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-SubjectData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-SubjectData"&gt;
 *       &lt;redefine&gt;
 *         &lt;complexType name="ODMcomplexTypeDefinition-SubjectData"&gt;
 *           &lt;complexContent&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;sequence&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}AuditRecord" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Signature" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}InvestigatorRef" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}SiteRef" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Annotation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataAttributeDefinition"/&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}SubjectDataAttributeExtension"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/complexContent&gt;
 *         &lt;/complexType&gt;
 *       &lt;/redefine&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}SubjectGroupData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}AuditLogs" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}DiscrepancyNotes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-SubjectData", propOrder = {
    "subjectGroupData",
    "auditLogs",
    "discrepancyNotes"
})
public class ODMcomplexTypeDefinitionSubjectData
    extends OriginalODMcomplexTypeDefinitionSubjectData
{

    @XmlElement(name = "SubjectGroupData", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionSubjectGroupData> subjectGroupData;
    @XmlElement(name = "AuditLogs", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionAuditLogs> auditLogs;
    @XmlElement(name = "DiscrepancyNotes", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionDiscrepancyNotes> discrepancyNotes;

    /**
     * Gets the value of the subjectGroupData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subjectGroupData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectGroupData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionSubjectGroupData }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionSubjectGroupData> getSubjectGroupData() {
        if (subjectGroupData == null) {
            subjectGroupData = new ArrayList<OCodmComplexTypeDefinitionSubjectGroupData>();
        }
        return this.subjectGroupData;
    }

    /**
     * Gets the value of the auditLogs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditLogs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLogs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionAuditLogs }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionAuditLogs> getAuditLogs() {
        if (auditLogs == null) {
            auditLogs = new ArrayList<OCodmComplexTypeDefinitionAuditLogs>();
        }
        return this.auditLogs;
    }

    /**
     * Gets the value of the discrepancyNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discrepancyNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscrepancyNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionDiscrepancyNotes }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionDiscrepancyNotes> getDiscrepancyNotes() {
        if (discrepancyNotes == null) {
            discrepancyNotes = new ArrayList<OCodmComplexTypeDefinitionDiscrepancyNotes>();
        }
        return this.discrepancyNotes;
    }

}
