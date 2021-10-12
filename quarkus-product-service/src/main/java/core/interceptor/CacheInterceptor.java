package core.interceptor;

import java.lang.reflect.Method;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;

import org.jboss.logging.Logger;
import org.redisson.api.RedissonClient;

import core.cache.CacheImpl;
import core.logging.LogBuilder;
import core.logging.LogInfo;
import core.logging.LogType;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;
import core.utils.JsonUtil;

@Cached
@Interceptor
@Priority(20)
public class CacheInterceptor extends CacheImpl { 
 
    @Inject
    RedissonClient redis;

    @Inject
    Logger LOG;

    @AroundInvoke 
    Object interceptMethod(InvocationContext context) {
        try {
            Object ret;
            if(isCached(context.getMethod())){
                Cached params = context.getMethod().getAnnotation(Cached.class);
                if(isExists(params.key()) && !params.isToForceConsult()){
                    logCacheInfo(params, false, context.getMethod());
                    return get(params.key());
                }
                ret = context.proceed();
                add(params.key(), ret, params.ttl(), params.timeUnit());
                logCacheInfo(params, false, context.getMethod());
                return ret;
            }

            ret = context.proceed();
            return ret;
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR, e);
        } 
    }

    private void logCacheInfo(Cached params, Boolean isCreated, Method method){
        LogInfo logStructure = LogBuilder.type(LogType.CACHE).build(params, false, method, LoggerRequestFilter.containerRequestContext.get());
        LOG.info(JsonUtil.parseToJSON(logStructure));
    }

    // private LogInfo buildLogCache(Cached params, Boolean isCreated, Method method){
    //     LogInfo log = new LogInfo();
    //     log.setRequestID((String) requestContext.getProperty(LogInfo.REQUEST_ID_KEY));
    //     log.setType(LogStructure.LogInfo.CACHE);
    //     log.setCacheKey(params.key());
    //     log.setCreated(isCreated);
    //     log.setCalledBy(method.getDeclaringClass().getName());
    //     log.setTtl(params.ttl() + " " + params.timeUnit().name());
    //     return log;
    // }

    @Override
    protected RedissonClient getRedisClient() {
        return redis;
    }

    
}



