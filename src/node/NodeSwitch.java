package node;

public final class NodeSwitch extends Node
{

    public NodeSwitch(Node e, Node stm)
    {
	super(e, stm);
    }

    @Override public void checksType()
    {
	get(0).checksType();
	get(1).checksType();
    }

    @Override public NodeSwitch clone()
    {
	return new NodeSwitch((Node) getExp().clone(), (Node) getStm().clone());
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
