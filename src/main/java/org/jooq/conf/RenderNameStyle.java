//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.30 at 04:05:20 PM CEST 
//


package org.jooq.conf;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderNameStyle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RenderNameStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QUOTED"/>
 *     &lt;enumeration value="AS_IS"/>
 *     &lt;enumeration value="LOWER"/>
 *     &lt;enumeration value="UPPER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RenderNameStyle")
@XmlEnum
public enum RenderNameStyle {

    QUOTED,
    AS_IS,
    LOWER,
    UPPER;

    public String value() {
        return name();
    }

    public static RenderNameStyle fromValue(String v) {
        return valueOf(v);
    }

}