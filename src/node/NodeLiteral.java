package node;

import type.Type;

public final class NodeLiteral extends NodeExp
{
    private Object value;
    
    public NodeLiteral(Type type, Object value)
    {
	super();
	this.type = type;
	this.value = value;
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeLiteral clone()
    {
	return new NodeLiteral(this.type, this.value);
    }
    
    @Override public String toDotNodeName()
    {
	return "NodeLiteral " + this.value.toString();
    }
    
    @Override public String toString()
    {
	return this.getClass().getSimpleName() + '#' + this.value + ':' + this.type + '#';
    }
    
}
