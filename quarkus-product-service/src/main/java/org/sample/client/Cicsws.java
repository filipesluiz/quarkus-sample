package org.sample.client;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Cicsws {

    public Long id;
    public Long agencia;
    public String conta;
    public String digito;
    public String numeroprocesso;
    public String operacao;
    public Long codigoreceita;
    public String orgao;
    public String cpfcnpj;
    public String contribuinte;
    public String cpfcnpjcontribuinte;

    public Cicsws(){}

    public Cicsws(Long id, Long agencia, String conta, String digito, String numeroprocesso, String operacao,
                  Long codigoreceita, String orgao, String cpfcnpj, String contribuinte, String cpfcnpjcontribuinte) {
        this.id = id;
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.numeroprocesso = numeroprocesso;
        this.operacao = operacao;
        this.codigoreceita = codigoreceita;
        this.orgao = orgao;
        this.cpfcnpj = cpfcnpj;
        this.contribuinte = contribuinte;
        this.cpfcnpjcontribuinte = cpfcnpjcontribuinte;
    }
}
