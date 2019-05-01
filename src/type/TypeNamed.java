package type;

import main.ClonableSymbol;

public class TypeNamed extends TypeAtomic
{
    private String name;

    public TypeNamed(int start, int end, String name)
    {
	super(start, end);
	this.name = name;
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeNamed(this.start, this.end, this.name);
    }

    public String getName()
    {
	return this.name;
    }
    
    @Override public String toString()
    {
	return super.toString() + '_' + this.name;
    }

}
