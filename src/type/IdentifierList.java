package type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IdentifierList extends TypeAtomic implements Iterable<String>
{
    private List<String> list;

    public IdentifierList(int start, int end)
    {
	super(start, end);
	this.list = new ArrayList<String>();
    }

    public IdentifierList(int start, int end, String id)
    {
	this(start, end);
	this.list.add(id);
    }

    public void add(String id)
    {
	this.list.add(id);
    }

    @Override public boolean attestWellFormed()
    {
	return true;
    }

    @Override public Type clone()
    {
	IdentifierList result = new IdentifierList(this.start, this.end);
	for (String str : this.list)
	{
	    this.list.add(str);
	}
	return result;
    }

    public String first()
    {
	return this.list.get(0);
    }

    @Override public Iterator<String> iterator()
    {
	Iterator<String> iprof = this.list.iterator();
	return iprof;
    }
    
    public String last()
    {
	return this.list.get(this.list.size() - 1);
    }

}
