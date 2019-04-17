package type;

// Type fonction arg -> ret
public class TypeFunct extends TypeComplex
{
    private boolean defined;
    private String name;
    
    public TypeFunct(String name, TypeTuple params, Type ret)
    {
	super(params, ret);
	this.name = name;
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }
    
    @Override public TypeFunct clone()
    {
	TypeFunct result = new TypeFunct(this.name, getParams().clone(), (Type) getRet().clone());
	result.setDefined(this.defined);
	return result;
    }
    
    @Override public boolean equals(Type obj)
    {
	if (!(obj instanceof TypeFunct)) { return false; }
	TypeFunct real_t = (TypeFunct) obj;
	return getParams().equals(real_t.getParams()) && getRet().equals(real_t.getRet());
    }
    
    public boolean getDefined()
    {
	return this.defined;
    }
    
    public String getName()
    {
	return this.name;
    }
    
    public TypeTuple getParams()
    {
	return (TypeTuple) get(0);
    }
    
    public Type getRet()
    {
	return get(1);
    }
    
    public void setDefined(boolean defined)
    {
	this.defined = defined;
    }
    
    public void setRet(Type type)
    {
	super.set(1, type);
    }
    
    @Override public String toString()
    {
	return getParams() + " -> " + getRet() + " Defined: " + this.defined + " Name: " + this.name;
    }
    
}
