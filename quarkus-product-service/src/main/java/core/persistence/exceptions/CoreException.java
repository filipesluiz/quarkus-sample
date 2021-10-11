package core.persistence.exceptions;

public class CoreException extends RuntimeException {
    
    public CoreException(MessageTypeCoreException type, Throwable e){
        super(type.name(), e);
    }

}
