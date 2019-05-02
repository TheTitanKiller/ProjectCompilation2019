package node;

import errors.CustomError;
import type.TypePointer;

public final class NodeDispose extends Node
{
    public NodeDispose(int start, int end, Node e)
    {
	super(start, end, e);
    }

    @Override public void checksType()
    {
	if (!(((NodeExp) get(0)).getType() instanceof TypePointer))
	{ throw new CustomError(getClass().getSimpleName() + ": not a pointer type.", this); }
    }

    @Override public NodeDispose clone()
    {
	return new NodeDispose(this.start, this.end, (Node) get(0).clone());
    }

}
