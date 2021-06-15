package org.sample.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.sample.client.UserResource;
import org.sample.model.Product;
import org.sample.repository.ProductRepository;

@ApplicationScoped
public class ProductService {

    @Inject
    ProductRepository repository;
 
    @Inject
    UserResource userService;

    public List<Product> getAll(){
        return repository.getAll();
    }

    public Product findById(Long id){
        Product product = repository.findById(id);

        if(product != null)
            product.setUser(userService.findUserById(product.getId())); 
        
        return product;
    }
}
