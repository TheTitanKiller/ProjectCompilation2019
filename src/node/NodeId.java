package node;

import type.Type;

public final class NodeId extends NodeExp
{
    protected String name;

    public NodeId(String name, Type type)
    {
	super();
	this.name = name;
	this.type = type;
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	return true;
    }

    @Override public NodeId clone()
    {
	return new NodeId(this.name, this.type);
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
