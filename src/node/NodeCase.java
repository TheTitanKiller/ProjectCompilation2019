package node;

public final class NodeCase extends Node
{
    private String nameValue;
    private boolean defaultValue;
    
    public NodeCase(Node stm)
    {
	this(null, stm);
	this.defaultValue = true;
    }
    
    public NodeCase(String nameValue, Node stm)
    {
	super(stm);
	this.nameValue = nameValue;
	this.defaultValue = false;
    }
    
    @Override public boolean checksType()
    {
	super.checksType();
	return true;
    }
    
    @Override public NodeCase clone()
    {
	return new NodeCase(this.nameValue, (Node) getStm().clone());
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
