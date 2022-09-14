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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ODMcomplexTypeDefinition-ArchiveLayout complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ArchiveLayout"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutAttributeDefinition"/&gt;
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.3}ArchiveLayoutAttributeExtension"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ArchiveLayout")
public class ODMcomplexTypeDefinitionArchiveLayout {

    @XmlAttribute(name = "OID", required = true)
    protected String oid;
    @XmlAttribute(name = "PdfFileName", required = true)
    protected String pdfFileName;
    @XmlAttribute(name = "PresentationOID")
    protected String presentationOID;

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
     * Recupera il valore della proprietà pdfFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdfFileName() {
        return pdfFileName;
    }

    /**
     * Imposta il valore della proprietà pdfFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdfFileName(String value) {
        this.pdfFileName = value;
    }

    /**
     * Recupera il valore della proprietà presentationOID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentationOID() {
        return presentationOID;
    }

    /**
     * Imposta il valore della proprietà presentationOID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentationOID(String value) {
        this.presentationOID = value;
    }

}
