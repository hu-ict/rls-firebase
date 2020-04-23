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
 *         &lt;element ref="{http://taf-jsg.info/schemes}AdministrativeContactInformation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}Identifiers" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}MessageStatus"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfRUHarmonization" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfIMHarmonization" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}CoordinatingIM" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}LeadRU" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfRequest"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TypeOfInformation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}TrainInformation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}PathInformation"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}NetworkSpecificParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}FreeTextField" maxOccurs="unbounded" minOccurs="0"/>
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
    "administrativeContactInformation",
    "identifiers",
    "messageStatus",
    "typeOfRUHarmonization",
    "typeOfIMHarmonization",
    "coordinatingIM",
    "leadRU",
    "typeOfRequest",
    "typeOfInformation",
    "trainInformation",
    "pathInformation",
    "networkSpecificParameter",
    "freeTextField"
})
@XmlRootElement(name = "PathRequestMessage")
public class PathRequestMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "AdministrativeContactInformation", required = true)
    protected AdministrativeContactInformation administrativeContactInformation;
    @XmlElement(name = "Identifiers")
    protected Identifiers identifiers;
    @XmlElement(name = "MessageStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String messageStatus;
    @XmlElement(name = "TypeOfRUHarmonization")
    protected TypeOfRUHarmonizationCode typeOfRUHarmonization;
    @XmlElement(name = "TypeOfIMHarmonization")
    protected TypeOfIMHarmonizationCode typeOfIMHarmonization;
    @XmlElement(name = "CoordinatingIM")
    protected Integer coordinatingIM;
    @XmlElement(name = "LeadRU")
    protected Integer leadRU;
    @XmlElement(name = "TypeOfRequest")
    protected short typeOfRequest;
    @XmlElement(name = "TypeOfInformation")
    protected int typeOfInformation;
    @XmlElement(name = "TrainInformation", required = true)
    protected TrainInformation trainInformation;
    @XmlElement(name = "PathInformation", required = true)
    protected PathInformation pathInformation;
    @XmlElement(name = "NetworkSpecificParameter")
    protected List<NetworkSpecificParameter> networkSpecificParameter;
    @XmlElement(name = "FreeTextField")
    protected List<String> freeTextField;

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
     * Gets the value of the administrativeContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeContactInformation }
     *     
     */
    public AdministrativeContactInformation getAdministrativeContactInformation() {
        return administrativeContactInformation;
    }

    /**
     * Sets the value of the administrativeContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeContactInformation }
     *     
     */
    public void setAdministrativeContactInformation(AdministrativeContactInformation value) {
        this.administrativeContactInformation = value;
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
     * Gets the value of the typeOfRUHarmonization property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfRUHarmonizationCode }
     *     
     */
    public TypeOfRUHarmonizationCode getTypeOfRUHarmonization() {
        return typeOfRUHarmonization;
    }

    /**
     * Sets the value of the typeOfRUHarmonization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfRUHarmonizationCode }
     *     
     */
    public void setTypeOfRUHarmonization(TypeOfRUHarmonizationCode value) {
        this.typeOfRUHarmonization = value;
    }

    /**
     * Gets the value of the typeOfIMHarmonization property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfIMHarmonizationCode }
     *     
     */
    public TypeOfIMHarmonizationCode getTypeOfIMHarmonization() {
        return typeOfIMHarmonization;
    }

    /**
     * Sets the value of the typeOfIMHarmonization property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfIMHarmonizationCode }
     *     
     */
    public void setTypeOfIMHarmonization(TypeOfIMHarmonizationCode value) {
        this.typeOfIMHarmonization = value;
    }

    /**
     * Proposal from the RU, IM's will decide who will
     * 							take the role.
     * 						
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoordinatingIM() {
        return coordinatingIM;
    }

    /**
     * Sets the value of the coordinatingIM property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoordinatingIM(Integer value) {
        this.coordinatingIM = value;
    }

    /**
     * Gets the value of the leadRU property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLeadRU() {
        return leadRU;
    }

    /**
     * Sets the value of the leadRU property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLeadRU(Integer value) {
        this.leadRU = value;
    }

    /**
     *  1 Path study
     * 							2 Path request
     * 							3 Path Modification
     * 						
     * 
     */
    public short getTypeOfRequest() {
        return typeOfRequest;
    }

    /**
     * Sets the value of the typeOfRequest property.
     * 
     */
    public void setTypeOfRequest(short value) {
        this.typeOfRequest = value;
    }

    /**
     * Gets the value of the typeOfInformation property.
     * 
     */
    public int getTypeOfInformation() {
        return typeOfInformation;
    }

    /**
     * Sets the value of the typeOfInformation property.
     * 
     */
    public void setTypeOfInformation(int value) {
        this.typeOfInformation = value;
    }

    /**
     * Train Information provided by the RUs as an
     * 							overview for the whole train journey from origin to destination
     * 						
     * 
     * @return
     *     possible object is
     *     {@link TrainInformation }
     *     
     */
    public TrainInformation getTrainInformation() {
        return trainInformation;
    }

    /**
     * Sets the value of the trainInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainInformation }
     *     
     */
    public void setTrainInformation(TrainInformation value) {
        this.trainInformation = value;
    }

    /**
     * Information provided by the RU for a requested
     * 							journey section or by the IM for an offered/booked of the Path
     * 							section
     * 						
     * 
     * @return
     *     possible object is
     *     {@link PathInformation }
     *     
     */
    public PathInformation getPathInformation() {
        return pathInformation;
    }

    /**
     * Sets the value of the pathInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathInformation }
     *     
     */
    public void setPathInformation(PathInformation value) {
        this.pathInformation = value;
    }

    /**
     * A structured section for specific mandatory
     * 							attributes for that network. This has to be checked by the
     * 							applications that network section is contained in journy location
     * 							only if journy location belongs to PathInformation element
     * 						Gets the value of the networkSpecificParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkSpecificParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkSpecificParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkSpecificParameter }
     * 
     * 
     */
    public List<NetworkSpecificParameter> getNetworkSpecificParameter() {
        if (networkSpecificParameter == null) {
            networkSpecificParameter = new ArrayList<NetworkSpecificParameter>();
        }
        return this.networkSpecificParameter;
    }

    /**
     * Gets the value of the freeTextField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeTextField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeTextField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreeTextField() {
        if (freeTextField == null) {
            freeTextField = new ArrayList<String>();
        }
        return this.freeTextField;
    }

}
