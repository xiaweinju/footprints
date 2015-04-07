//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.01.13 à 04:28:44 PM CET 
//


package com.orange.paddock.cee.consumer.richProfile.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Gender" minOccurs="0"/&gt;
 *         &lt;element ref="{}Lastname" minOccurs="0"/&gt;
 *         &lt;element ref="{}Firstname" minOccurs="0"/&gt;
 *         &lt;element ref="{}Displayname" minOccurs="0"/&gt;
 *         &lt;element ref="{}UserEMail" minOccurs="0"/&gt;
 *         &lt;element ref="{}DateOfBirth" minOccurs="0"/&gt;
 *         &lt;element ref="{}HomePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{}MobilePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{}OfficePhone" minOccurs="0"/&gt;
 *         &lt;element ref="{}OfficeMobileNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{}PictureTagSmallURL" minOccurs="0"/&gt;
 *         &lt;element ref="{}HomeAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{}OfficeAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gender",
    "lastname",
    "firstname",
    "displayname",
    "userEMail",
    "dateOfBirth",
    "homePhone",
    "mobilePhone",
    "officePhone",
    "officeMobileNumber",
    "pictureTagSmallURL",
    "homeAddress",
    "officeAddress"
})
@XmlRootElement(name = "UserAuthorizedData")
public class UserAuthorizedData {

    @XmlElement(name = "Gender")
    protected Short gender;
    @XmlElement(name = "Lastname")
    protected String lastname;
    @XmlElement(name = "Firstname")
    protected String firstname;
    @XmlElement(name = "Displayname")
    protected String displayname;
    @XmlElement(name = "UserEMail")
    protected String userEMail;
    @XmlElement(name = "DateOfBirth")
    protected String dateOfBirth;
    @XmlElement(name = "HomePhone")
    protected String homePhone;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "OfficePhone")
    protected String officePhone;
    @XmlElement(name = "OfficeMobileNumber")
    protected String officeMobileNumber;
    @XmlElement(name = "PictureTagSmallURL")
    protected String pictureTagSmallURL;
    @XmlElement(name = "HomeAddress")
    protected HomeAddress homeAddress;
    @XmlElement(name = "OfficeAddress")
    protected OfficeAddress officeAddress;

    /**
     * Obtient la valeur de la propriété gender.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getGender() {
        return gender;
    }

    /**
     * Définit la valeur de la propriété gender.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setGender(Short value) {
        this.gender = value;
    }

    /**
     * Obtient la valeur de la propriété lastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Définit la valeur de la propriété lastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Obtient la valeur de la propriété firstname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Définit la valeur de la propriété firstname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Obtient la valeur de la propriété displayname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * Définit la valeur de la propriété displayname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayname(String value) {
        this.displayname = value;
    }

    /**
     * Obtient la valeur de la propriété userEMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEMail() {
        return userEMail;
    }

    /**
     * Définit la valeur de la propriété userEMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEMail(String value) {
        this.userEMail = value;
    }

    /**
     * Obtient la valeur de la propriété dateOfBirth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Définit la valeur de la propriété dateOfBirth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Obtient la valeur de la propriété homePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Définit la valeur de la propriété homePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Obtient la valeur de la propriété mobilePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Définit la valeur de la propriété mobilePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Obtient la valeur de la propriété officePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Définit la valeur de la propriété officePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Obtient la valeur de la propriété officeMobileNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeMobileNumber() {
        return officeMobileNumber;
    }

    /**
     * Définit la valeur de la propriété officeMobileNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeMobileNumber(String value) {
        this.officeMobileNumber = value;
    }

    /**
     * Obtient la valeur de la propriété pictureTagSmallURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureTagSmallURL() {
        return pictureTagSmallURL;
    }

    /**
     * Définit la valeur de la propriété pictureTagSmallURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureTagSmallURL(String value) {
        this.pictureTagSmallURL = value;
    }

    /**
     * Obtient la valeur de la propriété homeAddress.
     * 
     * @return
     *     possible object is
     *     {@link HomeAddress }
     *     
     */
    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    /**
     * Définit la valeur de la propriété homeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link HomeAddress }
     *     
     */
    public void setHomeAddress(HomeAddress value) {
        this.homeAddress = value;
    }

    /**
     * Obtient la valeur de la propriété officeAddress.
     * 
     * @return
     *     possible object is
     *     {@link OfficeAddress }
     *     
     */
    public OfficeAddress getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Définit la valeur de la propriété officeAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficeAddress }
     *     
     */
    public void setOfficeAddress(OfficeAddress value) {
        this.officeAddress = value;
    }

}
