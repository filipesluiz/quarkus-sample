package core.cache;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;

import core.interceptor.Cached;

public abstract class CacheImpl implements Cacheble {
    
    protected abstract RedissonClient getRedisClient();

    public void add(String key, Object value, long ttl, TimeUnit timeUnit) {
        RBucket<Object> bucket = getRedisClient().getBucket(key);
        bucket.set(value); 
        if(ttl > 0)
            bucket.expire(ttl, timeUnit);
    }

    public Object get(String key){
        return getRedisClient().getBucket(key).get();
    }

    
    public void remove(String key) {
        getRedisClient().getBucket(key).delete();
    }

    public boolean isCached(Method method) {
        return method.isAnnotationPresent(Cached.class);
    }

    public boolean isExists(String key) {
        return getRedisClient().getBucket(key).isExists();
    }
}
