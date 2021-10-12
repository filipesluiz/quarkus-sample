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
                LogInfo requestLog = LogBuilder.type(LogType.RESPONSE).build(requestContext, responseContext, null);
        LOG.info(JsonUtil.parseToJSON(requestLog));
        
    }

    // //TODO: AFTER FINISH, MOVE TO CLASS
    // private LogStructure buildLogResponse(ContainerRequestContext requestContext, ContainerResponseContext responseContext){
    //     LogStructure log = new LogStructure();
    //     log.setAppVersion(requestContext.getHeaderString(LogStructure.APP_VERSION_HEADER_KEY));
    //     log.setBody(JsonUtil.parseToJSON(responseContext.getEntity()));
    //     log.setEmail("filipe@teste.com");
    //     //log.setHeaders(JsonUtil.parseToJSON(responseContext.getHeaders()));
    //     log.setRequestID(requestContext.getProperty(LogStructure.REQUEST_ID_KEY).toString());
    //     log.setRequestMethod(requestContext.getMethod());
    //     log.setRequestUrl(requestContext.getUriInfo().getAbsolutePath().getPath());
    //     //log.setService(responseContext);
    //     log.setStatusCode(responseContext.getStatus());
    //     log.setType(LogStructure.Type.RESPONSE);
    //     log.setUser("filipe");
    //     log.setElapsedTime(System.currentTimeMillis() - (Long)requestContext.getProperty(LogStructure.START_ELAPSED_TIME_KEY));
    //     return log;
    // }
    
}
