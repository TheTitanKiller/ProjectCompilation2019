/**
 */
package environment;

import java.util.HashMap;

import node.Node;
import type.Type;

public class Environment implements EnvironmentInterface
{

    String name_environment;
    HashMap<String, NodeId> tableId = new HashMap<>();

    //TODO See why a string
    public Environment(String name_environment)
    {
      this.name_environment = name_environment;
    }

    public void backTrace()
    {
        for (String key : this.tableId.keySet())
        {
            System.out.println(key + ": " + getVariableValue(key));
        }
    }

    //TODO See the implementation for variable value, only a start.
    @Override public NodeId getVariable(String variable)
    {
	    return this.tableId.get(variable);
    }

    @Override public void putVariable(String var, Type type, NodeId value)
    {
	    this.tableId.put(var,  NodeId);
    }

}
