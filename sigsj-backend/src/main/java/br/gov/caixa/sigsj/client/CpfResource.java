package br.gov.caixa.sigsj.client;

import java.net.ConnectException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import java.util.List;

@ApplicationScoped
public class CpfResource {
    
    @Inject
    @RestClient
    CpfService client;

    public List<Cpf> findByCpf(String cpf){
        return client.listByCpf(cpf);
    }
}
