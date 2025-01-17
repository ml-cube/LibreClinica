//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.openclinica.ns.rules.v31;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openclinica.ns.rules.v31 package. 
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

    private final static QName _RuleAssignment_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "RuleAssignment");
    private final static QName _RuleDef_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "RuleDef");
    private final static QName _RuleRef_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "RuleRef");
    private final static QName _DiscrepancyNoteAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "DiscrepancyNoteAction");
    private final static QName _EmailAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "EmailAction");
    private final static QName _NotificationAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "NotificationAction");
    private final static QName _ShowAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "ShowAction");
    private final static QName _HideAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "HideAction");
    private final static QName _InsertAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "InsertAction");
    private final static QName _EventAction_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "EventAction");
    private final static QName _Target_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "Target");
    private final static QName _RunOnSchedule_QNAME = new QName("http://www.openclinica.org/ns/rules/v3.1", "RunOnSchedule");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openclinica.ns.rules.v31
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link RuleAssignmentType }
     * 
     */
    public RuleAssignmentType createRuleAssignmentType() {
        return new RuleAssignmentType();
    }

    /**
     * Create an instance of {@link RuleDefType }
     * 
     */
    public RuleDefType createRuleDefType() {
        return new RuleDefType();
    }

    /**
     * Create an instance of {@link RuleRefType }
     * 
     */
    public RuleRefType createRuleRefType() {
        return new RuleRefType();
    }

    /**
     * Create an instance of {@link DiscrepancyNoteActionType }
     * 
     */
    public DiscrepancyNoteActionType createDiscrepancyNoteActionType() {
        return new DiscrepancyNoteActionType();
    }

    /**
     * Create an instance of {@link EmailActionType }
     * 
     */
    public EmailActionType createEmailActionType() {
        return new EmailActionType();
    }

    /**
     * Create an instance of {@link NotificationActionType }
     * 
     */
    public NotificationActionType createNotificationActionType() {
        return new NotificationActionType();
    }

    /**
     * Create an instance of {@link ShowActionType }
     * 
     */
    public ShowActionType createShowActionType() {
        return new ShowActionType();
    }

    /**
     * Create an instance of {@link HideActionType }
     * 
     */
    public HideActionType createHideActionType() {
        return new HideActionType();
    }

    /**
     * Create an instance of {@link InsertActionType }
     * 
     */
    public InsertActionType createInsertActionType() {
        return new InsertActionType();
    }

    /**
     * Create an instance of {@link EventActionType }
     * 
     */
    public EventActionType createEventActionType() {
        return new EventActionType();
    }

    /**
     * Create an instance of {@link TargetType }
     * 
     */
    public TargetType createTargetType() {
        return new TargetType();
    }

    /**
     * Create an instance of {@link RunOnScheduleType }
     * 
     */
    public RunOnScheduleType createRunOnScheduleType() {
        return new RunOnScheduleType();
    }

    /**
     * Create an instance of {@link RunOnType }
     * 
     */
    public RunOnType createRunOnType() {
        return new RunOnType();
    }

    /**
     * Create an instance of {@link EventDestinationType }
     * 
     */
    public EventDestinationType createEventDestinationType() {
        return new EventDestinationType();
    }

    /**
     * Create an instance of {@link ValueExpressionType }
     * 
     */
    public ValueExpressionType createValueExpressionType() {
        return new ValueExpressionType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link ActionRunType }
     * 
     */
    public ActionRunType createActionRunType() {
        return new ActionRunType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleAssignmentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "RuleAssignment")
    public JAXBElement<RuleAssignmentType> createRuleAssignment(RuleAssignmentType value) {
        return new JAXBElement<RuleAssignmentType>(_RuleAssignment_QNAME, RuleAssignmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleDefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "RuleDef")
    public JAXBElement<RuleDefType> createRuleDef(RuleDefType value) {
        return new JAXBElement<RuleDefType>(_RuleDef_QNAME, RuleDefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleRefType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "RuleRef")
    public JAXBElement<RuleRefType> createRuleRef(RuleRefType value) {
        return new JAXBElement<RuleRefType>(_RuleRef_QNAME, RuleRefType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscrepancyNoteActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "DiscrepancyNoteAction")
    public JAXBElement<DiscrepancyNoteActionType> createDiscrepancyNoteAction(DiscrepancyNoteActionType value) {
        return new JAXBElement<DiscrepancyNoteActionType>(_DiscrepancyNoteAction_QNAME, DiscrepancyNoteActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "EmailAction")
    public JAXBElement<EmailActionType> createEmailAction(EmailActionType value) {
        return new JAXBElement<EmailActionType>(_EmailAction_QNAME, EmailActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificationActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "NotificationAction")
    public JAXBElement<NotificationActionType> createNotificationAction(NotificationActionType value) {
        return new JAXBElement<NotificationActionType>(_NotificationAction_QNAME, NotificationActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "ShowAction")
    public JAXBElement<ShowActionType> createShowAction(ShowActionType value) {
        return new JAXBElement<ShowActionType>(_ShowAction_QNAME, ShowActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HideActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "HideAction")
    public JAXBElement<HideActionType> createHideAction(HideActionType value) {
        return new JAXBElement<HideActionType>(_HideAction_QNAME, HideActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "InsertAction")
    public JAXBElement<InsertActionType> createInsertAction(InsertActionType value) {
        return new JAXBElement<InsertActionType>(_InsertAction_QNAME, InsertActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventActionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "EventAction")
    public JAXBElement<EventActionType> createEventAction(EventActionType value) {
        return new JAXBElement<EventActionType>(_EventAction_QNAME, EventActionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "Target")
    public JAXBElement<TargetType> createTarget(TargetType value) {
        return new JAXBElement<TargetType>(_Target_QNAME, TargetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunOnScheduleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.openclinica.org/ns/rules/v3.1", name = "RunOnSchedule")
    public JAXBElement<RunOnScheduleType> createRunOnSchedule(RunOnScheduleType value) {
        return new JAXBElement<RunOnScheduleType>(_RunOnSchedule_QNAME, RunOnScheduleType.class, null, value);
    }

}
