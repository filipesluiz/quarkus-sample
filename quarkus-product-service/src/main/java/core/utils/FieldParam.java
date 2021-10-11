package core.utils;

public class FieldParam {
    private Class<?> type;
    private Object value;

    public FieldParam(Class<?> type, Object value){
        this.type = type;
        this.value = value;
    }

    public Class<?> getType() {
        return type;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    
}
