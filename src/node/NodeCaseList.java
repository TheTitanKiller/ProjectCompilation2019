package node;

public final class NodeCaseList extends NodeExp
{
    public NodeCaseList()
    {
	super();
    }

    @Override public void checksType()
    {
	return;
    }

    @Override public NodeCaseList clone()
    {
	return new NodeCaseList();
    }

}
