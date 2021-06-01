package org.sample.services;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.sample.client.UserService;
import org.sample.model.Product;
import org.sample.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ProductService {

    @Inject
    private ProductRepository repository;
 
    @Inject
    @RestClient
    private UserService userService;

    public List<Product> getAll(){
        return repository.getAll();
    }

    public Product findById(Long id){
        Product product = repository.findById(id);

        if(product != null)
            product.setUser(userService.findById(product.getId())); 
        
        return product;
    }
}
