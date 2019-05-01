package node;

import type.Type;
import type.TypeComplex;
import type.TypePointer;

public final class NodePtrAccess extends NodeExp
{
    // e = NodeExp(TypePointer(tr))
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
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodePtrAccess clone()
    {
	return new NodePtrAccess((NodeExp) get(0).clone());
    }
    
}
