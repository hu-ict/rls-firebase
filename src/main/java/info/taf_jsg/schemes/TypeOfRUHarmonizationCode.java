//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.22 at 09:30:01 PM CEST 
//


package info.taf_jsg.schemes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfRUHarmonizationCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfRUHarmonizationCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Full"/>
 *     &lt;enumeration value="Part"/>
 *     &lt;enumeration value="None"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeOfRUHarmonizationCode")
@XmlEnum
public enum TypeOfRUHarmonizationCode {

    @XmlEnumValue("Full")
    FULL("Full"),
    @XmlEnumValue("Part")
    PART("Part"),
    @XmlEnumValue("None")
    NONE("None");
    private final String value;

    TypeOfRUHarmonizationCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfRUHarmonizationCode fromValue(String v) {
        for (TypeOfRUHarmonizationCode c: TypeOfRUHarmonizationCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
