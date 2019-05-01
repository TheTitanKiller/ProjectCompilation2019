package node;

public final class NodeReturn extends NodeExp
{

    public NodeReturn(Node e)
    {
	super(e);
    }

    @Override public void checksType()
    {
	return;
    }

    @Override public NodeReturn clone()
    {
	return new NodeReturn((Node) get(0).clone());
    }

}
