
import java.io.FileReader;

import abstractTree.AbstTree;
import abstractTree.Environment;
import abstractTree.IAbstTree;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		ScannerExpr input = new ScannerExpr(new FileReader(args[0]));
		ParserExpr parser = new ParserExpr();
		
		// Le "%goal" du parser doit être un objet de type IAbstTree
		IAbstTree expr = (AbstTree) parser.parse(input);
		
		//  Il doit pouvoir s'évaluer avec un environnement
		Environment environment = new Environment();
		expr.eval(environment);
		System.out.println("Résultat expression: " + expr.getValue());
		
		System.out.println("\nBacktrace: ");
		environment.backTrace();
	}
}