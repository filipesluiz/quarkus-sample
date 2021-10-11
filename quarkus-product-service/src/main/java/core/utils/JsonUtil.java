package core.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.persistence.exceptions.CoreException;
import core.persistence.exceptions.MessageTypeCoreException;

public class JsonUtil {

    public static String parseToJSON(Object object){
        try {
            return new ObjectMapper().writeValueAsString(object);
        } catch (Exception e) {
            throw new CoreException(MessageTypeCoreException.JSON_PARSER_ERROR, e);
        }
   }
    
}
