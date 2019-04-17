package node;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.ClonableSymbol;

public abstract class Node extends ClonableSymbol implements NodeInterface
{
    private static int staticUniqId;
    protected List<Node> elts;
    protected int uniqId;
    
    public Node()
    {
	super();
	this.uniqId = Node.staticUniqId++;
	//System.err.println("Create class " + this.getClass().getSimpleName());
	this.elts = new ArrayList<Node>();
	
    }
    
    public Node(Node... args)
    {
	this();
	for (Node elt : args)
	{
	    this.elts.add(elt);
	}
    }
    
    public void add(Node elt)
    {
	this.elts.add(elt);
    }
    
    @Override public boolean checksType()
    {
	System.err.println("--- CheckType " + this.getClass().getSimpleName());
	return false;
    };
    
    @Override public Object clone()
    {
	try
	{
	    return super.clone();
	}
	catch (CloneNotSupportedException e)
	{
	    e.printStackTrace();
	}
	return null;
    }
    
    @Override public void generateIntermediateCode()
    {
	// TODO Auto-generated method stub
	System.err.println("TODO: " + this.getClass().getSimpleName() + ".generateIntermediateCode()");
    }
    
    public Node get(int i)
    {
	return this.elts.get(i);
    }
    
    public int size()
    {
	return this.elts.size();
    }
    
    @Override public final void toDot(String file)
    {
	try
	{
	    BufferedWriter out = new BufferedWriter(new FileWriter(file));
	    out.write("digraph Stree {\n");
	    StringBuffer str = new StringBuffer();
	    toDot(str);
	    out.write(str.toString());
	    out.write("}\n");
	    out.close();
	}
	catch (IOException e)
	{
	    System.err.println("ERROR: build dot");
	}
    }
    
    private final void toDot(StringBuffer stringBuffer)
    {
	stringBuffer.append("node_" + this.uniqId + " [shape=\"ellipse\", label=\"" + toDotNodeName() + "\"];\n");
	for (Node elt : this.elts)
	{
	    elt.toDot(stringBuffer);
	    stringBuffer.append("node_" + this.uniqId + " -> node_" + elt.uniqId + ";\n");
	}
	
    }
    
    protected String toDotNodeName()
    {
	return getClass().getSimpleName();
    }
    
    @Override public String toString()
    {
	String ret = this.getClass().getSimpleName();
	if (this.elts.size() > 0)
	{
	    ret += '(';
	}
	boolean first = true;
	for (Node elt : this.elts)
	{
	    if (first)
	    {
		first = false;
	    }
	    else
	    {
		ret += ", ";
	    }
	    ret += elt.toString();
	}
	if (this.elts.size() > 0)
	{
	    ret += ')';
	}
	return ret;
    }
    
}
