//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.09.12 alle 10:57:06 AM CEST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.cdisc.ns.odm.v121 package. 
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

    private final static QName _Study_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Study");
    private final static QName _AdminData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "AdminData");
    private final static QName _ReferenceData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ReferenceData");
    private final static QName _ClinicalData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ClinicalData");
    private final static QName _Association_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Association");
    private final static QName _KeySet_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "KeySet");
    private final static QName _TranslatedText_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "TranslatedText");
    private final static QName _GlobalVariables_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "GlobalVariables");
    private final static QName _StudyName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StudyName");
    private final static QName _StudyDescription_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StudyDescription");
    private final static QName _ProtocolName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ProtocolName");
    private final static QName _BasicDefinitions_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "BasicDefinitions");
    private final static QName _MeasurementUnit_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "MeasurementUnit");
    private final static QName _Symbol_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Symbol");
    private final static QName _MetaDataVersion_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "MetaDataVersion");
    private final static QName _Include_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Include");
    private final static QName _Protocol_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Protocol");
    private final static QName _StudyEventRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StudyEventRef");
    private final static QName _StudyEventDef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StudyEventDef");
    private final static QName _FormRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FormRef");
    private final static QName _FormDef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FormDef");
    private final static QName _ItemGroupRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemGroupRef");
    private final static QName _ArchiveLayout_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ArchiveLayout");
    private final static QName _ItemGroupDef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemGroupDef");
    private final static QName _ItemRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemRef");
    private final static QName _ItemDef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemDef");
    private final static QName _Question_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Question");
    private final static QName _ExternalQuestion_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ExternalQuestion");
    private final static QName _MeasurementUnitRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "MeasurementUnitRef");
    private final static QName _RangeCheck_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "RangeCheck");
    private final static QName _CheckValue_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "CheckValue");
    private final static QName _ErrorMessage_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ErrorMessage");
    private final static QName _CodeListRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "CodeListRef");
    private final static QName _Role_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Role");
    private final static QName _Alias_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Alias");
    private final static QName _CodeList_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "CodeList");
    private final static QName _CodeListItem_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "CodeListItem");
    private final static QName _Decode_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Decode");
    private final static QName _ExternalCodeList_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ExternalCodeList");
    private final static QName _ImputationMethod_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ImputationMethod");
    private final static QName _Presentation_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Presentation");
    private final static QName _User_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "User");
    private final static QName _LoginName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "LoginName");
    private final static QName _DisplayName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "DisplayName");
    private final static QName _FullName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FullName");
    private final static QName _FirstName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FirstName");
    private final static QName _LastName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "LastName");
    private final static QName _Organization_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Organization");
    private final static QName _Address_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Address");
    private final static QName _StreetName_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StreetName");
    private final static QName _City_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "City");
    private final static QName _StateProv_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StateProv");
    private final static QName _Country_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Country");
    private final static QName _PostalCode_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "PostalCode");
    private final static QName _OtherText_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "OtherText");
    private final static QName _Email_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Email");
    private final static QName _Picture_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Picture");
    private final static QName _Pager_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Pager");
    private final static QName _Fax_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Fax");
    private final static QName _Phone_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Phone");
    private final static QName _LocationRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "LocationRef");
    private final static QName _Certificate_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Certificate");
    private final static QName _Location_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Location");
    private final static QName _MetaDataVersionRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "MetaDataVersionRef");
    private final static QName _SignatureDef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "SignatureDef");
    private final static QName _Meaning_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Meaning");
    private final static QName _LegalReason_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "LegalReason");
    private final static QName _SubjectData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "SubjectData");
    private final static QName _AuditRecord_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "AuditRecord");
    private final static QName _UserRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "UserRef");
    private final static QName _DateTimeStamp_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "DateTimeStamp");
    private final static QName _ReasonForChange_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ReasonForChange");
    private final static QName _SourceID_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "SourceID");
    private final static QName _Signature_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Signature");
    private final static QName _SignatureRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "SignatureRef");
    private final static QName _CryptoBindingManifest_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "CryptoBindingManifest");
    private final static QName _InvestigatorRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "InvestigatorRef");
    private final static QName _SiteRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "SiteRef");
    private final static QName _Annotation_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Annotation");
    private final static QName _Comment_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Comment");
    private final static QName _Flag_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "Flag");
    private final static QName _FlagValue_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FlagValue");
    private final static QName _FlagType_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FlagType");
    private final static QName _StudyEventData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "StudyEventData");
    private final static QName _FormData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "FormData");
    private final static QName _ArchiveLayoutRef_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ArchiveLayoutRef");
    private final static QName _ItemGroupData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemGroupData");
    private final static QName _ItemData_QNAME = new QName("http://www.cdisc.org/ns/odm/v1.2", "ItemData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.cdisc.ns.odm.v121
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ODM }
     * 
     */
    public ODM createODM() {
        return new ODM();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudy }
     * 
     */
    public ODMcomplexTypeDefinitionStudy createODMcomplexTypeDefinitionStudy() {
        return new ODMcomplexTypeDefinitionStudy();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAdminData }
     * 
     */
    public ODMcomplexTypeDefinitionAdminData createODMcomplexTypeDefinitionAdminData() {
        return new ODMcomplexTypeDefinitionAdminData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionReferenceData }
     * 
     */
    public ODMcomplexTypeDefinitionReferenceData createODMcomplexTypeDefinitionReferenceData() {
        return new ODMcomplexTypeDefinitionReferenceData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionClinicalData }
     * 
     */
    public ODMcomplexTypeDefinitionClinicalData createODMcomplexTypeDefinitionClinicalData() {
        return new ODMcomplexTypeDefinitionClinicalData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAssociation }
     * 
     */
    public ODMcomplexTypeDefinitionAssociation createODMcomplexTypeDefinitionAssociation() {
        return new ODMcomplexTypeDefinitionAssociation();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionKeySet }
     * 
     */
    public ODMcomplexTypeDefinitionKeySet createODMcomplexTypeDefinitionKeySet() {
        return new ODMcomplexTypeDefinitionKeySet();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionTranslatedText }
     * 
     */
    public ODMcomplexTypeDefinitionTranslatedText createODMcomplexTypeDefinitionTranslatedText() {
        return new ODMcomplexTypeDefinitionTranslatedText();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionGlobalVariables }
     * 
     */
    public ODMcomplexTypeDefinitionGlobalVariables createODMcomplexTypeDefinitionGlobalVariables() {
        return new ODMcomplexTypeDefinitionGlobalVariables();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudyName }
     * 
     */
    public ODMcomplexTypeDefinitionStudyName createODMcomplexTypeDefinitionStudyName() {
        return new ODMcomplexTypeDefinitionStudyName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudyDescription }
     * 
     */
    public ODMcomplexTypeDefinitionStudyDescription createODMcomplexTypeDefinitionStudyDescription() {
        return new ODMcomplexTypeDefinitionStudyDescription();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionProtocolName }
     * 
     */
    public ODMcomplexTypeDefinitionProtocolName createODMcomplexTypeDefinitionProtocolName() {
        return new ODMcomplexTypeDefinitionProtocolName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionBasicDefinitions }
     * 
     */
    public ODMcomplexTypeDefinitionBasicDefinitions createODMcomplexTypeDefinitionBasicDefinitions() {
        return new ODMcomplexTypeDefinitionBasicDefinitions();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionMeasurementUnit }
     * 
     */
    public ODMcomplexTypeDefinitionMeasurementUnit createODMcomplexTypeDefinitionMeasurementUnit() {
        return new ODMcomplexTypeDefinitionMeasurementUnit();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSymbol }
     * 
     */
    public ODMcomplexTypeDefinitionSymbol createODMcomplexTypeDefinitionSymbol() {
        return new ODMcomplexTypeDefinitionSymbol();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionMetaDataVersion }
     * 
     */
    public ODMcomplexTypeDefinitionMetaDataVersion createODMcomplexTypeDefinitionMetaDataVersion() {
        return new ODMcomplexTypeDefinitionMetaDataVersion();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionInclude }
     * 
     */
    public ODMcomplexTypeDefinitionInclude createODMcomplexTypeDefinitionInclude() {
        return new ODMcomplexTypeDefinitionInclude();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionProtocol }
     * 
     */
    public ODMcomplexTypeDefinitionProtocol createODMcomplexTypeDefinitionProtocol() {
        return new ODMcomplexTypeDefinitionProtocol();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudyEventRef }
     * 
     */
    public ODMcomplexTypeDefinitionStudyEventRef createODMcomplexTypeDefinitionStudyEventRef() {
        return new ODMcomplexTypeDefinitionStudyEventRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudyEventDef }
     * 
     */
    public ODMcomplexTypeDefinitionStudyEventDef createODMcomplexTypeDefinitionStudyEventDef() {
        return new ODMcomplexTypeDefinitionStudyEventDef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFormRef }
     * 
     */
    public ODMcomplexTypeDefinitionFormRef createODMcomplexTypeDefinitionFormRef() {
        return new ODMcomplexTypeDefinitionFormRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFormDef }
     * 
     */
    public ODMcomplexTypeDefinitionFormDef createODMcomplexTypeDefinitionFormDef() {
        return new ODMcomplexTypeDefinitionFormDef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemGroupRef }
     * 
     */
    public ODMcomplexTypeDefinitionItemGroupRef createODMcomplexTypeDefinitionItemGroupRef() {
        return new ODMcomplexTypeDefinitionItemGroupRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionArchiveLayout }
     * 
     */
    public ODMcomplexTypeDefinitionArchiveLayout createODMcomplexTypeDefinitionArchiveLayout() {
        return new ODMcomplexTypeDefinitionArchiveLayout();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemGroupDef }
     * 
     */
    public ODMcomplexTypeDefinitionItemGroupDef createODMcomplexTypeDefinitionItemGroupDef() {
        return new ODMcomplexTypeDefinitionItemGroupDef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemRef }
     * 
     */
    public ODMcomplexTypeDefinitionItemRef createODMcomplexTypeDefinitionItemRef() {
        return new ODMcomplexTypeDefinitionItemRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemDef }
     * 
     */
    public ODMcomplexTypeDefinitionItemDef createODMcomplexTypeDefinitionItemDef() {
        return new ODMcomplexTypeDefinitionItemDef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionQuestion }
     * 
     */
    public ODMcomplexTypeDefinitionQuestion createODMcomplexTypeDefinitionQuestion() {
        return new ODMcomplexTypeDefinitionQuestion();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionExternalQuestion }
     * 
     */
    public ODMcomplexTypeDefinitionExternalQuestion createODMcomplexTypeDefinitionExternalQuestion() {
        return new ODMcomplexTypeDefinitionExternalQuestion();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionMeasurementUnitRef }
     * 
     */
    public ODMcomplexTypeDefinitionMeasurementUnitRef createODMcomplexTypeDefinitionMeasurementUnitRef() {
        return new ODMcomplexTypeDefinitionMeasurementUnitRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionRangeCheck }
     * 
     */
    public ODMcomplexTypeDefinitionRangeCheck createODMcomplexTypeDefinitionRangeCheck() {
        return new ODMcomplexTypeDefinitionRangeCheck();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCheckValue }
     * 
     */
    public ODMcomplexTypeDefinitionCheckValue createODMcomplexTypeDefinitionCheckValue() {
        return new ODMcomplexTypeDefinitionCheckValue();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionErrorMessage }
     * 
     */
    public ODMcomplexTypeDefinitionErrorMessage createODMcomplexTypeDefinitionErrorMessage() {
        return new ODMcomplexTypeDefinitionErrorMessage();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCodeListRef }
     * 
     */
    public ODMcomplexTypeDefinitionCodeListRef createODMcomplexTypeDefinitionCodeListRef() {
        return new ODMcomplexTypeDefinitionCodeListRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionRole }
     * 
     */
    public ODMcomplexTypeDefinitionRole createODMcomplexTypeDefinitionRole() {
        return new ODMcomplexTypeDefinitionRole();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAlias }
     * 
     */
    public ODMcomplexTypeDefinitionAlias createODMcomplexTypeDefinitionAlias() {
        return new ODMcomplexTypeDefinitionAlias();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCodeList }
     * 
     */
    public ODMcomplexTypeDefinitionCodeList createODMcomplexTypeDefinitionCodeList() {
        return new ODMcomplexTypeDefinitionCodeList();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCodeListItem }
     * 
     */
    public ODMcomplexTypeDefinitionCodeListItem createODMcomplexTypeDefinitionCodeListItem() {
        return new ODMcomplexTypeDefinitionCodeListItem();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionDecode }
     * 
     */
    public ODMcomplexTypeDefinitionDecode createODMcomplexTypeDefinitionDecode() {
        return new ODMcomplexTypeDefinitionDecode();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionExternalCodeList }
     * 
     */
    public ODMcomplexTypeDefinitionExternalCodeList createODMcomplexTypeDefinitionExternalCodeList() {
        return new ODMcomplexTypeDefinitionExternalCodeList();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionImputationMethod }
     * 
     */
    public ODMcomplexTypeDefinitionImputationMethod createODMcomplexTypeDefinitionImputationMethod() {
        return new ODMcomplexTypeDefinitionImputationMethod();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionPresentation }
     * 
     */
    public ODMcomplexTypeDefinitionPresentation createODMcomplexTypeDefinitionPresentation() {
        return new ODMcomplexTypeDefinitionPresentation();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionUser }
     * 
     */
    public ODMcomplexTypeDefinitionUser createODMcomplexTypeDefinitionUser() {
        return new ODMcomplexTypeDefinitionUser();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionLoginName }
     * 
     */
    public ODMcomplexTypeDefinitionLoginName createODMcomplexTypeDefinitionLoginName() {
        return new ODMcomplexTypeDefinitionLoginName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionDisplayName }
     * 
     */
    public ODMcomplexTypeDefinitionDisplayName createODMcomplexTypeDefinitionDisplayName() {
        return new ODMcomplexTypeDefinitionDisplayName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFullName }
     * 
     */
    public ODMcomplexTypeDefinitionFullName createODMcomplexTypeDefinitionFullName() {
        return new ODMcomplexTypeDefinitionFullName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFirstName }
     * 
     */
    public ODMcomplexTypeDefinitionFirstName createODMcomplexTypeDefinitionFirstName() {
        return new ODMcomplexTypeDefinitionFirstName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionLastName }
     * 
     */
    public ODMcomplexTypeDefinitionLastName createODMcomplexTypeDefinitionLastName() {
        return new ODMcomplexTypeDefinitionLastName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionOrganization }
     * 
     */
    public ODMcomplexTypeDefinitionOrganization createODMcomplexTypeDefinitionOrganization() {
        return new ODMcomplexTypeDefinitionOrganization();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAddress }
     * 
     */
    public ODMcomplexTypeDefinitionAddress createODMcomplexTypeDefinitionAddress() {
        return new ODMcomplexTypeDefinitionAddress();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStreetName }
     * 
     */
    public ODMcomplexTypeDefinitionStreetName createODMcomplexTypeDefinitionStreetName() {
        return new ODMcomplexTypeDefinitionStreetName();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCity }
     * 
     */
    public ODMcomplexTypeDefinitionCity createODMcomplexTypeDefinitionCity() {
        return new ODMcomplexTypeDefinitionCity();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStateProv }
     * 
     */
    public ODMcomplexTypeDefinitionStateProv createODMcomplexTypeDefinitionStateProv() {
        return new ODMcomplexTypeDefinitionStateProv();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCountry }
     * 
     */
    public ODMcomplexTypeDefinitionCountry createODMcomplexTypeDefinitionCountry() {
        return new ODMcomplexTypeDefinitionCountry();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionPostalCode }
     * 
     */
    public ODMcomplexTypeDefinitionPostalCode createODMcomplexTypeDefinitionPostalCode() {
        return new ODMcomplexTypeDefinitionPostalCode();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionOtherText }
     * 
     */
    public ODMcomplexTypeDefinitionOtherText createODMcomplexTypeDefinitionOtherText() {
        return new ODMcomplexTypeDefinitionOtherText();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionEmail }
     * 
     */
    public ODMcomplexTypeDefinitionEmail createODMcomplexTypeDefinitionEmail() {
        return new ODMcomplexTypeDefinitionEmail();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionPicture }
     * 
     */
    public ODMcomplexTypeDefinitionPicture createODMcomplexTypeDefinitionPicture() {
        return new ODMcomplexTypeDefinitionPicture();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionPager }
     * 
     */
    public ODMcomplexTypeDefinitionPager createODMcomplexTypeDefinitionPager() {
        return new ODMcomplexTypeDefinitionPager();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFax }
     * 
     */
    public ODMcomplexTypeDefinitionFax createODMcomplexTypeDefinitionFax() {
        return new ODMcomplexTypeDefinitionFax();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionPhone }
     * 
     */
    public ODMcomplexTypeDefinitionPhone createODMcomplexTypeDefinitionPhone() {
        return new ODMcomplexTypeDefinitionPhone();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionLocationRef }
     * 
     */
    public ODMcomplexTypeDefinitionLocationRef createODMcomplexTypeDefinitionLocationRef() {
        return new ODMcomplexTypeDefinitionLocationRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCertificate }
     * 
     */
    public ODMcomplexTypeDefinitionCertificate createODMcomplexTypeDefinitionCertificate() {
        return new ODMcomplexTypeDefinitionCertificate();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionLocation }
     * 
     */
    public ODMcomplexTypeDefinitionLocation createODMcomplexTypeDefinitionLocation() {
        return new ODMcomplexTypeDefinitionLocation();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionMetaDataVersionRef }
     * 
     */
    public ODMcomplexTypeDefinitionMetaDataVersionRef createODMcomplexTypeDefinitionMetaDataVersionRef() {
        return new ODMcomplexTypeDefinitionMetaDataVersionRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSignatureDef }
     * 
     */
    public ODMcomplexTypeDefinitionSignatureDef createODMcomplexTypeDefinitionSignatureDef() {
        return new ODMcomplexTypeDefinitionSignatureDef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionMeaning }
     * 
     */
    public ODMcomplexTypeDefinitionMeaning createODMcomplexTypeDefinitionMeaning() {
        return new ODMcomplexTypeDefinitionMeaning();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionLegalReason }
     * 
     */
    public ODMcomplexTypeDefinitionLegalReason createODMcomplexTypeDefinitionLegalReason() {
        return new ODMcomplexTypeDefinitionLegalReason();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSubjectData }
     * 
     */
    public ODMcomplexTypeDefinitionSubjectData createODMcomplexTypeDefinitionSubjectData() {
        return new ODMcomplexTypeDefinitionSubjectData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAuditRecord }
     * 
     */
    public ODMcomplexTypeDefinitionAuditRecord createODMcomplexTypeDefinitionAuditRecord() {
        return new ODMcomplexTypeDefinitionAuditRecord();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionUserRef }
     * 
     */
    public ODMcomplexTypeDefinitionUserRef createODMcomplexTypeDefinitionUserRef() {
        return new ODMcomplexTypeDefinitionUserRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionDateTimeStamp }
     * 
     */
    public ODMcomplexTypeDefinitionDateTimeStamp createODMcomplexTypeDefinitionDateTimeStamp() {
        return new ODMcomplexTypeDefinitionDateTimeStamp();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionReasonForChange }
     * 
     */
    public ODMcomplexTypeDefinitionReasonForChange createODMcomplexTypeDefinitionReasonForChange() {
        return new ODMcomplexTypeDefinitionReasonForChange();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSourceID }
     * 
     */
    public ODMcomplexTypeDefinitionSourceID createODMcomplexTypeDefinitionSourceID() {
        return new ODMcomplexTypeDefinitionSourceID();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSignature }
     * 
     */
    public ODMcomplexTypeDefinitionSignature createODMcomplexTypeDefinitionSignature() {
        return new ODMcomplexTypeDefinitionSignature();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSignatureRef }
     * 
     */
    public ODMcomplexTypeDefinitionSignatureRef createODMcomplexTypeDefinitionSignatureRef() {
        return new ODMcomplexTypeDefinitionSignatureRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionCryptoBindingManifest }
     * 
     */
    public ODMcomplexTypeDefinitionCryptoBindingManifest createODMcomplexTypeDefinitionCryptoBindingManifest() {
        return new ODMcomplexTypeDefinitionCryptoBindingManifest();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionInvestigatorRef }
     * 
     */
    public ODMcomplexTypeDefinitionInvestigatorRef createODMcomplexTypeDefinitionInvestigatorRef() {
        return new ODMcomplexTypeDefinitionInvestigatorRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionSiteRef }
     * 
     */
    public ODMcomplexTypeDefinitionSiteRef createODMcomplexTypeDefinitionSiteRef() {
        return new ODMcomplexTypeDefinitionSiteRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionAnnotation }
     * 
     */
    public ODMcomplexTypeDefinitionAnnotation createODMcomplexTypeDefinitionAnnotation() {
        return new ODMcomplexTypeDefinitionAnnotation();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionComment }
     * 
     */
    public ODMcomplexTypeDefinitionComment createODMcomplexTypeDefinitionComment() {
        return new ODMcomplexTypeDefinitionComment();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFlag }
     * 
     */
    public ODMcomplexTypeDefinitionFlag createODMcomplexTypeDefinitionFlag() {
        return new ODMcomplexTypeDefinitionFlag();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFlagValue }
     * 
     */
    public ODMcomplexTypeDefinitionFlagValue createODMcomplexTypeDefinitionFlagValue() {
        return new ODMcomplexTypeDefinitionFlagValue();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFlagType }
     * 
     */
    public ODMcomplexTypeDefinitionFlagType createODMcomplexTypeDefinitionFlagType() {
        return new ODMcomplexTypeDefinitionFlagType();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionStudyEventData }
     * 
     */
    public ODMcomplexTypeDefinitionStudyEventData createODMcomplexTypeDefinitionStudyEventData() {
        return new ODMcomplexTypeDefinitionStudyEventData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionFormData }
     * 
     */
    public ODMcomplexTypeDefinitionFormData createODMcomplexTypeDefinitionFormData() {
        return new ODMcomplexTypeDefinitionFormData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionArchiveLayoutRef }
     * 
     */
    public ODMcomplexTypeDefinitionArchiveLayoutRef createODMcomplexTypeDefinitionArchiveLayoutRef() {
        return new ODMcomplexTypeDefinitionArchiveLayoutRef();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemGroupData }
     * 
     */
    public ODMcomplexTypeDefinitionItemGroupData createODMcomplexTypeDefinitionItemGroupData() {
        return new ODMcomplexTypeDefinitionItemGroupData();
    }

    /**
     * Create an instance of {@link ODMcomplexTypeDefinitionItemData }
     * 
     */
    public ODMcomplexTypeDefinitionItemData createODMcomplexTypeDefinitionItemData() {
        return new ODMcomplexTypeDefinitionItemData();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionItemData }
     * 
     */
    public OriginalODMcomplexTypeDefinitionItemData createOriginalODMcomplexTypeDefinitionItemData() {
        return new OriginalODMcomplexTypeDefinitionItemData();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionFormData }
     * 
     */
    public OriginalODMcomplexTypeDefinitionFormData createOriginalODMcomplexTypeDefinitionFormData() {
        return new OriginalODMcomplexTypeDefinitionFormData();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionStudyEventData }
     * 
     */
    public OriginalODMcomplexTypeDefinitionStudyEventData createOriginalODMcomplexTypeDefinitionStudyEventData() {
        return new OriginalODMcomplexTypeDefinitionStudyEventData();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionSubjectData }
     * 
     */
    public OriginalODMcomplexTypeDefinitionSubjectData createOriginalODMcomplexTypeDefinitionSubjectData() {
        return new OriginalODMcomplexTypeDefinitionSubjectData();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionItemDef }
     * 
     */
    public OriginalODMcomplexTypeDefinitionItemDef createOriginalODMcomplexTypeDefinitionItemDef() {
        return new OriginalODMcomplexTypeDefinitionItemDef();
    }

    /**
     * Create an instance of {@link OriginalODMcomplexTypeDefinitionMetaDataVersion }
     * 
     */
    public OriginalODMcomplexTypeDefinitionMetaDataVersion createOriginalODMcomplexTypeDefinitionMetaDataVersion() {
        return new OriginalODMcomplexTypeDefinitionMetaDataVersion();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Study")
    public JAXBElement<ODMcomplexTypeDefinitionStudy> createStudy(ODMcomplexTypeDefinitionStudy value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudy>(_Study_QNAME, ODMcomplexTypeDefinitionStudy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAdminData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "AdminData")
    public JAXBElement<ODMcomplexTypeDefinitionAdminData> createAdminData(ODMcomplexTypeDefinitionAdminData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAdminData>(_AdminData_QNAME, ODMcomplexTypeDefinitionAdminData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionReferenceData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ReferenceData")
    public JAXBElement<ODMcomplexTypeDefinitionReferenceData> createReferenceData(ODMcomplexTypeDefinitionReferenceData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionReferenceData>(_ReferenceData_QNAME, ODMcomplexTypeDefinitionReferenceData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionClinicalData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ClinicalData")
    public JAXBElement<ODMcomplexTypeDefinitionClinicalData> createClinicalData(ODMcomplexTypeDefinitionClinicalData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionClinicalData>(_ClinicalData_QNAME, ODMcomplexTypeDefinitionClinicalData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAssociation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Association")
    public JAXBElement<ODMcomplexTypeDefinitionAssociation> createAssociation(ODMcomplexTypeDefinitionAssociation value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAssociation>(_Association_QNAME, ODMcomplexTypeDefinitionAssociation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionKeySet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "KeySet")
    public JAXBElement<ODMcomplexTypeDefinitionKeySet> createKeySet(ODMcomplexTypeDefinitionKeySet value) {
        return new JAXBElement<ODMcomplexTypeDefinitionKeySet>(_KeySet_QNAME, ODMcomplexTypeDefinitionKeySet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionTranslatedText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "TranslatedText")
    public JAXBElement<ODMcomplexTypeDefinitionTranslatedText> createTranslatedText(ODMcomplexTypeDefinitionTranslatedText value) {
        return new JAXBElement<ODMcomplexTypeDefinitionTranslatedText>(_TranslatedText_QNAME, ODMcomplexTypeDefinitionTranslatedText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionGlobalVariables }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "GlobalVariables")
    public JAXBElement<ODMcomplexTypeDefinitionGlobalVariables> createGlobalVariables(ODMcomplexTypeDefinitionGlobalVariables value) {
        return new JAXBElement<ODMcomplexTypeDefinitionGlobalVariables>(_GlobalVariables_QNAME, ODMcomplexTypeDefinitionGlobalVariables.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudyName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StudyName")
    public JAXBElement<ODMcomplexTypeDefinitionStudyName> createStudyName(ODMcomplexTypeDefinitionStudyName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudyName>(_StudyName_QNAME, ODMcomplexTypeDefinitionStudyName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudyDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StudyDescription")
    public JAXBElement<ODMcomplexTypeDefinitionStudyDescription> createStudyDescription(ODMcomplexTypeDefinitionStudyDescription value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudyDescription>(_StudyDescription_QNAME, ODMcomplexTypeDefinitionStudyDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionProtocolName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ProtocolName")
    public JAXBElement<ODMcomplexTypeDefinitionProtocolName> createProtocolName(ODMcomplexTypeDefinitionProtocolName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionProtocolName>(_ProtocolName_QNAME, ODMcomplexTypeDefinitionProtocolName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionBasicDefinitions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "BasicDefinitions")
    public JAXBElement<ODMcomplexTypeDefinitionBasicDefinitions> createBasicDefinitions(ODMcomplexTypeDefinitionBasicDefinitions value) {
        return new JAXBElement<ODMcomplexTypeDefinitionBasicDefinitions>(_BasicDefinitions_QNAME, ODMcomplexTypeDefinitionBasicDefinitions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionMeasurementUnit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "MeasurementUnit")
    public JAXBElement<ODMcomplexTypeDefinitionMeasurementUnit> createMeasurementUnit(ODMcomplexTypeDefinitionMeasurementUnit value) {
        return new JAXBElement<ODMcomplexTypeDefinitionMeasurementUnit>(_MeasurementUnit_QNAME, ODMcomplexTypeDefinitionMeasurementUnit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSymbol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Symbol")
    public JAXBElement<ODMcomplexTypeDefinitionSymbol> createSymbol(ODMcomplexTypeDefinitionSymbol value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSymbol>(_Symbol_QNAME, ODMcomplexTypeDefinitionSymbol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionMetaDataVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "MetaDataVersion")
    public JAXBElement<ODMcomplexTypeDefinitionMetaDataVersion> createMetaDataVersion(ODMcomplexTypeDefinitionMetaDataVersion value) {
        return new JAXBElement<ODMcomplexTypeDefinitionMetaDataVersion>(_MetaDataVersion_QNAME, ODMcomplexTypeDefinitionMetaDataVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionInclude }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Include")
    public JAXBElement<ODMcomplexTypeDefinitionInclude> createInclude(ODMcomplexTypeDefinitionInclude value) {
        return new JAXBElement<ODMcomplexTypeDefinitionInclude>(_Include_QNAME, ODMcomplexTypeDefinitionInclude.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Protocol")
    public JAXBElement<ODMcomplexTypeDefinitionProtocol> createProtocol(ODMcomplexTypeDefinitionProtocol value) {
        return new JAXBElement<ODMcomplexTypeDefinitionProtocol>(_Protocol_QNAME, ODMcomplexTypeDefinitionProtocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudyEventRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StudyEventRef")
    public JAXBElement<ODMcomplexTypeDefinitionStudyEventRef> createStudyEventRef(ODMcomplexTypeDefinitionStudyEventRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudyEventRef>(_StudyEventRef_QNAME, ODMcomplexTypeDefinitionStudyEventRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudyEventDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StudyEventDef")
    public JAXBElement<ODMcomplexTypeDefinitionStudyEventDef> createStudyEventDef(ODMcomplexTypeDefinitionStudyEventDef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudyEventDef>(_StudyEventDef_QNAME, ODMcomplexTypeDefinitionStudyEventDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFormRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FormRef")
    public JAXBElement<ODMcomplexTypeDefinitionFormRef> createFormRef(ODMcomplexTypeDefinitionFormRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFormRef>(_FormRef_QNAME, ODMcomplexTypeDefinitionFormRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFormDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FormDef")
    public JAXBElement<ODMcomplexTypeDefinitionFormDef> createFormDef(ODMcomplexTypeDefinitionFormDef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFormDef>(_FormDef_QNAME, ODMcomplexTypeDefinitionFormDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemGroupRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemGroupRef")
    public JAXBElement<ODMcomplexTypeDefinitionItemGroupRef> createItemGroupRef(ODMcomplexTypeDefinitionItemGroupRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemGroupRef>(_ItemGroupRef_QNAME, ODMcomplexTypeDefinitionItemGroupRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionArchiveLayout }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ArchiveLayout")
    public JAXBElement<ODMcomplexTypeDefinitionArchiveLayout> createArchiveLayout(ODMcomplexTypeDefinitionArchiveLayout value) {
        return new JAXBElement<ODMcomplexTypeDefinitionArchiveLayout>(_ArchiveLayout_QNAME, ODMcomplexTypeDefinitionArchiveLayout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemGroupDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemGroupDef")
    public JAXBElement<ODMcomplexTypeDefinitionItemGroupDef> createItemGroupDef(ODMcomplexTypeDefinitionItemGroupDef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemGroupDef>(_ItemGroupDef_QNAME, ODMcomplexTypeDefinitionItemGroupDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemRef")
    public JAXBElement<ODMcomplexTypeDefinitionItemRef> createItemRef(ODMcomplexTypeDefinitionItemRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemRef>(_ItemRef_QNAME, ODMcomplexTypeDefinitionItemRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemDef")
    public JAXBElement<ODMcomplexTypeDefinitionItemDef> createItemDef(ODMcomplexTypeDefinitionItemDef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemDef>(_ItemDef_QNAME, ODMcomplexTypeDefinitionItemDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Question")
    public JAXBElement<ODMcomplexTypeDefinitionQuestion> createQuestion(ODMcomplexTypeDefinitionQuestion value) {
        return new JAXBElement<ODMcomplexTypeDefinitionQuestion>(_Question_QNAME, ODMcomplexTypeDefinitionQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionExternalQuestion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ExternalQuestion")
    public JAXBElement<ODMcomplexTypeDefinitionExternalQuestion> createExternalQuestion(ODMcomplexTypeDefinitionExternalQuestion value) {
        return new JAXBElement<ODMcomplexTypeDefinitionExternalQuestion>(_ExternalQuestion_QNAME, ODMcomplexTypeDefinitionExternalQuestion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionMeasurementUnitRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "MeasurementUnitRef")
    public JAXBElement<ODMcomplexTypeDefinitionMeasurementUnitRef> createMeasurementUnitRef(ODMcomplexTypeDefinitionMeasurementUnitRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionMeasurementUnitRef>(_MeasurementUnitRef_QNAME, ODMcomplexTypeDefinitionMeasurementUnitRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionRangeCheck }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "RangeCheck")
    public JAXBElement<ODMcomplexTypeDefinitionRangeCheck> createRangeCheck(ODMcomplexTypeDefinitionRangeCheck value) {
        return new JAXBElement<ODMcomplexTypeDefinitionRangeCheck>(_RangeCheck_QNAME, ODMcomplexTypeDefinitionRangeCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCheckValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "CheckValue")
    public JAXBElement<ODMcomplexTypeDefinitionCheckValue> createCheckValue(ODMcomplexTypeDefinitionCheckValue value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCheckValue>(_CheckValue_QNAME, ODMcomplexTypeDefinitionCheckValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ErrorMessage")
    public JAXBElement<ODMcomplexTypeDefinitionErrorMessage> createErrorMessage(ODMcomplexTypeDefinitionErrorMessage value) {
        return new JAXBElement<ODMcomplexTypeDefinitionErrorMessage>(_ErrorMessage_QNAME, ODMcomplexTypeDefinitionErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCodeListRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "CodeListRef")
    public JAXBElement<ODMcomplexTypeDefinitionCodeListRef> createCodeListRef(ODMcomplexTypeDefinitionCodeListRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCodeListRef>(_CodeListRef_QNAME, ODMcomplexTypeDefinitionCodeListRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Role")
    public JAXBElement<ODMcomplexTypeDefinitionRole> createRole(ODMcomplexTypeDefinitionRole value) {
        return new JAXBElement<ODMcomplexTypeDefinitionRole>(_Role_QNAME, ODMcomplexTypeDefinitionRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAlias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Alias")
    public JAXBElement<ODMcomplexTypeDefinitionAlias> createAlias(ODMcomplexTypeDefinitionAlias value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAlias>(_Alias_QNAME, ODMcomplexTypeDefinitionAlias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "CodeList")
    public JAXBElement<ODMcomplexTypeDefinitionCodeList> createCodeList(ODMcomplexTypeDefinitionCodeList value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCodeList>(_CodeList_QNAME, ODMcomplexTypeDefinitionCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCodeListItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "CodeListItem")
    public JAXBElement<ODMcomplexTypeDefinitionCodeListItem> createCodeListItem(ODMcomplexTypeDefinitionCodeListItem value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCodeListItem>(_CodeListItem_QNAME, ODMcomplexTypeDefinitionCodeListItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionDecode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Decode")
    public JAXBElement<ODMcomplexTypeDefinitionDecode> createDecode(ODMcomplexTypeDefinitionDecode value) {
        return new JAXBElement<ODMcomplexTypeDefinitionDecode>(_Decode_QNAME, ODMcomplexTypeDefinitionDecode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionExternalCodeList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ExternalCodeList")
    public JAXBElement<ODMcomplexTypeDefinitionExternalCodeList> createExternalCodeList(ODMcomplexTypeDefinitionExternalCodeList value) {
        return new JAXBElement<ODMcomplexTypeDefinitionExternalCodeList>(_ExternalCodeList_QNAME, ODMcomplexTypeDefinitionExternalCodeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionImputationMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ImputationMethod")
    public JAXBElement<ODMcomplexTypeDefinitionImputationMethod> createImputationMethod(ODMcomplexTypeDefinitionImputationMethod value) {
        return new JAXBElement<ODMcomplexTypeDefinitionImputationMethod>(_ImputationMethod_QNAME, ODMcomplexTypeDefinitionImputationMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionPresentation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Presentation")
    public JAXBElement<ODMcomplexTypeDefinitionPresentation> createPresentation(ODMcomplexTypeDefinitionPresentation value) {
        return new JAXBElement<ODMcomplexTypeDefinitionPresentation>(_Presentation_QNAME, ODMcomplexTypeDefinitionPresentation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "User")
    public JAXBElement<ODMcomplexTypeDefinitionUser> createUser(ODMcomplexTypeDefinitionUser value) {
        return new JAXBElement<ODMcomplexTypeDefinitionUser>(_User_QNAME, ODMcomplexTypeDefinitionUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionLoginName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "LoginName")
    public JAXBElement<ODMcomplexTypeDefinitionLoginName> createLoginName(ODMcomplexTypeDefinitionLoginName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionLoginName>(_LoginName_QNAME, ODMcomplexTypeDefinitionLoginName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionDisplayName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "DisplayName")
    public JAXBElement<ODMcomplexTypeDefinitionDisplayName> createDisplayName(ODMcomplexTypeDefinitionDisplayName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionDisplayName>(_DisplayName_QNAME, ODMcomplexTypeDefinitionDisplayName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFullName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FullName")
    public JAXBElement<ODMcomplexTypeDefinitionFullName> createFullName(ODMcomplexTypeDefinitionFullName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFullName>(_FullName_QNAME, ODMcomplexTypeDefinitionFullName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFirstName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FirstName")
    public JAXBElement<ODMcomplexTypeDefinitionFirstName> createFirstName(ODMcomplexTypeDefinitionFirstName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFirstName>(_FirstName_QNAME, ODMcomplexTypeDefinitionFirstName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionLastName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "LastName")
    public JAXBElement<ODMcomplexTypeDefinitionLastName> createLastName(ODMcomplexTypeDefinitionLastName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionLastName>(_LastName_QNAME, ODMcomplexTypeDefinitionLastName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Organization")
    public JAXBElement<ODMcomplexTypeDefinitionOrganization> createOrganization(ODMcomplexTypeDefinitionOrganization value) {
        return new JAXBElement<ODMcomplexTypeDefinitionOrganization>(_Organization_QNAME, ODMcomplexTypeDefinitionOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Address")
    public JAXBElement<ODMcomplexTypeDefinitionAddress> createAddress(ODMcomplexTypeDefinitionAddress value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAddress>(_Address_QNAME, ODMcomplexTypeDefinitionAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStreetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StreetName")
    public JAXBElement<ODMcomplexTypeDefinitionStreetName> createStreetName(ODMcomplexTypeDefinitionStreetName value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStreetName>(_StreetName_QNAME, ODMcomplexTypeDefinitionStreetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "City")
    public JAXBElement<ODMcomplexTypeDefinitionCity> createCity(ODMcomplexTypeDefinitionCity value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCity>(_City_QNAME, ODMcomplexTypeDefinitionCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStateProv }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StateProv")
    public JAXBElement<ODMcomplexTypeDefinitionStateProv> createStateProv(ODMcomplexTypeDefinitionStateProv value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStateProv>(_StateProv_QNAME, ODMcomplexTypeDefinitionStateProv.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCountry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Country")
    public JAXBElement<ODMcomplexTypeDefinitionCountry> createCountry(ODMcomplexTypeDefinitionCountry value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCountry>(_Country_QNAME, ODMcomplexTypeDefinitionCountry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionPostalCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "PostalCode")
    public JAXBElement<ODMcomplexTypeDefinitionPostalCode> createPostalCode(ODMcomplexTypeDefinitionPostalCode value) {
        return new JAXBElement<ODMcomplexTypeDefinitionPostalCode>(_PostalCode_QNAME, ODMcomplexTypeDefinitionPostalCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionOtherText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "OtherText")
    public JAXBElement<ODMcomplexTypeDefinitionOtherText> createOtherText(ODMcomplexTypeDefinitionOtherText value) {
        return new JAXBElement<ODMcomplexTypeDefinitionOtherText>(_OtherText_QNAME, ODMcomplexTypeDefinitionOtherText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Email")
    public JAXBElement<ODMcomplexTypeDefinitionEmail> createEmail(ODMcomplexTypeDefinitionEmail value) {
        return new JAXBElement<ODMcomplexTypeDefinitionEmail>(_Email_QNAME, ODMcomplexTypeDefinitionEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionPicture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Picture")
    public JAXBElement<ODMcomplexTypeDefinitionPicture> createPicture(ODMcomplexTypeDefinitionPicture value) {
        return new JAXBElement<ODMcomplexTypeDefinitionPicture>(_Picture_QNAME, ODMcomplexTypeDefinitionPicture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionPager }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Pager")
    public JAXBElement<ODMcomplexTypeDefinitionPager> createPager(ODMcomplexTypeDefinitionPager value) {
        return new JAXBElement<ODMcomplexTypeDefinitionPager>(_Pager_QNAME, ODMcomplexTypeDefinitionPager.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFax }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Fax")
    public JAXBElement<ODMcomplexTypeDefinitionFax> createFax(ODMcomplexTypeDefinitionFax value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFax>(_Fax_QNAME, ODMcomplexTypeDefinitionFax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionPhone }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Phone")
    public JAXBElement<ODMcomplexTypeDefinitionPhone> createPhone(ODMcomplexTypeDefinitionPhone value) {
        return new JAXBElement<ODMcomplexTypeDefinitionPhone>(_Phone_QNAME, ODMcomplexTypeDefinitionPhone.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionLocationRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "LocationRef")
    public JAXBElement<ODMcomplexTypeDefinitionLocationRef> createLocationRef(ODMcomplexTypeDefinitionLocationRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionLocationRef>(_LocationRef_QNAME, ODMcomplexTypeDefinitionLocationRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCertificate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Certificate")
    public JAXBElement<ODMcomplexTypeDefinitionCertificate> createCertificate(ODMcomplexTypeDefinitionCertificate value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCertificate>(_Certificate_QNAME, ODMcomplexTypeDefinitionCertificate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionLocation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Location")
    public JAXBElement<ODMcomplexTypeDefinitionLocation> createLocation(ODMcomplexTypeDefinitionLocation value) {
        return new JAXBElement<ODMcomplexTypeDefinitionLocation>(_Location_QNAME, ODMcomplexTypeDefinitionLocation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionMetaDataVersionRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "MetaDataVersionRef")
    public JAXBElement<ODMcomplexTypeDefinitionMetaDataVersionRef> createMetaDataVersionRef(ODMcomplexTypeDefinitionMetaDataVersionRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionMetaDataVersionRef>(_MetaDataVersionRef_QNAME, ODMcomplexTypeDefinitionMetaDataVersionRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSignatureDef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "SignatureDef")
    public JAXBElement<ODMcomplexTypeDefinitionSignatureDef> createSignatureDef(ODMcomplexTypeDefinitionSignatureDef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSignatureDef>(_SignatureDef_QNAME, ODMcomplexTypeDefinitionSignatureDef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionMeaning }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Meaning")
    public JAXBElement<ODMcomplexTypeDefinitionMeaning> createMeaning(ODMcomplexTypeDefinitionMeaning value) {
        return new JAXBElement<ODMcomplexTypeDefinitionMeaning>(_Meaning_QNAME, ODMcomplexTypeDefinitionMeaning.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionLegalReason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "LegalReason")
    public JAXBElement<ODMcomplexTypeDefinitionLegalReason> createLegalReason(ODMcomplexTypeDefinitionLegalReason value) {
        return new JAXBElement<ODMcomplexTypeDefinitionLegalReason>(_LegalReason_QNAME, ODMcomplexTypeDefinitionLegalReason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSubjectData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "SubjectData")
    public JAXBElement<ODMcomplexTypeDefinitionSubjectData> createSubjectData(ODMcomplexTypeDefinitionSubjectData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSubjectData>(_SubjectData_QNAME, ODMcomplexTypeDefinitionSubjectData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAuditRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "AuditRecord")
    public JAXBElement<ODMcomplexTypeDefinitionAuditRecord> createAuditRecord(ODMcomplexTypeDefinitionAuditRecord value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAuditRecord>(_AuditRecord_QNAME, ODMcomplexTypeDefinitionAuditRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionUserRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "UserRef")
    public JAXBElement<ODMcomplexTypeDefinitionUserRef> createUserRef(ODMcomplexTypeDefinitionUserRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionUserRef>(_UserRef_QNAME, ODMcomplexTypeDefinitionUserRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionDateTimeStamp }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "DateTimeStamp")
    public JAXBElement<ODMcomplexTypeDefinitionDateTimeStamp> createDateTimeStamp(ODMcomplexTypeDefinitionDateTimeStamp value) {
        return new JAXBElement<ODMcomplexTypeDefinitionDateTimeStamp>(_DateTimeStamp_QNAME, ODMcomplexTypeDefinitionDateTimeStamp.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionReasonForChange }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ReasonForChange")
    public JAXBElement<ODMcomplexTypeDefinitionReasonForChange> createReasonForChange(ODMcomplexTypeDefinitionReasonForChange value) {
        return new JAXBElement<ODMcomplexTypeDefinitionReasonForChange>(_ReasonForChange_QNAME, ODMcomplexTypeDefinitionReasonForChange.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSourceID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "SourceID")
    public JAXBElement<ODMcomplexTypeDefinitionSourceID> createSourceID(ODMcomplexTypeDefinitionSourceID value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSourceID>(_SourceID_QNAME, ODMcomplexTypeDefinitionSourceID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSignature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Signature")
    public JAXBElement<ODMcomplexTypeDefinitionSignature> createSignature(ODMcomplexTypeDefinitionSignature value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSignature>(_Signature_QNAME, ODMcomplexTypeDefinitionSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSignatureRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "SignatureRef")
    public JAXBElement<ODMcomplexTypeDefinitionSignatureRef> createSignatureRef(ODMcomplexTypeDefinitionSignatureRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSignatureRef>(_SignatureRef_QNAME, ODMcomplexTypeDefinitionSignatureRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionCryptoBindingManifest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "CryptoBindingManifest")
    public JAXBElement<ODMcomplexTypeDefinitionCryptoBindingManifest> createCryptoBindingManifest(ODMcomplexTypeDefinitionCryptoBindingManifest value) {
        return new JAXBElement<ODMcomplexTypeDefinitionCryptoBindingManifest>(_CryptoBindingManifest_QNAME, ODMcomplexTypeDefinitionCryptoBindingManifest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionInvestigatorRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "InvestigatorRef")
    public JAXBElement<ODMcomplexTypeDefinitionInvestigatorRef> createInvestigatorRef(ODMcomplexTypeDefinitionInvestigatorRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionInvestigatorRef>(_InvestigatorRef_QNAME, ODMcomplexTypeDefinitionInvestigatorRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionSiteRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "SiteRef")
    public JAXBElement<ODMcomplexTypeDefinitionSiteRef> createSiteRef(ODMcomplexTypeDefinitionSiteRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionSiteRef>(_SiteRef_QNAME, ODMcomplexTypeDefinitionSiteRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionAnnotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Annotation")
    public JAXBElement<ODMcomplexTypeDefinitionAnnotation> createAnnotation(ODMcomplexTypeDefinitionAnnotation value) {
        return new JAXBElement<ODMcomplexTypeDefinitionAnnotation>(_Annotation_QNAME, ODMcomplexTypeDefinitionAnnotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionComment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Comment")
    public JAXBElement<ODMcomplexTypeDefinitionComment> createComment(ODMcomplexTypeDefinitionComment value) {
        return new JAXBElement<ODMcomplexTypeDefinitionComment>(_Comment_QNAME, ODMcomplexTypeDefinitionComment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFlag }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "Flag")
    public JAXBElement<ODMcomplexTypeDefinitionFlag> createFlag(ODMcomplexTypeDefinitionFlag value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFlag>(_Flag_QNAME, ODMcomplexTypeDefinitionFlag.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFlagValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FlagValue")
    public JAXBElement<ODMcomplexTypeDefinitionFlagValue> createFlagValue(ODMcomplexTypeDefinitionFlagValue value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFlagValue>(_FlagValue_QNAME, ODMcomplexTypeDefinitionFlagValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFlagType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FlagType")
    public JAXBElement<ODMcomplexTypeDefinitionFlagType> createFlagType(ODMcomplexTypeDefinitionFlagType value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFlagType>(_FlagType_QNAME, ODMcomplexTypeDefinitionFlagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionStudyEventData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "StudyEventData")
    public JAXBElement<ODMcomplexTypeDefinitionStudyEventData> createStudyEventData(ODMcomplexTypeDefinitionStudyEventData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionStudyEventData>(_StudyEventData_QNAME, ODMcomplexTypeDefinitionStudyEventData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionFormData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "FormData")
    public JAXBElement<ODMcomplexTypeDefinitionFormData> createFormData(ODMcomplexTypeDefinitionFormData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionFormData>(_FormData_QNAME, ODMcomplexTypeDefinitionFormData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionArchiveLayoutRef }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ArchiveLayoutRef")
    public JAXBElement<ODMcomplexTypeDefinitionArchiveLayoutRef> createArchiveLayoutRef(ODMcomplexTypeDefinitionArchiveLayoutRef value) {
        return new JAXBElement<ODMcomplexTypeDefinitionArchiveLayoutRef>(_ArchiveLayoutRef_QNAME, ODMcomplexTypeDefinitionArchiveLayoutRef.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemGroupData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemGroupData")
    public JAXBElement<ODMcomplexTypeDefinitionItemGroupData> createItemGroupData(ODMcomplexTypeDefinitionItemGroupData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemGroupData>(_ItemGroupData_QNAME, ODMcomplexTypeDefinitionItemGroupData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ODMcomplexTypeDefinitionItemData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cdisc.org/ns/odm/v1.2", name = "ItemData")
    public JAXBElement<ODMcomplexTypeDefinitionItemData> createItemData(ODMcomplexTypeDefinitionItemData value) {
        return new JAXBElement<ODMcomplexTypeDefinitionItemData>(_ItemData_QNAME, ODMcomplexTypeDefinitionItemData.class, null, value);
    }

}
