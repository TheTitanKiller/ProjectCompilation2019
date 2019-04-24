package environment;

import java.util.LinkedList;

import node.NodeId;

public class StackEnvironment implements EnvironmentInterface
{
    String name_stack;
    LinkedList<Environment> stack = new LinkedList<>();
    
    public StackEnvironment(String name_stack)
    {
	this.name_stack = name_stack;
    }
    
    @Override public void backtrace()
    {
	System.err.println(this);
	System.err.println("**");
	int i = 0;
	for (Environment e : this.stack)
	{
	    System.err.println("Layer " + i + " :");
	    e.backtrace();
	}
	System.err.println("**");
    }
    
    @Override public NodeId getVariable(String variable) throws Exception
    {
	for (Environment e : this.stack)
	{
	    try
	    {
		NodeId el = e.getVariable(variable);
		return el;
	    }
	    catch (Exception err)
	    {
	    }
	}
	throw new Exception("Variable " + variable + " not initialised in " + this + ".");
    }

    public Environment PopEnvironment()
    {
	return this.stack.removeFirst();
    }

    public void PushEnvironment(String name_environment)
    {
	this.stack.push(new Environment(name_environment));
    }

    @Override public void putVariable(String var, NodeId value) throws Exception
    {
	this.stack.getFirst().putVariable(var, value);
    }

    @Override public String toString()
    {
	return getClass().getSimpleName() + "::" + this.name_stack;
    }
}
