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
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionMultiSelectListRef;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ItemDef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-ItemDef"&gt;
 *       &lt;redefine&gt;
 *         &lt;complexType name="ODMcomplexTypeDefinition-ItemDef"&gt;
 *           &lt;complexContent&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *               &lt;sequence&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Question" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ExternalQuestion" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}MeasurementUnitRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}RangeCheck" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListRef" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Alias" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *               &lt;/sequence&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefAttributeDefinition"/&gt;
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefAttributeExtension"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/complexContent&gt;
 *         &lt;/complexType&gt;
 *       &lt;/redefine&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectListRef" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDef", propOrder = {
    "multiSelectListRef"
})
public class ODMcomplexTypeDefinitionItemDef
    extends OriginalODMcomplexTypeDefinitionItemDef
{

    @XmlElement(name = "MultiSelectListRef", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionMultiSelectListRef> multiSelectListRef;

    /**
     * Gets the value of the multiSelectListRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSelectListRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSelectListRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectListRef }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionMultiSelectListRef> getMultiSelectListRef() {
        if (multiSelectListRef == null) {
            multiSelectListRef = new ArrayList<OCodmComplexTypeDefinitionMultiSelectListRef>();
        }
        return this.multiSelectListRef;
    }

}
