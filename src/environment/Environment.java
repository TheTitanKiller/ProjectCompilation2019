/**
 */
package environment;

import java.util.HashMap;

import errors.CustomError;
import node.NodeId;

public class Environment implements EnvironmentInterface
{
    
    String name_environment;
    HashMap<String, NodeId> tableId = new HashMap<>();

    int line, colomn;
    
    /**
     * Créer un environement.
     *
     * @param name_environment
     *        son nom.
     */
    public Environment(String name_environment, int line, int colomn)
    {
	this.name_environment = name_environment;
	this.line = line;
	this.colomn = colomn;

    }
    
    /**
     * @see EnvironmentInterface
     */
    @Override public void backtrace()
    {
	System.err.println(this);
	System.err.println(">");
	for (String key : this.tableId.keySet())
	{
	    try
	    {
		System.err.println(key + ": " + getVariable(key));
	    }
	    catch (Exception e)
	    {
		e.printStackTrace();
	    }
	}
	System.err.println(">");
    }
    
    /**
     * @see EnvironmentInterface
     */
    @Override public NodeId getVariable(String variable) throws CustomError
    {
	NodeId el = this.tableId.get(variable);
	if (el != null)
	{ return el; }
	throw new CustomError(
		"Variable \"" + variable + "\" is not initialised in " + this + ".", this.line, this.colomn
	);
    }
    
    /**
     * @see EnvironmentInterface
     */
    @Override public void putVariable(String var, NodeId value) throws CustomError
    {
	NodeId el = this.tableId.put(var, value);
	if (el == null)
	{ return; }
	throw new CustomError("Variable \"" + var + "\" already initialised in " + this + ".", value);
    }
    
    /**
     * @see EnvironmentInterface
     */
    @Override public void replaceVariable(String var, NodeId value) throws CustomError
    {
	NodeId el = this.tableId.put(var, value);
	if (el != null)
	{ return; }
	throw new CustomError("Variable \"" + var + "\" can't be replaced in " + this + ".", value);
	
    }

    /**
     * @see EnvironmentInterface
     */
    @Override public String toString()
    {
	return getClass().getSimpleName() + "::" + this.name_environment;
    }

}
