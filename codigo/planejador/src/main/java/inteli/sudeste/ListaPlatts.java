//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.22 at 08:27:36 PM UTC 
//


package inteli.sudeste;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{}diferencial"/&gt;
 *         &lt;element ref="{}frete"/&gt;
 *         &lt;element ref="{}id"/&gt;
 *         &lt;element ref="{}porcentagemFe"/&gt;
 *         &lt;element ref="{}valor"/&gt;
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
    "diferencial",
    "frete",
    "id",
    "porcentagemFe",
    "valor"
})
@XmlRootElement(name = "listaPlatts")
public class ListaPlatts {

    @XmlElement(required = true)
    protected BigDecimal diferencial;
    @XmlElement(required = true)
    protected BigDecimal frete;
    @XmlElement(required = true)
    protected Id id;
    @XmlElement(required = true)
    protected BigDecimal porcentagemFe;
    @XmlElement(required = true)
    protected String valor;

    /**
     * Gets the value of the diferencial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiferencial() {
        return diferencial;
    }

    /**
     * Sets the value of the diferencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiferencial(BigDecimal value) {
        this.diferencial = value;
    }

    /**
     * Gets the value of the frete property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrete() {
        return frete;
    }

    /**
     * Sets the value of the frete property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrete(BigDecimal value) {
        this.frete = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setId(Id value) {
        this.id = value;
    }

    /**
     * Gets the value of the porcentagemFe property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentagemFe() {
        return porcentagemFe;
    }

    /**
     * Sets the value of the porcentagemFe property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentagemFe(BigDecimal value) {
        this.porcentagemFe = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
    }

}