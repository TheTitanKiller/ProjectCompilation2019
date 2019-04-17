package type;

public final class TypeString extends TypeAtomic
{
    @Override public Type clone()
    {
	return new TypeString();
    }
    
}
