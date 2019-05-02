package type;

// Tout type non complexe non variable
public abstract class TypeAtomic extends Type
{
    
    protected TypeAtomic(int start, int end)
    {
	super(start, end);
    }

    @Override public boolean equals(Object obj)
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
