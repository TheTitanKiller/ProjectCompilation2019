package abstractTree;

public interface IEnvironment {
	
	// Retrouve une variable d'un environnement
	Integer getVariableValue(String variable);
	
	void putVariable(String var, Types type, Integer value);
}
