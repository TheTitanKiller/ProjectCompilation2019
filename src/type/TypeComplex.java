package type;

import java.util.Vector;

// Tout type qui compose d'autres types
public abstract class TypeComplex extends Type
{
    protected Vector<Type> componant;

    public TypeComplex(int start, int end)
    {
	super(start, end);
	this.componant = new Vector<Type>();
    }

    public TypeComplex(int start, int end, Type... ts)
    {
	this(start, end);
	addAll(ts);
    }

    public TypeComplex(int start, int end, Vector<Type> componant)
    {
	super(start, end);
	this.componant = componant;
    }

    public void add(Type t)
    {
	this.componant.add(t);
    }

    public void addAll(Type... ts)
    {
	for (Type t : ts)
	{
	    this.componant.add(t);
	}
    }

    @Override public boolean equals(Type obj)
    {
	// System.out.println("EQ" + this + " = " + obj);
	if (this.getClass() != obj.getClass())
	{ return false; }
	if (!(obj instanceof TypeComplex))
	{ return false; }
	TypeComplex real_t = (TypeComplex) obj;
	if (this.componant.size() != real_t.componant.size())
	{ return false; }
	for (int i = 0; i < this.componant.size(); ++i)
	{
	    if (!this.componant.get(i).equals(real_t.componant.get(i)))
	    { return false; }
	}
	return true;
    }

    public Type get(int n)
    {
	return this.componant.get(n);
    }

    @Override public Type mapping(Subst subst)
    {
	Vector<Type> clone = new Vector<Type>();
	for (Type t : this.componant)
	{
	    clone.add(t.mapping(subst));
	}
	this.componant = clone;
	return this;
    }

    public void set(int i, Type type)
    {
	this.componant.set(i, type);
    }

    public int size()
    {
	return this.componant.size();
    }

    @Override public String toString()
    {
	String ret = this.getClass().getSimpleName();
	if (this.componant.size() > 0)
	{
	    ret += '(';
	}
	boolean first = true;
	for (Type elt : this.componant)
	{
	    if (first)
	    {
		first = false;
	    }
	    else
	    {
		ret += ", ";
	    }
	    ret += elt.toString();
	}
	if (this.componant.size() > 0)
	{
	    ret += ')';
	}
	return ret;
    }

}
