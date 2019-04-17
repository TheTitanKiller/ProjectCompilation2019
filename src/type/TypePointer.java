package type;

public class TypePointer extends TypeComplex
{
    public TypePointer()
    {
	super();
    }
    
    public TypePointer(Type t)
    {
	super(t);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (!get(0).attestWellFormed()) { return false; }
	return true;
    }
    
    @Override public Type clone()
    {
	if (get(0) != null)
	{
	    return new TypePointer((Type) get(0).clone());
	}
	else
	{
	    return new TypePointer(null);
	}
    }
    
}
