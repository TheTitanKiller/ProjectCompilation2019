package environment;

import java.util.HashMap;

import node.Node;
import type.Type;

//TODO Used but no idea why
public class StackEnvironment implements EnvironmentInterface
{
    String name_stack;
    LinkedList<Environment> stack = new LinkedList<>();

    StackEnvironment(String name_stack)
    {
      this.name_stack = name_stack;
    }
    /**
     * @param string
     */
    public StackEnvironment(String name_environment)
    {
      this.name_environment = name_environment;
    }

    PushEnvironment(String name_environment);

    Environment PopEnvironment();

    NodeId getVariable(String variable);

    void putVariable(String var, NodeId value);

    void backTrace();

    void toString();
}
