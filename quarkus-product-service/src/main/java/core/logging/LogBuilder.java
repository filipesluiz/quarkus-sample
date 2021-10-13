package core.logging;

import java.lang.reflect.Method;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;

import core.interceptor.Cached;

public class LogBuilder {

    private static LogBuilder instance;

    private LogBuilder(){}

    private LogType logType;

    public static synchronized LogBuilder type(LogType logType){
        if(instance == null)
            instance = new LogBuilder();
        
        instance.logType = logType;

        return instance;
    }

    public LogInfo build(ContainerRequestContext requestContext, ContainerResponseContext responseContext, String userIp){
      return logType.build(requestContext, responseContext, userIp);
    }

    public LogInfo build(Cached params, Boolean isCreated, Method method, ContainerRequestContext requestContext, String tableName){
         return logType.build(params, isCreated, method, requestContext, tableName);
    }
    
    
}
