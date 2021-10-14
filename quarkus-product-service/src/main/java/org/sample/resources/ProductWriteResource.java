package org.sample.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sample.model.Product;
import org.sample.services.ProductService;

@ApplicationScoped
@Path("/write/products")
public class ProductWriteResource {

    @Inject
    ProductService service;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    //@Authenticated
    @Path("insert")
    public Response insertProduct(Product product){
        //try {
            product = service.insert(product);
            return Response.ok(product, MediaType.APPLICATION_JSON).build();
        // } catch (Exception e){
        //     return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("Insert Product Failed!").build();
        // }
    }

}
