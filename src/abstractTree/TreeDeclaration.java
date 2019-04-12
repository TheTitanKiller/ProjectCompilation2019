/**
 */
package abstractTree;

/**
 * @author mcerutti
 */
public class TreeDeclaration extends AbstTree
{
    Types type;
    String id;
    
    public TreeDeclaration(Types type, String id)
    {
	this.type = type;
	this.id = id;
    }
    
    public String getID()
    {
	return this.id;
    }
    
    @Override protected String getName()
    {
	return getID();
    }
    
    private Types getType()
    {
	return this.type;
    }
    
    @Override protected void peval(IEnvironment environment) throws Exception
    {
	super.peval(environment);
	environment.putVariable(getID(), null);
    }
}
