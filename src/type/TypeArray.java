package type;

import main.ClonableSymbol;

public class TypeArray extends TypeComplex
{
    public TypeArray(int start, int end, Type t1, Type t2)
    {
	super(start, end, t1, t2);
    }

    @Override public boolean attestWellFormed()
    {
	if (!getRangeOREnum().attestWellFormed())
	{ return false; }
	if (!getType().attestWellFormed())
	{ return false; }
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	Type result = new TypeArray(this.start, this.end, (Type) get(0).clone(), (Type) get(1).clone());
	return result;
    }

    @Override public boolean equals(Object obj)
    {
	// TODO Auto-generated method stub
	return false;
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
