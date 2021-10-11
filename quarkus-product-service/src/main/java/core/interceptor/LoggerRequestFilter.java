package core.interceptor;

import java.io.IOException;
import java.util.UUID;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;

import core.logging.LogStructure;
import core.utils.JsonUtil;
import io.vertx.core.http.HttpServerRequest;

@Provider
public class LoggerRequestFilter implements ContainerRequestFilter {

    @Context
    UriInfo info;

    @Context
    HttpServerRequest request;

    @Inject
    Logger LOG;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        requestContext.setProperty("startElapsedTime", System.currentTimeMillis());
        LogStructure requestLog = logRequest(requestContext);
        requestContext.setProperty("requestID", requestLog.getRequestID());
        LOG.info(JsonUtil.parseToJSON(requestLog));
    }

    //TODO: AFTER FINISH, MOVE TO CLASS
    LogStructure logRequest(ContainerRequestContext requestContext){
        LogStructure log = new LogStructure();
        log.setElapsedTime(System.currentTimeMillis());
        log.setAppVersion(request.getHeader("user-agent"));
        log.setEmail("filipe@teste.com");
        //log.setHeaders(JsonUtil.parseToJSON(requestContext.getHeaders()));
        log.setRequestID(UUID.randomUUID().toString());
        log.setRequestMethod(request.method().name());
        log.setRequestUrl(request.absoluteURI());
        log.setType("Request");
        log.setUser("filipe");
        return log;
    }

    
}
