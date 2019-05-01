package type;

public class TypePointer extends TypeComplex
{
    public TypePointer(int start, int end)
    {
	super(start, end);
    }
    
    public TypePointer(int start, int end, Type t)
    {
	super(start, end, t);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (!get(0).attestWellFormed())
	{ return false; }
	return true;
    }
    
    @Override public Type clone()
    {
	if (get(0) != null)
	{
	    return new TypePointer(this.start, this.end, (Type) get(0).clone());
	}
	else
	{
	    return new TypePointer(this.start, this.end, null);
	}
    }
    
}
