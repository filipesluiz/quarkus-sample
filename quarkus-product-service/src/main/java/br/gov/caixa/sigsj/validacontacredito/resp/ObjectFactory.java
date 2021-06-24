
package br.gov.caixa.sigsj.validacontacredito.resp;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.caixa.sigsj.validacontacredito.resp package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidacontacreditoResponse_QNAME = new QName("http://caixa.gov.br/sigsj/validacontacredito/resp", "validacontacreditoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.caixa.sigsj.validacontacredito.resp
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProgramInterface }
     * 
     */
    public ProgramInterface createProgramInterface() {
        return new ProgramInterface();
    }

    /**
     * Create an instance of {@link ProgramInterface.ValidaContaCredito }
     * 
     */
    public ProgramInterface.ValidaContaCredito createProgramInterfaceValidaContaCredito() {
        return new ProgramInterface.ValidaContaCredito();
    }

    /**
     * Create an instance of {@link ProgramInterface.ValidaContaCredito.Saida }
     * 
     */
    public ProgramInterface.ValidaContaCredito.Saida createProgramInterfaceValidaContaCreditoSaida() {
        return new ProgramInterface.ValidaContaCredito.Saida();
    }

    /**
     * Create an instance of {@link ProgramInterface.ValidaContaCredito.Saida.DetalheErro }
     * 
     */
    public ProgramInterface.ValidaContaCredito.Saida.DetalheErro createProgramInterfaceValidaContaCreditoSaidaDetalheErro() {
        return new ProgramInterface.ValidaContaCredito.Saida.DetalheErro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProgramInterface }{@code >}
     */
    @XmlElementDecl(namespace = "http://caixa.gov.br/sigsj/validacontacredito/resp", name = "validacontacreditoResponse")
    public JAXBElement<ProgramInterface> createValidacontacreditoResponse(ProgramInterface value) {
        return new JAXBElement<ProgramInterface>(_ValidacontacreditoResponse_QNAME, ProgramInterface.class, null, value);
    }

}
