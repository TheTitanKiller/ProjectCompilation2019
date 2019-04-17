package node;

public final class NodeSwitch extends Node
{
    
    public NodeSwitch(Node e, Node stm)
    {
	super(e, stm);
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	if (!get(0).checksType()) { return false; }
	if (!get(1).checksType()) { return false; }
	return true;
    }
    
    @Override public NodeSwitch clone()
    {
	return new NodeSwitch((Node) getExp().clone(), (Node) getStm().clone());
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
