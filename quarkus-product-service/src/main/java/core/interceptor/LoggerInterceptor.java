package core.interceptor;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.jboss.logging.Logger;

import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;

@Logged
@Interceptor
@Priority(20)
class LoggerInteceptor {

    @Inject
    Logger log;

    @AroundInvoke 
    Object interceptMethod(InvocationContext context) {
        try {
            Object ret;
            log.info(getLogJsonFormat(context));
            ret = context.proceed();
            log.info(getLogJsonFormat(context));
            return ret;
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR);
        } 
   }


    String getLogJsonFormat(InvocationContext context){
        try {
            LogStructure log = new LogStructure();
            
            return new ObjectMapper().writeValueAsString(log);
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR);
        }
   }

}