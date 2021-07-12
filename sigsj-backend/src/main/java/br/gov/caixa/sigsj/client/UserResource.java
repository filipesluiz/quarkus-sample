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

@ApplicationScoped
public class UserResource {
    
    @Inject
    @RestClient
    UserService client;

    @Retry(maxRetries = 2, delay = 500)
    @Timeout(2000)
    @Fallback(applyOn = {CircuitBreakerOpenException.class, ConnectException.class}, fallbackMethod = "findUserByIdFallBack")
    @CircuitBreaker(successThreshold = 20, requestVolumeThreshold = 5, delay = 1000, failureRatio = 0.5)
    public User findUserById(long id){
        return client.findById(id);
    }

    public User findUserByIdFallBack(long id){
        User user = new User(0l, "Usuário Temporário!");
        return user;
    }
}
