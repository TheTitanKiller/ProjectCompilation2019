package type;

public class TypeItemEnum extends TypeAtomic
{
    
    private Integer const_value;
    private String name;
    private String refEnumRange;
    
    public TypeItemEnum(int start, int end, int value, String name, String refEnumRange)
    {
	super(start, end);
	this.const_value = value;
	this.refEnumRange = refEnumRange;
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }
    
    @Override public TypeItemEnum clone()
    {
	return new TypeItemEnum(this.start, this.end, this.const_value, this.name, this.refEnumRange);
    }
    
    @Override public int compareTo(Type o)
    {
	if (o instanceof TypeItemEnum)
	{
	    TypeItemEnum real_object = (TypeItemEnum) o;
	    return this.const_value.compareTo(real_object.const_value);
	}
	return 0;
    }
    
    @Override public boolean equals(Type obj)
    {
	if (!super.equals(obj))
	{
	    return false;
	}
	else if (this.const_value != ((TypeItemEnum) obj).const_value)
	{ return false; }
	return true;
    }
    
    public Integer getConst_value()
    {
	return this.const_value;
    }
    
    public String getRefEnumRange()
    {
	return this.refEnumRange;
    }
    
    public Integer getValue()
    {
	return this.const_value;
    }
    
    public void setRefEnumRange(String refEnumRange)
    {
	this.refEnumRange = refEnumRange;
    }
    
    @Override public String toString()
    {
	return super.toString() + '@' + this.refEnumRange + '=' + this.name + "(" + this.const_value + ")";
    }
    
}
