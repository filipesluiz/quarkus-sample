package org.sample.user.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.sample.user.model.User;
import org.sample.user.repository.UserRepository;

@ApplicationScoped
public class UserService {
    
    @Inject
    private UserRepository repository;

    public List<User> getAll(){
        return repository.getAll();
    }

    public User findById(Long id){
        return repository.findById(id);
    }
}
