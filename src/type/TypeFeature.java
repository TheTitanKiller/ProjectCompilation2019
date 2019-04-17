package type;

import main.ClonableSymbol;

public class TypeFeature extends TypeComplex
{
    private String name;
    
    public TypeFeature(String name, Type t)
    {
	super(t);
	this.name = name;
    }
    
    @Override public boolean attestWellFormed()
    {
	// TODO Auto-generated method stub
	return false;
    }
    
    @Override public ClonableSymbol clone()
    {
	return new TypeFeature(this.name, (Type) get(0).clone());
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
