
package br.gov.caixa.sigsj.validacontacredito.req;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java de ProgramInterface complex type.
 * 
 * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ProgramInterface"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ValidaContaCredito"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="Entrada"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="TipoJustica"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                   &amp;lt;maxInclusive value="99"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="NumeroTribunal"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                   &amp;lt;maxInclusive value="9999"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="CodigoIP"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                   &amp;lt;maxLength value="15"/&amp;gt;
 *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="CodigoUsuario"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                   &amp;lt;maxLength value="8"/&amp;gt;
 *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="Conta"&amp;gt;
 *                               &amp;lt;complexType&amp;gt;
 *                                 &amp;lt;complexContent&amp;gt;
 *                                   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                     &amp;lt;sequence&amp;gt;
 *                                       &amp;lt;element name="NumeroAgencia"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                             &amp;lt;maxInclusive value="9999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="0"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="NumeroProduto"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                             &amp;lt;maxInclusive value="9999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="0"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="NumeroConta"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
 *                                             &amp;lt;maxInclusive value="999999999999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="0"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="DVConta"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                             &amp;lt;maxInclusive value="9"/&amp;gt;
 *                                             &amp;lt;minInclusive value="0"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                     &amp;lt;/sequence&amp;gt;
 *                                   &amp;lt;/restriction&amp;gt;
 *                                 &amp;lt;/complexContent&amp;gt;
 *                               &amp;lt;/complexType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="NumeroDocumentoSacador"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
 *                                   &amp;lt;maxInclusive value="99999999999999"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="ValorCredito"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
 *                                   &amp;lt;totalDigits value="15"/&amp;gt;
 *                                   &amp;lt;fractionDigits value="2"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                           &amp;lt;/sequence&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "validaContaCredito"
})
public class ProgramInterface {

    @XmlElement(name = "ValidaContaCredito", required = true)
    protected ProgramInterface.ValidaContaCredito validaContaCredito;

    /**
     * Obtém o valor da propriedade validaContaCredito.
     * 
     * @return
     *     possible object is
     *     {@link ProgramInterface.ValidaContaCredito }
     *     
     */
    public ProgramInterface.ValidaContaCredito getValidaContaCredito() {
        return validaContaCredito;
    }

    /**
     * Define o valor da propriedade validaContaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramInterface.ValidaContaCredito }
     *     
     */
    public void setValidaContaCredito(ProgramInterface.ValidaContaCredito value) {
        this.validaContaCredito = value;
    }


    /**
     * &lt;p&gt;Classe Java de anonymous complex type.
     * 
     * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="Entrada"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="TipoJustica"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                         &amp;lt;maxInclusive value="99"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="NumeroTribunal"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                         &amp;lt;maxInclusive value="9999"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="CodigoIP"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                         &amp;lt;maxLength value="15"/&amp;gt;
     *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="CodigoUsuario"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                         &amp;lt;maxLength value="8"/&amp;gt;
     *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="Conta"&amp;gt;
     *                     &amp;lt;complexType&amp;gt;
     *                       &amp;lt;complexContent&amp;gt;
     *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                           &amp;lt;sequence&amp;gt;
     *                             &amp;lt;element name="NumeroAgencia"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                                   &amp;lt;maxInclusive value="9999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="0"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="NumeroProduto"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                                   &amp;lt;maxInclusive value="9999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="0"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="NumeroConta"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
     *                                   &amp;lt;maxInclusive value="999999999999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="0"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="DVConta"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                                   &amp;lt;maxInclusive value="9"/&amp;gt;
     *                                   &amp;lt;minInclusive value="0"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                           &amp;lt;/sequence&amp;gt;
     *                         &amp;lt;/restriction&amp;gt;
     *                       &amp;lt;/complexContent&amp;gt;
     *                     &amp;lt;/complexType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="NumeroDocumentoSacador"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
     *                         &amp;lt;maxInclusive value="99999999999999"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="ValorCredito"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
     *                         &amp;lt;totalDigits value="15"/&amp;gt;
     *                         &amp;lt;fractionDigits value="2"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                 &amp;lt;/sequence&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entrada"
    })
    public static class ValidaContaCredito {

        @XmlElement(name = "Entrada", required = true)
        protected ProgramInterface.ValidaContaCredito.Entrada entrada;

        /**
         * Obtém o valor da propriedade entrada.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.ValidaContaCredito.Entrada }
         *     
         */
        public ProgramInterface.ValidaContaCredito.Entrada getEntrada() {
            return entrada;
        }

