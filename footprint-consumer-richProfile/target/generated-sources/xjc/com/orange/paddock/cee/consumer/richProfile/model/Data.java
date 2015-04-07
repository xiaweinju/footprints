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
 *         &lt;element ref="{}UserAuthorizedData" minOccurs="0"/&gt;
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
    "userAuthorizedData"
})
@XmlRootElement(name = "Data")
public class Data {

    @XmlElement(name = "UserAuthorizedData")
    protected UserAuthorizedData userAuthorizedData;

    /**
     * Obtient la valeur de la propriété userAuthorizedData.
     * 
     * @return
     *     possible object is
     *     {@link UserAuthorizedData }
     *     
     */
    public UserAuthorizedData getUserAuthorizedData() {
        return userAuthorizedData;
    }

    /**
     * Définit la valeur de la propriété userAuthorizedData.
     * 
     * @param value
     *     allowed object is
     *     {@link UserAuthorizedData }
     *     
     */
    public void setUserAuthorizedData(UserAuthorizedData value) {
        this.userAuthorizedData = value;
    }

}
