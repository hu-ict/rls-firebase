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
 *         &lt;element ref="{http://taf-jsg.info/schemes}TractionDetails" maxOccurs="24" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}BrakeWeight" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}HandBrake" minOccurs="0"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}NumberOfAxles" minOccurs="0"/>
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
    "tractionDetails",
    "brakeWeight",
    "handBrake",
    "numberOfAxles"
})
@XmlRootElement(name = "Traction")
public class Traction {

    @XmlElement(name = "TractionDetails")
    protected List<TractionDetails> tractionDetails;
    @XmlElement(name = "BrakeWeight")
    protected Integer brakeWeight;
    @XmlElement(name = "HandBrake")
    protected HandBrake handBrake;
    @XmlElement(name = "NumberOfAxles")
    protected Integer numberOfAxles;

    /**
     * Gets the value of the tractionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tractionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTractionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TractionDetails }
     * 
     * 
     */
    public List<TractionDetails> getTractionDetails() {
        if (tractionDetails == null) {
            tractionDetails = new ArrayList<TractionDetails>();
        }
        return this.tractionDetails;
    }

    /**
     * Gets the value of the brakeWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBrakeWeight() {
        return brakeWeight;
    }

    /**
     * Sets the value of the brakeWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBrakeWeight(Integer value) {
        this.brakeWeight = value;
    }

    /**
     * Gets the value of the handBrake property.
     * 
     * @return
     *     possible object is
     *     {@link HandBrake }
     *     
     */
    public HandBrake getHandBrake() {
        return handBrake;
    }

    /**
     * Sets the value of the handBrake property.
     * 
     * @param value
     *     allowed object is
     *     {@link HandBrake }
     *     
     */
    public void setHandBrake(HandBrake value) {
        this.handBrake = value;
    }

    /**
     * Gets the value of the numberOfAxles property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfAxles() {
        return numberOfAxles;
    }

    /**
     * Sets the value of the numberOfAxles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfAxles(Integer value) {
        this.numberOfAxles = value;
    }

}
