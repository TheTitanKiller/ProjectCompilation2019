package node;

public final class NodeIf extends Node
{
    public NodeIf(int start, int end, Node boolExp, Node stm)
    {
	super(start, end, boolExp, stm);
    }
    
    public NodeIf(int start, int end, Node e, Node stm1, Node stm2)
    {
	super(start, end, e, stm1, stm2);
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeIf clone()
    {
	Node expNode = getExpNode();
	Node thenNode = getThenNode();
	Node elseNode = getElseNode();
	if (elseNode == null)
	{
	    return new NodeIf(this.start, this.end, (Node) expNode.clone(), (Node) thenNode.clone());
	}
	else
	{
	    return new NodeIf(this.start, this.end, expNode, (Node) thenNode.clone(), (Node) elseNode.clone());
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

	@Override public String generateIntermediateCode()
	{
		return "IF(" + getExpNode().generateIntermediateCode() +")\n"
			 + "THEN(" + getThenNode().generateIntermediateCode() + ")\n"
			 + (getElseNode() == null) ? "" : "ELSE(" + getElseNode().generateIntermediateCode() + ")\n";
	}
    
}
