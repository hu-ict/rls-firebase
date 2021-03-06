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
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageType"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageTypeVersion"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageIdentifier"/>
 *         &lt;element name="MessageDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "messageType",
    "messageTypeVersion",
    "messageIdentifier",
    "messageDateTime"
})
@XmlRootElement(name = "MessageReference")
public class MessageReference {

    @XmlElement(name = "MessageType")
    protected int messageType;
    @XmlElement(name = "MessageTypeVersion", required = true)
    protected String messageTypeVersion;
    @XmlElement(name = "MessageIdentifier", required = true)
    protected String messageIdentifier;
    @XmlElement(name = "MessageDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageDateTime;

    /**
     * Gets the value of the messageType property.
     * 
     */
    public int getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     */
    public void setMessageType(int value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the messageTypeVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTypeVersion() {
        return messageTypeVersion;
    }

    /**
     * Sets the value of the messageTypeVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTypeVersion(String value) {
        this.messageTypeVersion = value;
    }

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageIdentifier(String value) {
        this.messageIdentifier = value;
    }

    /**
     * Gets the value of the messageDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageDateTime() {
        return messageDateTime;
    }

    /**
     * Sets the value of the messageDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageDateTime(XMLGregorianCalendar value) {
        this.messageDateTime = value;
    }

}
