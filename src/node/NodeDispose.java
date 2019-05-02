package node;

public final class NodeDispose extends Node
{
    public NodeDispose(int start, int end, Node e)
    {
	super(start, end, e);
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeDispose clone()
    {
	return new NodeDispose(this.start, this.end, (Node) get(0).clone());
    }
    
}
