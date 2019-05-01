package node;

import type.TypeFeature;
import type.TypeStruct;

public class NodeStructAccess extends NodeExp
{
    String feature;

    // s.c
    public NodeStructAccess(NodeExp s, String c)
    {
	super(s);
	if (s.getType() instanceof TypeStruct)
	{
	    TypeStruct t = (TypeStruct) s.getType();
	    TypeFeature f = t.getFeaturesList().getFeature(c);
	    this.type = f.getType();
	}
	this.feature = c;
    }

    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeStructAccess clone()
    {
	return new NodeStructAccess((NodeExp) get(0).clone(), getFeatureName());
    }
    
    public String getFeatureName()
    {
	return this.feature;
    }
    
}