        /**
         * Define o valor da propriedade entrada.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.ValidaContaCredito.Entrada }
         *     
         */
        public void setEntrada(ProgramInterface.ValidaContaCredito.Entrada value) {
            this.entrada = value;
        }


        /**
         * &lt;p&gt;Classe Java de anonymous complex type.
         * 
         * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;sequence&amp;gt;
         *         &amp;lt;element name="TipoJustica"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *               &amp;lt;maxInclusive value="99"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="NumeroTribunal"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *               &amp;lt;maxInclusive value="9999"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="CodigoIP"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *               &amp;lt;maxLength value="15"/&amp;gt;
         *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="CodigoUsuario"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *               &amp;lt;maxLength value="8"/&amp;gt;
         *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="Conta"&amp;gt;
         *           &amp;lt;complexType&amp;gt;
         *             &amp;lt;complexContent&amp;gt;
         *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                 &amp;lt;sequence&amp;gt;
         *                   &amp;lt;element name="NumeroAgencia"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *                         &amp;lt;maxInclusive value="9999"/&amp;gt;
         *                         &amp;lt;minInclusive value="0"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="NumeroProduto"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *                         &amp;lt;maxInclusive value="9999"/&amp;gt;
         *                         &amp;lt;minInclusive value="0"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="NumeroConta"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
         *                         &amp;lt;maxInclusive value="999999999999"/&amp;gt;
         *                         &amp;lt;minInclusive value="0"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="DVConta"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *                         &amp;lt;maxInclusive value="9"/&amp;gt;
         *                         &amp;lt;minInclusive value="0"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                 &amp;lt;/sequence&amp;gt;
         *               &amp;lt;/restriction&amp;gt;
         *             &amp;lt;/complexContent&amp;gt;
         *           &amp;lt;/complexType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="NumeroDocumentoSacador"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
         *               &amp;lt;maxInclusive value="99999999999999"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="ValorCredito"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&amp;gt;
         *               &amp;lt;totalDigits value="15"/&amp;gt;
         *               &amp;lt;fractionDigits value="2"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *       &amp;lt;/sequence&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tipoJustica",
            "numeroTribunal",
            "codigoIP",
            "codigoUsuario",
            "conta",
            "numeroDocumentoSacador",
            "valorCredito"
        })
        public static class Entrada {

            @XmlElement(name = "TipoJustica")
            protected int tipoJustica;
            @XmlElement(name = "NumeroTribunal")
            protected int numeroTribunal;
            @XmlElement(name = "CodigoIP", required = true)
            protected String codigoIP;
            @XmlElement(name = "CodigoUsuario", required = true)
            protected String codigoUsuario;
            @XmlElement(name = "Conta", required = true)
            protected ProgramInterface.ValidaContaCredito.Entrada.Conta conta;
            @XmlElement(name = "NumeroDocumentoSacador")
            protected long numeroDocumentoSacador;
            @XmlElement(name = "ValorCredito", required = true)
            protected BigDecimal valorCredito;

            /**
             * Obtém o valor da propriedade tipoJustica.
             * 
             */
            public int getTipoJustica() {
                return tipoJustica;
            }

            /**
             * Define o valor da propriedade tipoJustica.
             * 
             */
            public void setTipoJustica(int value) {
                this.tipoJustica = value;
            }

            /**
             * Obtém o valor da propriedade numeroTribunal.
             * 
             */
            public int getNumeroTribunal() {
                return numeroTribunal;
            }

            /**
             * Define o valor da propriedade numeroTribunal.
             * 
             */
            public void setNumeroTribunal(int value) {
                this.numeroTribunal = value;
            }

            /**
             * Obtém o valor da propriedade codigoIP.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoIP() {
                return codigoIP;
            }

            /**
             * Define o valor da propriedade codigoIP.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoIP(String value) {
                this.codigoIP = value;
            }

            /**
             * Obtém o valor da propriedade codigoUsuario.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoUsuario() {
                return codigoUsuario;
            }

            /**
             * Define o valor da propriedade codigoUsuario.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoUsuario(String value) {
                this.codigoUsuario = value;
            }

            /**
             * Obtém o valor da propriedade conta.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.ValidaContaCredito.Entrada.Conta }
             *     
             */
            public ProgramInterface.ValidaContaCredito.Entrada.Conta getConta() {
                return conta;
            }

