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
 *         &lt;element ref="{http://taf-jsg.info/schemes}ITU_Details"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}Goods" maxOccurs="99"/>
 *         &lt;element ref="{http://taf-jsg.info/schemes}SummaryOFGoodsWithSameRID" maxOccurs="25" minOccurs="0"/>
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
    "ituDetails",
    "goods",
    "summaryOFGoodsWithSameRID"
})
@XmlRootElement(name = "ITU")
public class ITU {

    @XmlElement(name = "ITU_Details", required = true)
    protected ITUDetails ituDetails;
    @XmlElement(name = "Goods", required = true)
    protected List<Goods> goods;
    @XmlElement(name = "SummaryOFGoodsWithSameRID")
    protected List<SummaryOFGoodsWithSameRID> summaryOFGoodsWithSameRID;

    /**
     * Details for Intermodal Transport Unit on wagon
     * 						
     * 
     * @return
     *     possible object is
     *     {@link ITUDetails }
     *     
     */
    public ITUDetails getITUDetails() {
        return ituDetails;
    }

    /**
     * Sets the value of the ituDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ITUDetails }
     *     
     */
    public void setITUDetails(ITUDetails value) {
        this.ituDetails = value;
    }

    /**
     * Gets the value of the goods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the goods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Goods }
     * 
     * 
     */
    public List<Goods> getGoods() {
        if (goods == null) {
            goods = new ArrayList<Goods>();
        }
        return this.goods;
    }

    /**
     * Gets the value of the summaryOFGoodsWithSameRID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryOFGoodsWithSameRID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryOFGoodsWithSameRID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryOFGoodsWithSameRID }
     * 
     * 
     */
    public List<SummaryOFGoodsWithSameRID> getSummaryOFGoodsWithSameRID() {
        if (summaryOFGoodsWithSameRID == null) {
            summaryOFGoodsWithSameRID = new ArrayList<SummaryOFGoodsWithSameRID>();
        }
        return this.summaryOFGoodsWithSameRID;
    }

}
