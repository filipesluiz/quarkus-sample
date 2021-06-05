package org.sample.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserClient {

    public Long id;
    public String name;

    public UserClient(Long id, String name) {
        this.id = id;
        this.name = name;
    } 

}
