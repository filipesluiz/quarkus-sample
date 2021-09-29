package org.sample.mock;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import org.sample.model.Product;
import org.sample.repository.ProductRepository;
import io.quarkus.test.Mock;

@Mock
@ApplicationScoped
public class MockProductRepository extends ProductRepository {

    @Override
    public List<Product> getAll(){
        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "Product 1", "First Product"));
        products.add(new Product(2L, "Product 2", "Second Product"));
        products.add(new Product(3L, "Product 3", "Thirty Product"));
        return products;

    }
        
}
