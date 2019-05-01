package node;

import java.util.Iterator;

public final class NodeList extends Node implements Iterable<Node>
{

    public NodeList(int start, int end)
    {
	super(start, end);
    }

    public NodeList(int start, int end, Node... stm)
    {
	super(start, end, stm);
    }

    @Override public void checksType()
    {
	for (Node elt : this.elts)
	{
	    if (elt != null)
	    {
		elt.checksType();
	    }
	}
    }

    @Override public NodeList clone()
    {
	NodeList node = new NodeList(this.start, this.end);
	for (Node elt : this.elts)
	{
	    node.add((Node) elt.clone());
	}
	return node;
    }

    @Override public Iterator<Node> iterator()
    {
	return this.elts.iterator();
    }

    @Override public int size()
    {
	return this.elts.size();
    }

}
