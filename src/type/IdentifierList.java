package type;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IdentifierList extends TypeAtomic implements Iterable<String>
{
    private List<String> list;

    public IdentifierList()
    {
	this.list = new ArrayList<String>();
    }

    public IdentifierList(String id)
    {
	this();
	this.list.add(id);
    }

    public void add(String id)
    {
	this.list.add(id);
    }

    @Override public Type clone()
    {
	IdentifierList result = new IdentifierList();
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
