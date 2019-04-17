package type;

import main.ClonableSymbol;

public class TypeBoolean extends TypeAtomic
{
    @Override public ClonableSymbol clone()
    {
	return new TypeBoolean();
    }
    
}
