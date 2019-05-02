package type;

import java.util.Iterator;
import java.util.Vector;

// Type servant à la fois pour les arguments d'une fonction et pour les termes d'une liste
public class TypeTuple extends TypeComplex
{
    public TypeTuple(int start, int end)
    {
	super(start, end);
    }
    
    public TypeTuple(int start, int end, Type t)
    {
	super(start, end, t);
    }
    
    public TypeTuple(int start, int end, Type... ts)
    {
	super(start, end, ts);
    }
    
    public TypeTuple(int start, int end, Vector<Type> componant)
    {
	super(start, end, componant);
    }
    
    public Boolean attestAllEqual()
    {
	Type t = get(0);
	for (Type o : this.componant)
	{
	    if (!t.equals(o))
	    { return false; }
	}
	return true;
    }
    
    @Override public boolean attestWellFormed()
    {
	return true;
    }
    
    @Override public TypeTuple clone()
    {
	Vector<Type> componant = new Vector<Type>();
	for (Type t : this.componant)
	{
	    componant.add((Type) t.clone());
	}
	return new TypeTuple(this.start, this.end, componant);
    }
    
    public Iterator<Type> iterator()
    {
	return this.componant.iterator();
    }
    
    @Override public int size()
    {
	return this.componant.size();
    }
    
    @Override public String toString()
    {
	String str = "(";
	boolean first = true;
	for (Type t : this.componant)
	{
	    if (first)
	    {
		first = false;
	    }
	    else
	    {
		str += ", ";
	    }
	    str += t;
	}
	str += ")";
	return str;
    }
    
}
