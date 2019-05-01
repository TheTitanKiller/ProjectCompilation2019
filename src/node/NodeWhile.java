package node;

public final class NodeWhile extends Node
{
    
    public NodeWhile(Node boolExpr, Node stm)
    {
	super(boolExpr, stm);
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	if (!get(0).checksType()) { return false; }
	if (!get(1).checksType()) { return false; }
	return true;
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

    @Override
    public void generateIntermediateCode()
    {
        getExp().generateIntermediateCode();
        getStm().generateIntermediateCode();
    }
    
}
