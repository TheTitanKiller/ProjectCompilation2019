package node;

public final class NodeNew extends Node
{
    
    public NodeNew(Node stm)
    {
	super(stm);
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	return true;
    }
    
    @Override public NodeNew clone()
    {
	return new NodeNew((Node) get(0).clone());
    }
}