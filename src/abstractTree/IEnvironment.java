package abstractTree;

public interface IEnvironment
{
    // Retrouve une variable d'un environnement
    Double getVariableValue(String variable);

    void putVariable(String var, Types type, Double value);
}
