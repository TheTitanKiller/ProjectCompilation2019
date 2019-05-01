/**
 */
package main;

import beaver.Symbol;

public abstract class ClonableSymbol extends Symbol
{
    
    protected ClonableSymbol(int start, int end)
    {
	this.start = start;
	this.end = end;
    }
    
    @Override public abstract ClonableSymbol clone();

    public void setEnd(int end)
    {
	this.end = end;
    }
    
    public void setEnd(Symbol end)
    {
	this.end = end.getEnd();
    }

    public void setPosition(Symbol start, Symbol end)
    {
	setStart(start);
	setEnd(end);
    }
    
    public void setStart(int start)
    {
	this.start = start;
    }
    
    public void setStart(Symbol start)
    {
	this.start = start.getStart();
    }
}
