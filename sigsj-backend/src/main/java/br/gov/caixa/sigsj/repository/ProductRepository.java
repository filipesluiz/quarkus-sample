package br.gov.caixa.sigsj.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.ws.rs.NotFoundException;

import org.hibernate.procedure.ProcedureCall;

import br.gov.caixa.sigsj.model.Product;

@ApplicationScoped
public class ProductRepository {

    private List<Product> products;

    @Inject
    EntityManager entityManager;

    @PostConstruct
    public void init(){
        products = new ArrayList<>();
        products.add(new Product(1L, "Product 1", "First Product"));
        products.add(new Product(2L, "Product 2", "Second Product"));
        products.add(new Product(3L, "Product 3", "Thirty Product"));
    }

    public List<Product> getAll(){
        return products;
       // return callSP();
    }

    public Product findById(Long id){
        Optional<Product> opt = products.stream().filter(p -> p.getId().equals(id)).findFirst();
        if (opt.isPresent())
            return opt.get();
        else
            throw new NotFoundException("Not Found!");
    }

    private List<Product> callSP(){
        try {
            ProcedureCall sp = entityManager.createStoredProcedureQuery("sp_consulta_produto").unwrap(ProcedureCall.class);
            sp.registerParameter("ID", Integer.TYPE, ParameterMode.IN);
            sp.setParameter("ID", 1);
            sp.execute();
            List result = sp.getResultList();
            return result;
        }catch (Exception e) {
           throw e;
        }
    }
}
