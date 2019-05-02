package type;

public abstract class TypeRange extends TypeAtomic
{
    protected Type first;
    protected Type last;
    
    public TypeRange(int start, int end, Type min, Type max)
    {
	super(start, end);
	this.first = min;
	this.last = max;
    }
    
    /**
     *
     */
    @Override public boolean equals(Object obj)
    {
	if (super.equals(obj))
	{ return false; }
	TypeRange t = (TypeRange) obj;
	if (t.getFirst().equals(getFirst()))
	{ return false; }
	if (t.getLast().equals(getLast()))
	{ return false; }
	return true;
    }
    
    public Type getFirst()
    {
	return this.first;
    }
    
    public Type getLast()
    {
	return this.last;
    }
    
    @Override public String toString()
    {
	return super.toString() + '[' + this.first.toString() + ".." + this.last.toString() + ']';
    }
    
}
