/**
 * This class lists terminals used by the
 * grammar specified in "ParserExpr.grammar".
 */
public class Terminals {
	static public final short EOF = 0;
	static public final short MINUS = 1;
	static public final short LPAR = 2;
	static public final short ID = 3;
	static public final short BFCT = 4;
	static public final short UFCT = 5;
	static public final short INTEGER = 6;
	static public final short FLOAT = 7;
	static public final short PI = 8;
	static public final short NEP = 9;
	static public final short MULT = 10;
	static public final short DIV = 11;
	static public final short PLUS = 12;
	static public final short SEMICOLON = 13;
	static public final short RPAR = 14;
	static public final short ASSIGN = 15;
	static public final short COLON = 16;

	static public final String[] NAMES = {
		"EOF",
		"MINUS",
		"LPAR",
		"ID",
		"BFCT",
		"UFCT",
		"INTEGER",
		"FLOAT",
		"PI",
		"NEP",
		"MULT",
		"DIV",
		"PLUS",
		"SEMICOLON",
		"RPAR",
		"ASSIGN",
		"COLON"
	};
}
