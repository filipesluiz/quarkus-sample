package br.gov.caixa.sigsj.services;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.gov.caixa.sigsj.client.UserResource;
import br.gov.caixa.sigsj.model.Product;
import br.gov.caixa.sigsj.repository.ProductRepository;

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
