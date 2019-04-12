package abstractTree;

import java.util.HashMap;

import javafx.util.Pair;

public class Environment implements IEnvironment
{
	
	HashMap<String, Pair<Types, Integer>> tableId = new HashMap<>();
	
	public void backTrace()
	{
		for (String key : this.tableId.keySet())
		{
			System.out.println(key + ": " + getVariableValue(key));
		}
	}
	
	@Override public Integer getVariableValue(String variable)
	{
		return this.tableId.get(variable).getValue();
	}
	
	@Override public void putVariable(String var, Types type, Integer value)
	{
		this.tableId.put(var, new Pair<Types, Integer>(type, value));
	}
}
