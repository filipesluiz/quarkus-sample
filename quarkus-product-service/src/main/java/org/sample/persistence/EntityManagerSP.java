package org.sample.persistence;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.hibernate.procedure.ProcedureCall;

@ApplicationScoped
public final class EntityManagerSP  {

    // @Inject
    // EntityManager entityManager;

    // public List<?> findAll(Object entity){

    //     ProcedureCall call = entityManager.createStoredProcedureQuery(ReflactionUtils.getProcedureName(entity)).unwrap(ProcedureCall.class);
        
    // }

    // static class ReflactionUtils {

    //     static String getProcedureName(Object entity){
    //         if(hasEntityAnnotion(entity))
    //             return entity.getClass().getAnnotation(Entity.class).name();
            
    //         throw new PersistenceException("Objeto de consulta NAO contem a anotacao @Entity!!!");
    //     }
        
    //     private static boolean hasEntityAnnotion(Object target){
    //         return target.getClass().isAnnotationPresent(Entity.class);
    //     }

        

    // }
}