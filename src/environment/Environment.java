/**
 */
package environment;

import java.util.HashMap;

import node.NodeId;

public class Environment implements EnvironmentInterface
{
    
    String name_environment;
    HashMap<String, NodeId> tableId = new HashMap<>();
    
    //TODO See why a string
    public Environment(String name_environment)
    {
	this.name_environment = name_environment;
    }
    
    @Override public void backtrace()
    {
	System.err.println(this);
	System.err.println(">");
	for (String key : this.tableId.keySet())
	{
	    System.err.println(key + ": " + getVariable(key));
	}
	System.err.println(">");
    }
    
    @Override public NodeId getVariable(String variable)
    {
	return this.tableId.get(variable);
    }
    
    @Override public void putVariable(String var, NodeId value)
    {
	this.tableId.put(var, value);
    }
    
    @Override public String toString()
    {
	return getClass().getSimpleName() + " : " + this.name_environment;
    }

}
