package abstractTree;

import java.util.HashMap;

public class Environment implements IEnvironment
{
    
    HashMap<String, Double> tableId = new HashMap<>();
    
    public void backTrace()
    {
	for (String key : this.tableId.keySet())
	{
	    System.out.println(key + ": " + getVariableValue(key));
	}
    }
    
    @Override public Double getVariableValue(String variable)
    {
	return this.tableId.get(variable);
    }

    @Override public void putVariable(String var, Double value)
    {
	this.tableId.put(var, value);
    }
}
