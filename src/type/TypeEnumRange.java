package type;

import main.ClonableSymbol;

public class TypeEnumRange extends TypeRange
{
    
    private static int uniqName;
    private String name;
    
    public TypeEnumRange()
    {
	super(null, null);
	this.name = Integer.toString(uniqName++);
    }
    
    public TypeEnumRange(String name, TypeItemEnum first, TypeItemEnum max)
    {
	super(first, max);
	this.name = name;
    }
    
    public TypeEnumRange(TypeItemEnum min, TypeItemEnum max)
    {
	super(min, max);
	this.name = Integer.toString(uniqName++);
    }
    
    @Override public boolean attestWellFormed()
    {
	if (((TypeItemEnum) getFirst()).getConst_value() >= ((TypeItemEnum) getLast())
		.getConst_value()) { return false; }
	return true;
    }
    
    @Override public ClonableSymbol clone()
    {
	return new TypeEnumRange(this.name, (TypeItemEnum) this.first, (TypeItemEnum) this.last);
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
