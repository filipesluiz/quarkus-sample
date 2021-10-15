package org.sample.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

import org.sample.model.Product;

import core.interceptor.Logged;
import core.persistence.repository.CoreSpRepository;

@ApplicationScoped
public class ProductRepository extends CoreSpRepository<Product> {

    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<>();
        products.add(new Product(1L, "Product 1", "First Product"));
        products.add(new Product(2L, "Product 2", "Second Product"));
        products.add(new Product(3L, "Product 3", "Thirty Product"));
    }

    @Logged(target = Product.FIND)
    public List<Product> getAll(){
        //return products;
        return executeQuery(new Product(), Product.FIND);
    }

    public Product findById(Long id){
        Optional<Product> opt = products.stream().filter(p -> p.getId().equals(id)).findFirst();
        if (opt.isPresent())
            return opt.get();
        else
            throw new NotFoundException("Not Found!");
    }

    @Logged(target = Product.INSERT)
    @Transactional
    public Product insert(Product product){
        return executeUpdate(product, Product.INSERT);
    }

    @Logged(target = Product.DELETE)
    @Transactional
    public Product update(Product product){
        return executeUpdate(product, Product.UPDATE);
    }

    @Logged(target = Product.DELETE)
    @Transactional
    public Product delete(Long id){
        return executeUpdate(new Product(id, null, null), Product.DELETE);
    }


}
