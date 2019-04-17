package main;
import beaver.Symbol;
import beaver.Scanner;


%%

%class Scanner
%extends beaver.Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	System.out.println(yytext()); return new Symbol(Terminals.TOKEN_END);
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


[^]
	{
		throw new Scanner.Exception("caractère inattendu '" + yytext() + "'");
	}