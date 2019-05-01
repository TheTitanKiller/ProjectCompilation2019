package node;

public final class NodeWhile extends Node
{
    
    public NodeWhile(Node boolExpr, Node stm)
    {
	super(boolExpr, stm);
    }
    
    @Override public void checksType()
    {
	get(0).checksType();
	get(1).checksType();
    }
    
    @Override public NodeWhile clone()
    {
	return new NodeWhile((Node) getExp().clone(), (Node) getStm().clone());
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
