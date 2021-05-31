package org.sample.user.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import org.sample.user.model.User;

@ApplicationScoped
public class UserRepository {
    
    private List users;

    @PostConstruct
    public void init(){
        users = new ArrayList<User>();
    }
}
