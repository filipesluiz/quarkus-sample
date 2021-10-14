package core.utils;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.Column;

import core.persistence.entity.NamedSP;
import core.persistence.entity.NamedSPs;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;
import core.persistence.repository.CoreSpRepository;

public interface ReflactionUtil {
    
    static NamedSP findNamed(Class<?> clazz, String name){
        NamedSPs queries = clazz.getAnnotation(NamedSPs.class);
        Optional<NamedSP> namedSP = Stream.of(queries.value())
            .filter(n -> n.name().equals(name))
            .findFirst();
        return namedSP.orElseThrow();
    }

    static FieldParam findField(Class<?> clazz, String param, Object instance){
        try {
            Field field = findDeclaredField(clazz, param, instance);
            
            if(field != null){
                field.setAccessible(true);
                return new FieldParam(field.getType(), field.get(instance));
            } else 
                return new FieldParam(Object.class, null);
                   
            
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new CoreException(MessageTypeCoreException.NOT_FOUND_VALUE_PARAM_IN_ENTITY, e);
        }
    }

    static Object setFieldValue(Class<?> clazz, String param, Object instance, Object value){
        try {
            Field field = findDeclaredField(clazz, param, instance);
            
            if(field != null){
                field.setAccessible(true);
                field.set(instance, value);  
            }      
            return instance;
        } catch (IllegalArgumentException | IllegalAccessException e) {
            throw new CoreException(MessageTypeCoreException.NOT_FOUND_VALUE_PARAM_IN_ENTITY, e);
        }
    }

    private static Field findDeclaredField(Class<?> clazz, String param, Object instance){
        try {
            Field field = Stream.of(clazz.getDeclaredFields())
                .filter(f -> 
                    f.getName().equalsIgnoreCase(param) 
                        || (f.isAnnotationPresent(Column.class) && f.getAnnotation(Column.class).name().equalsIgnoreCase(param)))
                .findFirst().get();
            
            return field;
        } catch (IllegalArgumentException e) {
            throw new CoreException(MessageTypeCoreException.NOT_FOUND_VALUE_PARAM_IN_ENTITY, e);
        }
    }

    static Class<?> getGenericTypeClass(Class<?> clazz) {
        return (Class<?>) (getParametrizedType(clazz)).getActualTypeArguments()[0];
    }

    private static ParameterizedType getParametrizedType(Class<?> clazz){
        if(clazz.getSuperclass().equals(CoreSpRepository.class)){ 
            return (ParameterizedType) clazz.getGenericSuperclass();
        } else {
            return getParametrizedType(clazz.getSuperclass());
        }
    }
  

}
