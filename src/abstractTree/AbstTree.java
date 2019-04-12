package abstractTree;

import java.util.ArrayList;

import beaver.Symbol;

public abstract class AbstTree extends Symbol implements IAbstTree
{
	private ArrayList<AbstTree> children;
	
	protected Integer value = null;
	
	// Constructeur pour un terme simple
	public AbstTree()
	{
		super();
		this.children = new ArrayList<>();
	}
	
	// Constructeur pour un arbre unaire
	public AbstTree(AbstTree... children)
	{
		this();
		for (AbstTree child : children)
		{
			this.children.add(child);
		}
	}
	
	// Affichage de l'arbre et évaluation
	@Override public void eval(IEnvironment environment) throws Exception
	{
		System.out.println("Eval:\n" + toString());
		peval(environment);
	}
	
	/**
	 * @return the children
	 */
	public ArrayList<AbstTree> getChildren()
	{
		return this.children;
	}
	
	protected String getName()
	{
		return this.getClass().getSimpleName();
	}
	
	// Renvoie la valeur calculée pour ce noeud
	@Override public Integer getValue()
	{
		return this.value;
	}
	
	protected boolean isLeaf()
	{
		return this.children.size() == 0;
	}
	
	// Méthode virtuelle pure que vous devez écrire dans les classes dérivées de celle-ci
	protected void peval(IEnvironment environment) throws Exception
	{
		if(!isLeaf())
		{
			for (AbstTree child : this.children)
			{
				if(child != null)
				{
					child.peval(environment);
				}
			}
			this.value = this.children.get(this.children.size()-1).getValue();
		}
	}
	
	// Affichage parenthésé de l'arbre
	@Override public String toString()
	{
		if(isLeaf())
		{
			return getName();
		}
		String result = getName() + "[";
		int i = 0;
		for (AbstTree child : getChildren())
		{
			if(child != null)
			{
				result += child.toString();
			}
			if(i < getChildren().size()-1)
			{
				result += ";";
				i++;
			}
		}
		result += "]";
		
		return result;
	}
}
