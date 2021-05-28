package org.sample.resources;

import org.sample.model.Product;
import org.sample.services.ProductService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@ApplicationScoped
@Path("/products")
public class ProductResource {

    @Inject
    private ProductService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getAll(){
        return service.getAll();
    }

    //TODO: change to Async
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response findById(@PathParam("id") long id){
        try {
           return Response.ok(service.findById(id), MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e){
            return Response.status(Response.Status.NOT_FOUND).entity("Product Not Found!").build();
        }
    }
}
