//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.06 at 11:06:21 AM CEST 
//


package hello.wsdl;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCurrencyResult" type="{http://www.oorsprong.org/websamples.countryinfo}tCurrency"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "countryCurrencyResult"
})
@XmlRootElement(name = "CountryCurrencyResponse")
public class CountryCurrencyResponse {

    @XmlElement(name = "CountryCurrencyResult", required = true)
    protected TCurrency countryCurrencyResult;

    /**
     * Gets the value of the countryCurrencyResult property.
     * 
     * @return
     *     possible object is
     *     {@link TCurrency }
     *     
     */
    public TCurrency getCountryCurrencyResult() {
        return countryCurrencyResult;
    }

    /**
     * Sets the value of the countryCurrencyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCurrency }
     *     
     */
    public void setCountryCurrencyResult(TCurrency value) {
        this.countryCurrencyResult = value;
    }

}
