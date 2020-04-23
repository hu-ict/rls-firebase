//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="Timing" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Time">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
 *                           &lt;attribute ref="{http://taf-jsg.info/schemes}TimingQualifierCode"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}Offset"/>
 *                   &lt;element ref="{http://taf-jsg.info/schemes}BookedLocationDateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://taf-jsg.info/schemes}DwellTime" minOccurs="0"/>
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
    "timing",
    "dwellTime"
})
@XmlRootElement(name = "TimingAtLocation")
public class TimingAtLocation {

    @XmlElement(name = "Timing")
    protected List<TimingAtLocation.Timing> timing;
    @XmlElement(name = "DwellTime")
    protected BigDecimal dwellTime;

    /**
     * Gets the value of the timing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiming().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimingAtLocation.Timing }
     * 
     * 
     */
    public List<TimingAtLocation.Timing> getTiming() {
        if (timing == null) {
            timing = new ArrayList<TimingAtLocation.Timing>();
        }
        return this.timing;
    }

    /**
     * Gets the value of the dwellTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDwellTime() {
        return dwellTime;
    }

    /**
     * Sets the value of the dwellTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDwellTime(BigDecimal value) {
        this.dwellTime = value;
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
     *         &lt;element name="Time">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
     *                 &lt;attribute ref="{http://taf-jsg.info/schemes}TimingQualifierCode"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://taf-jsg.info/schemes}Offset"/>
     *         &lt;element ref="{http://taf-jsg.info/schemes}BookedLocationDateTime" minOccurs="0"/>
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
        "time",
        "offset",
        "bookedLocationDateTime"
    })
    public static class Timing {

        @XmlElement(name = "Time", required = true)
        protected TimingAtLocation.Timing.Time time;
        @XmlElement(name = "Offset", required = true)
        protected BigInteger offset;
        @XmlElement(name = "BookedLocationDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar bookedLocationDateTime;

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link TimingAtLocation.Timing.Time }
         *     
         */
        public TimingAtLocation.Timing.Time getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimingAtLocation.Timing.Time }
         *     
         */
        public void setTime(TimingAtLocation.Timing.Time value) {
            this.time = value;
        }

        /**
         * in days
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOffset() {
            return offset;
        }

        /**
         * Sets the value of the offset property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOffset(BigInteger value) {
            this.offset = value;
        }

        /**
         * Gets the value of the bookedLocationDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBookedLocationDateTime() {
            return bookedLocationDateTime;
        }

        /**
         * Sets the value of the bookedLocationDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBookedLocationDateTime(XMLGregorianCalendar value) {
            this.bookedLocationDateTime = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>time">
         *       &lt;attribute ref="{http://taf-jsg.info/schemes}TimingQualifierCode"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Time {

            @XmlValue
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "TimingQualifierCode", namespace = "http://taf-jsg.info/schemes")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String timingQualifierCode;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * Gets the value of the timingQualifierCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimingQualifierCode() {
                return timingQualifierCode;
            }

            /**
             * Sets the value of the timingQualifierCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimingQualifierCode(String value) {
                this.timingQualifierCode = value;
            }

        }

    }

}
