package node;

import errors.CustomError;
import type.Type;
import type.TypeArray;
import type.TypeComplex;
import type.TypeItemEnum;
import type.TypeRange;

public final class NodeArrayAccess extends NodeExp
{

    // t [i]
    public NodeArrayAccess(NodeExp t, Node i)
    {
	super(t, i);
	if (t != null && ((TypeComplex) t.type).size() == 2)
	{
	    this.type = ((TypeComplex) t.type).get(1);
	}
    }

    @Override public void checksType()
    {
	TypeArray typeArray = (TypeArray) ((NodeExp) get(0)).getType();
	TypeRange typeRangeOREnum = typeArray.getRangeOREnum();
	Type typeArg = ((NodeExp) get(1)).getType();

	// Si l'index n'est pas du type attendu
	if (typeArg.getClass() != typeRangeOREnum.getFirst().getClass())
	{ throw new CustomError(getClass().getSimpleName() + ": type de l'index incorrect", this); }
	
	// Si l'index est un enum, mais pas le bon
	if (typeArg instanceof TypeItemEnum && ((TypeItemEnum) typeArg)
		.getRefEnumRange() != ((TypeItemEnum) typeRangeOREnum.getFirst()).getRefEnumRange())
	{ throw new CustomError(getClass().getSimpleName() + ":  type de l'index incorrect, pas le bon enum.", this); }
	
	// Si la valeur constante de l'index depasse
	if (typeArg.compareTo(typeRangeOREnum.getFirst()) < 0 || typeArg.compareTo(typeRangeOREnum.getLast()) > 0)
	{ throw new CustomError(getClass().getSimpleName() + ":  index constant hors tableau", this); }
	
    }

    @Override public NodeArrayAccess clone()
    {
	return new NodeArrayAccess((NodeExp) get(0).clone(), (Node) get(1).clone());
    }

}
