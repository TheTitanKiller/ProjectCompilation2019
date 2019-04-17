/* The following code was generated by JFlex 1.7.0 */

package main;
import beaver.Symbol;
import beaver.Scanner;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>/mnt/788A03918A034B58/ShareFiles/Documents/1-Etude/2-Université de Bordeaux/Semestre 6/ProjectCompilation2019/scanner/Scanner.jflex</tt>
 */
class ScannerLEA extends Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\61\1\11\3\61\22\0\1\61\1\56\1\7\3\0\1\57"+
    "\1\0\1\40\1\41\1\12\1\37\1\46\1\1\1\52\1\10\1\3"+
    "\11\2\1\50\1\47\1\55\1\53\1\54\2\0\6\5\24\6\1\42"+
    "\1\0\1\43\1\51\1\6\1\0\1\24\1\21\1\30\1\33\1\16"+
    "\1\34\1\17\1\35\1\13\2\6\1\23\1\6\1\14\1\22\1\31"+
    "\1\6\1\20\1\25\1\15\1\27\1\32\1\36\1\4\1\26\1\6"+
    "\1\44\1\60\1\45\7\0\1\61\32\0\1\61\u15df\0\1\61\u097f\0"+
    "\13\61\35\0\2\61\5\0\1\61\57\0\1\61\u0fa0\0\1\61\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\1\1\5\1\6"+
    "\1\7\16\4\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\1\1\23\1\24"+
    "\1\25\1\26\2\1\2\0\1\27\2\0\1\4\1\30"+
    "\12\4\1\31\5\4\1\32\3\4\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\0\1\4\1\43"+
    "\4\4\1\44\11\4\1\45\5\4\1\46\1\47\1\50"+
    "\1\51\1\52\20\4\1\53\1\4\1\54\5\4\1\55"+
    "\1\4\1\56\1\4\1\57\1\60\1\4\1\61\1\62"+
    "\4\4\1\63\1\64\1\65\1\4\1\66\2\4\1\67"+
    "\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\62\0\144\0\144\0\226\0\310\0\372\0\u012c"+
    "\0\62\0\62\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258"+
    "\0\u028a\0\u02bc\0\u02ee\0\u0320\0\u0352\0\u0384\0\u03b6\0\u03e8"+
    "\0\144\0\62\0\62\0\62\0\62\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2"+
    "\0\u0514\0\u0546\0\u0578\0\372\0\62\0\u05aa\0\u05dc\0\u060e"+
    "\0\310\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c"+
    "\0\u079e\0\u07d0\0\u0802\0\310\0\u0834\0\u0866\0\u0898\0\u08ca"+
    "\0\u08fc\0\310\0\u092e\0\u0960\0\u0992\0\62\0\62\0\62"+
    "\0\62\0\62\0\62\0\62\0\u0578\0\u09c4\0\u09f6\0\310"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\310\0\u0af0\0\u0b22\0\u0b54"+
    "\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\u0c4e\0\u0c80\0\310\0\u0cb2"+
    "\0\u0ce4\0\u0d16\0\u0d48\0\u0d7a\0\310\0\310\0\310\0\310"+
    "\0\310\0\u0dac\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8"+
    "\0\u0f0a\0\u0f3c\0\u0f6e\0\u0fa0\0\u0fd2\0\u1004\0\u1036\0\u1068"+
    "\0\u109a\0\310\0\u10cc\0\310\0\u10fe\0\u1130\0\u1162\0\u1194"+
    "\0\u11c6\0\310\0\u11f8\0\310\0\u122a\0\310\0\310\0\u125c"+
    "\0\310\0\310\0\u128e\0\u12c0\0\u12f2\0\u1324\0\310\0\310"+
    "\0\310\0\u1356\0\310\0\u1388\0\u13ba\0\310\0\310";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\3\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\6\1\17\1\20"+
    "\1\21\1\6\1\22\1\23\3\6\1\24\1\25\1\26"+
    "\1\27\1\6\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\11\64\0\2\4"+
    "\60\0\2\4\1\53\57\0\5\6\4\0\24\6\23\0"+
    "\7\54\1\55\52\54\10\0\1\56\1\0\1\57\51\0"+
    "\5\6\4\0\1\6\1\60\17\6\1\61\2\6\25\0"+
    "\5\6\4\0\3\6\1\62\10\6\1\63\7\6\25\0"+
    "\5\6\4\0\5\6\1\64\5\6\1\65\6\6\1\66"+
    "\1\6\25\0\5\6\4\0\1\6\1\67\6\6\1\70"+
    "\13\6\25\0\5\6\4\0\3\6\1\71\20\6\25\0"+
    "\5\6\4\0\3\6\1\72\3\6\1\73\14\6\25\0"+
    "\5\6\4\0\21\6\1\74\2\6\25\0\5\6\4\0"+
    "\5\6\1\75\16\6\25\0\5\6\4\0\2\6\1\76"+
    "\21\6\25\0\5\6\4\0\5\6\1\77\16\6\25\0"+
    "\5\6\4\0\11\6\1\100\12\6\25\0\5\6\4\0"+
    "\1\101\6\6\1\102\14\6\25\0\5\6\4\0\11\6"+
    "\1\103\2\6\1\104\7\6\25\0\5\6\4\0\22\6"+
    "\1\105\1\6\75\0\1\106\62\0\1\107\61\0\1\110"+
    "\61\0\1\111\61\0\1\112\65\0\1\113\62\0\1\114"+
    "\3\0\2\115\1\0\1\115\10\0\1\115\2\0\1\115"+
    "\2\0\1\115\3\0\1\115\2\0\2\115\25\0\11\56"+
    "\1\11\50\56\12\57\1\116\47\57\2\0\5\6\4\0"+
    "\2\6\1\117\21\6\25\0\5\6\4\0\23\6\1\120"+
    "\25\0\5\6\4\0\10\6\1\121\13\6\25\0\5\6"+
    "\4\0\14\6\1\122\7\6\25\0\5\6\4\0\16\6"+
    "\1\123\5\6\25\0\5\6\4\0\3\6\1\124\20\6"+
    "\25\0\5\6\4\0\20\6\1\125\3\6\25\0\5\6"+
    "\4\0\12\6\1\126\11\6\25\0\5\6\4\0\2\6"+
    "\1\127\6\6\1\130\12\6\25\0\5\6\4\0\4\6"+
    "\1\131\17\6\25\0\5\6\4\0\7\6\1\132\14\6"+
    "\25\0\5\6\4\0\5\6\1\133\16\6\25\0\5\6"+
    "\4\0\5\6\1\134\16\6\25\0\5\6\4\0\1\135"+
    "\6\6\1\136\14\6\25\0\5\6\4\0\5\6\1\137"+
    "\16\6\25\0\5\6\4\0\12\6\1\140\11\6\25\0"+
    "\5\6\4\0\10\6\1\141\13\6\25\0\5\6\4\0"+
    "\1\6\1\142\22\6\25\0\5\6\4\0\1\143\23\6"+
    "\23\0\10\57\1\11\1\57\1\116\47\57\2\0\5\6"+
    "\4\0\3\6\1\144\20\6\25\0\5\6\4\0\10\6"+
    "\1\145\13\6\25\0\5\6\4\0\3\6\1\146\20\6"+
    "\25\0\5\6\4\0\3\6\1\147\20\6\25\0\5\6"+
    "\4\0\1\6\1\150\22\6\25\0\5\6\4\0\3\6"+
    "\1\151\20\6\25\0\5\6\4\0\14\6\1\152\7\6"+
    "\25\0\5\6\4\0\20\6\1\153\3\6\25\0\5\6"+
    "\4\0\1\154\23\6\25\0\5\6\4\0\10\6\1\155"+
    "\13\6\25\0\5\6\4\0\11\6\1\156\12\6\25\0"+
    "\5\6\4\0\1\157\13\6\1\160\7\6\25\0\5\6"+
    "\4\0\1\6\1\161\22\6\25\0\5\6\4\0\15\6"+
    "\1\162\6\6\25\0\5\6\4\0\16\6\1\163\5\6"+
    "\25\0\5\6\4\0\12\6\1\164\11\6\25\0\5\6"+
    "\4\0\15\6\1\165\6\6\25\0\5\6\4\0\10\6"+
    "\1\166\13\6\25\0\5\6\4\0\4\6\1\167\17\6"+
    "\25\0\5\6\4\0\5\6\1\170\16\6\25\0\5\6"+
    "\4\0\10\6\1\171\13\6\25\0\5\6\4\0\1\6"+
    "\1\172\22\6\25\0\5\6\4\0\3\6\1\173\20\6"+
    "\25\0\5\6\4\0\13\6\1\174\10\6\25\0\5\6"+
    "\4\0\1\6\1\175\22\6\25\0\5\6\4\0\15\6"+
    "\1\176\6\6\25\0\5\6\4\0\2\6\1\177\21\6"+
    "\25\0\5\6\4\0\3\6\1\200\20\6\25\0\5\6"+
    "\4\0\7\6\1\201\14\6\25\0\5\6\4\0\3\6"+
    "\1\202\20\6\25\0\5\6\4\0\2\6\1\203\21\6"+
    "\25\0\5\6\4\0\3\6\1\204\20\6\25\0\5\6"+
    "\4\0\3\6\1\205\20\6\25\0\5\6\4\0\1\6"+
    "\1\206\22\6\25\0\5\6\4\0\1\6\1\207\22\6"+
    "\25\0\5\6\4\0\11\6\1\210\12\6\25\0\5\6"+
    "\4\0\4\6\1\211\17\6\25\0\5\6\4\0\2\6"+
    "\1\212\21\6\25\0\5\6\4\0\10\6\1\213\13\6"+
    "\25\0\5\6\4\0\20\6\1\214\3\6\25\0\5\6"+
    "\4\0\12\6\1\215\11\6\25\0\5\6\4\0\1\216"+
    "\23\6\25\0\5\6\4\0\5\6\1\217\16\6\25\0"+
    "\5\6\4\0\1\6\1\220\22\6\25\0\5\6\4\0"+
    "\1\6\1\221\22\6\25\0\5\6\4\0\14\6\1\222"+
    "\7\6\25\0\5\6\4\0\3\6\1\223\20\6\25\0"+
    "\5\6\4\0\7\6\1\224\14\6\25\0\5\6\4\0"+
    "\5\6\1\225\16\6\25\0\5\6\4\0\1\6\1\226"+
    "\22\6\25\0\5\6\4\0\3\6\1\227\20\6\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5100];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\2\11\17\1\12\11\7\1\2\0"+
    "\1\11\2\0\26\1\7\11\1\1\1\0\111\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
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



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  ScannerLEA(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 192) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Symbol nextToken() throws java.io.IOException, Scanner.Exception {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	System.out.println(yytext()); return new Symbol(Terminals.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { throw new Scanner.Exception("Unexpected character '" + yytext() + "'" + " line " + yyline + " colomn" + yycolumn + ".");
            } 
            // fall through
          case 57: break;
          case 2: 
            { return newToken(Terminals.TOKEN_MINUS);
            } 
            // fall through
          case 58: break;
          case 3: 
            { return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt(yytext()));
            } 
            // fall through
          case 59: break;
          case 4: 
            { return newToken(Terminals.TOKEN_IDENTIFIER, yytext());
            } 
            // fall through
          case 60: break;
          case 5: 
            { return newToken(Terminals.TOKEN_DIV);
            } 
            // fall through
          case 61: break;
          case 6: 
            { 
            } 
            // fall through
          case 62: break;
          case 7: 
            { return newToken(Terminals.TOKEN_TIMES);
            } 
            // fall through
          case 63: break;
          case 8: 
            { return newToken(Terminals.TOKEN_PLUS);
            } 
            // fall through
          case 64: break;
          case 9: 
            { return newToken(Terminals.TOKEN_LPAR);
            } 
            // fall through
          case 65: break;
          case 10: 
            { return newToken(Terminals.TOKEN_RPAR);
            } 
            // fall through
          case 66: break;
          case 11: 
            { return newToken(Terminals.TOKEN_LBRACKET);
            } 
            // fall through
          case 67: break;
          case 12: 
            { return newToken(Terminals.TOKEN_RBRACKET);
            } 
            // fall through
          case 68: break;
          case 13: 
            { return newToken(Terminals.TOKEN_LBRACE);
            } 
            // fall through
          case 69: break;
          case 14: 
            { return newToken(Terminals.TOKEN_RBRACE);
            } 
            // fall through
          case 70: break;
          case 15: 
            { return newToken(Terminals.TOKEN_COMMA);
            } 
            // fall through
          case 71: break;
          case 16: 
            { return newToken(Terminals.TOKEN_SEMIC);
            } 
            // fall through
          case 72: break;
          case 17: 
            { return newToken(Terminals.TOKEN_COLON);
            } 
            // fall through
          case 73: break;
          case 18: 
            { return newToken(Terminals.TOKEN_CIRC);
            } 
            // fall through
          case 74: break;
          case 19: 
            { return newToken(Terminals.TOKEN_AFF);
            } 
            // fall through
          case 75: break;
          case 20: 
            { return newToken(Terminals.TOKEN_GT);
            } 
            // fall through
          case 76: break;
          case 21: 
            { return newToken(Terminals.TOKEN_LT);
            } 
            // fall through
          case 77: break;
          case 22: 
            { return newToken(Terminals.TOKEN_NOT);
            } 
            // fall through
          case 78: break;
          case 23: 
            { return newToken(Terminals.TOKEN_LIT_STRING, yytext());
            } 
            // fall through
          case 79: break;
          case 24: 
            { return newToken(Terminals.TOKEN_IF);
            } 
            // fall through
          case 80: break;
          case 25: 
            { return newToken(Terminals.TOKEN_OF);
            } 
            // fall through
          case 81: break;
          case 26: 
            { return newToken(Terminals.TOKEN_DO);
            } 
            // fall through
          case 82: break;
          case 27: 
            { return newToken(Terminals.TOKEN_DOTDOT);
            } 
            // fall through
          case 83: break;
          case 28: 
            { return newToken(Terminals.TOKEN_EQ);
            } 
            // fall through
          case 84: break;
          case 29: 
            { return newToken(Terminals.TOKEN_GE);
            } 
            // fall through
          case 85: break;
          case 30: 
            { return newToken(Terminals.TOKEN_LE);
            } 
            // fall through
          case 86: break;
          case 31: 
            { return newToken(Terminals.TOKEN_NE);
            } 
            // fall through
          case 87: break;
          case 32: 
            { return newToken(Terminals.TOKEN_AND);
            } 
            // fall through
          case 88: break;
          case 33: 
            { return newToken(Terminals.TOKEN_OR);
            } 
            // fall through
          case 89: break;
          case 34: 
            { String s = yytext();
	s = s.replaceAll("0x", ""); 
	return newToken(Terminals.TOKEN_LIT_INTEGER, Integer.parseInt( s, 16));
            } 
            // fall through
          case 90: break;
          case 35: 
            { return newToken(Terminals.TOKEN_NEW);
            } 
            // fall through
          case 91: break;
          case 36: 
            { return newToken(Terminals.TOKEN_END);
            } 
            // fall through
          case 92: break;
          case 37: 
            { return newToken(Terminals.TOKEN_VAR);
            } 
            // fall through
          case 93: break;
          case 38: 
            { return newToken(Terminals.TOKEN_NULL);
            } 
            // fall through
          case 94: break;
          case 39: 
            { return newToken(Terminals.TOKEN_TRUE);
            } 
            // fall through
          case 95: break;
          case 40: 
            { return newToken(Terminals.TOKEN_TYPE);
            } 
            // fall through
          case 96: break;
          case 41: 
            { return newToken(Terminals.TOKEN_THEN);
            } 
            // fall through
          case 97: break;
          case 42: 
            { return newToken(Terminals.TOKEN_ELSE);
            } 
            // fall through
          case 98: break;
          case 43: 
            { return newToken(Terminals.TOKEN_BEGIN);
            } 
            // fall through
          case 99: break;
          case 44: 
            { return newToken(Terminals.TOKEN_ARRAY);
            } 
            // fall through
          case 100: break;
          case 45: 
            { return newToken(Terminals.TOKEN_FALSE);
            } 
            // fall through
          case 101: break;
          case 46: 
            { return newToken(Terminals.TOKEN_WHILE);
            } 
            // fall through
          case 102: break;
          case 47: 
            { return newToken(Terminals.TOKEN_RETURN);
            } 
            // fall through
          case 103: break;
          case 48: 
            { return newToken(Terminals.TOKEN_READLN);
            } 
            // fall through
          case 104: break;
          case 49: 
            { return newToken(Terminals.TOKEN_STRING);
            } 
            // fall through
          case 105: break;
          case 50: 
            { return newToken(Terminals.TOKEN_STRUCT);
            } 
            // fall through
          case 106: break;
          case 51: 
            { return newToken(Terminals.TOKEN_INTEGER);
            } 
            // fall through
          case 107: break;
          case 52: 
            { return newToken(Terminals.TOKEN_BOOLEAN);
            } 
            // fall through
          case 108: break;
          case 53: 
            { return newToken(Terminals.TOKEN_PRINTLN);
            } 
            // fall through
          case 109: break;
          case 54: 
            { return newToken(Terminals.TOKEN_DISPOSE);
            } 
            // fall through
          case 110: break;
          case 55: 
            { return newToken(Terminals.TOKEN_FUNCTION);
            } 
            // fall through
          case 111: break;
          case 56: 
            { return newToken(Terminals.TOKEN_PROCEDURE);
            } 
            // fall through
          case 112: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
