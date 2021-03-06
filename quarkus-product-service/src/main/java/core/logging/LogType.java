package core.logging;

import java.lang.reflect.Method;
import java.util.UUID;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

import core.interceptor.Cached;
import core.utils.JsonUtil;

public enum LogType  {
    
    REQUEST, RESPONSE, CACHE, DATABASE, INTEGRATION;
    
    protected LogInfo build(ContainerRequestContext requestContext, ContainerResponseContext responseContext, String userIp){
        LogInfo log = new LogInfo();
        log.setType(this);
        log.setAppVersion(requestContext.getHeaderString(LogInfo.APP_VERSION_HEADER_KEY));
        log.setBody(this.equals(RESPONSE)
            ? JsonUtil.parseToJSON(responseContext.getEntity())
            : null);
        log.setEmail(requestContext.getProperty("email") != null 
            ?  requestContext.getProperty("email").toString()
            : null);
        //log.setHeaders(JsonUtil.parseToJSON(responseContext.getHeaders()));
        log.setHeaders(requestContext.getHeaderString("Authorization"));
        log.setRequestID(this.equals(REQUEST)
            ? UUID.randomUUID().toString() 
            : requestContext.getProperty(LogInfo.REQUEST_ID_KEY).toString());
        log.setRequestMethod(requestContext.getMethod());
        log.setRequestUrl(requestContext.getUriInfo().getAbsolutePath().getPath());
        //log.setService(responseContext);
        log.setStatusCode(this.equals(RESPONSE)
            ? responseContext.getStatus()
            : null);
        log.setUser(requestContext.getSecurityContext().getUserPrincipal() != null 
            ?   requestContext.getSecurityContext().getUserPrincipal().getName()
            : null);
        log.setUserIp(userIp);
        log.setElapsedTime(this.equals(REQUEST) 
            ? 0
            : System.currentTimeMillis() - (Long)requestContext.getProperty(LogInfo.START_ELAPSED_TIME_KEY));
        return log;
    }

    protected LogInfo build(Cached params, Boolean isCreated, Method method, ContainerRequestContext requestContext, String tableName){
        LogInfo log = new LogInfo();
        log.setRequestID((String) requestContext.getProperty(LogInfo.REQUEST_ID_KEY));
        log.setType(this);
        log.setCacheKey(params != null 
            ? params.key() 
            : null);
        log.setCreated(isCreated);
        log.setCalledBy(method.getDeclaringClass().getSimpleName());
        log.setTtl(params != null 
            ? params.ttl() + " " + params.timeUnit().name() 
            : null);
        log.setTableName(tableName);
        return log;
    }
}
