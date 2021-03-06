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
import javax.ws.rs.QueryParam;

import org.sample.client.CpfResource;
import org.sample.client.CicswsResource;

import core.interceptor.Cached;

@ApplicationScoped
@Path("/v1/externalservice")
public class ExternalServiceResource {

    @Inject
    CpfResource service;

    @Inject
    CicswsResource serviceCicsws;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/validacpf")
    public Response findByCpf(@QueryParam("cpf") String cpf){
        try {
            return Response.ok(service.findByCpf(cpf), MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e){
            return Response.serverError().status(Response.Status.NOT_FOUND).entity("CPF invalid!").build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/validaconta")
    public Response findByConta(@QueryParam("agencia") Long agencia, @QueryParam("conta") String conta, @QueryParam("digito") String digito){
        try {
            return Response.ok(serviceCicsws.findByConta(agencia, conta, digito), MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e){
            return Response.serverError().status(Response.Status.NOT_FOUND).entity("Conta invalid!").build();
        }
    }
}
