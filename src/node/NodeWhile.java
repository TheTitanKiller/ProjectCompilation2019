package node;

public final class NodeWhile extends Node
{

    public NodeWhile(int start, int end, Node boolExpr, Node stm)
    {
	super(start, end, boolExpr, stm);
    }

    @Override public void checksType()
    {
	get(0).checksType();
	get(1).checksType();
    }

    @Override public NodeWhile clone()
    {
	return new NodeWhile(this.start, this.end, (Node) getExp().clone(), (Node) getStm().clone());
    }

    private Node getExp()
    {
	return get(0);
    }

    private Node getStm()
    {
	return get(1);
    }

}
