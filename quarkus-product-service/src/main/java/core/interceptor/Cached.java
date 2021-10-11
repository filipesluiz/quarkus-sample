package core.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

import javax.enterprise.util.Nonbinding;
import javax.interceptor.InterceptorBinding;
import javax.ws.rs.NameBinding;

@InterceptorBinding
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@NameBinding
public @interface Cached {
    @Nonbinding String key() default "";
    @Nonbinding long ttl() default -1;
    @Nonbinding TimeUnit timeUnit() default TimeUnit.MILLISECONDS;
    @Nonbinding boolean forceConsult() default false;
}