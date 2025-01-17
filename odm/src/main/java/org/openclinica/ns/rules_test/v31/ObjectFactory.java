//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.rules_test.v31;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openclinica.ns.rules_test.v31 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Parameters_QNAME = new QName("http://www.openclinica.org/ns/RulesTest/v3.1", "Parameters");
    private final static QName _RulesTestMessages_QNAME = new QName("http://www.openclinica.org/ns/RulesTest/v3.1", "RulesTestMessages");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openclinica.ns.rules_test.v31
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RulesTest }
     * 
     */
    public RulesTest createRulesTest() {
        return new RulesTest();
    }

    /**
     * Create an instance of {@link ParameterType }
     * 
     */
    public ParameterType createParameterType() {
        return new ParameterType();
    }

    /**
     * Create an instance of {@link RulesTestMessagesType }
     * 
     */
    public RulesTestMessagesType createRulesTestMessagesType() {
        return new RulesTestMessagesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/RulesTest/v3.1", name = "Parameters")
    public JAXBElement<ParameterType> createParameters(ParameterType value) {
        return new JAXBElement<ParameterType>(_Parameters_QNAME, ParameterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RulesTestMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/RulesTest/v3.1", name = "RulesTestMessages")
    public JAXBElement<RulesTestMessagesType> createRulesTestMessages(RulesTestMessagesType value) {
        return new JAXBElement<RulesTestMessagesType>(_RulesTestMessages_QNAME, RulesTestMessagesType.class, null, value);
    }

}
