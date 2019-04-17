/**
 */
package main;

import beaver.Symbol;

/**
 * @author mcerutti
 */
public abstract class ClonableSymbol extends Symbol
{
	
	/**
	 * @return
	 */
	public boolean checksType()
	{
		return false;
	}
	
	/**
	 * 
	 */
	public void generateIntermediateCode()
	{
	}
	
	/**
	 * @param file
	 */
	public void toDot(String file)
	{
	}
	
}
