package node;

import errors.CustomError;
import type.TypeBoolean;
import type.TypeInt;

public class NodeRel extends NodeExp
{
    protected String name;

    // Relation binaire
    // f : E X F -> {0,1}
    public NodeRel(int start, int end, String name, Node op1, Node op2)
    {
	super(start, end, op1, op2);
	this.name = name;
	this.type = new TypeBoolean(start, end);
    }

    @Override public void checksType()
    {
	if (!(getOp1().getType() instanceof TypeInt) || !(getOp2().getType() instanceof TypeInt))
	{ throw new CustomError(getClass().getSimpleName() + ": un des paramétres n'est pas un entier.", this); }
    }

    @Override public NodeRel clone()
    {
	return new NodeRel(this.start, this.end, this.name, (Node) getOp1().clone(), (Node) getOp2().clone());
    };

    private NodeExp getOp1()
    {
	return (NodeExp) get(0);
    }

    private NodeExp getOp2()
    {
	return (NodeExp) get(1);
    };

}
