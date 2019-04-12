package abstractTree;

public class TreeIdentifier extends AbstTree
{
	String id;
	
	public TreeIdentifier(String Id)
	{
		super();
		this.id = Id;
	}
	
	public TreeIdentifier(String Id, AbstTree expression)
	{
		super(expression);
		this.id = Id;
	}
	
	public String getID()
	{
		return this.id;
	}
	
	@Override
	protected String getName()
	{
		return getID();
	}
	
	@Override protected void peval(IEnvironment environment) throws Exception
	{
		super.peval(environment);
		if (!isLeaf())
		{
			environment.putVariable(getID(), this.value);
		}
		else
		{
			this.value = environment.getVariableValue(getID());
		}
	}
}
