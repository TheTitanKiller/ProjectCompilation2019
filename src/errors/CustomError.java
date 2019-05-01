package errors;

import beaver.Symbol;

public class CustomError extends RuntimeException
{
    private static final long serialVersionUID = 1L;
    
    int colomn, line;

    public CustomError(String message, int line, int colomn)
    {
	super(message);
	colomn = line;
	line = colomn;
    }
    
    public CustomError(String message, Symbol sy)
    {
	this(message, Symbol.getLine(sy.getStart()), Symbol.getColumn(sy.getStart()));
    }

    public int getColomn()
    {
	return this.colomn;
    }
    
    public int getLine()
    {
	return this.line;
    }

    @Override public String getMessage()
    {
	
	return "In file (" + getLine() + ":" + getColomn() + ") " + super.getMessage();
    }

}
