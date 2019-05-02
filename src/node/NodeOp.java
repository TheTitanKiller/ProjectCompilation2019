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
				tmp = "CALL(println, 1)\n";
				break;
			case "readln":
				tmp = "CALL(readln, 1)\n";
				break;
			case "+":
				tmp = "ADD(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "-":
				tmp = "SUB(" getOp1().generateIntermediateCode() + ((getOp2() == null) ? "" : ", " + getOp2().generateIntermediateCode()) + ")\n";
				break;
			case "*":
				tmp = "MULT(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "/":
				tmp = "DIV(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "||":
				tmp = "OR(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "&&":
				tmp = "AND(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "<":
				tmp = "LT(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "<=":
				tmp = "LEQ(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case ">":
				tmp = "GT(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case ">=":
				tmp = "GEQ(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "==":
				tmp = "EQ(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "!=":
				tmp = "NEQ(" getOp1().generateIntermediateCode() + ", " + getOp2().generateIntermediateCode() + ")\n";
				break;
			case "!":
				tmp = "NOT(" + getOp1().generateIntermediateCode() + ")\n";
				break;	
			default:
				break;
		}
		return tmp;
	}
}
