import beaver.Symbol;
import beaver.Scanner;

%%

%class ScannerExpr
%extends Scanner
%function nextToken
%type Symbol
%yylexthrow Scanner.Exception
%eofval{
	System.out.println(yytext()); return Symbol(Terminals.EOF);
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
		return Symbol(id, yyline + 1, yycolumn + 1, yylength(), null);
	}

	private Symbol newToken(short id, Object value)
	{
		return Symbol(id, yyline + 1, yycolumn + 1, yylength(), value);
	}

%}

Integer = [+-]?[0-9]+
HexInteger = "0x"[0-9A-Fa-f]+
Identifier = [a-zA-Z_][a-zA-Z0-9_]*
String = "\""~"\""
Comment = "//"~"\n"
BigComment = "/*"~"*/"

%%

"integer" {return newToken(Terminals.TOKEN_INTEGER);}
"boolean" {return newToken(Terminals.TOKEN_BOOLEAN);}
"string" {return newToken(Terminals.TOKEN_STRING);}
"array" {return newToken(Terminals.TOKEN_ARRAY);}
"struct" {return newToken(Terminals.TOKEN_STRUCT);}

"type" {return newToken(Terminals.TOKEN_TYPE);}
"var" {return newToken(Terminals.TOKEN_VAR);}
"begin" {return newToken(Terminals.TOKEN_BEGIN);}
"end" {return newToken(Terminals.TOKEN_END);}

"function" {return newToken(Terminals.TOKEN_FUNCTION);}
"procedure" {return newToken(Terminals.TOKEN_PROCEDURE);}
"println" {return newToken(Terminals.TOKEN_PRINTLN);}
"readln" {return newToken(Terminals.TOKEN_READLN);}

"of" {return newToken(Terminals.TOKEN_OF);}
"if" {return newToken(Terminals.TOKEN_IF);}
"then" {return newToken(Terminals.TOKEN_THEN);}
"else" {return newToken(Terminals.TOKEN_ELSE);}
"while" {return newToken(Terminals.TOKEN_WHILE);}
"do" {return newToken(Terminals.TOKEN_DO);}
"return" {return newToken(Terminals.TOKEN_RETURN);}
"new" {return newToken(Terminals.TOKEN_NEW);}
"dispose" {return newToken(Terminals.TOKEN_DISPOSE);}

"true" {return newToken(Terminals.TOKEN_TRUE);}
"false" {return newToken(Terminals.TOKEN_FALSE);}
"null" {return newToken(Terminals.TOKEN_NULL);}

"+" {return newToken(Terminals.TOKEN_PLUS);}
"-" {return newToken(Terminals.TOKEN_MINUS);}
"*" {return newToken(Terminals.TOKEN_TIMES);}
"/" {return newToken(Terminals.TOKEN_DIV);}

"(" {return newToken(Terminals.TOKEN_LPAR);}
")" {return newToken(Terminals.TOKEN_RPAR);}
"[" {return newToken(Terminals.TOKEN_LBRACKET);}
"]" {return newToken(Terminals.TOKEN_RBRACKET);}
"{" {return newToken(Terminals.TOKEN_LBRACE);}
"}" {return newToken(Terminals.TOKEN_RBRACE);}
"," {return newToken(Terminals.TOKEN_COMMA);}
";" {return newToken(Terminals.TOKEN_SEMIC);}
":" {return newToken(Terminals.TOKEN_COLON);}
"^" {return newToken(Terminals.TOKEN_CIRC);}
".." {return newToken(Terminals.TOKEN_DOTDOT);}
"=" {return newToken(Terminals.TOKEN_AFF);}

"==" {return newToken(Terminals.TOKEN_EQ);}
">" {return newToken(Terminals.TOKEN_GT);}
"<" {return newToken(Terminals.TOKEN_LT);}
">=" {return newToken(Terminals.TOKEN_GE);}
"<=" {return newToken(Terminals.TOKEN_LE);}
"!=" {return newToken(Terminals.TOKEN_NE);}
"&&" {return newToken(Terminals.TOKEN_AND);}
"||" {return newToken(Terminals.TOKEN_OR);}
"!" {return newToken(Terminals.TOKEN_NOT);}

{Integer} {return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt(yytext()));}
{HexInteger} {return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt(yytext(), 16));}
{String} {return newToken(Terminals.TOKEN_LIT_STRING, yytext());}
{Identifier} {return newToken(Terminals.TOKEN_IDENTIFIER, yytext());}

{Comment} | {BigComment} | \n | \s {}

[^] {throw new Scanner.Exception("Caractère inattendu '" + yytext() + "'" + " en ligne " + yyline() + " colonne " + yycolumn() + ".");}