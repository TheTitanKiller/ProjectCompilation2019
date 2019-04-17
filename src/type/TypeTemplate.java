package type;

// Type variable
public class TypeTemplate extends TypeAtomic
{
    private String name;
    
    public TypeTemplate(String name)
    {
	this.name = name;
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }
    
    @Override public Type clone()
    {
	return new TypeTemplate(this.name);
    }
    
    @Override public boolean equals(Type obj)
    {
	if (obj.getClass() != this.getClass()) { return false; }
	if (!(obj instanceof TypeTemplate)) { return false; }
	TypeTemplate real_t = (TypeTemplate) obj;
	if (this.name != real_t.name) { return false; }
	return true;
    }
    
    public String getName()
    {
	return this.name;
    }
    
    @Override public Type mapping(Subst subst)
    {
	Type ret = subst.get(this.name);
	if (ret == null)
	{
	    return this;
	}
	else
	{
	    return ret;
	}
    }
    
    @Override public String toString()
    {
	return this.name;
    }
}
