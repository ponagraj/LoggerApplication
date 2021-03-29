//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 09:43:16 AM IST 
//


package com.dnb.etl.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="websiteName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="activityTypeCode" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="loggedInTime" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="number_of_views" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userName",
    "websiteName",
    "activityTypeCode",
    "loggedInTime",
    "numberOfViews"
})
@XmlRootElement(name = "activity")
public class Activity {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String websiteName;
    @XmlElement(required = true)
    protected BigInteger activityTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar loggedInTime;
    @XmlElement(name = "number_of_views", required = true)
    protected BigInteger numberOfViews;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the websiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebsiteName() {
        return websiteName;
    }

    /**
     * Sets the value of the websiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebsiteName(String value) {
        this.websiteName = value;
    }

    /**
     * Gets the value of the activityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getActivityTypeCode() {
        return activityTypeCode;
    }

    /**
     * Sets the value of the activityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setActivityTypeCode(BigInteger value) {
        this.activityTypeCode = value;
    }

    /**
     * Gets the value of the loggedInTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLoggedInTime() {
        return loggedInTime;
    }

    /**
     * Sets the value of the loggedInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLoggedInTime(XMLGregorianCalendar value) {
        this.loggedInTime = value;
    }

    /**
     * Gets the value of the numberOfViews property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfViews() {
        return numberOfViews;
    }

    /**
     * Sets the value of the numberOfViews property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfViews(BigInteger value) {
        this.numberOfViews = value;
    }

}
