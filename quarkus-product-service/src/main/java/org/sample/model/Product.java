package org.sample.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.sample.client.User;

import core.persistence.entity.NamedSP;
import core.persistence.entity.NamedSPs;

@Entity
@NamedSPs( 
    @NamedSP(name = Product.FIND, paramsIn =  {"P_ID", "P_NAME"})
)
public class Product implements Serializable {

    private static final long serialVersionUID = -7243554022847965126L;

    public static final String FIND = "SP_CONSULTA_PRODUTO";

    @Id
    @Column(name = "P_ID")
    private Long id;

    @Column(name = "P_NAME")
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