            /**
             * Define o valor da propriedade conta.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.ValidaContaCredito.Entrada.Conta }
             *     
             */
            public void setConta(ProgramInterface.ValidaContaCredito.Entrada.Conta value) {
                this.conta = value;
            }

            /**
             * Obtém o valor da propriedade numeroDocumentoSacador.
             * 
             */
            public long getNumeroDocumentoSacador() {
                return numeroDocumentoSacador;
            }

            /**
             * Define o valor da propriedade numeroDocumentoSacador.
             * 
             */
            public void setNumeroDocumentoSacador(long value) {
                this.numeroDocumentoSacador = value;
            }

            /**
             * Obtém o valor da propriedade valorCredito.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorCredito() {
                return valorCredito;
            }

            /**
             * Define o valor da propriedade valorCredito.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorCredito(BigDecimal value) {
                this.valorCredito = value;
            }


            /**
             * &lt;p&gt;Classe Java de anonymous complex type.
             * 
             * &lt;p&gt;O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
             * 
             * &lt;pre&gt;
             * &amp;lt;complexType&amp;gt;
             *   &amp;lt;complexContent&amp;gt;
             *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
             *       &amp;lt;sequence&amp;gt;
             *         &amp;lt;element name="NumeroAgencia"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
             *               &amp;lt;maxInclusive value="9999"/&amp;gt;
             *               &amp;lt;minInclusive value="0"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="NumeroProduto"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
             *               &amp;lt;maxInclusive value="9999"/&amp;gt;
             *               &amp;lt;minInclusive value="0"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="NumeroConta"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedLong"&amp;gt;
             *               &amp;lt;maxInclusive value="999999999999"/&amp;gt;
             *               &amp;lt;minInclusive value="0"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="DVConta"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
             *               &amp;lt;maxInclusive value="9"/&amp;gt;
             *               &amp;lt;minInclusive value="0"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *       &amp;lt;/sequence&amp;gt;
             *     &amp;lt;/restriction&amp;gt;
             *   &amp;lt;/complexContent&amp;gt;
             * &amp;lt;/complexType&amp;gt;
             * &lt;/pre&gt;
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "numeroAgencia",
                "numeroProduto",
                "numeroConta",
                "dvConta"
            })
            public static class Conta {

                @XmlElement(name = "NumeroAgencia")
                protected int numeroAgencia;
                @XmlElement(name = "NumeroProduto")
                protected int numeroProduto;
                @XmlElement(name = "NumeroConta")
                protected long numeroConta;
                @XmlElement(name = "DVConta")
                protected int dvConta;

                /**
                 * Obtém o valor da propriedade numeroAgencia.
                 * 
                 */
                public int getNumeroAgencia() {
                    return numeroAgencia;
                }

                /**
                 * Define o valor da propriedade numeroAgencia.
                 * 
                 */
                public void setNumeroAgencia(int value) {
                    this.numeroAgencia = value;
                }

                /**
                 * Obtém o valor da propriedade numeroProduto.
                 * 
                 */
                public int getNumeroProduto() {
                    return numeroProduto;
                }

                /**
                 * Define o valor da propriedade numeroProduto.
                 * 
                 */
                public void setNumeroProduto(int value) {
                    this.numeroProduto = value;
                }

                /**
                 * Obtém o valor da propriedade numeroConta.
                 * 
                 */
                public long getNumeroConta() {
                    return numeroConta;
                }

                /**
                 * Define o valor da propriedade numeroConta.
                 * 
                 */
                public void setNumeroConta(long value) {
                    this.numeroConta = value;
                }

                /**
                 * Obtém o valor da propriedade dvConta.
                 * 
                 */
                public int getDVConta() {
                    return dvConta;
                }

                /**
                 * Define o valor da propriedade dvConta.
                 * 
                 */
                public void setDVConta(int value) {
                    this.dvConta = value;
                }

            }

        }

    }

}
