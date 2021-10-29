package org.sample.integration.client;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sigsj.validacontacredito.GSJPO700Port;
import br.gov.caixa.sigsj.validacontacredito.GSJPO700Service;
import br.gov.caixa.sigsj.validacontacredito.resp.ProgramInterface.ValidaContaCredito;
import br.gov.caixa.sigsj.validacontacredito.resp.ProgramInterface.ValidaContaCredito.Saida;

@ApplicationScoped
public class GSJPO700wsClient {
    
    public Saida executeWS(br.gov.caixa.sigsj.validacontacredito.req.ProgramInterface.ValidaContaCredito validaContaCredito){
        GSJPO700Service wss = new GSJPO700Service();
        GSJPO700Port port = wss.getGSJPO700Port();
        ValidaContaCredito result = port.validacontacredito(validaContaCredito);
        return result.getSaida();
    }

    
}
