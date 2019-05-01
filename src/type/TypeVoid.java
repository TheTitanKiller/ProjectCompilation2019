package type;

import main.ClonableSymbol;

public class TypeVoid extends TypeAtomic
{
    public TypeVoid(int start, int end)
    {
	super(start, end);
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeVoid(this.start, this.end);
    }

}
