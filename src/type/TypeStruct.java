package type;

public class TypeStruct extends TypeComplex
{
    public TypeStruct(int start, int end, Type t)
    {
	super(start, end, t);
    }
    
    @Override public boolean attestWellFormed()
    {
	return getFeaturesList().attestWellFormed();
    }
    
    @Override public Type clone()
    {
	return new TypeStruct(this.start, this.end, (Type) get(0).clone());
    }

    public TypeFeatureList getFeaturesList()
    {
	return (TypeFeatureList) get(0);
    }
}
