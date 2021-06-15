package org.sample.mock;

import javax.enterprise.context.ApplicationScoped;

import org.sample.client.User;
import org.sample.client.UserResource;

import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockUserResource extends UserResource {

    @Override
    public User findUserById(long id){
        return new User(1l, "Mock User One");
    }
    
}
