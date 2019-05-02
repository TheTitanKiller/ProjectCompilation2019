package node;

public final class NodeReturn extends NodeExp
{
    public NodeReturn(int start, int end, Node e)
    {
	super(start, end, e);
    }

    @Override public void checksType()
    {
	return;
    }

    @Override public NodeReturn clone()
    {
	return new NodeReturn(this.start, this.end, (Node) get(0).clone());
    }

}
