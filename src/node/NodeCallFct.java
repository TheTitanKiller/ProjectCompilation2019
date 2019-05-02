package node;

import java.util.Iterator;

import errors.CustomError;
import type.Type;
import type.TypeFunct;

public final class NodeCallFct extends NodeExp
{
    protected String name;

    // Application
    // (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
    public NodeCallFct(int start, int end, String name, TypeFunct type)
    {
	super(start, end);
	this.name = name;
	this.type = type;
    }

    // Application
    // (f : E1 x E2 ... x Ek -> F), (arg1, arg2, ..., argk)
    public NodeCallFct(int start, int end, String name, TypeFunct type, NodeList args)
    {
	super(start, end, args);
	this.name = name;
	this.type = type;
    }

    // On parcourt les arguments et on vérifie qu'ils sont bien typés
    // On parcourt aussi les paramètres de la fonction
    // et on regarde que les types sont égaux
    @Override public void checksType()
    {
	boolean result = true;
	Iterator<Node> itArgs = getArgs().iterator();
	Iterator<Type> itParams = ((TypeFunct) this.type).getParams().iterator();
	while (itArgs.hasNext() && itParams.hasNext())
	{
	    NodeExp arg = (NodeExp) itArgs.next();
	    arg.checksType();

	    Type argType = arg.getType();
	    // chaque paramètre est une feature nom : type
	    Type paramType = itParams.next();
	    if (!paramType.equals(argType))
	    { throw new CustomError(getClass().getSimpleName() + ": " + argType + " != " + paramType, this); }
	}
	// Plus ou moins d'arguments que de paramètres
	if (result && (itArgs.hasNext() || itParams.hasNext()))
	{ throw new CustomError(getClass().getSimpleName() + ": pas le même nombre de paramètres ", this); }
    }

    @Override public NodeCallFct clone()
    {
	NodeCallFct node = new NodeCallFct(this.start, this.end, this.name, (TypeFunct) this.type);
	for (Node elt : this.elts)
	{
	    node.add((Node) elt.clone());
	}
	return node;
    }

    @Override public String generateIntermediateCode()
    {
        return "CALL(" + name + ((getArgs().size() != 0) ? ", " + getArgs().size() : "") + ")\n";
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
