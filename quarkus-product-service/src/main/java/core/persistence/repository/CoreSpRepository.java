package core.persistence.repository;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;

import org.hibernate.procedure.ProcedureCall;
import org.hibernate.query.procedure.ProcedureParameter;

import core.persistence.entity.NamedSP;

@ApplicationScoped
public class CoreSpRepository<T> implements CoreSpRepositoryBase<T> {

    @Inject
    EntityManager em;

    @SuppressWarnings("unchecked")
    public List<T> executeQuery(T entity, String name){
        ProcedureCall sp = execute(entity, name);
        sp.execute();
        return (List<T>) sp.getResultList();
    }

    public int executeUpdate(T entity, String name){
        ProcedureCall sp = execute(entity, name);
        return sp.executeUpdate();
    }

    public ProcedureCall execute(T entity, String name){
        NamedSP storedProcedure = ReflactionUtils.findNamed(entity.getClass(), name);
        ProcedureCall sp = createProcedureCall(storedProcedure.name());
        registerParameter(sp, entity, storedProcedure.paramsIn(), ParameterMode.IN);
        registerParameter(sp, entity, storedProcedure.paramsOut(), ParameterMode.OUT);
        return sp;
    }

    public void registerParameter(ProcedureCall sp, T entity, String[] params, javax.persistence.ParameterMode mode){
        Stream.of(params).forEach(p -> {
            FieldParam fieldParam =  ReflactionUtils.findField(entity.getClass(), p, entity);
            sp.registerParameter(p, fieldParam.type, mode);
            ((ProcedureParameter<?>) sp.getParameter(p)).enablePassingNulls(true);
            sp.setParameter(p, fieldParam.value);
        });
    }
   
    public ProcedureCall createProcedureCall(String procedureName){
        return em.createStoredProcedureQuery(procedureName).unwrap(ProcedureCall.class);
    }
    
}
