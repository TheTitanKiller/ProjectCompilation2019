package node;

public final class NodeDispose extends Node
{
    public NodeDispose(Node e)
    {
	super(e);
    }

    @Override public void checksType()
    {
	return;
    }

    @Override public NodeDispose clone()
    {
	return new NodeDispose((Node) get(0).clone());
    }

}
