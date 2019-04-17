package node;

public final class NodeIf extends Node
{
    public NodeIf(Node boolExp, Node stm)
    {
	super(boolExp, stm);
    }
    
    public NodeIf(Node e, Node stm1, Node stm2)
    {
	super(e, stm1, stm2);
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	return true;
    }
    
    @Override public NodeIf clone()
    {
	Node expNode = getExpNode();
	Node thenNode = getThenNode();
	Node elseNode = getElseNode();
	if (elseNode == null)
	{
	    return new NodeIf((Node) expNode.clone(), (Node) thenNode.clone());
	}
	else
	{
	    return new NodeIf(expNode, (Node) thenNode.clone(), (Node) elseNode.clone());
	}
    }
    
    private Node getElseNode()
    {
	if (size() == 3)
	{
	    return get(2);
	}
	else
	{
	    return null;
	}
    }
    
    private Node getExpNode()
    {
	return get(0);
    }
    
    private Node getThenNode()
    {
	return get(1);
    }
    
}
