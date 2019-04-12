package abstractTree;

public class TreeOperator extends AbstTree
{
    Keywords op;
    
    public TreeOperator(Keywords Operator, AbstTree Left)
    {
	super(Left);
	this.op = Operator;
    }
    
    public TreeOperator(Keywords Operator, AbstTree Left, AbstTree Right)
    {
	super(Left, Right);
	this.op = Operator;
    }
    
    void applyOperator()
    {
	switch (getOperator())
	{
	    
	    case PLUS:
		this.value = getChildren().get(0).getValue() + getChildren().get(1).getValue();
		break;
	    
	    case MINUS:
		if (getChildren().size() == 2)
		{
		    this.value = getChildren().get(0).getValue() - getChildren().get(1).getValue();
		}
		else
		{
		    this.value = -getChildren().get(0).getValue();
		}
		break;
	    
	    case MULTIPLY:
		this.value = getChildren().get(0).getValue() * getChildren().get(1).getValue();
		break;
	    
	    case DIVIDE:
		this.value = getChildren().get(0).getValue() / getChildren().get(1).getValue();
		break;
	    
	    case sin:
		this.value = Math.sin(getChildren().get(0).getValue());
		break;
	    
	    case round:
		this.value = (double) Math.round(getChildren().get(0).getValue());
		break;
	    
	    case min:
		this.value = Math.min(getChildren().get(0).getValue(), getChildren().get(1).getValue());
		break;
	    
	    case max:
		this.value = Math.max(getChildren().get(0).getValue(), getChildren().get(1).getValue());
		break;
	    
	    case sqrt:
		this.value = Math.sqrt(getChildren().get(0).getValue());
		break;
	    
	    case pow:
		this.value = Math.pow(getChildren().get(0).getValue(), getChildren().get(1).getValue());
		break;
	    
	    case ln:
		this.value = Math.log(getChildren().get(0).getValue());
		break;
	}
    }
    
    Keywords getOperator()
    {
	return this.op;
    }
    
    @Override protected void peval(IEnvironment environment) throws Exception
    {
	super.peval(environment);
	applyOperator();
    }
}
