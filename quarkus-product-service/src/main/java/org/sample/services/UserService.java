package org.sample.services;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.faulttolerance.CircuitBreaker;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Retry;
import org.eclipse.microprofile.faulttolerance.Timeout;
import org.eclipse.microprofile.faulttolerance.exceptions.CircuitBreakerOpenException;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sample.client.UserClient;
import org.sample.model.User;

@ApplicationScoped
public class UserService {
    
    @Inject
    @RestClient
    private UserClient client;

    @Retry(maxRetries = 2, delay = 500)
    @Timeout(2000)
    @Fallback(applyOn = CircuitBreakerOpenException.class, fallbackMethod = "findUserByIdFallBack")
    @CircuitBreaker(successThreshold = 20, requestVolumeThreshold = 5, delay = 1000)
    public User findUserById(long id){
        return client.findById(id);
    }

    private User findUserByIdFallBack(){
        User user = new User(0l, "Usuário Temporário!");
        return user;
    }
}
