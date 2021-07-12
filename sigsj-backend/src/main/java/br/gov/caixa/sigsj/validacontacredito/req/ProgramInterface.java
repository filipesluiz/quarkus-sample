
package br.gov.caixa.sigsj.validacontacredito.req;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramInterface", propOrder = {
    "validaContaCredito"
})
public class ProgramInterface {

    @XmlElement(name = "ValidaContaCredito", required = true)
    protected ProgramInterface.ValidaContaCredito validaContaCredito;

    /**
     * Obtem o valor da propriedade validaContaCredito.
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


   
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entrada"
    })
    public static class ValidaContaCredito {

        @XmlElement(name = "Entrada", required = true)
        protected ProgramInterface.ValidaContaCredito.Entrada entrada;

        /**
         * Obtem o valor da propriedade entrada.
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
             * Obtem o valor da propriedade tipoJustica.
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
             * Obtem o valor da propriedade numeroTribunal.
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
             * Obtem o valor da propriedade codigoIP.
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
             * Obt�m o valor da propriedade codigoUsuario.
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
             * Obt�m o valor da propriedade conta.
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
             * Obt�m o valor da propriedade numeroDocumentoSacador.
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
             * Obt�m o valor da propriedade valorCredito.
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
                 * Obtem o valor da propriedade numeroAgencia.
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
                 * Obtem o valor da propriedade numeroProduto.
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
                 * Obtem o valor da propriedade numeroConta.
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
                 * Obtem o valor da propriedade dvConta.
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
