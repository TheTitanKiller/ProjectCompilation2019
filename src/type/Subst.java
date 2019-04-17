package type;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// Une fonction qui à une variable fait correspondre son type
// sert pour l'unification
public class Subst
{
    private Map<String, Type> map;
    
    public Subst()
    {
	setMap(new HashMap<String, Type>());
    }
    
    public void add(String name, Type val)
    {
	getMap().put(name, val);
    }
    
    public Subst add(Subst obj)
    {
	getMap().putAll(obj.getMap());
	return this;
    }
    
    public Type get(String key)
    {
	return getMap().get(key);
    }
    
    public Map<String, Type> getMap()
    {
	return this.map;
    }
    
    public boolean isEmpty()
    {
	return getMap().isEmpty();
    }
    
    public void setMap(Map<String, Type> map)
    {
	this.map = map;
    }
    
    public int size()
    {
	return getMap().size();
    }
    
    @Override public String toString()
    {
	String str = "{";
	for (Entry<String, Type> entry : getMap().entrySet())
	{
	    str += "<" + entry.getKey() + ", " + entry.getValue() + ">";
	}
	str += "}";
	return str;
    }
    
}
