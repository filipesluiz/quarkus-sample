package core.persistence.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Repeatable(NamedSPs.class)
@Target({ElementType.TYPE}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface NamedSP {
    String name();
    String[] paramsIn() default {};
    String[] paramsOut() default {};
}
