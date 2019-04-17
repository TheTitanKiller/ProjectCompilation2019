package environment;

import node.Node;
import type.Type;

//TODO Make it more flexible
public interface EnvironmentInterface
{
    Pair<Type, Node> getVariableValue(String variable);
    
    void putVariable(String var, Type type, Node value);
}
