package node;

import java.util.Iterator;

import type.Type;
import type.TypeFeature;
import type.TypeFunct;

public final class NodeCallFct extends NodeExp
{
    protected String name;
    
    // Application
    // (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
    public NodeCallFct(String name, TypeFunct type)
    {
	super();
	this.name = name;
	this.type = type;
    }
    
    // Application
    // (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
    public NodeCallFct(String name, TypeFunct type, NodeList args)
    {
	super(args);
	this.name = name;
	this.type = type;
    }
    
    // On parcourt les arguments et on vérifie qu'ils sont bien typés
    // On parcourt aussi les paramètres de la fonction
    // et on regarde que les types sont égaux
    @Override public boolean checksType()
    {
	super.checksType();
	boolean result = true;
	Iterator<Node> itArgs = getArgs().iterator();
	Iterator<Type> itParams = ((TypeFunct) this.type).getParams().iterator();
	while (itArgs.hasNext() && itParams.hasNext())
	{
	    NodeExp arg = (NodeExp) itArgs.next();
	    if (!arg.checksType())
	    {
		result = false;
		break;
	    }
	    Type argType = arg.getType();
	    // chaque paramètre est une feature nom : type
	    Type paramType = ((TypeFeature) itParams.next()).getType();
	    if (!paramType.equals(argType))
	    {
		System.err.println("*** Erreur de typage " + argType + " != " + paramType);
		result = false;
		break;
	    }
	}
	// Plus ou moins d'arguments que de paramètres
	if (result && (itArgs.hasNext() || itParams.hasNext()))
	{
	    System.err.println("*** Erreur de typage: pas le même nombre de paramètres ");
	    return false;
	}
	return result;
    }
    
    @Override public NodeCallFct clone()
    {
	NodeCallFct node = new NodeCallFct(this.name, (TypeFunct) this.type);
	for (Node elt : this.elts)
	{
	    node.add((Node) elt.clone());
	}
	return node;
    }
    
    private NodeList getArgs()
    {
	return (NodeList) this.elts.get(0);
    }
    
    @Override public Type getType()
    {
	return ((TypeFunct) this.type).getRet();
    }
    
    @Override protected String toDotNodeName()
    {
	return "NodeCallFct " + this.name + "()";
    }
    
    @Override public String toString()
    {
	return this.name + '_' + super.toString();
    }
    
}
