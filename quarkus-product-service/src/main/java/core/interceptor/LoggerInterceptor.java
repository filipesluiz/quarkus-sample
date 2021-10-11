package core.interceptor;

import java.util.UUID;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.jboss.logging.Logger;

import core.logging.LogStructure;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;

@Logged
@Interceptor
@Priority(30)
class LoggerInteceptor {

    @Inject
    Logger LOG;

    @AroundInvoke 
    Object interceptMethod(InvocationContext context) {
        try {
            Object ret;
            //LOG.info(getLogJsonFormat(context));
            ret = context.proceed();
            //LOG.info(getLogJsonFormat(context));
            return ret;
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR, e);
        } 
   }


    String getLogJsonFormat(InvocationContext context){
        try {
            LogStructure log = new LogStructure();
            log.setRequestID(UUID.randomUUID().toString());
            //log.setRequestUrl(requestUrl);
            return new ObjectMapper().writeValueAsString(log);
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR, e);
        }
   }

}