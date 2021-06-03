package org.sample.resources;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sample.services.ProductService;

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
