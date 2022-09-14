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
 * <p>Classe Java per ActionRunType complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ActionRunType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/rules/v3.1}ActionRunAttributeType"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionRunType")
public class ActionRunType {

    @XmlAttribute(name = "AdministrativeDataEntry", required = true)
    protected boolean administrativeDataEntry;
    @XmlAttribute(name = "InitialDataEntry", required = true)
    protected boolean initialDataEntry;
    @XmlAttribute(name = "DoubleDataEntry", required = true)
    protected boolean doubleDataEntry;
    @XmlAttribute(name = "ImportDataEntry", required = true)
    protected boolean importDataEntry;
    @XmlAttribute(name = "Batch", required = true)
    protected boolean batch;

    /**
     * Recupera il valore della proprietà administrativeDataEntry.
     * 
     */
    public boolean isAdministrativeDataEntry() {
        return administrativeDataEntry;
    }

    /**
     * Imposta il valore della proprietà administrativeDataEntry.
     * 
     */
    public void setAdministrativeDataEntry(boolean value) {
        this.administrativeDataEntry = value;
    }

    /**
     * Recupera il valore della proprietà initialDataEntry.
     * 
     */
    public boolean isInitialDataEntry() {
        return initialDataEntry;
    }

    /**
     * Imposta il valore della proprietà initialDataEntry.
     * 
     */
    public void setInitialDataEntry(boolean value) {
        this.initialDataEntry = value;
    }

    /**
     * Recupera il valore della proprietà doubleDataEntry.
     * 
     */
    public boolean isDoubleDataEntry() {
        return doubleDataEntry;
    }

    /**
     * Imposta il valore della proprietà doubleDataEntry.
     * 
     */
    public void setDoubleDataEntry(boolean value) {
        this.doubleDataEntry = value;
    }

    /**
     * Recupera il valore della proprietà importDataEntry.
     * 
     */
    public boolean isImportDataEntry() {
        return importDataEntry;
    }

    /**
     * Imposta il valore della proprietà importDataEntry.
     * 
     */
    public void setImportDataEntry(boolean value) {
        this.importDataEntry = value;
    }

    /**
     * Recupera il valore della proprietà batch.
     * 
     */
    public boolean isBatch() {
        return batch;
    }

    /**
     * Imposta il valore della proprietà batch.
     * 
     */
    public void setBatch(boolean value) {
        this.batch = value;
    }

}
