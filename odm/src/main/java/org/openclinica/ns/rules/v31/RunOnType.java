//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.rules.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RunOnType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RunOnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="not_scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="scheduled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="data_entry_started" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="completed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="skipped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="stopped" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="signed" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" /&gt;
 *       &lt;attribute name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" fixed="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunOnType")
public class RunOnType {

    @XmlAttribute(name = "not_scheduled")
    protected Boolean notScheduled;
    @XmlAttribute(name = "scheduled")
    protected Boolean scheduled;
    @XmlAttribute(name = "data_entry_started")
    protected Boolean dataEntryStarted;
    @XmlAttribute(name = "completed")
    protected Boolean completed;
    @XmlAttribute(name = "skipped")
    protected Boolean skipped;
    @XmlAttribute(name = "stopped")
    protected Boolean stopped;
    @XmlAttribute(name = "signed")
    protected Boolean signed;
    @XmlAttribute(name = "locked")
    protected Boolean locked;

    /**
     * Recupera il valore della proprietà notScheduled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotScheduled() {
        if (notScheduled == null) {
            return true;
        } else {
            return notScheduled;
        }
    }

    /**
     * Imposta il valore della proprietà notScheduled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotScheduled(Boolean value) {
        this.notScheduled = value;
    }

    /**
     * Recupera il valore della proprietà scheduled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isScheduled() {
        if (scheduled == null) {
            return true;
        } else {
            return scheduled;
        }
    }

    /**
     * Imposta il valore della proprietà scheduled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setScheduled(Boolean value) {
        this.scheduled = value;
    }

    /**
     * Recupera il valore della proprietà dataEntryStarted.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDataEntryStarted() {
        if (dataEntryStarted == null) {
            return false;
        } else {
            return dataEntryStarted;
        }
    }

    /**
     * Imposta il valore della proprietà dataEntryStarted.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDataEntryStarted(Boolean value) {
        this.dataEntryStarted = value;
    }

    /**
     * Recupera il valore della proprietà completed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCompleted() {
        if (completed == null) {
            return false;
        } else {
            return completed;
        }
    }

    /**
     * Imposta il valore della proprietà completed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompleted(Boolean value) {
        this.completed = value;
    }

    /**
     * Recupera il valore della proprietà skipped.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkipped() {
        if (skipped == null) {
            return false;
        } else {
            return skipped;
        }
    }

    /**
     * Imposta il valore della proprietà skipped.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipped(Boolean value) {
        this.skipped = value;
    }

    /**
     * Recupera il valore della proprietà stopped.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isStopped() {
        if (stopped == null) {
            return false;
        } else {
            return stopped;
        }
    }

    /**
     * Imposta il valore della proprietà stopped.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStopped(Boolean value) {
        this.stopped = value;
    }

    /**
     * Recupera il valore della proprietà signed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSigned() {
        if (signed == null) {
            return false;
        } else {
            return signed;
        }
    }

    /**
     * Imposta il valore della proprietà signed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSigned(Boolean value) {
        this.signed = value;
    }

    /**
     * Recupera il valore della proprietà locked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocked() {
        if (locked == null) {
            return false;
        } else {
            return locked;
        }
    }

    /**
     * Imposta il valore della proprietà locked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

}
