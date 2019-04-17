package type;

import main.ClonableSymbol;

// Tout type non complexe non variable
public abstract class TypeAtomic extends Type
{
    @Override public boolean attestWellFormed()
    {
	return true;
    }
    
    @Override public abstract ClonableSymbol clone();
    
    @Override public boolean equals(Type obj)
    {
	return this.getClass() == obj.getClass();
    }
    
    @Override public Type mapping(Subst subst)
    {
	return this;
    }
    
    @Override public String toString()
    {
	return this.getClass().getSimpleName();
    }
    
}
