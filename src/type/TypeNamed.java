package type;

import main.ClonableSymbol;

public class TypeNamed extends TypeAtomic
{
    private String name;
    
    public TypeNamed(String name)
    {
	super();
	this.name = name;
    }

    public String getName() { return this.name; }
    
    @Override public ClonableSymbol clone()
    {
	return new TypeNamed(this.name);
    }
    
    @Override public String toString()
    {
	return super.toString() + '_' + this.name;
    }
    
}
