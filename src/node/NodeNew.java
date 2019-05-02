package node;

import errors.CustomError;
import type.TypePointer;

public final class NodeNew extends Node
{
    public NodeNew(int start, int end, Node stm)
    {
	super(start, end, stm);
    }
    
    @Override public void checksType()
    {
	if (!(((NodeExp) get(0)).getType() instanceof TypePointer))
	{ throw new CustomError(getClass().getSimpleName() + ": not a pointer type.", this); }
    }
    
    @Override public NodeNew clone()
    {
	return new NodeNew(this.start, this.end, (Node) get(0).clone());
    }
}
