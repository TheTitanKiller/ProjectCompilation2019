package main;

import java.io.FileReader;

import beaver.Scanner;
import node.Node;

public class Main
{
    private static boolean checksType = false;
    private static boolean backtrace = false;

    public static void main(String[] args) throws Exception
    {
	for (String arg : args)
	{
	    if (arg.charAt(0) == '-')
	    {
		if (arg.equals("-checktype"))
		{
		    checksType = true;
		}
		if (arg.equals("-backtrace"))
		{
		    backtrace = true;
		}
		if (arg.equals("-all"))
		{
		    checksType = true;
		    backtrace = true;
		}
	    }
	    else
	    {
		Scanner input = new ScannerLEA(new FileReader(arg));
		Parser parser = new Parser();
		try
		{
		    System.err.println("*** Fichier " + arg);
		    Node result = (Node) parser.parse(input);
		    System.err.println("*** Analyse syntaxique ok");
		    if (checksType)
		    {
			if (!result.checksType())
			{
			    System.err.println("*** Erreur de typage");
			}
			else
			{
			    System.err.println("*** Typage correct");
			}
		    }
		    if (backtrace)
		    {
			System.err.println("*** Backtrace");
			parser.backtrace();
			System.err.println("*** End backtrace");
		    }

		}
		catch (beaver.Parser.Exception e)
		{
		    System.err.println("*** Erreur de syntaxe: " + arg + ":" + e.getMessage());
		}
	    }

	}
    }
}