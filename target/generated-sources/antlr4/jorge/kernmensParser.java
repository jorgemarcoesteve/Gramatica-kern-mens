// Generated from jorge/kernmensParser.g4 by ANTLR 4.8
package jorge;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kernmensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, LETTER_L=2, LETTER_M=3, PERTFECT=4, DIGIT=5, THREE=6, TWO=7, M_RHYTHM=8, 
		SHARP=9, FLAT=10, DOUBLESHARP=11, DOUBLEFLAT=12, NATURAL=13, CLEF=14, 
		SPACE=15, GREATER=16, LESS=17, LEFTPAR=18, RIGHTPAR=19, LEFTBRACKET=20, 
		RIGHTBRACKET=21, LEFTCURBRACES=22, RIGHTCURBRACES=23, LETTER_K=24, LETTER_k=25, 
		LETTER_m=26, LETTER_T=27, LETTER_t=28, LETTER_W=29, LETTER_w=30, LETTER_U=31, 
		LETTER_p=32, LETTER_i=33, LETTER_v=34, LETTER_r=35, LETTER_R=36, LETTER_I=37, 
		LETTER_P=38, LETTER_A=39, LETTER_B=40, LETTER_C=41, LETTER_D=42, LETTER_E=43, 
		LETTER_F=44, LETTER_G=45, LETTER_X=46, LETTER_a=47, LETTER_b=48, LETTER_c=49, 
		LETTER_d=50, LETTER_e=51, LETTER_f=52, LETTER_g=53, LETTER_J=54, WORD_CLEF=55, 
		WORD_SKERN=56, WORD_SMENS=57, WORD_MET=58, DOT=59, BARLINE=60, EQUAL=61, 
		SLASH=62, BACKSLASH=63, ASTERISK=64, CIRCUNFLEX=65, APOSTROPHE=66, SEMICOLON=67, 
		COLON=68, COLOURED=69, GRAVE_ACCENT=70, EXCLAMATION=71, COMA=72, SLURS_COUNT=73, 
		TOKEN_FINISH=74;
	public static final int
		RULE_incipit = 0, RULE_mastercleff = 1, RULE_keysignature = 2, RULE_note_signature = 3, 
		RULE_notesuffix = 4, RULE_pitch = 5, RULE_stem_direction = 6, RULE_kern_notation = 7, 
		RULE_timesignature = 8, RULE_fraction = 9, RULE_number = 10, RULE_metter = 11, 
		RULE_common_met = 12, RULE_perfect_met = 13, RULE_musicalcontent = 14, 
		RULE_measure = 15, RULE_items = 16, RULE_item = 17, RULE_changeconfiguration = 18, 
		RULE_slurs = 19, RULE_ties = 20, RULE_notesties = 21, RULE_tiesaux = 22, 
		RULE_notes = 23, RULE_beaming = 24, RULE_note = 25, RULE_time = 26, RULE_rest = 27, 
		RULE_barlines = 28, RULE_chord = 29, RULE_articulations = 30, RULE_ornaments = 31, 
		RULE_partial_beaming = 32, RULE_edit_accident = 33, RULE_doubleBarline = 34, 
		RULE_rightRepeatBarline = 35, RULE_leftRepeatBarline = 36, RULE_doubleRepeatBarline = 37, 
		RULE_endBarline = 38, RULE_mens_notation = 39, RULE_m_timesignature = 40, 
		RULE_m_musicalcontent = 41, RULE_m_measure = 42, RULE_m_items = 43, RULE_m_item = 44, 
		RULE_m_note = 45, RULE_m_barlines = 46, RULE_m_rest = 47, RULE_m_slurs = 48, 
		RULE_m_ligature = 49, RULE_m_dot = 50, RULE_m_notesuffix = 51, RULE_mensural_signs = 52, 
		RULE_m_perfect = 53, RULE_m_imperfect = 54, RULE_noteName = 55, RULE_noteNameCl = 56, 
		RULE_not_hide = 57, RULE_bracket = 58, RULE_parenthe = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"incipit", "mastercleff", "keysignature", "note_signature", "notesuffix", 
			"pitch", "stem_direction", "kern_notation", "timesignature", "fraction", 
			"number", "metter", "common_met", "perfect_met", "musicalcontent", "measure", 
			"items", "item", "changeconfiguration", "slurs", "ties", "notesties", 
			"tiesaux", "notes", "beaming", "note", "time", "rest", "barlines", "chord", 
			"articulations", "ornaments", "partial_beaming", "edit_accident", "doubleBarline", 
			"rightRepeatBarline", "leftRepeatBarline", "doubleRepeatBarline", "endBarline", 
			"mens_notation", "m_timesignature", "m_musicalcontent", "m_measure", 
			"m_items", "m_item", "m_note", "m_barlines", "m_rest", "m_slurs", "m_ligature", 
			"m_dot", "m_notesuffix", "mensural_signs", "m_perfect", "m_imperfect", 
			"noteName", "noteNameCl", "not_hide", "bracket", "parenthe"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'L'", "'M'", null, null, "'3'", "'2'", null, "'#'", "'-'", 
			"'##'", "'--'", "'n'", null, "' '", "'>'", "'<'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'K'", "'k'", "'m'", "'T'", "'t'", "'W'", "'w'", 
			"'U'", "'p'", "'i'", "'v'", "'r'", "'R'", "'I'", "'P'", "'A'", "'B'", 
			"'C'", "'D'", "'E'", "'F'", "'G'", "'X'", "'a'", "'b'", "'c'", "'d'", 
			"'e'", "'f'", "'g'", "'J'", "'clef'", "'skern'", "'smens'", "'met'", 
			"'.'", "'|'", "'='", "'/'", "'\\'", "'*'", "'^'", "'''", "';'", "':'", 
			"'~'", "'`'", "'!'", "','", "'&'", "'*-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LETTER_L", "LETTER_M", "PERTFECT", "DIGIT", "THREE", "TWO", 
			"M_RHYTHM", "SHARP", "FLAT", "DOUBLESHARP", "DOUBLEFLAT", "NATURAL", 
			"CLEF", "SPACE", "GREATER", "LESS", "LEFTPAR", "RIGHTPAR", "LEFTBRACKET", 
			"RIGHTBRACKET", "LEFTCURBRACES", "RIGHTCURBRACES", "LETTER_K", "LETTER_k", 
			"LETTER_m", "LETTER_T", "LETTER_t", "LETTER_W", "LETTER_w", "LETTER_U", 
			"LETTER_p", "LETTER_i", "LETTER_v", "LETTER_r", "LETTER_R", "LETTER_I", 
			"LETTER_P", "LETTER_A", "LETTER_B", "LETTER_C", "LETTER_D", "LETTER_E", 
			"LETTER_F", "LETTER_G", "LETTER_X", "LETTER_a", "LETTER_b", "LETTER_c", 
			"LETTER_d", "LETTER_e", "LETTER_f", "LETTER_g", "LETTER_J", "WORD_CLEF", 
			"WORD_SKERN", "WORD_SMENS", "WORD_MET", "DOT", "BARLINE", "EQUAL", "SLASH", 
			"BACKSLASH", "ASTERISK", "CIRCUNFLEX", "APOSTROPHE", "SEMICOLON", "COLON", 
			"COLOURED", "GRAVE_ACCENT", "EXCLAMATION", "COMA", "SLURS_COUNT", "TOKEN_FINISH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "kernmensParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kernmensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class IncipitContext extends ParserRuleContext {
		public List<Kern_notationContext> kern_notation() {
			return getRuleContexts(Kern_notationContext.class);
		}
		public Kern_notationContext kern_notation(int i) {
			return getRuleContext(Kern_notationContext.class,i);
		}
		public List<Mens_notationContext> mens_notation() {
			return getRuleContexts(Mens_notationContext.class);
		}
		public Mens_notationContext mens_notation(int i) {
			return getRuleContext(Mens_notationContext.class,i);
		}
		public IncipitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incipit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterIncipit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitIncipit(this);
		}
	}

	public final IncipitContext incipit() throws RecognitionException {
		IncipitContext _localctx = new IncipitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_incipit);
		int _la;
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					kern_notation();
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					mens_notation();
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ASTERISK );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MastercleffContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_CLEF() { return getToken(kernmensParser.WORD_CLEF, 0); }
		public TerminalNode CLEF() { return getToken(kernmensParser.CLEF, 0); }
		public MastercleffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mastercleff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMastercleff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMastercleff(this);
		}
	}

	public final MastercleffContext mastercleff() throws RecognitionException {
		MastercleffContext _localctx = new MastercleffContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mastercleff);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(ASTERISK);
			setState(133);
			match(WORD_CLEF);
			setState(134);
			match(CLEF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeysignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode LETTER_k() { return getToken(kernmensParser.LETTER_k, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public List<Note_signatureContext> note_signature() {
			return getRuleContexts(Note_signatureContext.class);
		}
		public Note_signatureContext note_signature(int i) {
			return getRuleContext(Note_signatureContext.class,i);
		}
		public KeysignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keysignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterKeysignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitKeysignature(this);
		}
	}

	public final KeysignatureContext keysignature() throws RecognitionException {
		KeysignatureContext _localctx = new KeysignatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_keysignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ASTERISK);
			setState(137);
			match(LETTER_k);
			setState(138);
			match(LEFTBRACKET);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0)) {
				{
				{
				setState(139);
				note_signature();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			match(RIGHTBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_signatureContext extends ParserRuleContext {
		public NoteNameContext noteName() {
			return getRuleContext(NoteNameContext.class,0);
		}
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public TerminalNode SHARP() { return getToken(kernmensParser.SHARP, 0); }
		public Note_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNote_signature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNote_signature(this);
		}
	}

	public final Note_signatureContext note_signature() throws RecognitionException {
		Note_signatureContext _localctx = new Note_signatureContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note_signature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			noteName();
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==SHARP || _la==FLAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotesuffixContext extends ParserRuleContext {
		public TerminalNode SHARP() { return getToken(kernmensParser.SHARP, 0); }
		public TerminalNode DOUBLESHARP() { return getToken(kernmensParser.DOUBLESHARP, 0); }
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public TerminalNode DOUBLEFLAT() { return getToken(kernmensParser.DOUBLEFLAT, 0); }
		public TerminalNode NATURAL() { return getToken(kernmensParser.NATURAL, 0); }
		public NotesuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notesuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotesuffix(this);
		}
	}

	public final NotesuffixContext notesuffix() throws RecognitionException {
		NotesuffixContext _localctx = new NotesuffixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PitchContext extends ParserRuleContext {
		public List<NoteNameContext> noteName() {
			return getRuleContexts(NoteNameContext.class);
		}
		public NoteNameContext noteName(int i) {
			return getRuleContext(NoteNameContext.class,i);
		}
		public List<NoteNameClContext> noteNameCl() {
			return getRuleContexts(NoteNameClContext.class);
		}
		public NoteNameClContext noteNameCl(int i) {
			return getRuleContext(NoteNameClContext.class,i);
		}
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pitch);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_a:
			case LETTER_b:
			case LETTER_c:
			case LETTER_d:
			case LETTER_e:
			case LETTER_f:
			case LETTER_g:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(152);
					noteName();
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0) );
				}
				break;
			case LETTER_A:
			case LETTER_B:
			case LETTER_C:
			case LETTER_D:
			case LETTER_E:
			case LETTER_F:
			case LETTER_G:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					noteNameCl();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_A) | (1L << LETTER_B) | (1L << LETTER_C) | (1L << LETTER_D) | (1L << LETTER_E) | (1L << LETTER_F) | (1L << LETTER_G))) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stem_directionContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public TerminalNode BACKSLASH() { return getToken(kernmensParser.BACKSLASH, 0); }
		public Stem_directionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stem_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterStem_direction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitStem_direction(this);
		}
	}

	public final Stem_directionContext stem_direction() throws RecognitionException {
		Stem_directionContext _localctx = new Stem_directionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stem_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==SLASH || _la==BACKSLASH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kern_notationContext extends ParserRuleContext {
		public List<TerminalNode> ASTERISK() { return getTokens(kernmensParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(kernmensParser.ASTERISK, i);
		}
		public TerminalNode WORD_SKERN() { return getToken(kernmensParser.WORD_SKERN, 0); }
		public MastercleffContext mastercleff() {
			return getRuleContext(MastercleffContext.class,0);
		}
		public MusicalcontentContext musicalcontent() {
			return getRuleContext(MusicalcontentContext.class,0);
		}
		public TerminalNode TOKEN_FINISH() { return getToken(kernmensParser.TOKEN_FINISH, 0); }
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public TimesignatureContext timesignature() {
			return getRuleContext(TimesignatureContext.class,0);
		}
		public Kern_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kern_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterKern_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitKern_notation(this);
		}
	}

	public final Kern_notationContext kern_notation() throws RecognitionException {
		Kern_notationContext _localctx = new Kern_notationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_kern_notation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ASTERISK);
			setState(167);
			match(ASTERISK);
			setState(168);
			match(WORD_SKERN);
			setState(169);
			mastercleff();
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(170);
				keysignature();
				}
				break;
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(173);
				timesignature();
				}
				break;
			}
			setState(176);
			musicalcontent();
			setState(177);
			match(TOKEN_FINISH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimesignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode LETTER_M() { return getToken(kernmensParser.LETTER_M, 0); }
		public FractionContext fraction() {
			return getRuleContext(FractionContext.class,0);
		}
		public MetterContext metter() {
			return getRuleContext(MetterContext.class,0);
		}
		public TimesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timesignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTimesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTimesignature(this);
		}
	}

	public final TimesignatureContext timesignature() throws RecognitionException {
		TimesignatureContext _localctx = new TimesignatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(ASTERISK);
			setState(180);
			match(LETTER_M);
			setState(181);
			fraction();
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(182);
				metter();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public FractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitFraction(this);
		}
	}

	public final FractionContext fraction() throws RecognitionException {
		FractionContext _localctx = new FractionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			number();
			setState(186);
			match(SLASH);
			setState(187);
			number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetterContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_MET() { return getToken(kernmensParser.WORD_MET, 0); }
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public Common_metContext common_met() {
			return getRuleContext(Common_metContext.class,0);
		}
		public Perfect_metContext perfect_met() {
			return getRuleContext(Perfect_metContext.class,0);
		}
		public MetterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMetter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMetter(this);
		}
	}

	public final MetterContext metter() throws RecognitionException {
		MetterContext _localctx = new MetterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ASTERISK);
			setState(195);
			match(WORD_MET);
			setState(196);
			match(LEFTPAR);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_C:
			case LETTER_c:
				{
				setState(197);
				common_met();
				}
				break;
			case PERTFECT:
				{
				setState(198);
				perfect_met();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(201);
			match(RIGHTPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_metContext extends ParserRuleContext {
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_R() { return getToken(kernmensParser.LETTER_R, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public Common_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterCommon_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitCommon_met(this);
		}
	}

	public final Common_metContext common_met() throws RecognitionException {
		Common_metContext _localctx = new Common_metContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_common_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==LETTER_C || _la==LETTER_c) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BARLINE:
				{
				setState(204);
				match(BARLINE);
				}
				break;
			case DOT:
				{
				setState(205);
				match(DOT);
				}
				break;
			case LETTER_r:
			case LETTER_R:
				{
				setState(206);
				_la = _input.LA(1);
				if ( !(_la==LETTER_r || _la==LETTER_R) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RIGHTPAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Perfect_metContext extends ParserRuleContext {
		public TerminalNode PERTFECT() { return getToken(kernmensParser.PERTFECT, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public Perfect_metContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perfect_met; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPerfect_met(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPerfect_met(this);
		}
	}

	public final Perfect_metContext perfect_met() throws RecognitionException {
		Perfect_metContext _localctx = new Perfect_metContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_perfect_met);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(PERTFECT);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT || _la==BARLINE) {
				{
				setState(210);
				_la = _input.LA(1);
				if ( !(_la==DOT || _la==BARLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MusicalcontentContext extends ParserRuleContext {
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public List<MeasureContext> measure() {
			return getRuleContexts(MeasureContext.class);
		}
		public MeasureContext measure(int i) {
			return getRuleContext(MeasureContext.class,i);
		}
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public MusicalcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_musicalcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMusicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMusicalcontent(this);
		}
	}

	public final MusicalcontentContext musicalcontent() throws RecognitionException {
		MusicalcontentContext _localctx = new MusicalcontentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_musicalcontent);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (BARLINE - 60)) | (1L << (EQUAL - 60)) | (1L << (COLON - 60)) | (1L << (EXCLAMATION - 60)))) != 0)) {
					{
					setState(213);
					barlines();
					}
				}

				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					measure();
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U))) != 0) || _la==ASTERISK || _la==SLURS_COUNT );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				items();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeasureContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_measure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			items();
			setState(225);
			barlines();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitItems(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227);
				item();
				}
				}
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << LEFTBRACKET) | (1L << LETTER_U))) != 0) || _la==ASTERISK || _la==SLURS_COUNT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
		public ChangeconfigurationContext changeconfiguration() {
			return getRuleContext(ChangeconfigurationContext.class,0);
		}
		public SlursContext slurs() {
			return getRuleContext(SlursContext.class,0);
		}
		public TiesContext ties() {
			return getRuleContext(TiesContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_item);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				notes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				changeconfiguration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				slurs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				ties();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChangeconfigurationContext extends ParserRuleContext {
		public List<MastercleffContext> mastercleff() {
			return getRuleContexts(MastercleffContext.class);
		}
		public MastercleffContext mastercleff(int i) {
			return getRuleContext(MastercleffContext.class,i);
		}
		public List<TimesignatureContext> timesignature() {
			return getRuleContexts(TimesignatureContext.class);
		}
		public TimesignatureContext timesignature(int i) {
			return getRuleContext(TimesignatureContext.class,i);
		}
		public List<KeysignatureContext> keysignature() {
			return getRuleContexts(KeysignatureContext.class);
		}
		public KeysignatureContext keysignature(int i) {
			return getRuleContext(KeysignatureContext.class,i);
		}
		public ChangeconfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeconfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterChangeconfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitChangeconfiguration(this);
		}
	}

	public final ChangeconfigurationContext changeconfiguration() throws RecognitionException {
		ChangeconfigurationContext _localctx = new ChangeconfigurationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_changeconfiguration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						setState(239);
						mastercleff();
						}
						break;
					case 2:
						{
						setState(240);
						timesignature();
						}
						break;
					case 3:
						{
						setState(241);
						keysignature();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlursContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public List<TerminalNode> SLURS_COUNT() { return getTokens(kernmensParser.SLURS_COUNT); }
		public TerminalNode SLURS_COUNT(int i) {
			return getToken(kernmensParser.SLURS_COUNT, i);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public SlursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterSlurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitSlurs(this);
		}
	}

	public final SlursContext slurs() throws RecognitionException {
		SlursContext _localctx = new SlursContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_slurs);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LETTER_U) {
					{
					setState(246);
					match(LETTER_U);
					}
				}

				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(249);
					match(SLURS_COUNT);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(LEFTPAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SLURS_COUNT) {
					{
					{
					setState(256);
					match(SLURS_COUNT);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
				match(RIGHTPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TiesContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public NotestiesContext notesties() {
			return getRuleContext(NotestiesContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public TiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTies(this);
		}
	}

	public final TiesContext ties() throws RecognitionException {
		TiesContext _localctx = new TiesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(265);
				match(LETTER_U);
				}
			}

			setState(268);
			match(LEFTBRACKET);
			setState(269);
			notes();
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(270);
				barlines();
				}
				break;
			}
			setState(273);
			notesties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotestiesContext extends ParserRuleContext {
		public TiesauxContext tiesaux() {
			return getRuleContext(TiesauxContext.class,0);
		}
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public NotestiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notesties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotesties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotesties(this);
		}
	}

	public final NotestiesContext notesties() throws RecognitionException {
		NotestiesContext _localctx = new NotestiesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_notesties);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFTBRACKET:
			case LETTER_U:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				tiesaux();
				}
				break;
			case DIGIT:
			case BARLINE:
			case EQUAL:
			case COLON:
			case EXCLAMATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (BARLINE - 60)) | (1L << (EQUAL - 60)) | (1L << (COLON - 60)) | (1L << (EXCLAMATION - 60)))) != 0)) {
					{
					setState(276);
					barlines();
					}
				}

				setState(279);
				notes();
				setState(280);
				match(RIGHTBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TiesauxContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(kernmensParser.LEFTBRACKET, 0); }
		public NotesContext notes() {
			return getRuleContext(NotesContext.class,0);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(kernmensParser.RIGHTBRACKET, 0); }
		public NotestiesContext notesties() {
			return getRuleContext(NotestiesContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public BarlinesContext barlines() {
			return getRuleContext(BarlinesContext.class,0);
		}
		public TiesauxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiesaux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTiesaux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTiesaux(this);
		}
	}

	public final TiesauxContext tiesaux() throws RecognitionException {
		TiesauxContext _localctx = new TiesauxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tiesaux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(284);
				match(LETTER_U);
				}
			}

			setState(287);
			match(LEFTBRACKET);
			setState(288);
			notes();
			setState(289);
			match(RIGHTBRACKET);
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(290);
				barlines();
				}
				break;
			}
			setState(293);
			notesties();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotesContext extends ParserRuleContext {
		public BeamingContext beaming() {
			return getRuleContext(BeamingContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public NotesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNotes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNotes(this);
		}
	}

	public final NotesContext notes() throws RecognitionException {
		NotesContext _localctx = new NotesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_notes);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				beaming();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				note();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				chord();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BeamingContext extends ParserRuleContext {
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public ChordContext chord() {
			return getRuleContext(ChordContext.class,0);
		}
		public List<TerminalNode> LETTER_L() { return getTokens(kernmensParser.LETTER_L); }
		public TerminalNode LETTER_L(int i) {
			return getToken(kernmensParser.LETTER_L, i);
		}
		public List<TerminalNode> LETTER_J() { return getTokens(kernmensParser.LETTER_J); }
		public TerminalNode LETTER_J(int i) {
			return getToken(kernmensParser.LETTER_J, i);
		}
		public Partial_beamingContext partial_beaming() {
			return getRuleContext(Partial_beamingContext.class,0);
		}
		public BeamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBeaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBeaming(this);
		}
	}

	public final BeamingContext beaming() throws RecognitionException {
		BeamingContext _localctx = new BeamingContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_beaming);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(300);
					note();
					}
					break;
				case 2:
					{
					setState(301);
					chord();
					}
					break;
				}
				setState(305); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(304);
					match(LETTER_L);
					}
					}
					setState(307); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_L );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(309);
					note();
					}
					break;
				case 2:
					{
					setState(310);
					chord();
					}
					break;
				}
				setState(314); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(313);
					match(LETTER_J);
					}
					}
					setState(316); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LETTER_J );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(318);
					note();
					}
					break;
				case 2:
					{
					setState(319);
					chord();
					}
					break;
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER_L) {
					{
					{
					setState(322);
					match(LETTER_L);
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(328);
				partial_beaming();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(330);
					note();
					}
					break;
				case 2:
					{
					setState(331);
					chord();
					}
					break;
				}
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LETTER_J) {
					{
					{
					setState(334);
					match(LETTER_J);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
				partial_beaming();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(kernmensParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(kernmensParser.DOT, i);
		}
		public NotesuffixContext notesuffix() {
			return getRuleContext(NotesuffixContext.class,0);
		}
		public Edit_accidentContext edit_accident() {
			return getRuleContext(Edit_accidentContext.class,0);
		}
		public Not_hideContext not_hide() {
			return getRuleContext(Not_hideContext.class,0);
		}
		public OrnamentsContext ornaments() {
			return getRuleContext(OrnamentsContext.class,0);
		}
		public ArticulationsContext articulations() {
			return getRuleContext(ArticulationsContext.class,0);
		}
		public Stem_directionContext stem_direction() {
			return getRuleContext(Stem_directionContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			time();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(345);
				match(DOT);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			pitch();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL))) != 0)) {
				{
				setState(352);
				notesuffix();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_I || _la==LETTER_P) {
				{
				setState(355);
				edit_accident();
				}
			}

			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_X) {
				{
				setState(358);
				not_hide();
				}
			}

			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) {
				{
				setState(361);
				ornaments();
				}
			}

			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (CIRCUNFLEX - 65)) | (1L << (APOSTROPHE - 65)) | (1L << (SEMICOLON - 65)) | (1L << (COLOURED - 65)) | (1L << (GRAVE_ACCENT - 65)))) != 0)) {
				{
				setState(364);
				articulations();
				}
			}

			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(367);
				stem_direction();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitTime(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_time);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(370);
				match(DIGIT);
				}
				}
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestContext extends ParserRuleContext {
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public List<TerminalNode> DOT() { return getTokens(kernmensParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(kernmensParser.DOT, i);
		}
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			time();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(376);
				match(DOT);
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(LETTER_r);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BarlinesContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(kernmensParser.EQUAL, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(kernmensParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(kernmensParser.DIGIT, i);
		}
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public DoubleBarlineContext doubleBarline() {
			return getRuleContext(DoubleBarlineContext.class,0);
		}
		public LeftRepeatBarlineContext leftRepeatBarline() {
			return getRuleContext(LeftRepeatBarlineContext.class,0);
		}
		public RightRepeatBarlineContext rightRepeatBarline() {
			return getRuleContext(RightRepeatBarlineContext.class,0);
		}
		public EndBarlineContext endBarline() {
			return getRuleContext(EndBarlineContext.class,0);
		}
		public DoubleRepeatBarlineContext doubleRepeatBarline() {
			return getRuleContext(DoubleRepeatBarlineContext.class,0);
		}
		public BarlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_barlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBarlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBarlines(this);
		}
	}

	public final BarlinesContext barlines() throws RecognitionException {
		BarlinesContext _localctx = new BarlinesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_barlines);
		int _la;
		try {
			int _alt;
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(EQUAL);
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(385);
						match(DIGIT);
						}
						} 
					}
					setState(390);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FLAT) {
					{
					setState(391);
					match(FLAT);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(394);
					match(EQUAL);
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DIGIT) {
						{
						{
						setState(395);
						match(DIGIT);
						}
						}
						setState(400);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(403);
				doubleBarline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(404);
					match(EQUAL);
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DIGIT) {
						{
						{
						setState(405);
						match(DIGIT);
						}
						}
						setState(410);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(413);
				leftRepeatBarline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(414);
					match(EQUAL);
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DIGIT) {
						{
						{
						setState(415);
						match(DIGIT);
						}
						}
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(423);
				rightRepeatBarline();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(424);
				endBarline();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(425);
					match(EQUAL);
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==DIGIT) {
						{
						{
						setState(426);
						match(DIGIT);
						}
						}
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(434);
				doubleRepeatBarline();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ChordContext extends ParserRuleContext {
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(kernmensParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(kernmensParser.COMA, i);
		}
		public ChordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterChord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitChord(this);
		}
	}

	public final ChordContext chord() throws RecognitionException {
		ChordContext _localctx = new ChordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			note();
			setState(440); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438);
				match(COMA);
				setState(439);
				note();
				}
				}
				setState(442); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArticulationsContext extends ParserRuleContext {
		public TerminalNode APOSTROPHE() { return getToken(kernmensParser.APOSTROPHE, 0); }
		public List<TerminalNode> CIRCUNFLEX() { return getTokens(kernmensParser.CIRCUNFLEX); }
		public TerminalNode CIRCUNFLEX(int i) {
			return getToken(kernmensParser.CIRCUNFLEX, i);
		}
		public TerminalNode GRAVE_ACCENT() { return getToken(kernmensParser.GRAVE_ACCENT, 0); }
		public TerminalNode COLOURED() { return getToken(kernmensParser.COLOURED, 0); }
		public TerminalNode SEMICOLON() { return getToken(kernmensParser.SEMICOLON, 0); }
		public ArticulationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_articulations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterArticulations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitArticulations(this);
		}
	}

	public final ArticulationsContext articulations() throws RecognitionException {
		ArticulationsContext _localctx = new ArticulationsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_articulations);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(APOSTROPHE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(CIRCUNFLEX);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(GRAVE_ACCENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				match(COLOURED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(APOSTROPHE);
				setState(449);
				match(COLOURED);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(APOSTROPHE);
				setState(451);
				match(CIRCUNFLEX);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				match(CIRCUNFLEX);
				setState(453);
				match(CIRCUNFLEX);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(454);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrnamentsContext extends ParserRuleContext {
		public TerminalNode LETTER_t() { return getToken(kernmensParser.LETTER_t, 0); }
		public TerminalNode LETTER_T() { return getToken(kernmensParser.LETTER_T, 0); }
		public TerminalNode LETTER_m() { return getToken(kernmensParser.LETTER_m, 0); }
		public TerminalNode LETTER_M() { return getToken(kernmensParser.LETTER_M, 0); }
		public TerminalNode LETTER_W() { return getToken(kernmensParser.LETTER_W, 0); }
		public TerminalNode LETTER_w() { return getToken(kernmensParser.LETTER_w, 0); }
		public OrnamentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ornaments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterOrnaments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitOrnaments(this);
		}
	}

	public final OrnamentsContext ornaments() throws RecognitionException {
		OrnamentsContext _localctx = new OrnamentsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ornaments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_M) | (1L << LETTER_m) | (1L << LETTER_T) | (1L << LETTER_t) | (1L << LETTER_W) | (1L << LETTER_w))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partial_beamingContext extends ParserRuleContext {
		public TerminalNode LETTER_K() { return getToken(kernmensParser.LETTER_K, 0); }
		public TerminalNode LETTER_k() { return getToken(kernmensParser.LETTER_k, 0); }
		public Partial_beamingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partial_beaming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterPartial_beaming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitPartial_beaming(this);
		}
	}

	public final Partial_beamingContext partial_beaming() throws RecognitionException {
		Partial_beamingContext _localctx = new Partial_beamingContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partial_beaming);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==LETTER_K || _la==LETTER_k) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Edit_accidentContext extends ParserRuleContext {
		public BracketContext bracket() {
			return getRuleContext(BracketContext.class,0);
		}
		public ParentheContext parenthe() {
			return getRuleContext(ParentheContext.class,0);
		}
		public Edit_accidentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edit_accident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterEdit_accident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitEdit_accident(this);
		}
	}

	public final Edit_accidentContext edit_accident() throws RecognitionException {
		Edit_accidentContext _localctx = new Edit_accidentContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_edit_accident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_I:
				{
				setState(461);
				bracket();
				}
				break;
			case LETTER_P:
				{
				setState(462);
				parenthe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleBarlineContext extends ParserRuleContext {
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public DoubleBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterDoubleBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitDoubleBarline(this);
		}
	}

	public final DoubleBarlineContext doubleBarline() throws RecognitionException {
		DoubleBarlineContext _localctx = new DoubleBarlineContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_doubleBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(BARLINE);
			setState(466);
			match(BARLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightRepeatBarlineContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public RightRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterRightRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitRightRepeatBarline(this);
		}
	}

	public final RightRepeatBarlineContext rightRepeatBarline() throws RecognitionException {
		RightRepeatBarlineContext _localctx = new RightRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rightRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(COLON);
			setState(469);
			match(BARLINE);
			setState(470);
			match(EXCLAMATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftRepeatBarlineContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public LeftRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterLeftRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitLeftRepeatBarline(this);
		}
	}

	public final LeftRepeatBarlineContext leftRepeatBarline() throws RecognitionException {
		LeftRepeatBarlineContext _localctx = new LeftRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_leftRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(EXCLAMATION);
			setState(473);
			match(BARLINE);
			setState(474);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleRepeatBarlineContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(kernmensParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(kernmensParser.COLON, i);
		}
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public TerminalNode EXCLAMATION() { return getToken(kernmensParser.EXCLAMATION, 0); }
		public DoubleRepeatBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleRepeatBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterDoubleRepeatBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitDoubleRepeatBarline(this);
		}
	}

	public final DoubleRepeatBarlineContext doubleRepeatBarline() throws RecognitionException {
		DoubleRepeatBarlineContext _localctx = new DoubleRepeatBarlineContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_doubleRepeatBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(COLON);
			setState(477);
			match(BARLINE);
			setState(478);
			match(EXCLAMATION);
			setState(479);
			match(BARLINE);
			setState(480);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndBarlineContext extends ParserRuleContext {
		public List<TerminalNode> EQUAL() { return getTokens(kernmensParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(kernmensParser.EQUAL, i);
		}
		public EndBarlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endBarline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterEndBarline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitEndBarline(this);
		}
	}

	public final EndBarlineContext endBarline() throws RecognitionException {
		EndBarlineContext _localctx = new EndBarlineContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_endBarline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(EQUAL);
			setState(483);
			match(EQUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mens_notationContext extends ParserRuleContext {
		public List<TerminalNode> ASTERISK() { return getTokens(kernmensParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(kernmensParser.ASTERISK, i);
		}
		public TerminalNode WORD_SMENS() { return getToken(kernmensParser.WORD_SMENS, 0); }
		public MastercleffContext mastercleff() {
			return getRuleContext(MastercleffContext.class,0);
		}
		public M_musicalcontentContext m_musicalcontent() {
			return getRuleContext(M_musicalcontentContext.class,0);
		}
		public TerminalNode TOKEN_FINISH() { return getToken(kernmensParser.TOKEN_FINISH, 0); }
		public M_timesignatureContext m_timesignature() {
			return getRuleContext(M_timesignatureContext.class,0);
		}
		public KeysignatureContext keysignature() {
			return getRuleContext(KeysignatureContext.class,0);
		}
		public Mens_notationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mens_notation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMens_notation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMens_notation(this);
		}
	}

	public final Mens_notationContext mens_notation() throws RecognitionException {
		Mens_notationContext _localctx = new Mens_notationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_mens_notation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(ASTERISK);
			setState(486);
			match(ASTERISK);
			setState(487);
			match(WORD_SMENS);
			setState(488);
			mastercleff();
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(489);
				m_timesignature();
				}
				break;
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASTERISK) {
				{
				setState(492);
				keysignature();
				}
			}

			setState(495);
			m_musicalcontent();
			setState(496);
			match(TOKEN_FINISH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_timesignatureContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(kernmensParser.ASTERISK, 0); }
		public TerminalNode WORD_MET() { return getToken(kernmensParser.WORD_MET, 0); }
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public Mensural_signsContext mensural_signs() {
			return getRuleContext(Mensural_signsContext.class,0);
		}
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public M_timesignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_timesignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_timesignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_timesignature(this);
		}
	}

	public final M_timesignatureContext m_timesignature() throws RecognitionException {
		M_timesignatureContext _localctx = new M_timesignatureContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_m_timesignature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(ASTERISK);
			setState(499);
			match(WORD_MET);
			setState(500);
			match(LEFTPAR);
			setState(501);
			mensural_signs();
			setState(502);
			match(RIGHTPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_musicalcontentContext extends ParserRuleContext {
		public List<M_measureContext> m_measure() {
			return getRuleContexts(M_measureContext.class);
		}
		public M_measureContext m_measure(int i) {
			return getRuleContext(M_measureContext.class,i);
		}
		public M_itemsContext m_items() {
			return getRuleContext(M_itemsContext.class,0);
		}
		public M_musicalcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_musicalcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_musicalcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_musicalcontent(this);
		}
	}

	public final M_musicalcontentContext m_musicalcontent() throws RecognitionException {
		M_musicalcontentContext _localctx = new M_musicalcontentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_m_musicalcontent);
		int _la;
		try {
			setState(510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(505); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(504);
					m_measure();
					}
					}
					setState(507); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_RHYTHM) | (1L << GREATER) | (1L << LESS) | (1L << LEFTPAR) | (1L << RIGHTPAR) | (1L << EQUAL))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				m_items();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_measureContext extends ParserRuleContext {
		public M_itemsContext m_items() {
			return getRuleContext(M_itemsContext.class,0);
		}
		public M_barlinesContext m_barlines() {
			return getRuleContext(M_barlinesContext.class,0);
		}
		public M_measureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_measure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_measure(this);
		}
	}

	public final M_measureContext m_measure() throws RecognitionException {
		M_measureContext _localctx = new M_measureContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_m_measure);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case M_RHYTHM:
			case GREATER:
			case LESS:
			case LEFTPAR:
			case RIGHTPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				m_items();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				m_barlines();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_itemsContext extends ParserRuleContext {
		public List<M_itemContext> m_item() {
			return getRuleContexts(M_itemContext.class);
		}
		public M_itemContext m_item(int i) {
			return getRuleContext(M_itemContext.class,i);
		}
		public M_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_items(this);
		}
	}

	public final M_itemsContext m_items() throws RecognitionException {
		M_itemsContext _localctx = new M_itemsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_m_items);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(516);
					m_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_itemContext extends ParserRuleContext {
		public M_noteContext m_note() {
			return getRuleContext(M_noteContext.class,0);
		}
		public M_restContext m_rest() {
			return getRuleContext(M_restContext.class,0);
		}
		public M_slursContext m_slurs() {
			return getRuleContext(M_slursContext.class,0);
		}
		public M_ligatureContext m_ligature() {
			return getRuleContext(M_ligatureContext.class,0);
		}
		public M_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_item(this);
		}
	}

	public final M_itemContext m_item() throws RecognitionException {
		M_itemContext _localctx = new M_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_m_item);
		try {
			setState(525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				m_note();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(522);
				m_rest();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(523);
				m_slurs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				m_ligature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_noteContext extends ParserRuleContext {
		public TerminalNode M_RHYTHM() { return getToken(kernmensParser.M_RHYTHM, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public M_dotContext m_dot() {
			return getRuleContext(M_dotContext.class,0);
		}
		public M_perfectContext m_perfect() {
			return getRuleContext(M_perfectContext.class,0);
		}
		public M_imperfectContext m_imperfect() {
			return getRuleContext(M_imperfectContext.class,0);
		}
		public TerminalNode COLOURED() { return getToken(kernmensParser.COLOURED, 0); }
		public M_notesuffixContext m_notesuffix() {
			return getRuleContext(M_notesuffixContext.class,0);
		}
		public Stem_directionContext stem_direction() {
			return getRuleContext(Stem_directionContext.class,0);
		}
		public M_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_note(this);
		}
	}

	public final M_noteContext m_note() throws RecognitionException {
		M_noteContext _localctx = new M_noteContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_m_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(M_RHYTHM);
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(528);
				m_dot();
				}
				break;
			}
			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_p:
				{
				setState(531);
				m_perfect();
				}
				break;
			case LETTER_i:
				{
				setState(532);
				m_imperfect();
				}
				break;
			case LETTER_A:
			case LETTER_B:
			case LETTER_C:
			case LETTER_D:
			case LETTER_E:
			case LETTER_F:
			case LETTER_G:
			case LETTER_a:
			case LETTER_b:
			case LETTER_c:
			case LETTER_d:
			case LETTER_e:
			case LETTER_f:
			case LETTER_g:
			case COLOURED:
				break;
			default:
				break;
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLOURED) {
				{
				setState(535);
				match(COLOURED);
				}
			}

			setState(538);
			pitch();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SHARP) | (1L << FLAT) | (1L << DOUBLESHARP) | (1L << DOUBLEFLAT) | (1L << NATURAL) | (1L << LETTER_U))) != 0)) {
				{
				setState(539);
				m_notesuffix();
				}
			}

			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH || _la==BACKSLASH) {
				{
				setState(542);
				stem_direction();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_barlinesContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(kernmensParser.EQUAL, 0); }
		public TerminalNode FLAT() { return getToken(kernmensParser.FLAT, 0); }
		public List<TerminalNode> BARLINE() { return getTokens(kernmensParser.BARLINE); }
		public TerminalNode BARLINE(int i) {
			return getToken(kernmensParser.BARLINE, i);
		}
		public M_barlinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_barlines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_barlines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_barlines(this);
		}
	}

	public final M_barlinesContext m_barlines() throws RecognitionException {
		M_barlinesContext _localctx = new M_barlinesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_m_barlines);
		try {
			setState(550);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(EQUAL);
				setState(546);
				match(FLAT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(EQUAL);
				setState(548);
				match(BARLINE);
				setState(549);
				match(BARLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_restContext extends ParserRuleContext {
		public TerminalNode M_RHYTHM() { return getToken(kernmensParser.M_RHYTHM, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public M_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_rest(this);
		}
	}

	public final M_restContext m_rest() throws RecognitionException {
		M_restContext _localctx = new M_restContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_m_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(M_RHYTHM);
			setState(553);
			match(LETTER_r);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_slursContext extends ParserRuleContext {
		public TerminalNode LEFTPAR() { return getToken(kernmensParser.LEFTPAR, 0); }
		public TerminalNode RIGHTPAR() { return getToken(kernmensParser.RIGHTPAR, 0); }
		public M_slursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_slurs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_slurs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_slurs(this);
		}
	}

	public final M_slursContext m_slurs() throws RecognitionException {
		M_slursContext _localctx = new M_slursContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_m_slurs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_la = _input.LA(1);
			if ( !(_la==LEFTPAR || _la==RIGHTPAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_ligatureContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(kernmensParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(kernmensParser.GREATER, 0); }
		public M_ligatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_ligature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_ligature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_ligature(this);
		}
	}

	public final M_ligatureContext m_ligature() throws RecognitionException {
		M_ligatureContext _localctx = new M_ligatureContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_m_ligature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_la = _input.LA(1);
			if ( !(_la==GREATER || _la==LESS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_dotContext extends ParserRuleContext {
		public TerminalNode LETTER_p() { return getToken(kernmensParser.LETTER_p, 0); }
		public TerminalNode COLON() { return getToken(kernmensParser.COLON, 0); }
		public M_dotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_dot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_dot(this);
		}
	}

	public final M_dotContext m_dot() throws RecognitionException {
		M_dotContext _localctx = new M_dotContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_m_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(LETTER_p);
			setState(560);
			match(COLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_notesuffixContext extends ParserRuleContext {
		public NotesuffixContext notesuffix() {
			return getRuleContext(NotesuffixContext.class,0);
		}
		public TerminalNode LETTER_U() { return getToken(kernmensParser.LETTER_U, 0); }
		public M_notesuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_notesuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_notesuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_notesuffix(this);
		}
	}

	public final M_notesuffixContext m_notesuffix() throws RecognitionException {
		M_notesuffixContext _localctx = new M_notesuffixContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_m_notesuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER_U) {
				{
				setState(562);
				match(LETTER_U);
				}
			}

			setState(565);
			notesuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mensural_signsContext extends ParserRuleContext {
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
		public TerminalNode BARLINE() { return getToken(kernmensParser.BARLINE, 0); }
		public TerminalNode TWO() { return getToken(kernmensParser.TWO, 0); }
		public TerminalNode THREE() { return getToken(kernmensParser.THREE, 0); }
		public TerminalNode DOT() { return getToken(kernmensParser.DOT, 0); }
		public TerminalNode LETTER_r() { return getToken(kernmensParser.LETTER_r, 0); }
		public TerminalNode SLASH() { return getToken(kernmensParser.SLASH, 0); }
		public TerminalNode PERTFECT() { return getToken(kernmensParser.PERTFECT, 0); }
		public Mensural_signsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensural_signs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterMensural_signs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitMensural_signs(this);
		}
	}

	public final Mensural_signsContext mensural_signs() throws RecognitionException {
		Mensural_signsContext _localctx = new Mensural_signsContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_mensural_signs);
		int _la;
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER_c:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(567);
				match(LETTER_c);
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case BARLINE:
					{
					setState(568);
					match(BARLINE);
					setState(574);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case THREE:
						{
						setState(569);
						match(THREE);
						}
						break;
					case TWO:
						{
						setState(570);
						match(TWO);
						}
						break;
					case SLASH:
						{
						setState(571);
						match(SLASH);
						setState(572);
						_la = _input.LA(1);
						if ( !(_la==THREE || _la==TWO) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case LETTER_r:
						{
						setState(573);
						match(LETTER_r);
						}
						break;
					case RIGHTPAR:
						break;
					default:
						break;
					}
					}
					break;
				case TWO:
					{
					setState(576);
					match(TWO);
					}
					break;
				case THREE:
					{
					setState(577);
					match(THREE);
					}
					break;
				case DOT:
					{
					setState(578);
					match(DOT);
					setState(580);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==BARLINE) {
						{
						setState(579);
						match(BARLINE);
						}
					}

					}
					break;
				case LETTER_r:
					{
					setState(582);
					match(LETTER_r);
					}
					break;
				case RIGHTPAR:
					break;
				default:
					break;
				}
				}
				}
				break;
			case PERTFECT:
			case THREE:
			case TWO:
				enterOuterAlt(_localctx, 2);
				{
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(585);
					match(PERTFECT);
					setState(595);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TWO:
						{
						setState(586);
						match(TWO);
						}
						break;
					case THREE:
						{
						setState(587);
						match(THREE);
						}
						break;
					case BARLINE:
						{
						setState(588);
						match(BARLINE);
						setState(590);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==THREE) {
							{
							setState(589);
							match(THREE);
							}
						}

						}
						break;
					case SLASH:
						{
						setState(592);
						match(SLASH);
						setState(593);
						match(THREE);
						}
						break;
					case DOT:
						{
						setState(594);
						match(DOT);
						}
						break;
					case RIGHTPAR:
						break;
					default:
						break;
					}
					}
					break;
				case 2:
					{
					setState(597);
					match(THREE);
					setState(598);
					match(SLASH);
					setState(599);
					match(TWO);
					}
					break;
				case 3:
					{
					setState(600);
					match(THREE);
					}
					break;
				case 4:
					{
					setState(601);
					match(TWO);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_perfectContext extends ParserRuleContext {
		public TerminalNode LETTER_p() { return getToken(kernmensParser.LETTER_p, 0); }
		public M_perfectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_perfect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_perfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_perfect(this);
		}
	}

	public final M_perfectContext m_perfect() throws RecognitionException {
		M_perfectContext _localctx = new M_perfectContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_m_perfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(LETTER_p);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class M_imperfectContext extends ParserRuleContext {
		public TerminalNode LETTER_i() { return getToken(kernmensParser.LETTER_i, 0); }
		public M_imperfectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_m_imperfect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterM_imperfect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitM_imperfect(this);
		}
	}

	public final M_imperfectContext m_imperfect() throws RecognitionException {
		M_imperfectContext _localctx = new M_imperfectContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_m_imperfect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(LETTER_i);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteNameContext extends ParserRuleContext {
		public TerminalNode LETTER_a() { return getToken(kernmensParser.LETTER_a, 0); }
		public TerminalNode LETTER_b() { return getToken(kernmensParser.LETTER_b, 0); }
		public TerminalNode LETTER_c() { return getToken(kernmensParser.LETTER_c, 0); }
		public TerminalNode LETTER_d() { return getToken(kernmensParser.LETTER_d, 0); }
		public TerminalNode LETTER_e() { return getToken(kernmensParser.LETTER_e, 0); }
		public TerminalNode LETTER_f() { return getToken(kernmensParser.LETTER_f, 0); }
		public TerminalNode LETTER_g() { return getToken(kernmensParser.LETTER_g, 0); }
		public NoteNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNoteName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNoteName(this);
		}
	}

	public final NoteNameContext noteName() throws RecognitionException {
		NoteNameContext _localctx = new NoteNameContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_noteName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_a) | (1L << LETTER_b) | (1L << LETTER_c) | (1L << LETTER_d) | (1L << LETTER_e) | (1L << LETTER_f) | (1L << LETTER_g))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteNameClContext extends ParserRuleContext {
		public TerminalNode LETTER_A() { return getToken(kernmensParser.LETTER_A, 0); }
		public TerminalNode LETTER_B() { return getToken(kernmensParser.LETTER_B, 0); }
		public TerminalNode LETTER_C() { return getToken(kernmensParser.LETTER_C, 0); }
		public TerminalNode LETTER_D() { return getToken(kernmensParser.LETTER_D, 0); }
		public TerminalNode LETTER_E() { return getToken(kernmensParser.LETTER_E, 0); }
		public TerminalNode LETTER_F() { return getToken(kernmensParser.LETTER_F, 0); }
		public TerminalNode LETTER_G() { return getToken(kernmensParser.LETTER_G, 0); }
		public NoteNameClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteNameCl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNoteNameCl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNoteNameCl(this);
		}
	}

	public final NoteNameClContext noteNameCl() throws RecognitionException {
		NoteNameClContext _localctx = new NoteNameClContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_noteNameCl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETTER_A) | (1L << LETTER_B) | (1L << LETTER_C) | (1L << LETTER_D) | (1L << LETTER_E) | (1L << LETTER_F) | (1L << LETTER_G))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_hideContext extends ParserRuleContext {
		public TerminalNode LETTER_X() { return getToken(kernmensParser.LETTER_X, 0); }
		public Not_hideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_hide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterNot_hide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitNot_hide(this);
		}
	}

	public final Not_hideContext not_hide() throws RecognitionException {
		Not_hideContext _localctx = new Not_hideContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_not_hide);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(LETTER_X);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BracketContext extends ParserRuleContext {
		public TerminalNode LETTER_I() { return getToken(kernmensParser.LETTER_I, 0); }
		public BracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitBracket(this);
		}
	}

	public final BracketContext bracket() throws RecognitionException {
		BracketContext _localctx = new BracketContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			match(LETTER_I);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParentheContext extends ParserRuleContext {
		public TerminalNode LETTER_P() { return getToken(kernmensParser.LETTER_P, 0); }
		public ParentheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).enterParenthe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kernmensParserListener ) ((kernmensParserListener)listener).exitParenthe(this);
		}
	}

	public final ParentheContext parenthe() throws RecognitionException {
		ParentheContext _localctx = new ParentheContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parenthe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(LETTER_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u026f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\6\2|\n\2\r\2\16\2}\3\2\6\2\u0081\n\2\r\2\16\2\u0082\5\2\u0085\n\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\u008f\n\4\f\4\16\4\u0092\13\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\7\6\7\u009c\n\7\r\7\16\7\u009d\3\7\6\7\u00a1"+
		"\n\7\r\7\16\7\u00a2\5\7\u00a5\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u00ae"+
		"\n\t\3\t\5\t\u00b1\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\3\13"+
		"\3\13\3\13\3\13\3\f\6\f\u00c1\n\f\r\f\16\f\u00c2\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00ca\n\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d2\n\16\3\17\3\17\5\17"+
		"\u00d6\n\17\3\20\5\20\u00d9\n\20\3\20\6\20\u00dc\n\20\r\20\16\20\u00dd"+
		"\3\20\5\20\u00e1\n\20\3\21\3\21\3\21\3\22\6\22\u00e7\n\22\r\22\16\22\u00e8"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00f0\n\23\3\24\3\24\3\24\6\24\u00f5\n"+
		"\24\r\24\16\24\u00f6\3\25\5\25\u00fa\n\25\3\25\7\25\u00fd\n\25\f\25\16"+
		"\25\u0100\13\25\3\25\3\25\7\25\u0104\n\25\f\25\16\25\u0107\13\25\3\25"+
		"\5\25\u010a\n\25\3\26\5\26\u010d\n\26\3\26\3\26\3\26\5\26\u0112\n\26\3"+
		"\26\3\26\3\27\3\27\5\27\u0118\n\27\3\27\3\27\3\27\5\27\u011d\n\27\3\30"+
		"\5\30\u0120\n\30\3\30\3\30\3\30\3\30\5\30\u0126\n\30\3\30\3\30\3\31\3"+
		"\31\3\31\5\31\u012d\n\31\3\32\3\32\5\32\u0131\n\32\3\32\6\32\u0134\n\32"+
		"\r\32\16\32\u0135\3\32\3\32\5\32\u013a\n\32\3\32\6\32\u013d\n\32\r\32"+
		"\16\32\u013e\3\32\3\32\5\32\u0143\n\32\3\32\7\32\u0146\n\32\f\32\16\32"+
		"\u0149\13\32\3\32\3\32\3\32\3\32\5\32\u014f\n\32\3\32\7\32\u0152\n\32"+
		"\f\32\16\32\u0155\13\32\3\32\3\32\5\32\u0159\n\32\3\33\3\33\7\33\u015d"+
		"\n\33\f\33\16\33\u0160\13\33\3\33\3\33\5\33\u0164\n\33\3\33\5\33\u0167"+
		"\n\33\3\33\5\33\u016a\n\33\3\33\5\33\u016d\n\33\3\33\5\33\u0170\n\33\3"+
		"\33\5\33\u0173\n\33\3\34\6\34\u0176\n\34\r\34\16\34\u0177\3\35\3\35\7"+
		"\35\u017c\n\35\f\35\16\35\u017f\13\35\3\35\3\35\3\36\3\36\7\36\u0185\n"+
		"\36\f\36\16\36\u0188\13\36\3\36\5\36\u018b\n\36\3\36\3\36\7\36\u018f\n"+
		"\36\f\36\16\36\u0192\13\36\5\36\u0194\n\36\3\36\3\36\3\36\7\36\u0199\n"+
		"\36\f\36\16\36\u019c\13\36\5\36\u019e\n\36\3\36\3\36\3\36\7\36\u01a3\n"+
		"\36\f\36\16\36\u01a6\13\36\5\36\u01a8\n\36\3\36\3\36\3\36\3\36\7\36\u01ae"+
		"\n\36\f\36\16\36\u01b1\13\36\5\36\u01b3\n\36\3\36\5\36\u01b6\n\36\3\37"+
		"\3\37\3\37\6\37\u01bb\n\37\r\37\16\37\u01bc\3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \5 \u01ca\n \3!\3!\3\"\3\"\3#\3#\5#\u01d2\n#\3$\3$\3$\3%\3%\3%"+
		"\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\5)\u01ed"+
		"\n)\3)\5)\u01f0\n)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\6+\u01fc\n+\r+\16+\u01fd"+
		"\3+\5+\u0201\n+\3,\3,\5,\u0205\n,\3-\6-\u0208\n-\r-\16-\u0209\3.\3.\3"+
		".\3.\5.\u0210\n.\3/\3/\5/\u0214\n/\3/\3/\5/\u0218\n/\3/\5/\u021b\n/\3"+
		"/\3/\5/\u021f\n/\3/\5/\u0222\n/\3\60\3\60\3\60\3\60\3\60\5\60\u0229\n"+
		"\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\5\65\u0236"+
		"\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0241\n\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0247\n\66\3\66\5\66\u024a\n\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0251\n\66\3\66\3\66\3\66\5\66\u0256\n\66\3\66\3\66\3\66"+
		"\3\66\3\66\5\66\u025d\n\66\5\66\u025f\n\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\17\3\2\13\f\3\2"+
		"\13\17\3\2@A\4\2++\63\63\3\2%&\3\2=>\4\2\5\5\34 \3\2\32\33\3\2\24\25\3"+
		"\2\22\23\3\2\b\t\3\2\61\67\3\2)/\2\u02aa\2\u0084\3\2\2\2\4\u0086\3\2\2"+
		"\2\6\u008a\3\2\2\2\b\u0095\3\2\2\2\n\u0098\3\2\2\2\f\u00a4\3\2\2\2\16"+
		"\u00a6\3\2\2\2\20\u00a8\3\2\2\2\22\u00b5\3\2\2\2\24\u00bb\3\2\2\2\26\u00c0"+
		"\3\2\2\2\30\u00c4\3\2\2\2\32\u00cd\3\2\2\2\34\u00d3\3\2\2\2\36\u00e0\3"+
		"\2\2\2 \u00e2\3\2\2\2\"\u00e6\3\2\2\2$\u00ef\3\2\2\2&\u00f4\3\2\2\2(\u0109"+
		"\3\2\2\2*\u010c\3\2\2\2,\u011c\3\2\2\2.\u011f\3\2\2\2\60\u012c\3\2\2\2"+
		"\62\u0158\3\2\2\2\64\u015a\3\2\2\2\66\u0175\3\2\2\28\u0179\3\2\2\2:\u01b5"+
		"\3\2\2\2<\u01b7\3\2\2\2>\u01c9\3\2\2\2@\u01cb\3\2\2\2B\u01cd\3\2\2\2D"+
		"\u01d1\3\2\2\2F\u01d3\3\2\2\2H\u01d6\3\2\2\2J\u01da\3\2\2\2L\u01de\3\2"+
		"\2\2N\u01e4\3\2\2\2P\u01e7\3\2\2\2R\u01f4\3\2\2\2T\u0200\3\2\2\2V\u0204"+
		"\3\2\2\2X\u0207\3\2\2\2Z\u020f\3\2\2\2\\\u0211\3\2\2\2^\u0228\3\2\2\2"+
		"`\u022a\3\2\2\2b\u022d\3\2\2\2d\u022f\3\2\2\2f\u0231\3\2\2\2h\u0235\3"+
		"\2\2\2j\u025e\3\2\2\2l\u0260\3\2\2\2n\u0262\3\2\2\2p\u0264\3\2\2\2r\u0266"+
		"\3\2\2\2t\u0268\3\2\2\2v\u026a\3\2\2\2x\u026c\3\2\2\2z|\5\20\t\2{z\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0085\3\2\2\2\177\u0081\5P)\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\u0085\3\2\2\2\u0084{\3\2\2\2\u0084\u0080\3\2\2\2\u0085\3\3\2"+
		"\2\2\u0086\u0087\7B\2\2\u0087\u0088\79\2\2\u0088\u0089\7\20\2\2\u0089"+
		"\5\3\2\2\2\u008a\u008b\7B\2\2\u008b\u008c\7\33\2\2\u008c\u0090\7\26\2"+
		"\2\u008d\u008f\5\b\5\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0094\7\27\2\2\u0094\7\3\2\2\2\u0095\u0096\5p9\2\u0096\u0097\t\2\2\2"+
		"\u0097\t\3\2\2\2\u0098\u0099\t\3\2\2\u0099\13\3\2\2\2\u009a\u009c\5p9"+
		"\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u00a5\3\2\2\2\u009f\u00a1\5r:\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2"+
		"\2\2\u00a4\u009b\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a5\r\3\2\2\2\u00a6\u00a7"+
		"\t\4\2\2\u00a7\17\3\2\2\2\u00a8\u00a9\7B\2\2\u00a9\u00aa\7B\2\2\u00aa"+
		"\u00ab\7:\2\2\u00ab\u00ad\5\4\3\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5\22\n\2\u00b0"+
		"\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\36"+
		"\20\2\u00b3\u00b4\7L\2\2\u00b4\21\3\2\2\2\u00b5\u00b6\7B\2\2\u00b6\u00b7"+
		"\7\5\2\2\u00b7\u00b9\5\24\13\2\u00b8\u00ba\5\30\r\2\u00b9\u00b8\3\2\2"+
		"\2\u00b9\u00ba\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd"+
		"\7@\2\2\u00bd\u00be\5\26\f\2\u00be\25\3\2\2\2\u00bf\u00c1\7\7\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\27\3\2\2\2\u00c4\u00c5\7B\2\2\u00c5\u00c6\7<\2\2\u00c6\u00c9"+
		"\7\24\2\2\u00c7\u00ca\5\32\16\2\u00c8\u00ca\5\34\17\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc"+
		"\31\3\2\2\2\u00cd\u00d1\t\5\2\2\u00ce\u00d2\7>\2\2\u00cf\u00d2\7=\2\2"+
		"\u00d0\u00d2\t\6\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d5\7\6\2\2\u00d4"+
		"\u00d6\t\7\2\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\35\3\2\2"+
		"\2\u00d7\u00d9\5:\36\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\3\2\2\2\u00da\u00dc\5 \21\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00e1\5\""+
		"\22\2\u00e0\u00d8\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\37\3\2\2\2\u00e2\u00e3"+
		"\5\"\22\2\u00e3\u00e4\5:\36\2\u00e4!\3\2\2\2\u00e5\u00e7\5$\23\2\u00e6"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9#\3\2\2\2\u00ea\u00f0\5\60\31\2\u00eb\u00f0\58\35\2\u00ec\u00f0"+
		"\5&\24\2\u00ed\u00f0\5(\25\2\u00ee\u00f0\5*\26\2\u00ef\u00ea\3\2\2\2\u00ef"+
		"\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2"+
		"\2\2\u00f0%\3\2\2\2\u00f1\u00f5\5\4\3\2\u00f2\u00f5\5\22\n\2\u00f3\u00f5"+
		"\5\6\4\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\'\3\2\2\2"+
		"\u00f8\u00fa\7!\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe"+
		"\3\2\2\2\u00fb\u00fd\7K\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u010a\7\24\2\2\u0102\u0104\7K\2\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\25\2\2\u0109\u00f9\3\2\2\2\u0109"+
		"\u0105\3\2\2\2\u010a)\3\2\2\2\u010b\u010d\7!\2\2\u010c\u010b\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\26\2\2\u010f\u0111\5"+
		"\60\31\2\u0110\u0112\5:\36\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\5,\27\2\u0114+\3\2\2\2\u0115\u011d\5.\30\2"+
		"\u0116\u0118\5:\36\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119\u011a\5\60\31\2\u011a\u011b\7\27\2\2\u011b\u011d\3\2\2"+
		"\2\u011c\u0115\3\2\2\2\u011c\u0117\3\2\2\2\u011d-\3\2\2\2\u011e\u0120"+
		"\7!\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\7\26\2\2\u0122\u0123\5\60\31\2\u0123\u0125\7\27\2\2\u0124\u0126"+
		"\5:\36\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\5,\27\2\u0128/\3\2\2\2\u0129\u012d\5\62\32\2\u012a\u012d\5\64\33"+
		"\2\u012b\u012d\5<\37\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\61\3\2\2\2\u012e\u0131\5\64\33\2\u012f\u0131\5<\37\2\u0130"+
		"\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0134\7\4"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0159\3\2\2\2\u0137\u013a\5\64\33\2\u0138\u013a\5"+
		"<\37\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013c\3\2\2\2\u013b"+
		"\u013d\78\2\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0159\3\2\2\2\u0140\u0143\5\64\33\2\u0141"+
		"\u0143\5<\37\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0147\3\2"+
		"\2\2\u0144\u0146\7\4\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u014b\5B\"\2\u014b\u0159\3\2\2\2\u014c\u014f\5\64\33\2\u014d"+
		"\u014f\5<\37\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0153\3\2"+
		"\2\2\u0150\u0152\78\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0153\3\2"+
		"\2\2\u0156\u0157\5B\"\2\u0157\u0159\3\2\2\2\u0158\u0130\3\2\2\2\u0158"+
		"\u0139\3\2\2\2\u0158\u0142\3\2\2\2\u0158\u014e\3\2\2\2\u0159\63\3\2\2"+
		"\2\u015a\u015e\5\66\34\2\u015b\u015d\7=\2\2\u015c\u015b\3\2\2\2\u015d"+
		"\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2"+
		"\2\2\u0160\u015e\3\2\2\2\u0161\u0163\5\f\7\2\u0162\u0164\5\n\6\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5D"+
		"#\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2\u0168"+
		"\u016a\5t;\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2"+
		"\2\u016b\u016d\5@!\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016f"+
		"\3\2\2\2\u016e\u0170\5> \2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u0172\3\2\2\2\u0171\u0173\5\16\b\2\u0172\u0171\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\65\3\2\2\2\u0174\u0176\7\7\2\2\u0175\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\67\3\2\2"+
		"\2\u0179\u017d\5\66\34\2\u017a\u017c\7=\2\2\u017b\u017a\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7%\2\2\u01819\3\2\2\2\u0182\u0186"+
		"\7?\2\2\u0183\u0185\7\7\2\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0189\u018b\7\f\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u01b6\3\2\2\2\u018c\u0190\7?\2\2\u018d\u018f\7\7\2\2\u018e\u018d\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u018c\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0195\3\2\2\2\u0195\u01b6\5F$\2\u0196\u019a\7?\2\2\u0197\u0199"+
		"\7\7\2\2\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u0196\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01b6\5J&\2\u01a0\u01a4"+
		"\7?\2\2\u01a1\u01a3\7\7\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01a0\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01b6\5H%\2\u01aa\u01b6\5N(\2\u01ab\u01af\7?\2\2\u01ac\u01ae\7\7\2\2"+
		"\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\5L\'\2\u01b5\u0182\3\2"+
		"\2\2\u01b5\u0193\3\2\2\2\u01b5\u019d\3\2\2\2\u01b5\u01a7\3\2\2\2\u01b5"+
		"\u01aa\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6;\3\2\2\2\u01b7\u01ba\5\64\33"+
		"\2\u01b8\u01b9\7J\2\2\u01b9\u01bb\5\64\33\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd=\3\2\2\2"+
		"\u01be\u01ca\7D\2\2\u01bf\u01ca\7C\2\2\u01c0\u01ca\7H\2\2\u01c1\u01ca"+
		"\7G\2\2\u01c2\u01c3\7D\2\2\u01c3\u01ca\7G\2\2\u01c4\u01c5\7D\2\2\u01c5"+
		"\u01ca\7C\2\2\u01c6\u01c7\7C\2\2\u01c7\u01ca\7C\2\2\u01c8\u01ca\7E\2\2"+
		"\u01c9\u01be\3\2\2\2\u01c9\u01bf\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c1"+
		"\3\2\2\2\u01c9\u01c2\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01c8\3\2\2\2\u01ca?\3\2\2\2\u01cb\u01cc\t\b\2\2\u01ccA\3\2\2\2\u01cd"+
		"\u01ce\t\t\2\2\u01ceC\3\2\2\2\u01cf\u01d2\5v<\2\u01d0\u01d2\5x=\2\u01d1"+
		"\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2E\3\2\2\2\u01d3\u01d4\7>\2\2\u01d4"+
		"\u01d5\7>\2\2\u01d5G\3\2\2\2\u01d6\u01d7\7F\2\2\u01d7\u01d8\7>\2\2\u01d8"+
		"\u01d9\7I\2\2\u01d9I\3\2\2\2\u01da\u01db\7I\2\2\u01db\u01dc\7>\2\2\u01dc"+
		"\u01dd\7F\2\2\u01ddK\3\2\2\2\u01de\u01df\7F\2\2\u01df\u01e0\7>\2\2\u01e0"+
		"\u01e1\7I\2\2\u01e1\u01e2\7>\2\2\u01e2\u01e3\7F\2\2\u01e3M\3\2\2\2\u01e4"+
		"\u01e5\7?\2\2\u01e5\u01e6\7?\2\2\u01e6O\3\2\2\2\u01e7\u01e8\7B\2\2\u01e8"+
		"\u01e9\7B\2\2\u01e9\u01ea\7;\2\2\u01ea\u01ec\5\4\3\2\u01eb\u01ed\5R*\2"+
		"\u01ec\u01eb\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0"+
		"\5\6\4\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01f2\5T+\2\u01f2\u01f3\7L\2\2\u01f3Q\3\2\2\2\u01f4\u01f5\7B\2\2\u01f5"+
		"\u01f6\7<\2\2\u01f6\u01f7\7\24\2\2\u01f7\u01f8\5j\66\2\u01f8\u01f9\7\25"+
		"\2\2\u01f9S\3\2\2\2\u01fa\u01fc\5V,\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u0201\5X-\2\u0200\u01fb\3\2\2\2\u0200\u01ff\3\2\2\2\u0201U\3\2\2\2\u0202"+
		"\u0205\5X-\2\u0203\u0205\5^\60\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2"+
		"\2\u0205W\3\2\2\2\u0206\u0208\5Z.\2\u0207\u0206\3\2\2\2\u0208\u0209\3"+
		"\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aY\3\2\2\2\u020b\u0210"+
		"\5\\/\2\u020c\u0210\5`\61\2\u020d\u0210\5b\62\2\u020e\u0210\5d\63\2\u020f"+
		"\u020b\3\2\2\2\u020f\u020c\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u020e\3\2"+
		"\2\2\u0210[\3\2\2\2\u0211\u0213\7\n\2\2\u0212\u0214\5f\64\2\u0213\u0212"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0217\3\2\2\2\u0215\u0218\5l\67\2\u0216"+
		"\u0218\5n8\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u021a\3\2\2\2\u0219\u021b\7G\2\2\u021a\u0219\3\2\2\2\u021a\u021b"+
		"\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\5\f\7\2\u021d\u021f\5h\65\2\u021e"+
		"\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u0222\5\16"+
		"\b\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2\2\u0222]\3\2\2\2\u0223\u0224"+
		"\7?\2\2\u0224\u0229\7\f\2\2\u0225\u0226\7?\2\2\u0226\u0227\7>\2\2\u0227"+
		"\u0229\7>\2\2\u0228\u0223\3\2\2\2\u0228\u0225\3\2\2\2\u0229_\3\2\2\2\u022a"+
		"\u022b\7\n\2\2\u022b\u022c\7%\2\2\u022ca\3\2\2\2\u022d\u022e\t\n\2\2\u022e"+
		"c\3\2\2\2\u022f\u0230\t\13\2\2\u0230e\3\2\2\2\u0231\u0232\7\"\2\2\u0232"+
		"\u0233\7F\2\2\u0233g\3\2\2\2\u0234\u0236\7!\2\2\u0235\u0234\3\2\2\2\u0235"+
		"\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\5\n\6\2\u0238i\3\2\2\2"+
		"\u0239\u0249\7\63\2\2\u023a\u0240\7>\2\2\u023b\u0241\7\b\2\2\u023c\u0241"+
		"\7\t\2\2\u023d\u023e\7@\2\2\u023e\u0241\t\f\2\2\u023f\u0241\7%\2\2\u0240"+
		"\u023b\3\2\2\2\u0240\u023c\3\2\2\2\u0240\u023d\3\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u024a\3\2\2\2\u0242\u024a\7\t\2\2\u0243"+
		"\u024a\7\b\2\2\u0244\u0246\7=\2\2\u0245\u0247\7>\2\2\u0246\u0245\3\2\2"+
		"\2\u0246\u0247\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u024a\7%\2\2\u0249\u023a"+
		"\3\2\2\2\u0249\u0242\3\2\2\2\u0249\u0243\3\2\2\2\u0249\u0244\3\2\2\2\u0249"+
		"\u0248\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u025f\3\2\2\2\u024b\u0255\7\6"+
		"\2\2\u024c\u0256\7\t\2\2\u024d\u0256\7\b\2\2\u024e\u0250\7>\2\2\u024f"+
		"\u0251\7\b\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0256\3\2"+
		"\2\2\u0252\u0253\7@\2\2\u0253\u0256\7\b\2\2\u0254\u0256\7=\2\2\u0255\u024c"+
		"\3\2\2\2\u0255\u024d\3\2\2\2\u0255\u024e\3\2\2\2\u0255\u0252\3\2\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u025d\3\2\2\2\u0257\u0258\7\b"+
		"\2\2\u0258\u0259\7@\2\2\u0259\u025d\7\t\2\2\u025a\u025d\7\b\2\2\u025b"+
		"\u025d\7\t\2\2\u025c\u024b\3\2\2\2\u025c\u0257\3\2\2\2\u025c\u025a\3\2"+
		"\2\2\u025c\u025b\3\2\2\2\u025d\u025f\3\2\2\2\u025e\u0239\3\2\2\2\u025e"+
		"\u025c\3\2\2\2\u025fk\3\2\2\2\u0260\u0261\7\"\2\2\u0261m\3\2\2\2\u0262"+
		"\u0263\7#\2\2\u0263o\3\2\2\2\u0264\u0265\t\r\2\2\u0265q\3\2\2\2\u0266"+
		"\u0267\t\16\2\2\u0267s\3\2\2\2\u0268\u0269\7\60\2\2\u0269u\3\2\2\2\u026a"+
		"\u026b\7\'\2\2\u026bw\3\2\2\2\u026c\u026d\7(\2\2\u026dy\3\2\2\2W}\u0082"+
		"\u0084\u0090\u009d\u00a2\u00a4\u00ad\u00b0\u00b9\u00c2\u00c9\u00d1\u00d5"+
		"\u00d8\u00dd\u00e0\u00e8\u00ef\u00f4\u00f6\u00f9\u00fe\u0105\u0109\u010c"+
		"\u0111\u0117\u011c\u011f\u0125\u012c\u0130\u0135\u0139\u013e\u0142\u0147"+
		"\u014e\u0153\u0158\u015e\u0163\u0166\u0169\u016c\u016f\u0172\u0177\u017d"+
		"\u0186\u018a\u0190\u0193\u019a\u019d\u01a4\u01a7\u01af\u01b2\u01b5\u01bc"+
		"\u01c9\u01d1\u01ec\u01ef\u01fd\u0200\u0204\u0209\u020f\u0213\u0217\u021a"+
		"\u021e\u0221\u0228\u0235\u0240\u0246\u0249\u0250\u0255\u025c\u025e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}