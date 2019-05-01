package type;

import main.ClonableSymbol;

public class TypeBoolean extends TypeAtomic
{
    public TypeBoolean(int start, int end)
    {
	super(start, end);
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeBoolean(this.start, this.end);
    }

}
