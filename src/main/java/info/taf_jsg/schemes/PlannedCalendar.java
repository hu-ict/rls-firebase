//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BitmapDays" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="730"/>
 *               &lt;whiteSpace value="collapse"/>
 *               &lt;pattern value="[0-1]{1,730}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ValidityPeriod"/>
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
    "bitmapDays",
    "validityPeriod"
})
@XmlRootElement(name = "PlannedCalendar")
public class PlannedCalendar {

    @XmlElement(name = "BitmapDays")
    protected String bitmapDays;
    @XmlElement(name = "ValidityPeriod", required = true)
    protected ValidityPeriod validityPeriod;

    /**
     * Gets the value of the bitmapDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitmapDays() {
        return bitmapDays;
    }

    /**
     * Sets the value of the bitmapDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitmapDays(String value) {
        this.bitmapDays = value;
    }

    /**
     * Gets the value of the validityPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriod }
     *     
     */
    public ValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets the value of the validityPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriod }
     *     
     */
    public void setValidityPeriod(ValidityPeriod value) {
        this.validityPeriod = value;
    }

}
