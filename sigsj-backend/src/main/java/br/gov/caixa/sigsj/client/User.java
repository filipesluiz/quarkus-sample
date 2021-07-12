package br.gov.caixa.sigsj.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    public Long id;
    public String name;

    public User(){}

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    } 

}
