package org.sample.user.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.NotFoundException;

import org.sample.user.model.User;

@ApplicationScoped
public class UserRepository {
    
    private List<User> users;

    @PostConstruct
    public void init(){
        users = new ArrayList<User>();
        users.add(new User(1l, "User One"));
        users.add(new User(2l, "User Two"));
        users.add(new User(3l, "User Three"));
    }

    public List<User> getAll(){
        return users;
    }

    public User findById(Long id){
        Optional<User> result = users.stream().filter(u -> u.getId().equals(id)).findFirst();
        if(result.isPresent())
            return result.get();
        else
            throw new NotFoundException("User Not Found!");
        
    }
}
