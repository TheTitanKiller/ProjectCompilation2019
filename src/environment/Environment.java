/**
 */
package environment;

import java.util.HashMap;

import node.Node;
import type.Type;

public class Environment implements EnvironmentInterface
{

    HashMap<String, Pair<Type, Node>> tableId = new HashMap<>();

    //TODO See why a string
    public Environment(String string)
    {
    }

    public void backTrace()
    {
	for (String key : this.tableId.keySet())
	{
	    System.out.println(key + ": " + getVariableValue(key));
	}
    }

    //TODO See the implementation for variable value, only a start.
    @Override public Pair<Type, Node> getVariableValue(String variable)
    {
	return this.tableId.get(variable);
    }

    @Override public void putVariable(String var, Type type, Node value)
    {
	this.tableId.put(var, new Pair<Type, Node>(type, value));
    }

}
