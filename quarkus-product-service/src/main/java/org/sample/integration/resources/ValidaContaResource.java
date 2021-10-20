package org.sample.integration.resources;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.sample.integration.services.ValidaContaService;

import br.gov.caixa.sigsj.validacontacredito.req.ProgramInterface.ValidaContaCredito.Entrada;

@ApplicationScoped
@Path("/integration/conta")
public class ValidaContaResource {

    @Inject
    ValidaContaService service;

    @Path("valida")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response validar(Entrada entrada){
        return Response.ok(service.validar(entrada)).build();
    }
}
