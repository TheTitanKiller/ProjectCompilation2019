package type;

public final class TypeString extends TypeAtomic
{
    public TypeString(int start, int end)
    {
	super(start, end);
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public Type clone()
    {
	return new TypeString(this.start, this.end);
    }

}
