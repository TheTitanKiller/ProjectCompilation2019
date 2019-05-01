package type;

import java.util.HashMap;

import main.ClonableSymbol;

public class TypeFeatureList extends TypeComplex
{
    HashMap<String, TypeFeature> tableFeatures = new HashMap<>();

    public TypeFeatureList(int start, int end, TypeFeature t)
    {
	super(start, end);
	add(t);
    }

    @Override public void add(Type t)
    {
	super.add(t);
	TypeFeature f = (TypeFeature) t;
	this.tableFeatures.put(f.getName(), f);
    }

    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeFeatureList(this.start, this.end, (TypeFeature) get(0).clone());
    }
    
    public TypeFeature getFeature(String name)
    {
	return this.tableFeatures.get(name);
    }
}
