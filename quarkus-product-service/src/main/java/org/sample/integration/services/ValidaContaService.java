package org.sample.integration.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.sample.integration.client.GSJPO700wsClient;

import br.gov.caixa.sigsj.validacontacredito.req.ProgramInterface.ValidaContaCredito;
import br.gov.caixa.sigsj.validacontacredito.resp.ProgramInterface;

@ApplicationScoped
public class ValidaContaService {

    @Inject
    GSJPO700wsClient client;

    public ProgramInterface.ValidaContaCredito.Saida validar(br.gov.caixa.sigsj.validacontacredito.req.ProgramInterface.ValidaContaCredito.Entrada entrada){
        ValidaContaCredito validaContaCredito = new ValidaContaCredito();
        validaContaCredito.setEntrada(entrada);
        return client.executeWS(validaContaCredito);
    }
    
}
