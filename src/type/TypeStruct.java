package type;

public class TypeStruct extends TypeComplex
{
    public TypeStruct(Type t)
    {
	super(t);
    }

    @Override public boolean attestWellFormed()
    {
	return getFeaturesList().attestWellFormed();
    }

    @Override public Type clone()
    {
	return new TypeStruct((Type) get(0).clone());
    }
    
    public TypeFeatureList getFeaturesList()
    {
	return (TypeFeatureList) get(0);
    }
}
