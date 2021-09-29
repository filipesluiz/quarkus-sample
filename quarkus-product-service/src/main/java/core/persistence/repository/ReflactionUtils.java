package core.persistence.repository;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.Column;

import core.persistence.entity.NamedSP;
import core.persistence.entity.NamedSPs;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;

public interface ReflactionUtils {
    
    static NamedSP findNamed(Class<?> clazz, String name){
        NamedSPs queries = clazz.getAnnotation(NamedSPs.class);
        Optional<NamedSP> namedSP = Stream.of(queries.value())
            .filter(n -> n.name().equals(name))
            .findFirst();
        return namedSP.orElseThrow();
    }

    static FieldParam findField(Class<?> clazz, String param, Object instance){
        try {
            Field field = Stream.of(clazz.getDeclaredFields())
                .filter(f -> 
                    f.getName().equalsIgnoreCase(param) 
                        || (f.isAnnotationPresent(Column.class) && f.getAnnotation(Column.class).name().equalsIgnoreCase(param)))
                .findFirst().get();
            
            if(field != null){
                field.setAccessible(true);
                return new FieldParam(field.getType(), field.get(instance));
            } else 
                return new FieldParam(Object.class, null);
                   
            
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new CoreException(MessageTypeCoreException.NOT_FOUND_VALUE_PARAM_IN_ENTITY);
        }
    }

    static Class<?> getGenericTypeClass(Class<?> clazz) {
        return (Class<?>) (getParametrizedType(clazz)).getActualTypeArguments()[0];
    }

    static ParameterizedType getParametrizedType(Class<?> clazz){
        if(clazz.getSuperclass().equals(CoreSpRepository.class)){ 
            return (ParameterizedType) clazz.getGenericSuperclass();
        } else {
            return getParametrizedType(clazz.getSuperclass());
        }
    }
  

}
