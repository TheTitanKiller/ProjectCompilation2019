package node;

public final class NodeCase extends Node
{
    private String nameValue;
    private boolean defaultValue;
    
    public NodeCase(int start, int end, Node stm)
    {
	this(start, end, null, stm);
	this.defaultValue = true;
    }
    
    public NodeCase(int start, int end, String nameValue, Node stm)
    {
	super(start, end, stm);
	this.nameValue = nameValue;
	this.defaultValue = false;
    }
    
    @Override public void checksType()
    {
	return;
    }
    
    @Override public NodeCase clone()
    {
	return new NodeCase(this.start, this.end, this.nameValue, (Node) getStm().clone());
    }
    
    private Node getStm()
    {
	return super.get(0);
    }
    
    public boolean isDefaultValue()
    {
	return this.defaultValue;
    }
    
}
