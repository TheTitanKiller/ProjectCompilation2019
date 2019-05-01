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
    
    public void setEnd(ClonableSymbol end)
    {
	this.end = end.getEnd();
    }

    public void setEnd(int end)
    {
	this.end = end;
    }
    
    public void setPosition(ClonableSymbol start, ClonableSymbol end)
    {
	setStart(start);
	setEnd(end);
    }

    public void setStart(ClonableSymbol start)
    {
	this.start = start.getStart();
    }

    public void setStart(int start)
    {
	this.start = start;
    }
}
