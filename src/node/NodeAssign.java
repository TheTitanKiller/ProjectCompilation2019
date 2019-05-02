package node;

import errors.CustomError;
import type.Type;
import main.Main;
import intermediateCode.*;
import type.TypeArray;
import type.TypePointer;

public final class NodeAssign extends Node
{
    public NodeAssign(int start, int end, NodeExp lhs, NodeExp rhs)
    {
	super(start, end, lhs, rhs);
    }
    
    @Override public void checksType()
    {
	get(0).checksType();
	get(1).checksType();
	Type lhsType = getLhs().getType();
	Type rhsType = getRhs().getType();
	if (lhsType == null || rhsType == null)
	{ throw new CustomError(getClass().getSimpleName() + ": assignment on null type.", this); }
	if (!lhsType.equals(rhsType))
	{
	    if (lhsType instanceof TypePointer && rhsType instanceof TypePointer && ((TypePointer) rhsType).size() == 0)
	    { return; }
	    throw new CustomError(getClass().getSimpleName() + ": assignment not on same type.", this);
	}
	else
	{
	    if (lhsType instanceof TypeArray && rhsType instanceof TypeArray)
	    {
		if (!((TypeArray) lhsType).get(0).equals(((TypeArray) rhsType).get(0)))
		{ throw new CustomError(getClass().getSimpleName() + ": assignment not on same type complexe.", this); }
	    }
	}

    }
    
    @Override public NodeAssign clone()
    {
	return new NodeAssign(this.start, this.end, (NodeExp) getLhs().clone(), (NodeExp) getRhs().clone());
    }

    private NodeExp getLhs()
    {
	return (NodeExp) get(0);
    }
    
    private NodeExp getRhs()
    {
	return (NodeExp) get(1);
    }

    @Override public String generateIntermediateCode()
    {
        Main.temps = new TempValueList(new Temp(new TempValue()), Main.temps);
    }

}
