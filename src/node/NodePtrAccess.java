package node;

import type.Type;
import type.TypeComplex;
import type.TypePointer;

public final class NodePtrAccess extends NodeExp
{
    // e = NodeExp(TypePointer(\tau))
    public NodePtrAccess(NodeExp e)
    {
	super(e);
	if (e.getType() instanceof TypeComplex)
	{
	    Type t = e.getType();
	    if (t != null && t instanceof TypePointer)
	    {
		Type tr = ((TypePointer) t).get(0);
		if (tr != null)
		{
		    this.type = tr;
		}
	    }
	}
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	return true;
    }
    
    @Override public NodePtrAccess clone()
    {
	return new NodePtrAccess((NodeExp) get(0).clone());
    }
    
}
