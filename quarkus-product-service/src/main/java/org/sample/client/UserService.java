package org.sample.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;
import org.sample.model.User;

@Path("/users")
@RegisterRestClient
public interface UserService {

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    User findById(@PathParam Long id);
    
}
