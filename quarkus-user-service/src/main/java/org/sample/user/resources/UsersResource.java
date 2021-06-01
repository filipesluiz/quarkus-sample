package org.sample.user.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sample.user.model.User;
import org.sample.user.services.UserService;

@Path("/users")
public class UsersResource {

    @Inject
    private UserService service;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getAll(){
        return service.getAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") long id) {
        try {
            return Response.ok(service.findById(id), MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e) {
            return Response.status(Response.Status.NOT_FOUND).entity("User not found!").build();
        }
    }
}