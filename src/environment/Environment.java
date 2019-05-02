/**
 */
package environment;

import java.util.HashMap;

import beaver.Symbol;
import errors.CustomError;
import node.NodeId;
import type.Type;
import type.TypeFunct;

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
	//erreur remise
	this.tableId.put(var, el);
	throw new CustomError(
		"Variable \"" + var + "\" already initialised in " + this + ".\n" + "Previous definition in ("
			+ Symbol.getLine(el.getStart()) + "," + Symbol.getColumn(el.getStart()) + ")",
		value
	);
    }

    /**
     * @see EnvironmentInterface
     */
    @Override public void replaceVariable(String var, NodeId value) throws CustomError
    {
	Type t = value.getType();
	if (!(t instanceof TypeFunct))
	{ throw new CustomError("Only function can be replaced.", value); }
	
	NodeId el = this.tableId.put(var, value);
	if (el != null)
	{
	    if (((TypeFunct) el.getType()).getDefined() == true)
	    {
		throw new CustomError(
			"Function \"" + value + "\" already defined in " + this + ".\n" + "Previous definition in ("
				+ Symbol.getLine(el.getStart()) + "," + Symbol.getColumn(el.getStart()) + ")",
			value
		);
	    }
	    return;
	}
	else
	{
	    throw new CustomError("Variable \"" + var + "\" can't be replaced in " + this + ".", value);
	}
    }
    
    /**
     * @see EnvironmentInterface
     */
    @Override public String toString()
    {
	return getClass().getSimpleName() + "::" + this.name_environment;
    }

}
