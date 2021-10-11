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

import core.logging.LogStructure;
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
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
            throws IOException {
        LOG.info(JsonUtil.parseToJSON(logResponse(requestContext, responseContext)));
        
    }

    //TODO: AFTER FINISH, MOVE TO CLASS
    LogStructure logResponse(ContainerRequestContext requestContext, ContainerResponseContext responseContext){
        LogStructure log = new LogStructure();
        log.setAppVersion(requestContext.getHeaderString("user-agent"));
        log.setBody(JsonUtil.parseToJSON(responseContext.getEntity()));
        log.setEmail("filipe@teste.com");
        //log.setHeaders(JsonUtil.parseToJSON(responseContext.getHeaders()));
        log.setRequestID(requestContext.getProperty("requestID").toString());
        log.setRequestMethod(requestContext.getMethod());
        log.setRequestUrl(requestContext.getUriInfo().getAbsolutePath().getPath());
        //log.setService(responseContext);
        log.setStatusCode(responseContext.getStatus());
        log.setType("Response");
        log.setUser("filipe");
        //log.setUserIp(requestContext.getUriInfo()..remoteAddress().toString());
        log.setElapsedTime(System.currentTimeMillis() - (Long)requestContext.getProperty("startElapsedTime"));
        return log;
    }
    
}
