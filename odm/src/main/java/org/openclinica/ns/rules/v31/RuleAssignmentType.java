//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RuleAssignmentType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RuleAssignmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}Target"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}RunOnSchedule" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}RuleRef" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleAssignmentType", propOrder = {
    "target",
    "runOnSchedule",
    "ruleRef"
})
public class RuleAssignmentType {

    @XmlElement(name = "Target", required = true)
    protected TargetType target;
    @XmlElement(name = "RunOnSchedule")
    protected RunOnScheduleType runOnSchedule;
    @XmlElement(name = "RuleRef", required = true)
    protected List<RuleRefType> ruleRef;

    /**
     * Recupera il valore della proprietà target.
     * 
     * @return
     *     possible object is
     *     {@link TargetType }
     *     
     */
    public TargetType getTarget() {
        return target;
    }

    /**
     * Imposta il valore della proprietà target.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetType }
     *     
     */
    public void setTarget(TargetType value) {
        this.target = value;
    }

    /**
     * Recupera il valore della proprietà runOnSchedule.
     * 
     * @return
     *     possible object is
     *     {@link RunOnScheduleType }
     *     
     */
    public RunOnScheduleType getRunOnSchedule() {
        return runOnSchedule;
    }

    /**
     * Imposta il valore della proprietà runOnSchedule.
     * 
     * @param value
     *     allowed object is
     *     {@link RunOnScheduleType }
     *     
     */
    public void setRunOnSchedule(RunOnScheduleType value) {
        this.runOnSchedule = value;
    }

    /**
     * Gets the value of the ruleRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleRefType }
     * 
     * 
     */
    public List<RuleRefType> getRuleRef() {
        if (ruleRef == null) {
            ruleRef = new ArrayList<RuleRefType>();
        }
        return this.ruleRef;
    }

}
