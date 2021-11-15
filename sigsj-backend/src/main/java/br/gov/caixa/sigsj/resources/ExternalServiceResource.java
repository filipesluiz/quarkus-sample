package br.gov.caixa.sigsj.resources;

import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.gov.caixa.sigsj.client.Cicsws;
import br.gov.caixa.sigsj.client.CicswsResource;
import br.gov.caixa.sigsj.client.Cpf;

@ApplicationScoped
@Path("/v1/externalservice")
public class ExternalServiceResource {

    @Inject
    br.gov.caixa.sigsj.client.CpfResource service;

    @Inject
    CicswsResource serviceCicsws;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/validacpf")
    public Response findByCpf(@QueryParam("cpf") String cpf){
        try {
            System.out.println(cpf);
            
            Optional<Cpf> result = service.findByCpf(cpf).stream().filter(i ->
                i.cpf.equals(cpf)
            ).findFirst();

            return Response.ok(result.isPresent() ? result.get() : null, MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e){
            return Response.serverError().status(Response.Status.NOT_FOUND).entity("CPF invalid!").build();
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/validaconta")
    public Response findByConta(@QueryParam("agencia") Long agencia, @QueryParam("conta") String conta, @QueryParam("digito") String digito){
        try {
            System.out.println(agencia);

            Optional<Cicsws> result = serviceCicsws.findByConta(agencia, conta, digito).stream().filter((i) -> 
                i.agencia.equals(agencia) && i.conta.equals(conta) && i.digito.equals(digito)
            ).findFirst();

            return Response.ok(result.isPresent() ? result.get() : null, MediaType.APPLICATION_JSON).build();
        } catch (NotFoundException e){
            return Response.serverError().status(Response.Status.NOT_FOUND).entity("Conta invalid!").build();
        }
    }
}
