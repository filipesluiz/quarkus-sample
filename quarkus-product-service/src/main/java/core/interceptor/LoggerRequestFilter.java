package core.interceptor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

import org.jboss.logging.Logger;

import core.logging.LogBuilder;
import core.logging.LogInfo;
import core.logging.LogType;
import core.utils.JsonUtil;
import io.vertx.core.http.HttpServerRequest;

@Provider
public class LoggerRequestFilter implements ContainerRequestFilter {


    public static ThreadLocal<ContainerRequestContext> containerRequestContext = new ThreadLocal<>(); 

    @Context
    UriInfo info;

    @Context
    HttpServerRequest request;

    @Inject
    Logger LOG;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        requestContext.setProperty(LogInfo.START_ELAPSED_TIME_KEY, System.currentTimeMillis());
        LogInfo requestLog = LogBuilder.type(LogType.REQUEST).build(requestContext, null, request.remoteAddress().toString());
        requestContext.setProperty(LogInfo.REQUEST_ID_KEY, requestLog.getRequestID());
        containerRequestContext.set(requestContext);
        LOG.info(JsonUtil.parseToJSON(requestLog));
    }

    // //TODO: AFTER FINISH, MOVE TO CLASS
    // LogStructure buildLogRequest(ContainerRequestContext requestContext){
    //     LogStructure log = new LogStructure();
    //     log.setElapsedTime(System.currentTimeMillis());
    //     log.setAppVersion(request.getHeader(LogStructure.APP_VERSION_HEADER_KEY));
    //     log.setEmail("filipe@teste.com");
    //     //log.setHeaders(JsonUtil.parseToJSON(requestContext.getHeaders()));
    //     log.setRequestID(UUID.randomUUID().toString());
    //     log.setRequestMethod(request.method().name());
    //     log.setRequestUrl(request.absoluteURI());
    //     log.setType(LogStructure.Type.REQUEST);
    //     log.setUser("filipe");
    //     log.setUserIp(request.remoteAddress().toString());
    //     return log;
    // }

    
}
