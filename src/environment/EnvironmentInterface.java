package environment;

import node.NodeId;

//TODO Make it more flexible
public interface EnvironmentInterface
{
    void backtrace();
    
    NodeId getVariable(String variable) throws Exception;
    
    void putVariable(String var, NodeId value) throws Exception;
}
