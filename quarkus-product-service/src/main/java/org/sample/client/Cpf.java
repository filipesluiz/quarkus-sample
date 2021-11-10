package org.sample.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cpf {

    public Long id;
    public String name;
    public String cpf;

    public Cpf(){}

    public Cpf(Long id, String name, String cpf) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
    }

}
