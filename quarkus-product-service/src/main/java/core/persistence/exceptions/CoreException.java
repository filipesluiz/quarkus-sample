package core.persistence.exceptions;

public class CoreException extends RuntimeException {
    
    public CoreException(MessageTypeCoreException type){
        super(type.name());
    }

}
