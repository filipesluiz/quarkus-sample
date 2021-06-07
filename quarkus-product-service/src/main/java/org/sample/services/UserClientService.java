package org.sample.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sample.client.UserRestClient;
import org.sample.model.UserClient;

@ApplicationScoped
public class UserClientService {
    
    @Inject
    @RestClient
    private UserRestClient client;

    @Retry(maxRetries = 2, delay = 500)
    @Timeout(2000)
    @Fallback(applyOn = CircuitBreakerOpenException.class, fallbackMethod = "findUserByIdFallBack")
    @CircuitBreaker(successThreshold = 20, requestVolumeThreshold = 5, delay = 1000, failureRatio = 0.5)
    public UserClient findUserById(long id){
        return client.findById(id);
    }

    private UserClient findUserByIdFallBack(){
        UserClient user = new UserClient(0l, "Usuário Temporário!");
        return user;
    }
}
