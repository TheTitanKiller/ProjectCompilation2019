package environment;

import java.util.LinkedList;

import node.NodeId;

public class StackEnvironment implements EnvironmentInterface
{
    String name_stack;
    LinkedList<Environment> stack = new LinkedList<>();
    
    /**
     * Crée une pile d'environnement.
     *
     * @param name_stack
     *        son nom.
     */
    public StackEnvironment(String name_stack)
    {
	this.name_stack = name_stack;
    }

    /**
     * @see EnvironmentInterface
     */
    @Override public void backtrace()
    {
	System.err.println(this);
	System.err.println("**");
	int i = 0;
	for (Environment e : this.stack)
	{
	    System.err.println("Layer " + i + " :");
	    e.backtrace();
	}
	System.err.println("**");
    }
    
    /**
     * Recherche dans les environnements au moins une déclaration, la plus récente.
     *
     * @see EnvironmentInterface
     */
    @Override public NodeId getVariable(String variable) throws Error
    {
	for (Environment e : this.stack)
	{
	    try
	    {
		NodeId el = e.getVariable(variable);
		return el;
	    }
	    catch (Exception err)
	    {
	    }
	}
	throw new Error("Variable \"" + variable + "\" is not initialised in " + this + ".");
    }

    /**
     * Dépile l'environnement le plus récent. Les noeuds enregistré ne font ainsi
     * plus partie de la pile.
     *
     * @return L'environnement le plus récent, FIFO.
     */
    public Environment PopEnvironment()
    {
	return this.stack.removeFirst();
    }

    //TODO Possibilité d'améliorer avec fichier, ligne et colone du contexte.
    /**
     * Créé et empile un nouveau environnement avec un nom donné.
     * Correspond à nouveau block avec ses propres variables.
     *
     * @param name_environment
     *        Le nom de l'environnement à créer.
     */
    public void PushEnvironment(String name_environment)
    {
	this.stack.push(new Environment(name_environment));
    }

    /**
     * Rajoute dans l'environnement actuel la variable.
     *
     * @see EnvironmentInterface
     */
    @Override public void putVariable(String var, NodeId value) throws Error
    {
	this.stack.getFirst().putVariable(var, value);
    }

    @Override public String toString()
    {
	return getClass().getSimpleName() + "::" + this.name_stack;
    }
}
