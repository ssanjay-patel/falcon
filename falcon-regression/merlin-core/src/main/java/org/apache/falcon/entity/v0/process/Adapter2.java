//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 10:55:57 AM PDT 
//


package org.apache.falcon.entity.v0.process;

import java.util.TimeZone;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, TimeZone>
{


    public TimeZone unmarshal(String value) {
        return (java.util.TimeZone.getTimeZone(value));
    }

    public String marshal(TimeZone value) {
        return (org.apache.falcon.entity.v0.SchemaHelper.getTimeZoneId(value));
    }

}