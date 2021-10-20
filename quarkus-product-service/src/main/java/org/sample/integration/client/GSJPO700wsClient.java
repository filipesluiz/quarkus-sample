package org.sample.integration.client;

import java.net.URL;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;

import br.gov.caixa.sigsj.validacontacredito.GSJPO700Port;
import br.gov.caixa.sigsj.validacontacredito.GSJPO700Service;
import br.gov.caixa.sigsj.validacontacredito.resp.ProgramInterface.ValidaContaCredito;
import br.gov.caixa.sigsj.validacontacredito.resp.ProgramInterface.ValidaContaCredito.Saida;

@ApplicationScoped
public class GSJPO700wsClient {
    
    private static final QName SERVICE_NAME = new QName("http://caixa.gov.br/sigsj/validacontacredito", "GSJPO700Service");

    public Saida executeWS(br.gov.caixa.sigsj.validacontacredito.req.ProgramInterface.ValidaContaCredito validaContaCredito){
        URL wsdlURL = GSJPO700Service.WSDL_LOCATION;
        GSJPO700Service wss = new GSJPO700Service(wsdlURL, SERVICE_NAME);
        GSJPO700Port port = wss.getGSJPO700Port();
        ValidaContaCredito result = port.validacontacredito(validaContaCredito);
        return result.getSaida();
    }

    
}
