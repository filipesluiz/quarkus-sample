package br.gov.caixa.sigsj.mock;

import javax.enterprise.context.ApplicationScoped;

import br.gov.caixa.sigsj.client.User;
import br.gov.caixa.sigsj.client.UserResource;
import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockUserResource extends UserResource {

    @Override
    public User findUserById(long id){
        return new User(1l, "Mock User One");
    }
    
}
