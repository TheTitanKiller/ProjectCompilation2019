package type;

// Type integer
public final class TypeInt extends TypeAtomic
{
    private Integer const_value;

    public TypeInt(int start, int end)
    {
	super(start, end);
    }

    public TypeInt(int start, int end, Integer const_value)
    {
	this(start, end);
	this.const_value = const_value;
    }

    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public Type clone()
    {
	return new TypeInt(this.start, this.end, getConst_value());
    }

    @Override public int compareTo(Type o)
    {
	if (o instanceof TypeInt)
	{
	    TypeInt real_object = (TypeInt) o;
	    if (this.const_value != null && real_object.const_value != null)
	    { return this.const_value.compareTo(real_object.const_value); }
	}
	return 0;
    }

    public Integer getConst_value()
    {
	return this.const_value;
    }
    
    @Override public String toString()
    {
	return super.toString() + '_' + getConst_value();
    }

}
