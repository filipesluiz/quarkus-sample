package core.interceptor;

import java.lang.reflect.Method;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

import org.jboss.logging.Logger;

import core.logging.LogBuilder;
import core.logging.LogInfo;
import core.logging.LogType;
import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;
import core.utils.JsonUtil;

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
            ret = context.proceed();
            logDataBaseInfo(context.getMethod());
            return ret;
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.INTERCEPTOR_PROCESS_ERROR, e);
        } 
   }

    private void logDataBaseInfo(Method method){
        if(method.isAnnotationPresent(Logged.class)){
            
            LogInfo logStructure = LogBuilder.type(LogType.DATABASE).build(
                  null
                , null
                , method
                , LoggerRequestFilter.containerRequestContext.get()
                , method.getAnnotation(Logged.class).target());

            LOG.info(JsonUtil.parseToJSON(logStructure));
        }
    }

}