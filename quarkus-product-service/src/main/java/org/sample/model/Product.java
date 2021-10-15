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
@NamedSPs({ 
    @NamedSP(name = Product.FIND,   paramsIn =  {"P_ID", "P_NAME"}), 
    @NamedSP(name = Product.INSERT, paramsIn =  {"P_NAME", "P_DESCRIPTION"}, paramsOut = {"P_ID"}), 
    @NamedSP(name = Product.UPDATE, paramsIn =  {"P_ID", "P_NAME", "P_DESCRIPTION"}, paramsOut = {"P_ID"}),
    @NamedSP(name = Product.DELETE, paramsIn =  {"P_ID"}),
})
public class Product implements Serializable {

    private static final long serialVersionUID = -7243554022847965126L;

    public static final String FIND = "SP_FIND_PRODUCT";

    public static final String INSERT = "SP_INSERT_PRODUCT";

    public static final String DELETE = "SP_DELETE_PRODUCT";

    public static final String UPDATE = "SP_UPDATE_PRODUCT";

    @Id
    @Column(name = "P_ID")
    private Long id;

    @Column(name = "P_NAME")
    private String name;

    @Column(name = "P_DESCRIPTION")
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
