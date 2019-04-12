package abstractTree;

import java.util.HashMap;

import javafx.util.Pair;

public class Environment implements IEnvironment
{

    HashMap<String, Pair<Types, Double>> tableId = new HashMap<>();

    public void backTrace()
    {
	for (String key : this.tableId.keySet())
	{
	    System.out.println(key + ": " + getVariableValue(key));
	}
    }

    @Override public Double getVariableValue(String variable)
    {
	return this.tableId.get(variable).getValue();
    }

    @Override public void putVariable(String var, Types type, Double value)
    {
	this.tableId.put(var, new Pair<Types, Double>(type, value));
    }
}
