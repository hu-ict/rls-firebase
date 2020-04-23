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
 *         &lt;element ref="{http://taf-jsg.info/schemes}NHM_Code"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}GrossWeight" minOccurs="0"/>
 *         &lt;element name="ContainerNumber" type="{http://taf-jsg.info/schemes}EquipmentNumberType" minOccurs="0"/>
 *         &lt;element name="GoodsInContainer" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}NHM_Code" minOccurs="0"/>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}GrossWeight" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "nhmCode",
    "grossWeight",
    "containerNumber",
    "goodsInContainer"
})
@XmlRootElement(name = "GoodsInWagon")
public class GoodsInWagon {

    @XmlElement(name = "NHM_Code", required = true)
    protected String nhmCode;
    @XmlElement(name = "GrossWeight")
    protected Integer grossWeight;
    @XmlElement(name = "ContainerNumber")
    protected String containerNumber;
    @XmlElement(name = "GoodsInContainer")
    protected List<GoodsInWagon.GoodsInContainer> goodsInContainer;

    /**
     * Gets the value of the nhmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNHMCode() {
        return nhmCode;
    }

    /**
     * Sets the value of the nhmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNHMCode(String value) {
        this.nhmCode = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGrossWeight(Integer value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the containerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerNumber() {
        return containerNumber;
    }

    /**
     * Sets the value of the containerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerNumber(String value) {
        this.containerNumber = value;
    }

    /**
     * Gets the value of the goodsInContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goodsInContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsInContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsInWagon.GoodsInContainer }
     * 
     * 
     */
    public List<GoodsInWagon.GoodsInContainer> getGoodsInContainer() {
        if (goodsInContainer == null) {
            goodsInContainer = new ArrayList<GoodsInWagon.GoodsInContainer>();
        }
        return this.goodsInContainer;
    }


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
     *         &lt;element ref="{http://taf-jsg.info/schemes}NHM_Code" minOccurs="0"/>
     *         &lt;element ref="{http://taf-jsg.info/schemes}GrossWeight" minOccurs="0"/>
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
        "nhmCode",
        "grossWeight"
    })
    public static class GoodsInContainer {

        @XmlElement(name = "NHM_Code")
        protected String nhmCode;
        @XmlElement(name = "GrossWeight")
        protected Integer grossWeight;

        /**
         * Gets the value of the nhmCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNHMCode() {
            return nhmCode;
        }

        /**
         * Sets the value of the nhmCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNHMCode(String value) {
            this.nhmCode = value;
        }

        /**
         * Gets the value of the grossWeight property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGrossWeight() {
            return grossWeight;
        }

        /**
         * Sets the value of the grossWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGrossWeight(Integer value) {
            this.grossWeight = value;
        }

    }

}
