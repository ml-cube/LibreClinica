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
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionMultiSelectList;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionStudyGroupClassList;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-MetaDataVersion complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *       &lt;redefine&gt;
 *         &lt;complexType name="ODMcomplexTypeDefinition-MetaDataVersion"&gt;
 *           &lt;complexContent&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;sequence&gt;
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionPreIncludeElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Include" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Protocol" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}StudyEventDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}FormDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemGroupDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ImputationMethod" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Presentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeDefinition"/&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}MetaDataVersionAttributeExtension"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/complexContent&gt;
 *         &lt;/complexType&gt;
 *       &lt;/redefine&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}StudyGroupClassList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-MetaDataVersion", propOrder = {
    "multiSelectList",
    "studyGroupClassList"
})
public class ODMcomplexTypeDefinitionMetaDataVersion
    extends OriginalODMcomplexTypeDefinitionMetaDataVersion
{

    @XmlElement(name = "MultiSelectList", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionMultiSelectList> multiSelectList;
    @XmlElement(name = "StudyGroupClassList", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionStudyGroupClassList> studyGroupClassList;

    /**
     * Gets the value of the multiSelectList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSelectList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSelectList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectList }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionMultiSelectList> getMultiSelectList() {
        if (multiSelectList == null) {
            multiSelectList = new ArrayList<OCodmComplexTypeDefinitionMultiSelectList>();
        }
        return this.multiSelectList;
    }

    /**
     * Gets the value of the studyGroupClassList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studyGroupClassList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudyGroupClassList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionStudyGroupClassList }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionStudyGroupClassList> getStudyGroupClassList() {
        if (studyGroupClassList == null) {
            studyGroupClassList = new ArrayList<OCodmComplexTypeDefinitionStudyGroupClassList>();
        }
        return this.studyGroupClassList;
    }

}
