package br.gov.caixa.sigsj.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cpf {

    public Long id;
    public String nome;
    public String cpf;

    public Cpf(){}

    public Cpf(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

}
