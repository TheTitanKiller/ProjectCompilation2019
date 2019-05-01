package type;

import main.ClonableSymbol;

public class TypeArrayRange extends TypeRange
{
    public TypeArrayRange(int start, int end, Type min, Type max)
    {
	super(start, end, min, max);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (getLast() instanceof TypeInt)
	{
	    if (!(getFirst() instanceof TypeInt))
	    { return false; }
	    if (((TypeInt) getFirst()).getConst_value() >= ((TypeInt) getLast()).getConst_value())
	    { return false; }
	}
	else if (getLast() instanceof TypeItemEnum)
	{
	    if (!(getFirst() instanceof TypeItemEnum))
	    { return false; }
	    if (!((TypeItemEnum) getFirst()).getRefEnumRange().equals(((TypeItemEnum) getLast()).getRefEnumRange()))
	    { return false; }
	    if (((TypeItemEnum) getFirst()).getConst_value() >= ((TypeItemEnum) getLast()).getConst_value())
	    { return false; }
	}
	return true;
    }

    @Override public ClonableSymbol clone()
    {
	return new TypeArrayRange(this.start, this.end, (Type) this.first.clone(), (Type) this.last.clone());
    }

}
