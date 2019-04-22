package environment;

import node.Node;
import type.Type;

//TODO Make it more flexible
public interface EnvironmentInterface
{
    NodeId getVariable(String variable);

    void putVariable(String var, NodeId value);

    void backTrace();

    void toString();
}
