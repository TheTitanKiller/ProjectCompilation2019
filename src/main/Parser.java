package main;

import environment.*;
import java.util.Iterator;
import type.*;
import beaver.*;
import node.*;
import java.util.ArrayList;

/**
 * This class is a LALR parser generated by
 * <a href="http://beaver.sourceforge.net">Beaver</a> v0.9.6.1
 * from the grammar specification "Parser.grammar".
 */
public class Parser extends beaver.Parser {
	static public class AltGoals {
		static public final short program = 57;
	}

	static final ParsingTables PARSING_TABLES = new ParsingTables(
		"U9pjLmbuLDKPFVFU11MtbieaeRYB8Og0eBOGGWW14L0XGaW81ak0940Wu58jhRkYeXX0H0K" +
		"LKRQuWOYY8WWg8BY0kE62IbrRswfORDtuFU$EdybDPkPb74M#pyytt$$EV#yzzpztctll0r" +
		"9AK81qz4TtbA8vbc4$x8y3S21#Wz#Y6Nw7Wn12Aj9m4lBG6NtmH$J5gJWDf#CYRC9opCC#s" +
		"8n7iG9xORBy0mjb6rnCn4CemtYSWK4OZ3Dn5YfZH6YQjFRlqHNPh3S2XwgNWtD5gDs2seiJ" +
		"q1w9Et0Pfk1wN8nBSJckm9MOXCsCS2icogwe27PBz$q1BQrLcM6fF81Pr9d7baxyoNLcMZf" +
		"DP1jrF9MzVNL69Q5pkwLJYaUez1rrSdnrnYIXiyxIsOANs9yUrCdtrQbAGkS5I#Ta3AVEw9" +
		"WhoTRvIn8whrWwv#5ywloPEXVuwYoDgtCO3jVrVwJYmJW4H#0e78tME0Pjq1RjqG4daDaI$" +
		"S8SMOu5kDk7UGjEGHUqqeXFnsL6ztA1FCVwbw0NUY93w#VwA0r1PaJbMbpdmnoAOvKv5JTJ" +
		"9Jvp68vJvdJ#bs$mORPJtl6DZDs5c4rsHnszL$4tt8QAkEopCPVi4pNcCtWSSp3EfnL$K6Q" +
		"dHcSmIndT6cNsLaO11ZJ2B42XOHGt6hD46Nzgb5ckZB6DCYSeuquiufeSwCDy6Clb5UulHU" +
		"QikSk7cOFvZ3NF6tbv5ZNncV81bk19UL$Umqey9fjyOgx2QgxGfx0M6$0SDlemWUVn6d#lm" +
		"djUzcFA$s0$VZ6nnvZH$$7e7EkHHnAgyMlEdienTpIaSAh2tesMvqIyzLQfDwjNqti2Q#XM" +
		"uoPSXQjnJS9UEDA5bivwwj$Fz8qy5U$3FRWN3#9PHW$g8lghUM$5ItoV4pFcYooPnfvbyPp" +
		"AvXwImpqnb$j87cy7FNb#z#89rflzzdeTOBzSnav14zvHz#PzDODxs32kycBk$2DvyfOh8y" +
		"GzE8rxTGlUBrkQVyIXveIDZd1iqjgrzOeZNcj60xNRKBjzGjhUFFRZxI2VDuO1t3KBU6yud" +
		"X4SHa1KX6HR6aibWpj2Y2ENnj$krEbAbP1H2UrcdHmgW3gjTwlEcJmzG#IbyTQsEtNIpRYT" +
		"57Cb$PGwGxYZXFZTaCOLaQnEBQyMcyRytcbEPcg4ayxM3VLXLd9jfaVOZW#pOIyTrlEKgdW" +
		"FhwsVcL2R7DuZ$PHIhNzwHweaminan0u#p4J7hf2ZLSSEySiYWpVJU6nlXTQnZ#CT89Mtqn" +
		"$VYbyoiz3CVgeFqpjhGfpxL7FM#Cr$QqPok8AzaK$dwepFpAJkCNnd6cq$TTVyPueuxzuAT" +
		"#CpHGo7yOGFJoC$PXkn7Zzc$UVdPKRznwDowiL9JwJ6hpbxB2US7ioP2djDwpoCY7X5TQLc" +
		"LYSmhnJ3wHs18$bzqufVE8bwuKY5bauH1kCii#PgJyKXNdICKBMnvitJdk#Ac357isGCRno" +
		"lN#BTgqK#8uoa5NZtOze2mBcC#1Pj0gqP43ZAuoPZVB9e7HbZMrsUqv9M0mHJYQk86KJUjO" +
		"FjYHyJEn6$8tO7NEe7#nB92GuaTY6M4FE9PKHQi8h8Etlm0k9KugN4#KJsntsCU0FrTrXjs" +
		"iMyMwcnLrrUWFqF7a0Sh#btcMOCTrFiVhdlavCNzeFybd3RQlvNJ2ydTjEorTJ9K7y3$Ixg" +
		"Rw6VhrhdyaKjzDUoDrbMviqHomRHzjTyQZhiPo1Nq$zcUZhJGvdefB4cASwcdQV#$yapSyZ" +
		"vtibwDATPudFeDAVbDSZZN75DmUb1osRChxLDekL7qohfJBBgd0Eay1lBcQLfhZNNcsFjZr" +
		"jkZUz1j35MsflxGbgHfYluylfUKxzTRauOiLNJbOfZQNJTQkfodjs9cizvTwUhptMKieyLY" +
		"r#VxapoSuaNqxYkKjfQvGjfYzJdVoQ5wzoTeUbfTRpWNCNjshR5d8ULdazSHnZSSCn$gF4v" +
		"h46wLHW3ynLh5BSexWYZawBOGh6TegvjfvTYiU84HLrdpcJ5sT5jSkP4vmLMDE0iIQn$ph8" +
		"6wRMMly7otx3yj#lNCT$tKxJiKyrRexXJyx$GTcQ6qGs6CVWHyqgrhD3gJucMSxzqEbjQxH" +
		"BfL#Fz3dvknLHzpBJqRwFk2GtwkR5#slaaEMrNzwt0jFhvjME4ztpQlRH1h6ohVRjYyBTRV" +
		"UfWvNldqrTMMLbqNM#Vb6$LjY7oo3fvMfwI9sMDh9OdP9MibCTbiTmlzyczKcqOA#GElkVG" +
		"RgTnB8NdWioYtKAxYSR$lt0Va1aqdYF2FKUujyhDfluqcQgHvihrSgVn7ZNlXsMAN2VNocI" +
		"vHXuYY#UGLCioKrOj3nfSQjuFcFSIRVDwnNjeTwjV4#dH8fad2urt5#qjULFpNvSlPQVyLx" +
		"wG7VAvV2QVod#4fuDy9F#IJwmH#P3sT$MtoxlglQtuJzfMUStu7yixclk6udnP86k9BzDuU" +
		"icBiZaIzmNptcZUpyW6M8yyBppRvHlvMjCyZOId9Cxd$I90StXxQi9x3VT1#gED1NY72QA4" +
		"c1$7ph3iTDe0jNwiTnfZzUUDoRE1Z3s6#RLMmFY3oAaaLZ8zb7vNyhioFTPOW5#fl7MnRY7" +
		"zSfQL4yUnR9pvcdAC3QC$abR66s8PRuYbv9KoFPprXXEBY3cCKqnkCTFTr79zB8$y7kHt8O" +
		"vdlF7CgsASAc9FuicqNhHJQBrftPblMn$MwyF#zYMUodPLa5F1$25CZsAyKKndCPt5T1PrE" +
		"ZDTtvmuVYmBH2mxXftzFUwGZKq=");

