package node;

public final class NodeCaseList extends NodeExp
{
    public NodeCaseList(int start, int end)
    {
	super(start, end);
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeCaseList clone()
    {
	return new NodeCaseList(this.start, this.end);
    }
    
}
