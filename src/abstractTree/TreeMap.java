package abstractTree;

public class TreeMap extends AbstTree
{
	public TreeMap(AbstTree line)
	{
		super(line);
	}
	
	public TreeMap(TreeMap childBin)
	{
		super();
		addTree(childBin);
	}
	
	public void addTree(AbstTree child)
	{
		getChildren().add(child);
	}
	
	public void addTree(TreeMap child)
	{
		getChildren().addAll(child.getChildren());
	}
	
	@Override public String toString()
	{
		if(isLeaf())
		{
			return getName();
		}
		String result = getName() + "[\n";
		int i = 0;
		for (AbstTree child : getChildren())
		{
			if(child != null)
			{
				result += i +" :: " +child.toString();
			}
			if(i < getChildren().size()-1)
			{
				result += "\n";
				i++;
			}
		}
		result += "]";
		
		return result;
	}
}
