package node;

import errors.CustomError;

public class NodeOp extends NodeExp
{

    protected String name;

    public NodeOp(int start, int end, String name, NodeExp op)
    {
	super(start, end, op);
	this.name = name;
	// le type d'un opérateur
	NodeExp exprFct = (NodeExp) get(0);
	this.type = exprFct.type;
    }

    // Opération binaire
    // f : E X F -> F
    public NodeOp(int start, int end, String name, NodeExp op1, NodeExp op2)
    {
	super(start, end, op1, op2);
	this.name = name;
	// le type d'un opérateur
	NodeExp exprFct = (NodeExp) get(1);
	this.type = exprFct.type;
    }

    @Override public void checksType()
    {
	getOp1().checksType();
	if (super.size() > 1 && getOp2() != null)
	{
	    getOp2().checksType();
	    if (!getOp1().getType().equals(getOp2().getType()))
	    {
		throw new CustomError(
			getClass().getSimpleName() + ": pas le même type entre left" + getNameOp() + "right.", this
		);
	    }
	}
    }

    @Override public NodeOp clone()
    {
	if (size() == 1)
	{
	    return new NodeOp(this.start, this.end, this.name, (NodeExp) getOp1().clone());
	}
	else if (size() == 2)
	{ return new NodeOp(this.start, this.end, this.name, (NodeExp) getOp1().clone(), (NodeExp) getOp2().clone()); }
	return null;
    }
    
    public String getNameOp()
    {
	return this.name;
    }

    private NodeExp getOp1()
    {
	return (NodeExp) get(0);
    }
    
    private NodeExp getOp2()
    {
	return (NodeExp) get(1);
    }
    
	@Override public String generateIntermediateCode()
	{
		String tmp = "";
		switch(name)
		{
			case "println":
				tmp = "call println 1";
				break;
			case "readln":
				tmp = "call readln 1";
				break;
			default:
				break;
		}
		return tmp;
	}
}
