import beaver.Symbol;
import beaver.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

%%

%class ScannerExpr
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	System.out.println(yytext()); return new Symbol(Terminals.EOF);
%eofval}
%unicode
%line
%column
%{
	// Petit helpers pour simplifier la création de token.
	// On retient la position de chaque token pour la gestion d'erreur
	// voir beaver-rt/src/main/java/beaver/Symbol.java
	private Symbol newToken(short id)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), null);
	}

	private Symbol newToken(short id, Object value)
	{
		return new Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}

%}


NaturalInteger = [[:digit:]]+
Integer = {NaturalInteger}
Float = {NaturalInteger} ("." {NaturalInteger})?
Identifier = [_a-zA-Z][[:digit:]_a-zA-Z]*
Pi = "pi"
Nep = "e"
Comment = "//"~"\n"

%%

"+"
	{
		return newToken(Terminals.PLUS);
	}
	
"-"
	{
		return newToken(Terminals.MINUS);
	}
"*"
	{
		return newToken(Terminals.MULT);
	}
	
"/"
	{
		return newToken(Terminals.DIV);
	}
		
"="
	{
		return newToken(Terminals.ASSIGN);
	}
	
","
	{
		return newToken(Terminals.COLON);
	}
	
";"
	{
		return newToken(Terminals.SEMICOLON);
	}
	
"("
	{
		return newToken(Terminals.LPAR);
	}
")"
	{
		return newToken(Terminals.RPAR);
	}
	
"sin" 
	{
		return newToken(Terminals.UFCT, yytext());
	} 
	
"sqrt" 
	{
		return newToken(Terminals.UFCT, yytext());
	} 
	
"round" 
	{
		return newToken(Terminals.UFCT, yytext());
	}
	
"min" 
	{
		return newToken(Terminals.BFCT, yytext());
	}

"max" 
	{
		return newToken(Terminals.BFCT, yytext());
	}
	
"pow" 
	{
		return newToken(Terminals.BFCT, yytext());
	}
	
"ln" 
	{
		return newToken(Terminals.UFCT, yytext());
	}
	
{Pi}
	{
		return newToken(Terminals.PI, Math.PI);
	}
	
{Nep}
	{
		return newToken(Terminals.NEP, Math.exp(1));
	}
	
{Integer}
	{
		return newToken(Terminals.INTEGER, Integer.parseInt(yytext()));
	}
	
{Float}
	{
		return newToken(Terminals.FLOAT, Float.parseFloat(yytext()));
	}

{Identifier}
	{
		return newToken(Terminals.ID, yytext());
	}
	
{Comment}
	{
		//System.out.println("Comment :" +yytext());
	}


[\s] {}

[\n] {}

[^]
	{
		throw new Scanner.Exception("caractère inattendu '" + yytext() + "'");
	}