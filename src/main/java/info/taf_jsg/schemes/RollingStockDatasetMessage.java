//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://taf-jsg.info/schemes}RollingStockDataset" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RefusedWagonNumbers" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}WagonNumberFreight"/>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}RefusalCode"/>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}KeeperShortNameVKM" minOccurs="0"/>
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
    "messageHeader",
    "rollingStockDataset",
    "refusedWagonNumbers"
})
@XmlRootElement(name = "RollingStockDatasetMessage")
public class RollingStockDatasetMessage {

    @XmlElement(name = "MessageHeader", required = true)
    protected MessageHeader messageHeader;
    @XmlElement(name = "RollingStockDataset")
    protected List<RollingStockDataset> rollingStockDataset;
    @XmlElement(name = "RefusedWagonNumbers")
    protected List<RollingStockDatasetMessage.RefusedWagonNumbers> refusedWagonNumbers;

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
     * Gets the value of the rollingStockDataset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rollingStockDataset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRollingStockDataset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RollingStockDataset }
     * 
     * 
     */
    public List<RollingStockDataset> getRollingStockDataset() {
        if (rollingStockDataset == null) {
            rollingStockDataset = new ArrayList<RollingStockDataset>();
        }
        return this.rollingStockDataset;
    }

    /**
     * Gets the value of the refusedWagonNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refusedWagonNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefusedWagonNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RollingStockDatasetMessage.RefusedWagonNumbers }
     * 
     * 
     */
    public List<RollingStockDatasetMessage.RefusedWagonNumbers> getRefusedWagonNumbers() {
        if (refusedWagonNumbers == null) {
            refusedWagonNumbers = new ArrayList<RollingStockDatasetMessage.RefusedWagonNumbers>();
        }
        return this.refusedWagonNumbers;
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
     *         &lt;element ref="{http://taf-jsg.info/schemes}WagonNumberFreight"/>
     *         &lt;element ref="{http://taf-jsg.info/schemes}RefusalCode"/>
     *         &lt;element ref="{http://taf-jsg.info/schemes}KeeperShortNameVKM" minOccurs="0"/>
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
        "wagonNumberFreight",
        "refusalCode",
        "keeperShortNameVKM"
    })
    public static class RefusedWagonNumbers {

        @XmlElement(name = "WagonNumberFreight", required = true)
        protected String wagonNumberFreight;
        @XmlElement(name = "RefusalCode", required = true)
        protected BigInteger refusalCode;
        @XmlElement(name = "KeeperShortNameVKM")
        protected String keeperShortNameVKM;

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
         * Gets the value of the refusalCode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRefusalCode() {
            return refusalCode;
        }

        /**
         * Sets the value of the refusalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRefusalCode(BigInteger value) {
            this.refusalCode = value;
        }

        /**
         * Gets the value of the keeperShortNameVKM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeeperShortNameVKM() {
            return keeperShortNameVKM;
        }

        /**
         * Sets the value of the keeperShortNameVKM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeeperShortNameVKM(String value) {
            this.keeperShortNameVKM = value;
        }

    }

}
