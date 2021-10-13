package org.sample.resources;

import java.security.Principal;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.sample.services.ProductService;

import core.interceptor.Cached;

@ApplicationScoped
@Path("/products")
public class ProductResource {

    @Inject
    ProductService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    //@Authenticated
    @Cached(key = "products")
    public List<?> getAll(){
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
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

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("secutity")
    public List<?> getAllSecured(@Context SecurityContext ctx){
        Principal consumer = ctx.getUserPrincipal();
        System.out.println(ctx.isSecure());
        System.out.println(consumer.getName());
        System.out.println(ctx.getAuthenticationScheme());
        return service.getAll();
    }

    
}
