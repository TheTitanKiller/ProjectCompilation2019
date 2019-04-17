package node;

import type.Type;

public final class NodeAssign extends Node
{
    public NodeAssign(NodeExp lhs, NodeExp rhs)
    {
	super(lhs, rhs);
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	if (!get(0).checksType()) { return false; }
	if (!get(1).checksType()) { return false; }
	Type lhsType = getLhs().getType();
	Type rhsType = getRhs().getType();
	if (lhsType == null || rhsType == null || !lhsType.equals(rhsType))
	{
	    return false;
	}
	else
	{
	    return true;
	}
    }
    
    @Override public NodeAssign clone()
    {
	return new NodeAssign((NodeExp) getLhs().clone(), (NodeExp) getRhs().clone());
    };
    
    private NodeExp getLhs()
    {
	return (NodeExp) get(0);
    }
    
    private NodeExp getRhs()
    {
	return (NodeExp) get(1);
    };
    
}
