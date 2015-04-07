//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.01.13 à 04:28:44 PM CET 
//


package com.orange.paddock.cee.consumer.richProfile.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.orange.paddock.cee.consumer.richProfile.model package. 
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

    private final static QName _Gender_QNAME = new QName("", "Gender");
    private final static QName _Lastname_QNAME = new QName("", "Lastname");
    private final static QName _Firstname_QNAME = new QName("", "Firstname");
    private final static QName _Displayname_QNAME = new QName("", "Displayname");
    private final static QName _UserEMail_QNAME = new QName("", "UserEMail");
    private final static QName _DateOfBirth_QNAME = new QName("", "DateOfBirth");
    private final static QName _HomePhone_QNAME = new QName("", "HomePhone");
    private final static QName _MobilePhone_QNAME = new QName("", "MobilePhone");
    private final static QName _OfficePhone_QNAME = new QName("", "OfficePhone");
    private final static QName _OfficeMobileNumber_QNAME = new QName("", "OfficeMobileNumber");
    private final static QName _PictureTagSmallURL_QNAME = new QName("", "PictureTagSmallURL");
    private final static QName _Street1_QNAME = new QName("", "Street1");
    private final static QName _Street2_QNAME = new QName("", "Street2");
    private final static QName _ZipCode_QNAME = new QName("", "ZipCode");
    private final static QName _City_QNAME = new QName("", "City");
    private final static QName _State_QNAME = new QName("", "State");
    private final static QName _Country_QNAME = new QName("", "Country");
    private final static QName _Exception_QNAME = new QName("", "exception");
    private final static QName _Code_QNAME = new QName("", "code");
    private final static QName _Detail_QNAME = new QName("", "detail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.orange.paddock.cee.consumer.richProfile.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPersonalRichProfileReturn }
     * 
     */
    public GetPersonalRichProfileReturn createGetPersonalRichProfileReturn() {
        return new GetPersonalRichProfileReturn();
    }

    /**
     * Create an instance of {@link Data }
     * 
     */
    public Data createData() {
        return new Data();
    }

    /**
     * Create an instance of {@link UserAuthorizedData }
     * 
     */
    public UserAuthorizedData createUserAuthorizedData() {
        return new UserAuthorizedData();
    }

    /**
     * Create an instance of {@link HomeAddress }
     * 
     */
    public HomeAddress createHomeAddress() {
        return new HomeAddress();
    }

    /**
     * Create an instance of {@link OfficeAddress }
     * 
     */
    public OfficeAddress createOfficeAddress() {
        return new OfficeAddress();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Gender")
    public JAXBElement<Short> createGender(Short value) {
        return new JAXBElement<Short>(_Gender_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Lastname")
    public JAXBElement<String> createLastname(String value) {
        return new JAXBElement<String>(_Lastname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Firstname")
    public JAXBElement<String> createFirstname(String value) {
        return new JAXBElement<String>(_Firstname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Displayname")
    public JAXBElement<String> createDisplayname(String value) {
        return new JAXBElement<String>(_Displayname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "UserEMail")
    public JAXBElement<String> createUserEMail(String value) {
        return new JAXBElement<String>(_UserEMail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DateOfBirth")
    public JAXBElement<String> createDateOfBirth(String value) {
        return new JAXBElement<String>(_DateOfBirth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "HomePhone")
    public JAXBElement<String> createHomePhone(String value) {
        return new JAXBElement<String>(_HomePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MobilePhone")
    public JAXBElement<String> createMobilePhone(String value) {
        return new JAXBElement<String>(_MobilePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OfficePhone")
    public JAXBElement<String> createOfficePhone(String value) {
        return new JAXBElement<String>(_OfficePhone_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "OfficeMobileNumber")
    public JAXBElement<String> createOfficeMobileNumber(String value) {
        return new JAXBElement<String>(_OfficeMobileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PictureTagSmallURL")
    public JAXBElement<String> createPictureTagSmallURL(String value) {
        return new JAXBElement<String>(_PictureTagSmallURL_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Street1")
    public JAXBElement<String> createStreet1(String value) {
        return new JAXBElement<String>(_Street1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Street2")
    public JAXBElement<String> createStreet2(String value) {
        return new JAXBElement<String>(_Street2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ZipCode")
    public JAXBElement<String> createZipCode(String value) {
        return new JAXBElement<String>(_ZipCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "State")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<String>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "exception")
    public JAXBElement<String> createException(String value) {
        return new JAXBElement<String>(_Exception_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "detail")
    public JAXBElement<String> createDetail(String value) {
        return new JAXBElement<String>(_Detail_QNAME, String.class, null, value);
    }

}
