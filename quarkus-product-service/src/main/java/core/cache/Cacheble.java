 package core.cache;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public interface Cacheble {

    void add(String key, Object value, long ttl, TimeUnit timeUnit);

    Object get(String key);

    void remove(String key);

    boolean isCached(Method method);

    boolean isExists(String key);
    
}
