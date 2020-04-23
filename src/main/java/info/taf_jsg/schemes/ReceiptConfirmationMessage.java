//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://taf-jsg.info/schemes}Identifiers" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfRequest" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfInformation" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}AffectedSection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RelatedReference"/>
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
    "identifiers",
    "typeOfRequest",
    "typeOfInformation",
    "affectedSection",
    "relatedReference"
})
@XmlRootElement(name = "ReceiptConfirmationMessage")
public class ReceiptConfirmationMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "Identifiers")
    protected Identifiers identifiers;
    @XmlElement(name = "TypeOfRequest")
    protected Short typeOfRequest;
    @XmlElement(name = "TypeOfInformation")
    protected Integer typeOfInformation;
    @XmlElement(name = "AffectedSection")
    protected List<AffectedSection> affectedSection;
    @XmlElement(name = "RelatedReference", required = true)
    protected RelatedReference relatedReference;

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
     * Gets the value of the identifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Identifiers }
     *     
     */
    public Identifiers getIdentifiers() {
        return identifiers;
    }

    /**
     * Sets the value of the identifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifiers }
     *     
     */
    public void setIdentifiers(Identifiers value) {
        this.identifiers = value;
    }

    /**
     * Gets the value of the typeOfRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTypeOfRequest() {
        return typeOfRequest;
    }

    /**
     * Sets the value of the typeOfRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTypeOfRequest(Short value) {
        this.typeOfRequest = value;
    }

    /**
     * Gets the value of the typeOfInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTypeOfInformation() {
        return typeOfInformation;
    }

    /**
     * Sets the value of the typeOfInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTypeOfInformation(Integer value) {
        this.typeOfInformation = value;
    }

    /**
     * Gets the value of the affectedSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affectedSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffectedSection }
     * 
     * 
     */
    public List<AffectedSection> getAffectedSection() {
        if (affectedSection == null) {
            affectedSection = new ArrayList<AffectedSection>();
        }
        return this.affectedSection;
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

}
