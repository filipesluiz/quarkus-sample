package core.persistence.repository;

public abstract interface CoreSpRepositoryBase<T> {

    public abstract org.hibernate.procedure.ProcedureCall createProcedureCall(String procedureName);

    public abstract java.util.List<T> executeQuery(T entity, String name);

    public abstract org.hibernate.procedure.ProcedureCall execute(T entity, String name);

    public abstract void registerParameter(org.hibernate.procedure.ProcedureCall sp, T entity, String[] params, javax.persistence.ParameterMode mode);
}
