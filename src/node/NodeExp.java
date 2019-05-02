package node;

import type.Type;

public abstract class NodeExp extends Node
{
    protected Type type;

    public NodeExp(int start, int end, Node... abstTrees)
    {
	super(start, end, abstTrees);
    }

    public Type getType()
    {
	return this.type;
    }

}
