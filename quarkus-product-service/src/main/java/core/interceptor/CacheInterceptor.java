package core.interceptor;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.redisson.api.RedissonClient;

import core.cache.CacheImpl;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;

@Cached
@Interceptor
@Priority(20)
public class CacheInterceptor extends CacheImpl { 
 
    @Inject
    RedissonClient redis;

    @AroundInvoke 
    Object interceptMethod(InvocationContext context) {
        try {
            Object ret;

            if(isCached(context.getMethod())){
                Cached params = context.getMethod().getAnnotation(Cached.class);
                if(isExists(params.key()) && !params.forceConsult()){
                    return get(params.key());
                }
                ret = context.proceed();
                add(params.key(), ret, params.ttl(), params.timeUnit());
                return ret;
            }


            ret = context.proceed();
                        
            //redis.getBucket("product").set("");
            //redis.getBucket("product").get();
            //redis.getBucket("product").
            //String key = redisClient.get("key").
            //LOG.info(getLogJsonFormat(context));
           // redis.getBucket("products").set("");
            //redis.getBucket("products").is
            //redis.getBucket("products")
            return ret;
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR, e);
        } 
    }

    @Override
    protected RedissonClient getRedisClient() {
        return redis;
    }

    
}



