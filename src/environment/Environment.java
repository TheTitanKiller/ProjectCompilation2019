/**
 */
package environment;

import java.util.HashMap;

import node.NodeId;

public class Environment implements EnvironmentInterface
{
    
    String name_environment;
    HashMap<String, NodeId> tableId = new HashMap<>();
    
    /**
     * Crée un environement.
     *
     * @param name_environment
     *        son nom.
     */
    public Environment(String name_environment)
    {
	this.name_environment = name_environment;
    }
    
    /**
     * Permet d'afficher tout les noeuds enregistré à un instant donné.
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
    
    @Override public NodeId getVariable(String variable) throws Exception
    {
	NodeId el = this.tableId.get(variable);
	if (el != null)
	{ return el; }
	throw new Exception("Variable " + variable + " not initialised in " + this + ".");
    }
    
    @Override public void putVariable(String var, NodeId value) throws Exception
    {
	NodeId el = this.tableId.put(var, value);
	if (el == null)
	{ return; }
	throw new Exception("Variable " + var + " already initialised in " + this + ".");
    }
    
    @Override public String toString()
    {
	return getClass().getSimpleName() + "::" + this.name_environment;
    }

}
