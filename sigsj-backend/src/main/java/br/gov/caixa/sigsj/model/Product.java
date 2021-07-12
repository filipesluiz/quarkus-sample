package br.gov.caixa.sigsj.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import br.gov.caixa.sigsj.client.User;

@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = -7243554022847965126L;

    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Transient
    private User user;

    public Product(){}

    public Product(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    
}
