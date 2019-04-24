package node;

public class NodeOp extends NodeExp
{
    
    protected String name;
    
    public NodeOp(String name, NodeExp op)
    {
	super(op);
	this.name = name;
	// le type d'un opérateur
	NodeExp exprFct = (NodeExp) get(0);
	this.type = exprFct.type;
    }
    
    // Opération binaire
    // f : E X F -> F
    public NodeOp(String name, NodeExp op1, NodeExp op2)
    {
	super(op1, op2);
	this.name = name;
	// le type d'un opérateur
	NodeExp exprFct = (NodeExp) get(1);
	this.type = exprFct.type;
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	if (super.size() > 1 && getOp2() != null && !getOp1().getType().equals(getOp2().getType()))
	{ return false; }
	return true;
    }
    
    @Override public NodeOp clone()
    {
	if (size() == 1)
	{
	    return new NodeOp(this.name, (NodeExp) getOp1().clone());
	}
	else if (size() == 2)
	{ return new NodeOp(this.name, (NodeExp) getOp1().clone(), (NodeExp) getOp2().clone()); }
	return null;
    };
    
    public String getNameOp()
    {
	return this.name;
    }
    
    private NodeExp getOp1()
    {
	return (NodeExp) get(0);
    };
    
    private NodeExp getOp2()
    {
	return (NodeExp) get(1);
    };
    
}
