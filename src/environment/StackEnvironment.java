package environment;

import java.util.HashMap;

import node.Node;
import type.Type;

//TODO Used but no idea why
public class StackEnvironment
{
String name_environment;
    List<HashMap<String, NodeId>> stack = new LinkedList<>();
    /**
     * @param string
     */
    public StackEnvironment(String name_environment)
    {
      this.name_environment = name_environment;
    }

}
