package org.sample.services;

import org.sample.model.Product;
import org.sample.repository.ProductRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ProductService {

    @Inject
    private ProductRepository repository;

    public List<Product> getAll(){
        return repository.getAll();
    }

    public Product findById(Long id){
        return repository.findById(id);
    }
}
