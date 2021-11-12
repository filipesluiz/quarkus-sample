package br.gov.caixa.sigsj.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.QueryParam;

@Path("/")
@RegisterRestClient
public interface CpfService {

    @GET
    @Path("cpfvalidos")
    @Produces(MediaType.APPLICATION_JSON)
    List<Cpf> listByCpf(@QueryParam String cpf);
}
