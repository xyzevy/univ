
package com.group3.util.sms;

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
 *         &lt;element name="GetReportResult" type="{http://106.ihuyi.cn/}GetReportResult" minOccurs="0"/>
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
    "getReportResult"
})
@XmlRootElement(name = "GetReportResponse")
public class GetReportResponse {

    @XmlElement(name = "GetReportResult")
    protected GetReportResult getReportResult;

    /**
     * Gets the value of the getReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetReportResult }
     *     
     */
    public GetReportResult getGetReportResult() {
        return getReportResult;
    }

    /**
     * Sets the value of the getReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetReportResult }
     *     
     */
    public void setGetReportResult(GetReportResult value) {
        this.getReportResult = value;
    }

}
