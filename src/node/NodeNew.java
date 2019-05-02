package node;

public final class NodeNew extends Node
{
    
    public NodeNew(int start, int end, Node stm)
    {
	super(start, end, stm);
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeNew clone()
    {
	return new NodeNew(this.start, this.end, (Node) get(0).clone());
    }
}
