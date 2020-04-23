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
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainOperationalIdentification" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}OperationalTrainNumberIdentifier"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ReferenceOTN" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}ResponsibleRU" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DelayEventReport"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransferPoint" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TransfereeIM" minOccurs="0"/>
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
    "trainOperationalIdentification",
    "operationalTrainNumberIdentifier",
    "referenceOTN",
    "responsibleRU",
    "delayEventReport",
    "transferPoint",
    "transfereeIM"
})
@XmlRootElement(name = "TrainDelayCauseMessage")
public class TrainDelayCauseMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "MessageStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String messageStatus;
    @XmlElement(name = "TrainOperationalIdentification")
    protected TrainOperationalIdentification trainOperationalIdentification;
    @XmlElement(name = "OperationalTrainNumberIdentifier", required = true)
    protected OperationalTrainNumberIdentifier operationalTrainNumberIdentifier;
    @XmlElement(name = "ReferenceOTN")
    protected ReferenceOTN referenceOTN;
    @XmlElement(name = "ResponsibleRU")
    protected Integer responsibleRU;
    @XmlElement(name = "DelayEventReport", required = true)
    protected DelayEventReport delayEventReport;
    @XmlElement(name = "TransferPoint")
    protected LocationIdent transferPoint;
    @XmlElement(name = "TransfereeIM")
    protected Integer transfereeIM;

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
     * Gets the value of the trainOperationalIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TrainOperationalIdentification }
     *     
     */
    public TrainOperationalIdentification getTrainOperationalIdentification() {
        return trainOperationalIdentification;
    }

    /**
     * Sets the value of the trainOperationalIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainOperationalIdentification }
     *     
     */
    public void setTrainOperationalIdentification(TrainOperationalIdentification value) {
        this.trainOperationalIdentification = value;
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
     * Gets the value of the responsibleRU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResponsibleRU() {
        return responsibleRU;
    }

    /**
     * Sets the value of the responsibleRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResponsibleRU(Integer value) {
        this.responsibleRU = value;
    }

    /**
     * Gets the value of the delayEventReport property.
     * 
     * @return
     *     possible object is
     *     {@link DelayEventReport }
     *     
     */
    public DelayEventReport getDelayEventReport() {
        return delayEventReport;
    }

    /**
     * Sets the value of the delayEventReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayEventReport }
     *     
     */
    public void setDelayEventReport(DelayEventReport value) {
        this.delayEventReport = value;
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

}
