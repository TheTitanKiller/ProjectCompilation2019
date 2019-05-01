package type;

import main.ClonableSymbol;

public class TypeEnumRange extends TypeRange
{
    
    private static int uniqName;
    private String name;
    
    public TypeEnumRange(int start, int end)
    {
	super(start, end, null, null);
	this.name = Integer.toString(uniqName++);
    }
    
    public TypeEnumRange(int start, int end, String name, TypeItemEnum first, TypeItemEnum max)
    {
	super(start, end, first, max);
	this.name = name;
    }
    
    public TypeEnumRange(int start, int end, TypeItemEnum min, TypeItemEnum max)
    {
	super(start, end, min, max);
	this.name = Integer.toString(uniqName++);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (((TypeItemEnum) getFirst()).getConst_value() >= ((TypeItemEnum) getLast()).getConst_value())
	{ return false; }
	return true;
    }
    
    @Override public ClonableSymbol clone()
    {
	return new TypeEnumRange(this.start, this.end, this.name, (TypeItemEnum) this.first, (TypeItemEnum) this.last);
    }
    
    public String getName()
    {
	return this.name;
    }
    
    public void setFirst(Type min)
    {
	this.first = min;
    }
    
    public void setLast(Type max)
    {
	this.last = max;
    }
    
    @Override public String toString()
    {
	return super.toString() + '_' + this.name;
    }
    
}
