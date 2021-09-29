package core.persistence.repository;

class FieldParam {
    Class<?> type;
    Object value;

    public FieldParam(Class<?> type, Object value){
        this.type = type;
        this.value = value;
    }
}
