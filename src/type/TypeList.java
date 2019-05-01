package type;

// Type List(t)
public class TypeList extends TypeComplex
{
    public TypeList(int start, int end, Type t)
    {
	super(start, end, t);
    }
    
    @Override public boolean attestWellFormed()
    {
	return get(0).attestWellFormed();
    }
    
    @Override public Type clone()
    {
	return new TypeList(this.start, this.end, (Type) get(0).clone());
    }
    
    @Override public String toString()
    {
	return "List(" + get(0).toString() + ")";
    }
    
}
