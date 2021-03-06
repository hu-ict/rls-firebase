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
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageHeader"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RelatedReference"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}WagonNumberFreight"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RefusalAtInterchange"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}CauseType"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}CauseDescription" minOccurs="0"/>
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
    "messageHeader",
    "relatedReference",
    "wagonNumberFreight",
    "refusalAtInterchange",
    "causeType",
    "causeDescription"
})
@XmlRootElement(name = "WagonRefusedAtInterchangeMessage")
public class WagonRefusedAtInterchangeMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "RelatedReference", required = true)
    protected RelatedReference relatedReference;
    @XmlElement(name = "WagonNumberFreight", required = true)
    protected String wagonNumberFreight;
    @XmlElement(name = "RefusalAtInterchange", required = true)
    protected RefusalAtInterchange refusalAtInterchange;
    @XmlElement(name = "CauseType")
    protected int causeType;
    @XmlElement(name = "CauseDescription")
    protected String causeDescription;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader }
     *     
     */
    public MessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader }
     *     
     */
    public void setMessageHeader(MessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the relatedReference property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedReference }
     *     
     */
    public RelatedReference getRelatedReference() {
        return relatedReference;
    }

    /**
     * Sets the value of the relatedReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedReference }
     *     
     */
    public void setRelatedReference(RelatedReference value) {
        this.relatedReference = value;
    }

    /**
     * Gets the value of the wagonNumberFreight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWagonNumberFreight() {
        return wagonNumberFreight;
    }

    /**
     * Sets the value of the wagonNumberFreight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWagonNumberFreight(String value) {
        this.wagonNumberFreight = value;
    }

    /**
     * Gets the value of the refusalAtInterchange property.
     * 
     * @return
     *     possible object is
     *     {@link RefusalAtInterchange }
     *     
     */
    public RefusalAtInterchange getRefusalAtInterchange() {
        return refusalAtInterchange;
    }

    /**
     * Sets the value of the refusalAtInterchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefusalAtInterchange }
     *     
     */
    public void setRefusalAtInterchange(RefusalAtInterchange value) {
        this.refusalAtInterchange = value;
    }

    /**
     * Gets the value of the causeType property.
     * 
     */
    public int getCauseType() {
        return causeType;
    }

    /**
     * Sets the value of the causeType property.
     * 
     */
    public void setCauseType(int value) {
        this.causeType = value;
    }

    /**
     * Gets the value of the causeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseDescription() {
        return causeDescription;
    }

    /**
     * Sets the value of the causeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseDescription(String value) {
        this.causeDescription = value;
    }

}
