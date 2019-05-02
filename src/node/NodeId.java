package node;

import type.Type;

public final class NodeId extends NodeExp
{
    protected String name;

    public NodeId(int start, int end, String name, Type type)
    {
	super(start, end);
	this.name = name;
	this.type = type;
    }
    
    @Override public void checksType()
    {
	return;
    }

    @Override public NodeId clone()
    {
	return new NodeId(this.start, this.end, this.name, this.type);
    }

    public String getName()
    {
	return this.name;
    }

    @Override protected String toDotNodeName()
    {
	return "NodeId " + this.name;
    }

    @Override public String toString()
    {
	return this.getClass().getSimpleName() + "#" + this.name + ':' + this.type + '#';
    }

}
