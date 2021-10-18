package org.sample.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
    public Response insert(Product product){
        //try {
            product = service.insert(product);
            return Response.ok(product, MediaType.APPLICATION_JSON).build();
        // } catch (Exception e){
        //     return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("Insert Product Failed!").build();
        // }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    //@Authenticated
    @Path("update")
    public Response update(Product product){
        //try {
            product = service.update(product);
            return Response.ok(product, MediaType.APPLICATION_JSON).build();
        // } catch (Exception e){
        //     return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("Insert Product Failed!").build();
        // }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("delete/{id}")
    public Response delete(@PathParam("id") Long id){
        //try {
            service.delete(id);
            return Response.status(Status.OK).build();
        // } catch (Exception e) {
        //     //return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).entity("Insert Product Failed!").build();
        // }
         
    }

}
