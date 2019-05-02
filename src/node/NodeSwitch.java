package node;

public final class NodeSwitch extends Node
{
    public NodeSwitch(int start, int end, Node e, Node stm)
    {
	super(start, end, e, stm);
    }
    
    @Override public void checksType()
    {
	get(0).checksType();
	get(1).checksType();
    }
    
    @Override public NodeSwitch clone()
    {
	return new NodeSwitch(this.start, this.end, (Node) getExp().clone(), (Node) getStm().clone());
    }
    
    private Node getExp()
    {
	return get(0);
    }
    
    private Node getStm()
    {
	return get(1);
    }
    
}
