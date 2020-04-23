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
 *         &lt;element ref="{http://taf-jsg.info/schemes}Location"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RefusalTimeAtInterchange"/>
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
    "location",
    "refusalTimeAtInterchange"
})
@XmlRootElement(name = "RefusalAtInterchange")
public class RefusalAtInterchange {

    @XmlElement(name = "Location", required = true)
    protected LocationIdent location;
    @XmlElement(name = "RefusalTimeAtInterchange", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refusalTimeAtInterchange;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setLocation(LocationIdent value) {
        this.location = value;
    }

    /**
     * Gets the value of the refusalTimeAtInterchange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefusalTimeAtInterchange() {
        return refusalTimeAtInterchange;
    }

    /**
     * Sets the value of the refusalTimeAtInterchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefusalTimeAtInterchange(XMLGregorianCalendar value) {
        this.refusalTimeAtInterchange = value;
    }

}
