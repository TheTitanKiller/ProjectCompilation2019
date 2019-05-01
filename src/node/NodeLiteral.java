package node;

import type.Type;

public final class NodeLiteral extends NodeExp
{
    private Object value;

    public NodeLiteral(int start, int end, Type type, Object value)
    {
	super(start, end);
	this.type = type;
	this.value = value;
    }

    @Override public void checksType()
    {
	return;
    }

    @Override public NodeLiteral clone()
    {
	return new NodeLiteral(this.start, this.end, this.type, this.value);
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
