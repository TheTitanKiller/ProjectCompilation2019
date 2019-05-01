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