	static final Action RETURN2 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 2];
		}
	};

	static final Action RETURN6 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 6];
		}
	};

	static final Action RETURN4 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 4];
		}
	};

	static final Action RETURN3 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 3];
		}
	};

	static final Action RETURN5 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 5];
		}
	};

	static final Action RETURN7 = new Action() {
		public Symbol reduce(Symbol[] _symbols, int offset) {
			return _symbols[offset + 7];
		}
	};
 
	static class Events extends beaver.Parser.Events {
		public void syntaxError(Symbol token) {
			System.err.format("*** Erreur de syntaxe en ligne %d, colonne %d. Token inattendu: %s\n",
				Symbol.getLine(token.getStart()),
				Symbol.getColumn(token.getStart()),
				Terminals.NAMES[token.getId()]);
		}
	}
	
	public void semanticError(String msg, Symbol token) {
			System.err.format("*** " + msg + " ligne %d, colonne %d\n",
				Symbol.getLine(token.getStart()),
				Symbol.getColumn(token.getStart()));
		}
		
	private Environment typeEnvironment = new Environment("types");
	private Environment procedureEnvironment = new Environment("procedures");
	private StackEnvironment stackEnvironment = new StackEnvironment("local variables stack");
	private String type_declaration_name;

	private final Action[] actions;

	public Parser() {
		super(PARSING_TABLES);
		actions = new Action[] {
			Action.RETURN,	// [0] $goal = program
			RETURN2,	// [1] $goal = $program program; returns 'program' although none is marked
			RETURN6,	// [2] program = type_declaration_part variable_declaration_part procedure_definition_part TOKEN_BEGIN statement_list TOKEN_END; returns 'TOKEN_END' although none is marked
			Action.NONE,  	// [3] type_declaration_part = 
			RETURN2,	// [4] type_declaration_part = TOKEN_TYPE type_declaration_list; returns 'type_declaration_list' although none is marked
			new Action() {	// [5] type_declaration_list = type_declaration_list type_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [6] type_declaration_list = type_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN4,	// [7] type_declaration = type_declaration_head TOKEN_AFF type TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			Action.RETURN,	// [8] type_declaration_head = TOKEN_IDENTIFIER
			Action.RETURN,	// [9] type = simple_type
			Action.RETURN,	// [10] type = named_type
			Action.RETURN,	// [11] type = index_type
			Action.RETURN,	// [12] type = array_type
			Action.RETURN,	// [13] type = pointer_type
			Action.RETURN,	// [14] type = structure_type
			Action.RETURN,	// [15] simple_type = TOKEN_STRING
			Action.RETURN,	// [16] simple_type = TOKEN_INTEGER
			Action.RETURN,	// [17] simple_type = TOKEN_BOOLEAN
			Action.RETURN,	// [18] named_type = TOKEN_IDENTIFIER
			Action.RETURN,	// [19] index_type = enumerated_type
			Action.RETURN,	// [20] index_type = subrange_type
			RETURN4,	// [21] enumerated_type = init_enumerated_type TOKEN_LPAR identifier_list TOKEN_RPAR; returns 'TOKEN_RPAR' although none is marked
			Action.NONE,  	// [22] init_enumerated_type = 
			RETURN3,	// [23] subrange_type = TOKEN_LIT_INTEGER TOKEN_DOTDOT TOKEN_LIT_INTEGER; returns 'TOKEN_LIT_INTEGER' although none is marked
			RETURN3,	// [24] subrange_type = TOKEN_IDENTIFIER TOKEN_DOTDOT TOKEN_IDENTIFIER; returns 'TOKEN_IDENTIFIER' although none is marked
			RETURN6,	// [25] array_type = TOKEN_ARRAY TOKEN_LBRACKET range_type TOKEN_RBRACKET TOKEN_OF type; returns 'type' although none is marked
			Action.RETURN,	// [26] range_type = enumerated_type
			Action.RETURN,	// [27] range_type = subrange_type
			Action.RETURN,	// [28] range_type = named_type
			RETURN2,	// [29] pointer_type = TOKEN_CIRC type; returns 'type' although none is marked
			RETURN4,	// [30] structure_type = TOKEN_STRUCT TOKEN_LBRACE feature_list_type TOKEN_RBRACE; returns 'TOKEN_RBRACE' although none is marked
			new Action() {	// [31] feature_list_type = feature_list_type feature_type
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [32] feature_list_type = feature_type
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN4,	// [33] feature_type = TOKEN_IDENTIFIER TOKEN_COLON type TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			Action.NONE,  	// [34] variable_declaration_part = 
			RETURN2,	// [35] variable_declaration_part = TOKEN_VAR variable_declaration_list; returns 'variable_declaration_list' although none is marked
			new Action() {	// [36] variable_declaration_list = variable_declaration_list variable_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [37] variable_declaration_list = variable_declaration
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN4,	// [38] variable_declaration = identifier_list TOKEN_COLON type TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			new Action() {	// [39] identifier_list = identifier_list TOKEN_COMMA TOKEN_IDENTIFIER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [40] identifier_list = TOKEN_IDENTIFIER
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.NONE,  	// [41] procedure_definition_part = 
			Action.RETURN,	// [42] procedure_definition_part = procedure_definition_list
			new Action() {	// [43] procedure_definition_list = procedure_definition_list procedure_definition
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [44] procedure_definition_list = procedure_definition
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN2,	// [45] procedure_definition = procedure_definition_head block; returns 'block' although none is marked
			RETURN2,	// [46] procedure_definition = procedure_declaration_head TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			Action.RETURN,	// [47] procedure_definition_head = procedure_head
			Action.RETURN,	// [48] procedure_declaration_head = procedure_head
			RETURN5,	// [49] procedure_head = TOKEN_PROCEDURE TOKEN_IDENTIFIER TOKEN_LPAR argt_part TOKEN_RPAR; returns 'TOKEN_RPAR' although none is marked
			RETURN7,	// [50] procedure_head = TOKEN_FUNCTION TOKEN_IDENTIFIER TOKEN_LPAR argt_part TOKEN_RPAR TOKEN_COLON type; returns 'type' although none is marked
			Action.NONE,  	// [51] argt_part = 
			Action.RETURN,	// [52] argt_part = argt_list
			new Action() {	// [53] argt_list = argt_list TOKEN_COMMA argt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [54] argt_list = argt
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN3,	// [55] argt = TOKEN_IDENTIFIER TOKEN_COLON type; returns 'type' although none is marked
			RETURN4,	// [56] block = variable_declaration_part TOKEN_BEGIN statement_list TOKEN_END; returns 'TOKEN_END' although none is marked
			new Action() {	// [57] statement_list = statement_list statement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 2]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [58] statement_list = statement
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			Action.RETURN,	// [59] statement = simple_statement
			Action.RETURN,	// [60] statement = structured_statement
			Action.RETURN,	// [61] simple_statement = assignment_statement
			Action.RETURN,	// [62] simple_statement = procedure_statement
			Action.RETURN,	// [63] simple_statement = new_statement
			Action.RETURN,	// [64] simple_statement = dispose_statement
			Action.RETURN,	// [65] simple_statement = println_statement
			Action.RETURN,	// [66] simple_statement = readln_statement
			Action.RETURN,	// [67] simple_statement = return_statement
			RETURN4,	// [68] assignment_statement = variable_access TOKEN_AFF expression TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN2,	// [69] procedure_statement = procedure_expression TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN4,	// [70] procedure_expression = TOKEN_IDENTIFIER TOKEN_LPAR expression_part TOKEN_RPAR; returns 'TOKEN_RPAR' although none is marked
			Action.NONE,  	// [71] expression_part = 
			Action.RETURN,	// [72] expression_part = expression_list
			new Action() {	// [73] expression_list = expression_list TOKEN_COMMA expression
				public Symbol reduce(Symbol[] _symbols, int offset) {
					((ArrayList) _symbols[offset + 1].value).add(_symbols[offset + 3]); return _symbols[offset + 1];
				}
			},
			new Action() {	// [74] expression_list = expression
				public Symbol reduce(Symbol[] _symbols, int offset) {
					ArrayList lst = new ArrayList(); lst.add(_symbols[offset + 1]); return new Symbol(lst);
				}
			},
			RETURN3,	// [75] new_statement = TOKEN_NEW variable_access TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN3,	// [76] dispose_statement = TOKEN_DISPOSE variable_access TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN3,	// [77] println_statement = TOKEN_PRINTLN expression TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN3,	// [78] readln_statement = TOKEN_READLN expression TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			RETURN3,	// [79] return_statement = TOKEN_RETURN expression TOKEN_SEMIC; returns 'TOKEN_SEMIC' although none is marked
			Action.RETURN,	// [80] structured_statement = block
			Action.RETURN,	// [81] structured_statement = if_statement
			Action.RETURN,	// [82] structured_statement = while_statement
			Action.RETURN,	// [83] structured_statement = switch_statement
			RETURN4,	// [84] if_statement = TOKEN_IF expression TOKEN_THEN statement; returns 'statement' although none is marked
			RETURN6,	// [85] if_statement = TOKEN_IF expression TOKEN_THEN statement TOKEN_ELSE statement; returns 'statement' although none is marked
			RETURN4,	// [86] while_statement = TOKEN_WHILE expression TOKEN_DO statement; returns 'statement' although none is marked
			RETURN5,	// [87] switch_statement = TOKEN_SWITCH expression TOKEN_BEGIN case_statement_list TOKEN_END; returns 'TOKEN_END' although none is marked
			RETURN3,	// [88] case_statement_list = case_statement_list case_statement case_default; returns 'case_default' although none is marked
			Action.RETURN,	// [89] case_statement_list = case_statement
			RETURN4,	// [90] case_statement = TOKEN_CASE identifier_list TOKEN_COLON statement; returns 'statement' although none is marked
			Action.NONE,  	// [91] case_default = 
			RETURN3,	// [92] case_default = TOKEN_DEFAULT TOKEN_COLON statement; returns 'statement' although none is marked
			Action.RETURN,	// [93] variable_access = TOKEN_IDENTIFIER
			RETURN4,	// [94] variable_access = variable_access TOKEN_LBRACKET expression TOKEN_RBRACKET; returns 'TOKEN_RBRACKET' although none is marked
			RETURN2,	// [95] variable_access = expression TOKEN_CIRC; returns 'TOKEN_CIRC' although none is marked
			RETURN3,	// [96] expression = expression TOKEN_PLUS expression; returns 'expression' although none is marked
			RETURN3,	// [97] expression = expression TOKEN_MINUS expression; returns 'expression' although none is marked
			RETURN3,	// [98] expression = expression TOKEN_TIMES expression; returns 'expression' although none is marked
			RETURN3,	// [99] expression = expression TOKEN_DIV expression; returns 'expression' although none is marked
			RETURN2,	// [100] expression = TOKEN_MINUS expression; returns 'expression' although none is marked
			RETURN3,	// [101] expression = expression TOKEN_OR expression; returns 'expression' although none is marked
			RETURN3,	// [102] expression = expression TOKEN_AND expression; returns 'expression' although none is marked
			RETURN2,	// [103] expression = TOKEN_NOT expression; returns 'expression' although none is marked
			RETURN3,	// [104] expression = expression TOKEN_LT expression; returns 'expression' although none is marked
			RETURN3,	// [105] expression = expression TOKEN_LE expression; returns 'expression' although none is marked
			RETURN3,	// [106] expression = expression TOKEN_GT expression; returns 'expression' although none is marked
			RETURN3,	// [107] expression = expression TOKEN_GE expression; returns 'expression' although none is marked
			RETURN3,	// [108] expression = expression TOKEN_EQ expression; returns 'expression' although none is marked
			RETURN3,	// [109] expression = expression TOKEN_NE expression; returns 'expression' although none is marked
			RETURN3,	// [110] expression = TOKEN_LPAR expression TOKEN_RPAR; returns 'TOKEN_RPAR' although none is marked
			Action.RETURN,	// [111] expression = procedure_expression
			Action.RETURN,	// [112] expression = variable_access
			Action.RETURN,	// [113] expression = literal
			Action.RETURN,	// [114] literal = TOKEN_LIT_INTEGER
			Action.RETURN,	// [115] literal = TOKEN_LIT_STRING
			Action.RETURN,	// [116] literal = TOKEN_TRUE
			Action.RETURN,	// [117] literal = TOKEN_FALSE
			Action.RETURN	// [118] literal = TOKEN_NULL
		};

 
	report = new Events();
	}

	protected Symbol invokeReduceAction(int rule_num, int offset) {
		return actions[rule_num].reduce(_symbols, offset);
	}
}
