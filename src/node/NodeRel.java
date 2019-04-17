package node;

import type.TypeBoolean;
import type.TypeInt;

public class NodeRel extends NodeExp
{
    
    protected String name;
    
    // Relation binaire
    // f : E X F -> {0,1}
    public NodeRel(String name, Node op1, Node op2)
    {
	super(op1, op2);
	this.name = name;
	this.type = new TypeBoolean();
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	if (!(getOp1().getType() instanceof TypeInt) || !(getOp2().getType() instanceof TypeInt)) { return false; }
	return true;
    }
    
    @Override public NodeRel clone()
    {
	return new NodeRel(this.name, (Node) getOp1().clone(), (Node) getOp2().clone());
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
