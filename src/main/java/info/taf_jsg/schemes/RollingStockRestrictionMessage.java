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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransportOperationalIdentifiers" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}OperationalTrainNumberIdentifier"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ReferenceOTN" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransfereeIM" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransferPoint" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}LocationOfRestrictionDetection" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}RollingStockIdentification"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TechnicalPassengerRollingStockRestriction"/>
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
    "messageStatus",
    "transportOperationalIdentifiers",
    "operationalTrainNumberIdentifier",
    "referenceOTN",
    "transfereeIM",
    "transferPoint",
    "locationOfRestrictionDetection",
    "rollingStockIdentification",
    "technicalPassengerRollingStockRestriction"
})
@XmlRootElement(name = "RollingStockRestrictionMessage")
public class RollingStockRestrictionMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "MessageStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String messageStatus;
    @XmlElement(name = "TransportOperationalIdentifiers")
    protected List<TransportOperationalIdentifiers> transportOperationalIdentifiers;
    @XmlElement(name = "OperationalTrainNumberIdentifier", required = true)
    protected OperationalTrainNumberIdentifier operationalTrainNumberIdentifier;
    @XmlElement(name = "ReferenceOTN")
    protected ReferenceOTN referenceOTN;
    @XmlElement(name = "TransfereeIM")
    protected Integer transfereeIM;
    @XmlElement(name = "TransferPoint")
    protected LocationIdent transferPoint;
    @XmlElement(name = "LocationOfRestrictionDetection")
    protected LocationOfRestrictionDetection locationOfRestrictionDetection;
    @XmlElement(name = "RollingStockIdentification", required = true)
    protected RollingStockIdentification rollingStockIdentification;
    @XmlElement(name = "TechnicalPassengerRollingStockRestriction", required = true)
    protected TechnicalPassengerRollingStockRestriction technicalPassengerRollingStockRestriction;

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
     * Gets the value of the messageStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * Sets the value of the messageStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

    /**
     * Gets the value of the transportOperationalIdentifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportOperationalIdentifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportOperationalIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportOperationalIdentifiers }
     * 
     * 
     */
    public List<TransportOperationalIdentifiers> getTransportOperationalIdentifiers() {
        if (transportOperationalIdentifiers == null) {
            transportOperationalIdentifiers = new ArrayList<TransportOperationalIdentifiers>();
        }
        return this.transportOperationalIdentifiers;
    }

    /**
     * Gets the value of the operationalTrainNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalTrainNumberIdentifier }
     *     
     */
    public OperationalTrainNumberIdentifier getOperationalTrainNumberIdentifier() {
        return operationalTrainNumberIdentifier;
    }

    /**
     * Sets the value of the operationalTrainNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalTrainNumberIdentifier }
     *     
     */
    public void setOperationalTrainNumberIdentifier(OperationalTrainNumberIdentifier value) {
        this.operationalTrainNumberIdentifier = value;
    }

    /**
     * Gets the value of the referenceOTN property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceOTN }
     *     
     */
    public ReferenceOTN getReferenceOTN() {
        return referenceOTN;
    }

    /**
     * Sets the value of the referenceOTN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceOTN }
     *     
     */
    public void setReferenceOTN(ReferenceOTN value) {
        this.referenceOTN = value;
    }

    /**
     * Gets the value of the transfereeIM property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTransfereeIM() {
        return transfereeIM;
    }

    /**
     * Sets the value of the transfereeIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTransfereeIM(Integer value) {
        this.transfereeIM = value;
    }

    /**
     * Gets the value of the transferPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdent }
     *     
     */
    public LocationIdent getTransferPoint() {
        return transferPoint;
    }

    /**
     * Sets the value of the transferPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdent }
     *     
     */
    public void setTransferPoint(LocationIdent value) {
        this.transferPoint = value;
    }

    /**
     * Gets the value of the locationOfRestrictionDetection property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOfRestrictionDetection }
     *     
     */
    public LocationOfRestrictionDetection getLocationOfRestrictionDetection() {
        return locationOfRestrictionDetection;
    }

    /**
     * Sets the value of the locationOfRestrictionDetection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOfRestrictionDetection }
     *     
     */
    public void setLocationOfRestrictionDetection(LocationOfRestrictionDetection value) {
        this.locationOfRestrictionDetection = value;
    }

    /**
     * Gets the value of the rollingStockIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link RollingStockIdentification }
     *     
     */
    public RollingStockIdentification getRollingStockIdentification() {
        return rollingStockIdentification;
    }

    /**
     * Sets the value of the rollingStockIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link RollingStockIdentification }
     *     
     */
    public void setRollingStockIdentification(RollingStockIdentification value) {
        this.rollingStockIdentification = value;
    }

    /**
     * Gets the value of the technicalPassengerRollingStockRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalPassengerRollingStockRestriction }
     *     
     */
    public TechnicalPassengerRollingStockRestriction getTechnicalPassengerRollingStockRestriction() {
        return technicalPassengerRollingStockRestriction;
    }

    /**
     * Sets the value of the technicalPassengerRollingStockRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalPassengerRollingStockRestriction }
     *     
     */
    public void setTechnicalPassengerRollingStockRestriction(TechnicalPassengerRollingStockRestriction value) {
        this.technicalPassengerRollingStockRestriction = value;
    }

}
