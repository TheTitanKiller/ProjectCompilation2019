package type;

import main.ClonableSymbol;

public class TypeArray extends TypeComplex
{
    public TypeArray(Type t1, Type t2)
    {
	super(t1, t2);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (!getRangeOREnum().attestWellFormed()) { return false; }
	if (!getType().attestWellFormed()) { return false; }
	return true;
    }
    
    @Override public ClonableSymbol clone()
    {
	Type result = new TypeArray((Type) get(0).clone(), (Type) get(1).clone());
	return result;
    }
    
    public TypeRange getRangeOREnum()
    {
	return (TypeRange) get(0);
    }
    
    private Type getType()
    {
	return get(1);
    }
    
}
