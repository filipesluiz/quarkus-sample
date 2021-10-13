package core.interceptor;

import java.io.IOException;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;

import core.logging.LogBuilder;
import core.logging.LogInfo;
import core.logging.LogType;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;
import core.utils.JsonUtil;
import io.vertx.core.http.HttpServerResponse;

@Provider
public class LoggerResponseFilter implements ContainerResponseFilter {

    @Context
    UriInfo info;

    @Context
    HttpServerResponse response;

    @Inject
    Logger LOG;
    
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        try {
            LogInfo requestLog = LogBuilder.type(LogType.RESPONSE).build(requestContext, responseContext, null);
            LOG.info(JsonUtil.parseToJSON(requestLog));
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.UNTREATED_ERROR, e);
        }
    }

}
