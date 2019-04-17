package type;

// Type List(t)
public class TypeList extends TypeComplex
{
    public TypeList(Type t)
    {
	super(t);
    }
    
    @Override public boolean attestWellFormed()
    {
	return get(0).attestWellFormed();
    }
    
    @Override public Type clone()
    {
	return new TypeList((Type) get(0).clone());
    }
    
    @Override public String toString()
    {
	return "List(" + get(0).toString() + ")";
    }
    
}
