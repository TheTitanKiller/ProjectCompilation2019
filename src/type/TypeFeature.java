package type;

import main.ClonableSymbol;

public class TypeFeature extends TypeComplex
{
    private String name;

    public TypeFeature(int start, int end, String name, Type t)
    {
	super(start, end, t);
	this.name = name;
    }

    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeFeature(this.start, this.end, this.name, (Type) get(0).clone());
    }

    public String getName()
    {
	return this.name;
    }

    public Type getType()
    {
	return this.componant.get(0);
    }

    @Override public String toString()
    {
	String ret = '[' + this.name + ':';
	for (Type elt : this.componant)
	{
	    ret += elt.toString();
	}
	ret += ']';
	return ret;
    }

}
