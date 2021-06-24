
package br.gov.caixa.sigsj.validacontacredito.resp;

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
 *                   &amp;lt;element name="Saida"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;sequence&amp;gt;
 *                             &amp;lt;element name="NumeroRetorno"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                   &amp;lt;maxInclusive value="99"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="NumeroVersao"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                   &amp;lt;maxInclusive value="9999"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="NumeroControle"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
 *                                   &amp;lt;maxInclusive value="9999"/&amp;gt;
 *                                   &amp;lt;minInclusive value="0"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="DescricaoMensagem"&amp;gt;
 *                               &amp;lt;simpleType&amp;gt;
 *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                   &amp;lt;maxLength value="500"/&amp;gt;
 *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                 &amp;lt;/restriction&amp;gt;
 *                               &amp;lt;/simpleType&amp;gt;
 *                             &amp;lt;/element&amp;gt;
 *                             &amp;lt;element name="DetalheErro"&amp;gt;
 *                               &amp;lt;complexType&amp;gt;
 *                                 &amp;lt;complexContent&amp;gt;
 *                                   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                                     &amp;lt;sequence&amp;gt;
 *                                       &amp;lt;element name="NumeroRetornoDB"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                                             &amp;lt;maxInclusive value="999999999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="-999999999"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="NumeroRetornoTransacao"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                                             &amp;lt;maxInclusive value="999999999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="-999999999"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="NumeroRetornoTransacao2"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *                                             &amp;lt;maxInclusive value="999999999"/&amp;gt;
 *                                             &amp;lt;minInclusive value="-999999999"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="CodigoRotina"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                             &amp;lt;maxLength value="8"/&amp;gt;
 *                                             &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="CodigoRetornoRotina"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                             &amp;lt;maxLength value="5"/&amp;gt;
 *                                             &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                       &amp;lt;element name="DescricaoErro"&amp;gt;
 *                                         &amp;lt;simpleType&amp;gt;
 *                                           &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *                                             &amp;lt;maxLength value="500"/&amp;gt;
 *                                             &amp;lt;whiteSpace value="collapse"/&amp;gt;
 *                                           &amp;lt;/restriction&amp;gt;
 *                                         &amp;lt;/simpleType&amp;gt;
 *                                       &amp;lt;/element&amp;gt;
 *                                     &amp;lt;/sequence&amp;gt;
 *                                   &amp;lt;/restriction&amp;gt;
 *                                 &amp;lt;/complexContent&amp;gt;
 *                               &amp;lt;/complexType&amp;gt;
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
     *         &amp;lt;element name="Saida"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;sequence&amp;gt;
     *                   &amp;lt;element name="NumeroRetorno"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                         &amp;lt;maxInclusive value="99"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="NumeroVersao"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                         &amp;lt;maxInclusive value="9999"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="NumeroControle"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
     *                         &amp;lt;maxInclusive value="9999"/&amp;gt;
     *                         &amp;lt;minInclusive value="0"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="DescricaoMensagem"&amp;gt;
     *                     &amp;lt;simpleType&amp;gt;
     *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                         &amp;lt;maxLength value="500"/&amp;gt;
     *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
     *                       &amp;lt;/restriction&amp;gt;
     *                     &amp;lt;/simpleType&amp;gt;
     *                   &amp;lt;/element&amp;gt;
     *                   &amp;lt;element name="DetalheErro"&amp;gt;
     *                     &amp;lt;complexType&amp;gt;
     *                       &amp;lt;complexContent&amp;gt;
     *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                           &amp;lt;sequence&amp;gt;
     *                             &amp;lt;element name="NumeroRetornoDB"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *                                   &amp;lt;maxInclusive value="999999999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="-999999999"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="NumeroRetornoTransacao"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *                                   &amp;lt;maxInclusive value="999999999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="-999999999"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="NumeroRetornoTransacao2"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
     *                                   &amp;lt;maxInclusive value="999999999"/&amp;gt;
     *                                   &amp;lt;minInclusive value="-999999999"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="CodigoRotina"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                                   &amp;lt;maxLength value="8"/&amp;gt;
     *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="CodigoRetornoRotina"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                                   &amp;lt;maxLength value="5"/&amp;gt;
     *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
     *                                 &amp;lt;/restriction&amp;gt;
     *                               &amp;lt;/simpleType&amp;gt;
     *                             &amp;lt;/element&amp;gt;
     *                             &amp;lt;element name="DescricaoErro"&amp;gt;
     *                               &amp;lt;simpleType&amp;gt;
     *                                 &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
     *                                   &amp;lt;maxLength value="500"/&amp;gt;
     *                                   &amp;lt;whiteSpace value="collapse"/&amp;gt;
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
    @XmlType(name = "", propOrder = {
        "saida"
    })
    public static class ValidaContaCredito {

        @XmlElement(name = "Saida", required = true)
        protected ProgramInterface.ValidaContaCredito.Saida saida;

        /**
         * Obtém o valor da propriedade saida.
         * 
         * @return
         *     possible object is
         *     {@link ProgramInterface.ValidaContaCredito.Saida }
         *     
         */
        public ProgramInterface.ValidaContaCredito.Saida getSaida() {
            return saida;
        }

        /**
         * Define o valor da propriedade saida.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramInterface.ValidaContaCredito.Saida }
         *     
         */
        public void setSaida(ProgramInterface.ValidaContaCredito.Saida value) {
            this.saida = value;
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
         *         &amp;lt;element name="NumeroRetorno"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *               &amp;lt;maxInclusive value="99"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="NumeroVersao"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *               &amp;lt;maxInclusive value="9999"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="NumeroControle"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&amp;gt;
         *               &amp;lt;maxInclusive value="9999"/&amp;gt;
         *               &amp;lt;minInclusive value="0"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="DescricaoMensagem"&amp;gt;
         *           &amp;lt;simpleType&amp;gt;
         *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *               &amp;lt;maxLength value="500"/&amp;gt;
         *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
         *             &amp;lt;/restriction&amp;gt;
         *           &amp;lt;/simpleType&amp;gt;
         *         &amp;lt;/element&amp;gt;
         *         &amp;lt;element name="DetalheErro"&amp;gt;
         *           &amp;lt;complexType&amp;gt;
         *             &amp;lt;complexContent&amp;gt;
         *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *                 &amp;lt;sequence&amp;gt;
         *                   &amp;lt;element name="NumeroRetornoDB"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
         *                         &amp;lt;maxInclusive value="999999999"/&amp;gt;
         *                         &amp;lt;minInclusive value="-999999999"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="NumeroRetornoTransacao"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
         *                         &amp;lt;maxInclusive value="999999999"/&amp;gt;
         *                         &amp;lt;minInclusive value="-999999999"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="NumeroRetornoTransacao2"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
         *                         &amp;lt;maxInclusive value="999999999"/&amp;gt;
         *                         &amp;lt;minInclusive value="-999999999"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="CodigoRotina"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *                         &amp;lt;maxLength value="8"/&amp;gt;
         *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="CodigoRetornoRotina"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *                         &amp;lt;maxLength value="5"/&amp;gt;
         *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
         *                       &amp;lt;/restriction&amp;gt;
         *                     &amp;lt;/simpleType&amp;gt;
         *                   &amp;lt;/element&amp;gt;
         *                   &amp;lt;element name="DescricaoErro"&amp;gt;
         *                     &amp;lt;simpleType&amp;gt;
         *                       &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
         *                         &amp;lt;maxLength value="500"/&amp;gt;
         *                         &amp;lt;whiteSpace value="collapse"/&amp;gt;
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
            "numeroRetorno",
            "numeroVersao",
            "numeroControle",
            "descricaoMensagem",
            "detalheErro"
        })
        public static class Saida {

            @XmlElement(name = "NumeroRetorno")
            protected int numeroRetorno;
            @XmlElement(name = "NumeroVersao")
            protected int numeroVersao;
            @XmlElement(name = "NumeroControle")
            protected int numeroControle;
            @XmlElement(name = "DescricaoMensagem", required = true)
            protected String descricaoMensagem;
            @XmlElement(name = "DetalheErro", required = true)
            protected ProgramInterface.ValidaContaCredito.Saida.DetalheErro detalheErro;

            /**
             * Obtém o valor da propriedade numeroRetorno.
             * 
             */
            public int getNumeroRetorno() {
                return numeroRetorno;
            }

            /**
             * Define o valor da propriedade numeroRetorno.
             * 
             */
            public void setNumeroRetorno(int value) {
                this.numeroRetorno = value;
            }

            /**
             * Obtém o valor da propriedade numeroVersao.
             * 
             */
            public int getNumeroVersao() {
                return numeroVersao;
            }

            /**
             * Define o valor da propriedade numeroVersao.
             * 
             */
            public void setNumeroVersao(int value) {
                this.numeroVersao = value;
            }

            /**
             * Obtém o valor da propriedade numeroControle.
             * 
             */
            public int getNumeroControle() {
                return numeroControle;
            }

            /**
             * Define o valor da propriedade numeroControle.
             * 
             */
            public void setNumeroControle(int value) {
                this.numeroControle = value;
            }

            /**
             * Obtém o valor da propriedade descricaoMensagem.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescricaoMensagem() {
                return descricaoMensagem;
            }

            /**
             * Define o valor da propriedade descricaoMensagem.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescricaoMensagem(String value) {
                this.descricaoMensagem = value;
            }

            /**
             * Obtém o valor da propriedade detalheErro.
             * 
             * @return
             *     possible object is
             *     {@link ProgramInterface.ValidaContaCredito.Saida.DetalheErro }
             *     
             */
            public ProgramInterface.ValidaContaCredito.Saida.DetalheErro getDetalheErro() {
                return detalheErro;
            }

            /**
             * Define o valor da propriedade detalheErro.
             * 
             * @param value
             *     allowed object is
             *     {@link ProgramInterface.ValidaContaCredito.Saida.DetalheErro }
             *     
             */
            public void setDetalheErro(ProgramInterface.ValidaContaCredito.Saida.DetalheErro value) {
                this.detalheErro = value;
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
             *         &amp;lt;element name="NumeroRetornoDB"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
             *               &amp;lt;maxInclusive value="999999999"/&amp;gt;
             *               &amp;lt;minInclusive value="-999999999"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="NumeroRetornoTransacao"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
             *               &amp;lt;maxInclusive value="999999999"/&amp;gt;
             *               &amp;lt;minInclusive value="-999999999"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="NumeroRetornoTransacao2"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
             *               &amp;lt;maxInclusive value="999999999"/&amp;gt;
             *               &amp;lt;minInclusive value="-999999999"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="CodigoRotina"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
             *               &amp;lt;maxLength value="8"/&amp;gt;
             *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="CodigoRetornoRotina"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
             *               &amp;lt;maxLength value="5"/&amp;gt;
             *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
             *             &amp;lt;/restriction&amp;gt;
             *           &amp;lt;/simpleType&amp;gt;
             *         &amp;lt;/element&amp;gt;
             *         &amp;lt;element name="DescricaoErro"&amp;gt;
             *           &amp;lt;simpleType&amp;gt;
             *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
             *               &amp;lt;maxLength value="500"/&amp;gt;
             *               &amp;lt;whiteSpace value="collapse"/&amp;gt;
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
                "numeroRetornoDB",
                "numeroRetornoTransacao",
                "numeroRetornoTransacao2",
                "codigoRotina",
                "codigoRetornoRotina",
                "descricaoErro"
            })
            public static class DetalheErro {

                @XmlElement(name = "NumeroRetornoDB")
                protected int numeroRetornoDB;
                @XmlElement(name = "NumeroRetornoTransacao")
                protected int numeroRetornoTransacao;
                @XmlElement(name = "NumeroRetornoTransacao2")
                protected int numeroRetornoTransacao2;
                @XmlElement(name = "CodigoRotina", required = true)
                protected String codigoRotina;
                @XmlElement(name = "CodigoRetornoRotina", required = true)
                protected String codigoRetornoRotina;
                @XmlElement(name = "DescricaoErro", required = true)
                protected String descricaoErro;

                /**
                 * Obtém o valor da propriedade numeroRetornoDB.
                 * 
                 */
                public int getNumeroRetornoDB() {
                    return numeroRetornoDB;
                }

                /**
                 * Define o valor da propriedade numeroRetornoDB.
                 * 
                 */
                public void setNumeroRetornoDB(int value) {
                    this.numeroRetornoDB = value;
                }

                /**
                 * Obtém o valor da propriedade numeroRetornoTransacao.
                 * 
                 */
                public int getNumeroRetornoTransacao() {
                    return numeroRetornoTransacao;
                }

                /**
                 * Define o valor da propriedade numeroRetornoTransacao.
                 * 
                 */
                public void setNumeroRetornoTransacao(int value) {
                    this.numeroRetornoTransacao = value;
                }

                /**
                 * Obtém o valor da propriedade numeroRetornoTransacao2.
                 * 
                 */
                public int getNumeroRetornoTransacao2() {
                    return numeroRetornoTransacao2;
                }

                /**
                 * Define o valor da propriedade numeroRetornoTransacao2.
                 * 
                 */
                public void setNumeroRetornoTransacao2(int value) {
                    this.numeroRetornoTransacao2 = value;
                }

                /**
                 * Obtém o valor da propriedade codigoRotina.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoRotina() {
                    return codigoRotina;
                }

                /**
                 * Define o valor da propriedade codigoRotina.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoRotina(String value) {
                    this.codigoRotina = value;
                }

                /**
                 * Obtém o valor da propriedade codigoRetornoRotina.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodigoRetornoRotina() {
                    return codigoRetornoRotina;
                }

                /**
                 * Define o valor da propriedade codigoRetornoRotina.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodigoRetornoRotina(String value) {
                    this.codigoRetornoRotina = value;
                }

                /**
                 * Obtém o valor da propriedade descricaoErro.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescricaoErro() {
                    return descricaoErro;
                }

                /**
                 * Define o valor da propriedade descricaoErro.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescricaoErro(String value) {
                    this.descricaoErro = value;
                }

            }

        }

    }

}
