// Generated from C:\Users\koolajd\Documents\NetBeansProjects\MSP File Parser\src\NISTsimplifiedParser.g4 by ANTLR 4.1

         import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NISTsimplifiedParserParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, NAME=43, MW=44, COMMENT=45, NPEAKS=46, 
		SLASH=47, COMMA=48, HYPHEN=49, UNDERSCORE=50, OXIDIZEDMETHIONINE=51, TRYPTIC=52, 
		SEMI_C=53, SEMI_N=54, INSOURCE=55, INSAMPLE=56, INOTHERPEP=57, CONFIRMED=58, 
		UNCONFIRMED=59, IRREG=60, MISSGOOD=61, MISSBAD=62, OK=63, IPI=64, UNIPROT_SP=65, 
		UNIPROT_TR=66, CHICK=67, ECOLI=68, BOVINE=69, HUMAN=70, MOUSE=71, HORSE=72, 
		YEAST=73, RAT=74, Spec=75, Pep=76, Fullname=77, Mods=78, PARENT_MZ=79, 
		Inst=80, MzExact=81, MzDiff=82, Mz_av=83, PROTEIN_NAME=84, Pseq=85, Organism=86, 
		Se=87, Sample=88, NREPS=89, Missing=90, ParentMed=91, Max2medOrig=92, 
		Dotfull=93, DotCons=94, UnassignAll=95, Unassigned=96, Dotbest=97, Flags=98, 
		NUMBER_AMINO_ACIDS=99, DUScorr=100, Dottheory=101, Pfin=102, Probcorr=103, 
		Tfratio=104, Pfract=105, Oxidation=106, Carbamidomethyl=107, ICATLight=108, 
		ICATHeavy=109, ABOldICATd0=110, ABOldICATd8=111, Acetyl=112, Deamidation=113, 
		PyroCmC=114, PyroGlu=115, Pyro_glu=116, Amide=117, Phospho=118, Methyl=119, 
		Carbamyl=120, ZeroI=121, QUOTEDSTRINGLITERAL=122, PEPTIDESTRING=123, AA=124, 
		NUMBER=125, FLOATLITERAL=126, INTLITERAL=127, STRINGLITERAL=128, WS=129, 
		NEWLINE=130;
	public static final String[] tokenNames = {
		"<INVALID>", "'?*i'", "'\"e_coli\"'", "'^I'", "'['", "'*'", "'^M'", "'PrePep'", 
		"'Glu->pyro-Glu'", "'Pyro-carbamidomethyl'", "'\"c_elegans\"'", "'\"'", 
		"'Unassigned_corrected'", "')'", "'='", "'^C'", "'SameProtein'", "'|'", 
		"']'", "'^S'", "'\"rat\"'", "':'", "'('", "'^O'", "'?i'", "'\"chicken\"'", 
		"'\"Protein\"'", "'DiffProtein'", "'?'", "'^X'", "'\"human\"'", "'^'", 
		"'\"drosophila\"'", "'.'", "'\"yeast\"'", "'+'", "'?*'", "'^P'", "'Hom'", 
		"'Gln->pyro-Glu'", "'\"mouse\"'", "'i'", "'Hipks_removed'", "'Name:'", 
		"'MW:'", "'Comment:'", "'Num peaks:'", "'/'", "','", "'-'", "'_'", "'M(O)'", 
		"'Tryptic'", "'C-Semitryp'", "'N-Semitryp'", "'insource'", "'insample'", 
		"'inotherpep'", "'confirmed'", "'unconfirmed'", "'irreg'", "'miss_good'", 
		"'miss_bad'", "'ok'", "'IPI'", "'sp'", "'tr'", "'CHICK'", "'ECOLI'", "'BOVIN'", 
		"'HUMAN'", "'MOUSE'", "'HORSE'", "'YEAST'", "'RAT'", "'Spec'", "'Pep'", 
		"'Fullname'", "'Mods'", "'Parent'", "'Inst'", "'Mz_exact'", "'Mz_diff'", 
		"'Mz_av'", "'Protein'", "'Pseq'", "'Organism'", "'Se'", "'Sample'", "'Nreps'", 
		"'Missing'", "'Parent_med'", "'Max2med_orig'", "'Dotfull'", "'Dot_cons'", 
		"'Unassign_all'", "'Unassigned'", "'Dotbest'", "'Flags'", "'Naa'", "'DUScorr'", 
		"'Dottheory'", "'Pfin'", "'Probcorr'", "'Tfratio'", "'Pfract'", "'Oxidation'", 
		"'Carbamidomethyl'", "'ICAT_light'", "'ICAT_heavy'", "'AB_old_ICATd0'", 
		"'AB_old_ICATd8'", "'Acetyl'", "'Deamidation'", "'Pyro-cmC'", "'Pyro-glu'", 
		"'Pyro_glu'", "'Amide'", "'Phospho'", "'Methyl'", "'Carbamyl'", "'0i'", 
		"QUOTEDSTRINGLITERAL", "PEPTIDESTRING", "AA", "NUMBER", "FLOATLITERAL", 
		"INTLITERAL", "STRINGLITERAL", "WS", "NEWLINE"
	};
	public static final int
		RULE_mspFile = 0, RULE_peptideSpectraMatch = 1, RULE_peptideName = 2, 
		RULE_peptideSequence = 3, RULE_chargeState = 4, RULE_peptideWeight = 5, 
		RULE_molecularWeight = 6, RULE_comment = 7, RULE_keyValuePair = 8, RULE_key = 9, 
		RULE_keyValue = 10, RULE_fullNameStr = 11, RULE_leftFlankingAA = 12, RULE_rightFlankingAA = 13, 
		RULE_peptideClass = 14, RULE_terminusDescription = 15, RULE_terminusModifiers = 16, 
		RULE_missedClevageDescription = 17, RULE_modStr = 18, RULE_modIdentifier = 19, 
		RULE_modName = 20, RULE_organismName = 21, RULE_proteinID = 22, RULE_databaseDescript = 23, 
		RULE_proteinName = 24, RULE_scientificOrganismName = 25, RULE_searchSummary = 26, 
		RULE_searchEngineResults = 27, RULE_searchEngineName = 28, RULE_searchEngineTags = 29, 
		RULE_searchEngineResult = 30, RULE_sampleSpaceDescript = 31, RULE_sampleCode = 32, 
		RULE_sampleName = 33, RULE_flagsDescript = 34, RULE_duScorrDescript = 35, 
		RULE_numPeaks = 36, RULE_peakData = 37, RULE_peak = 38, RULE_ions = 39, 
		RULE_ionDescription = 40, RULE_unknownIon = 41, RULE_assignableIon = 42, 
		RULE_immoniumOrInternalIon = 43, RULE_mzPeakTheoreticalDiff = 44, RULE_knownIon = 45, 
		RULE_ionData = 46, RULE_ionName = 47, RULE_nonLossIon = 48, RULE_neutralLossIon = 49, 
		RULE_neutralGainIon = 50, RULE_fragmentChargeState = 51, RULE_internalIon = 52, 
		RULE_internalIonDescript = 53, RULE_internalIonName = 54, RULE_internalIonSequence = 55, 
		RULE_immoniumIon = 56, RULE_immoniumIonName = 57, RULE_prePepSummary = 58, 
		RULE_ratio = 59, RULE_concensusSpectraNumMatch = 60, RULE_concensusSpectraDeviation = 61, 
		RULE_homologousPeptideMatch = 62;
	public static final String[] ruleNames = {
		"mspFile", "peptideSpectraMatch", "peptideName", "peptideSequence", "chargeState", 
		"peptideWeight", "molecularWeight", "comment", "keyValuePair", "key", 
		"keyValue", "fullNameStr", "leftFlankingAA", "rightFlankingAA", "peptideClass", 
		"terminusDescription", "terminusModifiers", "missedClevageDescription", 
		"modStr", "modIdentifier", "modName", "organismName", "proteinID", "databaseDescript", 
		"proteinName", "scientificOrganismName", "searchSummary", "searchEngineResults", 
		"searchEngineName", "searchEngineTags", "searchEngineResult", "sampleSpaceDescript", 
		"sampleCode", "sampleName", "flagsDescript", "duScorrDescript", "numPeaks", 
		"peakData", "peak", "ions", "ionDescription", "unknownIon", "assignableIon", 
		"immoniumOrInternalIon", "mzPeakTheoreticalDiff", "knownIon", "ionData", 
		"ionName", "nonLossIon", "neutralLossIon", "neutralGainIon", "fragmentChargeState", 
		"internalIon", "internalIonDescript", "internalIonName", "internalIonSequence", 
		"immoniumIon", "immoniumIonName", "prePepSummary", "ratio", "concensusSpectraNumMatch", 
		"concensusSpectraDeviation", "homologousPeptideMatch"
	};

	@Override
	public String getGrammarFileName() { return "NISTsimplifiedParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	            boolean inModSpec = false;
	            boolean inSampleSpec = false;
	            boolean inNreps = false;
	            boolean peakDataSection = false;
	            public static  int MIN_SPECTRA_FOR_CONSENSUS = 0;
	            public enum IonType
	              {   B_ION, Y_ION, A_ION, P_ION, UNKNOWN_ION, INTERNAL_ION, IMMONIUM_ION, ERROR
	              }
	            public enum AminoAcid {
	              F, L, S, Y, C, W, P, H, Q, R, I, M, T, N, K,  V, A, D, E, G,
	              OM, ERROR
	            }                        
	            public class IonData extends Object 
	            {
	              public String ionName;
	              public IonType ionType;
	              public float mz;
	              public int peakStrength;
	              public int numSpectraUsedForConsensus;
	              public int numSpectraWithIon;
	              public int chargeState = 1;
	              public boolean lossIon;
	              public boolean gainIon;
	              public boolean heavy;
	              
	              public int neutralFragmentMass = -1;              
	              
	              public byte ionPosition = -1;     // by convention an ionPosition of '0' means the parent ion
	              
	              public IonData(String ionName, IonType ionType) {
	                this.ionName = ionName;                     
	                this.ionType = ionType;
	              }  
	              public IonData() {
	                super();
	              }
	              public String toString() {
	                return ionName;
	              }                          
	            } 
	            public class PSM extends Object 
	            {
	              public static final int WATER_FRAGMENT_MASS = 18;
	              public static final int AMMONIA_FRAGMENT_MASS = 17;
	              public List<IonData> peakList;
	              public String peptideSequence;
	              public float parentMass;
	              public float parentMZ;
	              public int parentCharge;
	              public byte numAminoAcids;
	              public int nRepsInConsensus;
	              public String proteinName;
	              
	              public PSM(List<IonData> peakList, String peptideSequence, 
	                         float parentMass, float parentMZ, int parentCharge,
	                         byte numAminoAcids, int nRepsInConsensus, String proteinNameString) {
	                  
	                  super();
	                  this.peakList = peakList;
	                  this.peptideSequence = peptideSequence;
	                  this.parentMass = parentMass;
	                  this.parentMZ = parentMZ;
	                  this.parentCharge = parentCharge;
	                  this.numAminoAcids = numAminoAcids;
	                  this.nRepsInConsensus = nRepsInConsensus;
	                  this.proteinName = proteinNameString;
	               }
	               private List<IonData> getIonsByType(IonType ionType) {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/2);
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.ionType == ionType)
	                     ions.add(id);
	                 };
	                 return ions;
	               };
	               
	               // positions are 1 based, because position 0 is reserved for the
	               // parent ion
	               public List<IonData> getIonsByPosition(int position) {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/numAminoAcids);
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   switch(id.ionType) {
	                     case B_ION:
	                     case A_ION:
	                       // B and A ions are easy, we just include the ion if it's position matches
	                       // what we're looking for
	                       if (id.ionPosition>0 && id.ionPosition == position)     // make sure we have a valid position
	                         ions.add(id); 
	                       break;
	                     case Y_ION:
	                       // Y ions are a little tougher because Y ions are described in the opposite orderd
	                       int yPosition = numAminoAcids - id.ionPosition;
	                       if (id.ionPosition > 0 && yPosition == position)
	                         ions.add(id);
	                         break;
	                      // consider adding cases for immonium? and internal ions
	                   }
	                 };
	                 return ions;                                                                     
	               }
	               public List<IonData> getWaterLossIons() {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/3); 
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.lossIon && id.neutralFragmentMass == WATER_FRAGMENT_MASS) {
	                       ions.add(id);             
	                   }
	                 }
	                 return ions;
	               }
	               public List<IonData> getAmmoniaLossIons() {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/3); 
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.lossIon && id.neutralFragmentMass == PSM.AMMONIA_FRAGMENT_MASS) {
	                       ions.add(id);             
	                   }
	                 }
	                 return ions;
	               }                
	               public List<IonData> immoniumIons() {
	                 return getIonsByType(IonType.IMMONIUM_ION);                                   
	               }     
	               public List<IonData> internalIons() {
	                 return getIonsByType(IonType.INTERNAL_ION);                                   
	               }    
	               public List<IonData> unknownIons() {
	                 return getIonsByType(IonType.UNKNOWN_ION);                                   
	               }                
	               public List<IonData> unparseableIons() {
	                 return getIonsByType(IonType.ERROR);                                   
	               }                
	               public List<IonData> bIons() {
	                 return getIonsByType(IonType.B_ION);                                        
	               };
	               public List<IonData> yIons() {
	                 return getIonsByType(IonType.Y_ION);                                        
	               };
	               public List<IonData> aIons() {
	                 return getIonsByType(IonType.A_ION);                                        
	               };
	               public List<IonData> pIons() {
	                 return getIonsByType(IonType.P_ION);                                        
	               };
	               private List<IonData> getIonsBySecondaryFragmentation(boolean loss, boolean gain)
	               {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/2);
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.lossIon == loss && id.gainIon == gain)
	                     ions.add(id);
	                 };
	                 return ions;
	               };
	               public List<IonData> getIonsByHeaviness(boolean isHeavy) {
	                 Iterator<IonData> it = peakList.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/2);
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.heavy == isHeavy)
	                     ions.add(id);
	                 };
	                 return ions;                                                       
	               }                                                          
	               private List<IonData> getIonsBySecondaryFragmentation(boolean loss, boolean gain,
	                                                                     List<IonData> list)
	               {
	                 Iterator<IonData> it = list.iterator();
	                 ArrayList<IonData> ions = new ArrayList<IonData>(peakList.size()/2);
	                 while (it.hasNext()) {
	                   IonData id = (IonData)it.next();
	                   if (id.lossIon == loss && id.gainIon == gain)
	                     ions.add(id);
	                 };
	                 return ions;
	               };
	               public List<IonData> bIonsUnmodified() {
	                 return getIonsBySecondaryFragmentation(false, false, bIons());                                      
	               };
	               public List<IonData> yIonsUnmodified() {
	                 return getIonsBySecondaryFragmentation(false, false, yIons());                                      
	               };
	               public List<IonData> aIonsUnmodified() {
	                 return getIonsBySecondaryFragmentation(false, false, aIons());                                      
	               };
	                public List<IonData> bIonsNeutralLoss() {
	                 return getIonsBySecondaryFragmentation(true, false, bIons());                                      
	               };
	               public List<IonData> yIonsNeutralLoss() {
	                 return getIonsBySecondaryFragmentation(true, false, yIons());                                      
	               };
	               public List<IonData> aIonsNeutralLoss() {
	                 return getIonsBySecondaryFragmentation(true, false, aIons());                                      
	               };
	               public  boolean listContainsIonOfTypeAndLoss(IonType ionType, 
	                                                                  int fragmentMass, 
	                                                                  List<IonData> ions) 
	               {
	                    for (IonData id :ions) {
	                      if (id.ionType == ionType && id.neutralFragmentMass == fragmentMass) {
	                        return true;
	                      }                                                      
	                    }
	                    return false;
	               };
	               
	               // positions are 1 based because position 0 is reserved for the
	               // parent Ion
	                        public char getLeftFlankingAAatPosition(int position) {
	                           if (position < 1 || position >= numAminoAcids)
	                             throw new IllegalArgumentException("request for flanking " + 
	                                             " AA at position out of bounds: " + position);

	                           peptideSequence = this.peptideSequence.replaceAll("M\\(O\\)", "Z");

	                           return peptideSequence.charAt(position-1);

	                        }
	                        public char getRightFlankingAAatPosition(int position) {
	                           if (position < 1 || position >= numAminoAcids)
	                             throw new IllegalArgumentException("request for flanking " + 
	                                             " AA at position out of bounds: " + position);
	                           peptideSequence = this.peptideSequence.replaceAll("M\\(O\\)", "Z");
	                           return peptideSequence.charAt(position);

	                        }                    
	               
	            }
	            
	            
	            public List<PSM> allSpectra = new ArrayList<PSM>();;

	         
	public NISTsimplifiedParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MspFileContext extends ParserRuleContext {
		public PeptideSpectraMatchContext peptideSpectraMatch(int i) {
			return getRuleContext(PeptideSpectraMatchContext.class,i);
		}
		public List<PeptideSpectraMatchContext> peptideSpectraMatch() {
			return getRuleContexts(PeptideSpectraMatchContext.class);
		}
		public MspFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mspFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterMspFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitMspFile(this);
		}
	}

	public final MspFileContext mspFile() throws RecognitionException {
		MspFileContext _localctx = new MspFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mspFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126); peptideSpectraMatch();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
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

	public static class PeptideSpectraMatchContext extends ParserRuleContext {
		public List<IonData> peaks = new ArrayList<IonData>(50);
		public String peptideString;
		public float parentMass;
		public float parentMZ;
		public int parentCharge;
		public byte numAminoAcids;
		public int nRepsInConsensus;
		public String proteinNameString;
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public PeptideNameContext peptideName() {
			return getRuleContext(PeptideNameContext.class,0);
		}
		public NumPeaksContext numPeaks() {
			return getRuleContext(NumPeaksContext.class,0);
		}
		public PeptideWeightContext peptideWeight() {
			return getRuleContext(PeptideWeightContext.class,0);
		}
		public PeakDataContext peakData() {
			return getRuleContext(PeakDataContext.class,0);
		}
		public PeptideSpectraMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peptideSpectraMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeptideSpectraMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeptideSpectraMatch(this);
		}
	}

	public final PeptideSpectraMatchContext peptideSpectraMatch() throws RecognitionException {
		PeptideSpectraMatchContext _localctx = new PeptideSpectraMatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_peptideSpectraMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); peptideName();
			setState(132); peptideWeight();
			setState(133); comment();
			setState(134); numPeaks();
			setState(135); peakData();
			}

			    if (_localctx.nRepsInConsensus >= MIN_SPECTRA_FOR_CONSENSUS)
			        allSpectra.add(new PSM(_localctx.peaks, _localctx.peptideString, _localctx.parentMass, _localctx.parentMZ, 
			                               _localctx.parentCharge, _localctx.numAminoAcids, _localctx.nRepsInConsensus, _localctx.proteinNameString));

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

	public static class PeptideNameContext extends ParserRuleContext {
		public PeptideSequenceContext peptideSequence;
		public ChargeStateContext chargeState() {
			return getRuleContext(ChargeStateContext.class,0);
		}
		public PeptideSequenceContext peptideSequence() {
			return getRuleContext(PeptideSequenceContext.class,0);
		}
		public PeptideNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peptideName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeptideName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeptideName(this);
		}
	}

	public final PeptideNameContext peptideName() throws RecognitionException {
		PeptideNameContext _localctx = new PeptideNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_peptideName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(NAME);
			setState(138); ((PeptideNameContext)_localctx).peptideSequence = peptideSequence();
			setState(139); match(SLASH);
			setState(140); chargeState();

			    peakDataSection = false;
			    ((PeptideSpectraMatchContext)getInvokingContext(1)).peptideString =  (((PeptideNameContext)_localctx).peptideSequence!=null?_input.getText(((PeptideNameContext)_localctx).peptideSequence.start,((PeptideNameContext)_localctx).peptideSequence.stop):null);


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

	public static class PeptideSequenceContext extends ParserRuleContext {
		public TerminalNode PEPTIDESTRING() { return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, 0); }
		public PeptideSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peptideSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeptideSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeptideSequence(this);
		}
	}

	public final PeptideSequenceContext peptideSequence() throws RecognitionException {
		PeptideSequenceContext _localctx = new PeptideSequenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_peptideSequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(PEPTIDESTRING);
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

	public static class ChargeStateContext extends ParserRuleContext {
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public ChargeStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chargeState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterChargeState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitChargeState(this);
		}
	}

	public final ChargeStateContext chargeState() throws RecognitionException {
		ChargeStateContext _localctx = new ChargeStateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_chargeState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); ((ChargeStateContext)_localctx).NUMBER = match(NUMBER);
			((PeptideSpectraMatchContext)getInvokingContext(1)).parentCharge =  (((ChargeStateContext)_localctx).NUMBER!=null?Integer.valueOf(((ChargeStateContext)_localctx).NUMBER.getText()):0);
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

	public static class PeptideWeightContext extends ParserRuleContext {
		public MolecularWeightContext molecularWeight() {
			return getRuleContext(MolecularWeightContext.class,0);
		}
		public PeptideWeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peptideWeight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeptideWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeptideWeight(this);
		}
	}

	public final PeptideWeightContext peptideWeight() throws RecognitionException {
		PeptideWeightContext _localctx = new PeptideWeightContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_peptideWeight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(MW);
			setState(149); molecularWeight();
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

	public static class MolecularWeightContext extends ParserRuleContext {
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public MolecularWeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_molecularWeight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterMolecularWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitMolecularWeight(this);
		}
	}

	public final MolecularWeightContext molecularWeight() throws RecognitionException {
		MolecularWeightContext _localctx = new MolecularWeightContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_molecularWeight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); ((MolecularWeightContext)_localctx).NUMBER = match(NUMBER);
			((PeptideSpectraMatchContext)getInvokingContext(1)).parentMass =  Float.parseFloat((((MolecularWeightContext)_localctx).NUMBER!=null?((MolecularWeightContext)_localctx).NUMBER.getText():null));
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

	public static class CommentContext extends ParserRuleContext {
		public KeyValuePairContext keyValuePair(int i) {
			return getRuleContext(KeyValuePairContext.class,i);
		}
		public List<KeyValuePairContext> keyValuePair() {
			return getRuleContexts(KeyValuePairContext.class);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(COMMENT);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155); keyValuePair();
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 12) | (1L << 38) | (1L << 42))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Spec - 75)) | (1L << (Pep - 75)) | (1L << (Fullname - 75)) | (1L << (Mods - 75)) | (1L << (PARENT_MZ - 75)) | (1L << (Inst - 75)) | (1L << (MzExact - 75)) | (1L << (MzDiff - 75)) | (1L << (Mz_av - 75)) | (1L << (PROTEIN_NAME - 75)) | (1L << (Pseq - 75)) | (1L << (Organism - 75)) | (1L << (Se - 75)) | (1L << (Sample - 75)) | (1L << (NREPS - 75)) | (1L << (Missing - 75)) | (1L << (ParentMed - 75)) | (1L << (Max2medOrig - 75)) | (1L << (Dotfull - 75)) | (1L << (DotCons - 75)) | (1L << (UnassignAll - 75)) | (1L << (Unassigned - 75)) | (1L << (Dotbest - 75)) | (1L << (Flags - 75)) | (1L << (NUMBER_AMINO_ACIDS - 75)) | (1L << (DUScorr - 75)) | (1L << (Dottheory - 75)) | (1L << (Pfin - 75)) | (1L << (Probcorr - 75)) | (1L << (Tfratio - 75)) | (1L << (Pfract - 75)))) != 0) );
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

	public static class KeyValuePairContext extends ParserRuleContext {
		public KeyContext key;
		public KeyValueContext keyValue;
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public KeyValueContext keyValue() {
			return getRuleContext(KeyValueContext.class,0);
		}
		public KeyValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterKeyValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitKeyValuePair(this);
		}
	}

	public final KeyValuePairContext keyValuePair() throws RecognitionException {
		KeyValuePairContext _localctx = new KeyValuePairContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); ((KeyValuePairContext)_localctx).key = key();
			setState(161); match(14);
			setState(162); ((KeyValuePairContext)_localctx).keyValue = keyValue();

			    switch((((KeyValuePairContext)_localctx).key!=null?(((KeyValuePairContext)_localctx).key.start):null).getType()) {
			      case NUMBER_AMINO_ACIDS:
			        // we're going to get number of amino acids, should be of form: "Naa=17"
			        // this assumes that the keyValue is an integer; if it isn't Java will throw
			        // an exception!
			        ((PeptideSpectraMatchContext)getInvokingContext(1)).numAminoAcids =  (byte)Integer.parseInt((((KeyValuePairContext)_localctx).keyValue!=null?_input.getText(((KeyValuePairContext)_localctx).keyValue.start,((KeyValuePairContext)_localctx).keyValue.stop):null));
			        break;
			      case PARENT_MZ:
			        ((PeptideSpectraMatchContext)getInvokingContext(1)).parentMZ =  Float.parseFloat((((KeyValuePairContext)_localctx).keyValue!=null?_input.getText(((KeyValuePairContext)_localctx).keyValue.start,((KeyValuePairContext)_localctx).keyValue.stop):null));
			        break;
			      case NREPS:
			        ((PeptideSpectraMatchContext)getInvokingContext(1)).nRepsInConsensus =  Integer.parseInt(((KeyValuePairContext)_localctx).keyValue.ratio().NUMBER(0).getText());
			        break;
			      case PROTEIN_NAME:
			        ((PeptideSpectraMatchContext)getInvokingContext(1)).proteinNameString =  (((KeyValuePairContext)_localctx).keyValue!=null?_input.getText(((KeyValuePairContext)_localctx).keyValue.start,((KeyValuePairContext)_localctx).keyValue.stop):null);
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

	public static class KeyContext extends ParserRuleContext {
		public Token k;
		public TerminalNode NREPS() { return getToken(NISTsimplifiedParserParser.NREPS, 0); }
		public TerminalNode NUMBER_AMINO_ACIDS() { return getToken(NISTsimplifiedParserParser.NUMBER_AMINO_ACIDS, 0); }
		public TerminalNode PARENT_MZ() { return getToken(NISTsimplifiedParserParser.PARENT_MZ, 0); }
		public TerminalNode PROTEIN_NAME() { return getToken(NISTsimplifiedParserParser.PROTEIN_NAME, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((KeyContext)_localctx).k = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 12) | (1L << 38) | (1L << 42))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Spec - 75)) | (1L << (Pep - 75)) | (1L << (Fullname - 75)) | (1L << (Mods - 75)) | (1L << (PARENT_MZ - 75)) | (1L << (Inst - 75)) | (1L << (MzExact - 75)) | (1L << (MzDiff - 75)) | (1L << (Mz_av - 75)) | (1L << (PROTEIN_NAME - 75)) | (1L << (Pseq - 75)) | (1L << (Organism - 75)) | (1L << (Se - 75)) | (1L << (Sample - 75)) | (1L << (NREPS - 75)) | (1L << (Missing - 75)) | (1L << (ParentMed - 75)) | (1L << (Max2medOrig - 75)) | (1L << (Dotfull - 75)) | (1L << (DotCons - 75)) | (1L << (UnassignAll - 75)) | (1L << (Unassigned - 75)) | (1L << (Dotbest - 75)) | (1L << (Flags - 75)) | (1L << (NUMBER_AMINO_ACIDS - 75)) | (1L << (DUScorr - 75)) | (1L << (Dottheory - 75)) | (1L << (Pfin - 75)) | (1L << (Probcorr - 75)) | (1L << (Tfratio - 75)) | (1L << (Pfract - 75)))) != 0)) ) {
				((KeyContext)_localctx).k = (Token)_errHandler.recoverInline(this);
			}
			consume();
			 if ((((KeyContext)_localctx).k!=null?((KeyContext)_localctx).k.getText():null).equals("Mods")) { 
			            // System.out.println("FOUND MODS STR.");
			            inModSpec = true;
			          }else if ((((KeyContext)_localctx).k!=null?((KeyContext)_localctx).k.getText():null).equals("Sample")) { 
			            inSampleSpec = true;
			          }
			          else if ((((KeyContext)_localctx).k!=null?((KeyContext)_localctx).k.getText():null).equals("Nreps")) {
			            inNreps = true;
			          }
			          else { 
			              inModSpec = false;
			              inNreps = false;
			              inSampleSpec = false;
			          };
			        
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

	public static class KeyValueContext extends ParserRuleContext {
		public ModStrContext modStr() {
			return getRuleContext(ModStrContext.class,0);
		}
		public ProteinIDContext proteinID() {
			return getRuleContext(ProteinIDContext.class,0);
		}
		public OrganismNameContext organismName() {
			return getRuleContext(OrganismNameContext.class,0);
		}
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public PeptideClassContext peptideClass() {
			return getRuleContext(PeptideClassContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public FlagsDescriptContext flagsDescript() {
			return getRuleContext(FlagsDescriptContext.class,0);
		}
		public DuScorrDescriptContext duScorrDescript() {
			return getRuleContext(DuScorrDescriptContext.class,0);
		}
		public HomologousPeptideMatchContext homologousPeptideMatch() {
			return getRuleContext(HomologousPeptideMatchContext.class,0);
		}
		public FullNameStrContext fullNameStr() {
			return getRuleContext(FullNameStrContext.class,0);
		}
		public PrePepSummaryContext prePepSummary() {
			return getRuleContext(PrePepSummaryContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public SearchSummaryContext searchSummary() {
			return getRuleContext(SearchSummaryContext.class,0);
		}
		public SampleSpaceDescriptContext sampleSpaceDescript() {
			return getRuleContext(SampleSpaceDescriptContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitKeyValue(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyValue);
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); match(NUMBER);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(STRINGLITERAL);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170); ratio();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171); proteinID();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172); fullNameStr();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173); modStr();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174); organismName();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175); searchSummary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176); sampleSpaceDescript();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177); flagsDescript();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178); peptideClass();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179); duScorrDescript();
				}
				break;

			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180); homologousPeptideMatch();
				}
				break;

			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181); prePepSummary();
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

	public static class FullNameStrContext extends ParserRuleContext {
		public RightFlankingAAContext rightFlankingAA() {
			return getRuleContext(RightFlankingAAContext.class,0);
		}
		public TerminalNode PEPTIDESTRING() { return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, 0); }
		public LeftFlankingAAContext leftFlankingAA() {
			return getRuleContext(LeftFlankingAAContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public FullNameStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullNameStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterFullNameStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitFullNameStr(this);
		}
	}

	public final FullNameStrContext fullNameStr() throws RecognitionException {
		FullNameStrContext _localctx = new FullNameStrContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fullNameStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184); leftFlankingAA();
			setState(185); match(33);
			setState(186); match(PEPTIDESTRING);
			setState(187); match(33);
			setState(188); rightFlankingAA();
			setState(189); match(SLASH);
			setState(190); match(NUMBER);
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

	public static class LeftFlankingAAContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(NISTsimplifiedParserParser.AA, 0); }
		public LeftFlankingAAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftFlankingAA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterLeftFlankingAA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitLeftFlankingAA(this);
		}
	}

	public final LeftFlankingAAContext leftFlankingAA() throws RecognitionException {
		LeftFlankingAAContext _localctx = new LeftFlankingAAContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_leftFlankingAA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==HYPHEN || _la==AA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class RightFlankingAAContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(NISTsimplifiedParserParser.AA, 0); }
		public RightFlankingAAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightFlankingAA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterRightFlankingAA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitRightFlankingAA(this);
		}
	}

	public final RightFlankingAAContext rightFlankingAA() throws RecognitionException {
		RightFlankingAAContext _localctx = new RightFlankingAAContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rightFlankingAA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==HYPHEN || _la==AA) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PeptideClassContext extends ParserRuleContext {
		public TerminusDescriptionContext terminusDescription() {
			return getRuleContext(TerminusDescriptionContext.class,0);
		}
		public MissedClevageDescriptionContext missedClevageDescription() {
			return getRuleContext(MissedClevageDescriptionContext.class,0);
		}
		public PeptideClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peptideClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeptideClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeptideClass(this);
		}
	}

	public final PeptideClassContext peptideClass() throws RecognitionException {
		PeptideClassContext _localctx = new PeptideClassContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_peptideClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); terminusDescription();
			setState(199);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(197); match(SLASH);
				setState(198); missedClevageDescription();
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

	public static class TerminusDescriptionContext extends ParserRuleContext {
		public TerminalNode SEMI_C() { return getToken(NISTsimplifiedParserParser.SEMI_C, 0); }
		public TerminalNode SEMI_N() { return getToken(NISTsimplifiedParserParser.SEMI_N, 0); }
		public TerminusModifiersContext terminusModifiers(int i) {
			return getRuleContext(TerminusModifiersContext.class,i);
		}
		public TerminalNode TRYPTIC() { return getToken(NISTsimplifiedParserParser.TRYPTIC, 0); }
		public List<TerminusModifiersContext> terminusModifiers() {
			return getRuleContexts(TerminusModifiersContext.class);
		}
		public TerminusDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminusDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterTerminusDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitTerminusDescription(this);
		}
	}

	public final TerminusDescriptionContext terminusDescription() throws RecognitionException {
		TerminusDescriptionContext _localctx = new TerminusDescriptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_terminusDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRYPTIC) | (1L << SEMI_C) | (1L << SEMI_N))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE) {
				{
				{
				setState(202); match(UNDERSCORE);
				setState(203); terminusModifiers();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class TerminusModifiersContext extends ParserRuleContext {
		public TerminalNode UNCONFIRMED() { return getToken(NISTsimplifiedParserParser.UNCONFIRMED, 0); }
		public TerminalNode INSAMPLE() { return getToken(NISTsimplifiedParserParser.INSAMPLE, 0); }
		public TerminalNode CONFIRMED() { return getToken(NISTsimplifiedParserParser.CONFIRMED, 0); }
		public TerminalNode IRREG() { return getToken(NISTsimplifiedParserParser.IRREG, 0); }
		public TerminalNode OK() { return getToken(NISTsimplifiedParserParser.OK, 0); }
		public TerminalNode INSOURCE() { return getToken(NISTsimplifiedParserParser.INSOURCE, 0); }
		public TerminalNode INOTHERPEP() { return getToken(NISTsimplifiedParserParser.INOTHERPEP, 0); }
		public TerminusModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminusModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterTerminusModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitTerminusModifiers(this);
		}
	}

	public final TerminusModifiersContext terminusModifiers() throws RecognitionException {
		TerminusModifiersContext _localctx = new TerminusModifiersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_terminusModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSOURCE) | (1L << INSAMPLE) | (1L << INOTHERPEP) | (1L << CONFIRMED) | (1L << UNCONFIRMED) | (1L << IRREG) | (1L << OK))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class MissedClevageDescriptionContext extends ParserRuleContext {
		public TerminalNode MISSGOOD() { return getToken(NISTsimplifiedParserParser.MISSGOOD, 0); }
		public TerminalNode UNCONFIRMED() { return getToken(NISTsimplifiedParserParser.UNCONFIRMED, 0); }
		public TerminalNode CONFIRMED() { return getToken(NISTsimplifiedParserParser.CONFIRMED, 0); }
		public TerminalNode MISSBAD() { return getToken(NISTsimplifiedParserParser.MISSBAD, 0); }
		public MissedClevageDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_missedClevageDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterMissedClevageDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitMissedClevageDescription(this);
		}
	}

	public final MissedClevageDescriptionContext missedClevageDescription() throws RecognitionException {
		MissedClevageDescriptionContext _localctx = new MissedClevageDescriptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_missedClevageDescription);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==MISSGOOD || _la==MISSBAD) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(214);
			_la = _input.LA(1);
			if (_la==UNDERSCORE) {
				{
				setState(212); match(UNDERSCORE);
				setState(213);
				_la = _input.LA(1);
				if ( !(_la==CONFIRMED || _la==UNCONFIRMED) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ModStrContext extends ParserRuleContext {
		public List<ModIdentifierContext> modIdentifier() {
			return getRuleContexts(ModIdentifierContext.class);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public ModIdentifierContext modIdentifier(int i) {
			return getRuleContext(ModIdentifierContext.class,i);
		}
		public ModStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterModStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitModStr(this);
		}
	}

	public final ModStrContext modStr() throws RecognitionException {
		ModStrContext _localctx = new ModStrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modStr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			if (!(!inNreps)) throw new FailedPredicateException(this, "!inNreps");
			setState(217); match(NUMBER);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(218); match(SLASH);
					setState(219); modIdentifier();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ModIdentifierContext extends ParserRuleContext {
		public TerminalNode AA() { return getToken(NISTsimplifiedParserParser.AA, 0); }
		public ModNameContext modName() {
			return getRuleContext(ModNameContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public ModIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterModIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitModIdentifier(this);
		}
	}

	public final ModIdentifierContext modIdentifier() throws RecognitionException {
		ModIdentifierContext _localctx = new ModIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_modIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); match(NUMBER);
			setState(226); match(COMMA);
			setState(227); match(AA);
			setState(228); match(COMMA);
			setState(229); modName();
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

	public static class ModNameContext extends ParserRuleContext {
		public ModNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterModName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitModName(this);
		}
	}

	public final ModNameContext modName() throws RecognitionException {
		ModNameContext _localctx = new ModNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 39))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (Oxidation - 106)) | (1L << (Carbamidomethyl - 106)) | (1L << (ICATLight - 106)) | (1L << (ICATHeavy - 106)) | (1L << (ABOldICATd0 - 106)) | (1L << (ABOldICATd8 - 106)) | (1L << (Acetyl - 106)) | (1L << (Deamidation - 106)) | (1L << (PyroCmC - 106)) | (1L << (PyroGlu - 106)) | (1L << (Pyro_glu - 106)) | (1L << (Amide - 106)) | (1L << (Phospho - 106)) | (1L << (Methyl - 106)) | (1L << (Carbamyl - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class OrganismNameContext extends ParserRuleContext {
		public OrganismNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_organismName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterOrganismName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitOrganismName(this);
		}
	}

	public final OrganismNameContext organismName() throws RecognitionException {
		OrganismNameContext _localctx = new OrganismNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_organismName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 10) | (1L << 20) | (1L << 25) | (1L << 26) | (1L << 30) | (1L << 32) | (1L << 34) | (1L << 40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ProteinIDContext extends ParserRuleContext {
		public TerminalNode QUOTEDSTRINGLITERAL() { return getToken(NISTsimplifiedParserParser.QUOTEDSTRINGLITERAL, 0); }
		public ProteinIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proteinID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterProteinID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitProteinID(this);
		}
	}

	public final ProteinIDContext proteinID() throws RecognitionException {
		ProteinIDContext _localctx = new ProteinIDContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_proteinID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(QUOTEDSTRINGLITERAL);
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

	public static class DatabaseDescriptContext extends ParserRuleContext {
		public TerminalNode PEPTIDESTRING(int i) {
			return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, i);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(NISTsimplifiedParserParser.STRINGLITERAL); }
		public List<TerminalNode> PEPTIDESTRING() { return getTokens(NISTsimplifiedParserParser.PEPTIDESTRING); }
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(NISTsimplifiedParserParser.STRINGLITERAL, i);
		}
		public DatabaseDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseDescript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterDatabaseDescript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitDatabaseDescript(this);
		}
	}

	public final DatabaseDescriptContext databaseDescript() throws RecognitionException {
		DatabaseDescriptContext _localctx = new DatabaseDescriptContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_databaseDescript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 21) | (1L << UNDERSCORE))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (PEPTIDESTRING - 123)) | (1L << (NUMBER - 123)) | (1L << (STRINGLITERAL - 123)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(240); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 21) | (1L << UNDERSCORE))) != 0) || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (PEPTIDESTRING - 123)) | (1L << (NUMBER - 123)) | (1L << (STRINGLITERAL - 123)))) != 0) );
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

	public static class ProteinNameContext extends ParserRuleContext {
		public TerminalNode PEPTIDESTRING(int i) {
			return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, i);
		}
		public TerminalNode AA(int i) {
			return getToken(NISTsimplifiedParserParser.AA, i);
		}
		public List<TerminalNode> AA() { return getTokens(NISTsimplifiedParserParser.AA); }
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> PEPTIDESTRING() { return getTokens(NISTsimplifiedParserParser.PEPTIDESTRING); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(NISTsimplifiedParserParser.STRINGLITERAL); }
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(NISTsimplifiedParserParser.STRINGLITERAL, i);
		}
		public ProteinNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proteinName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterProteinName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitProteinName(this);
		}
	}

	public final ProteinNameContext proteinName() throws RecognitionException {
		ProteinNameContext _localctx = new ProteinNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_proteinName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(259);
				switch (_input.LA(1)) {
				case PROTEIN_NAME:
					{
					setState(242); match(PROTEIN_NAME);
					}
					break;
				case SLASH:
					{
					setState(243); match(SLASH);
					}
					break;
				case STRINGLITERAL:
					{
					setState(244); match(STRINGLITERAL);
					}
					break;
				case PEPTIDESTRING:
					{
					setState(245); match(PEPTIDESTRING);
					}
					break;
				case AA:
					{
					setState(246); match(AA);
					}
					break;
				case NUMBER:
					{
					setState(247); match(NUMBER);
					}
					break;
				case COMMA:
					{
					setState(248); match(COMMA);
					}
					break;
				case 4:
					{
					setState(249); match(4);
					setState(250); match(STRINGLITERAL);
					setState(251); match(18);
					}
					break;
				case 22:
					{
					setState(252); match(22);
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(253);
						_la = _input.LA(1);
						if ( !(_la==35 || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (PEPTIDESTRING - 123)) | (1L << (AA - 123)) | (1L << (STRINGLITERAL - 123)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						setState(256); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==35 || ((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (PEPTIDESTRING - 123)) | (1L << (AA - 123)) | (1L << (STRINGLITERAL - 123)))) != 0) );
					setState(258); match(13);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 22) | (1L << SLASH) | (1L << COMMA))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (PROTEIN_NAME - 84)) | (1L << (PEPTIDESTRING - 84)) | (1L << (AA - 84)) | (1L << (NUMBER - 84)) | (1L << (STRINGLITERAL - 84)))) != 0) );
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

	public static class ScientificOrganismNameContext extends ParserRuleContext {
		public List<TerminalNode> STRINGLITERAL() { return getTokens(NISTsimplifiedParserParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(NISTsimplifiedParserParser.STRINGLITERAL, i);
		}
		public ScientificOrganismNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scientificOrganismName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterScientificOrganismName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitScientificOrganismName(this);
		}
	}

	public final ScientificOrganismNameContext scientificOrganismName() throws RecognitionException {
		ScientificOrganismNameContext _localctx = new ScientificOrganismNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scientificOrganismName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(4);
			setState(264); match(STRINGLITERAL);
			setState(265); match(STRINGLITERAL);
			setState(266); match(18);
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

	public static class SearchSummaryContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public List<SearchEngineResultsContext> searchEngineResults() {
			return getRuleContexts(SearchEngineResultsContext.class);
		}
		public SearchEngineResultsContext searchEngineResults(int i) {
			return getRuleContext(SearchEngineResultsContext.class,i);
		}
		public SearchSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSearchSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSearchSummary(this);
		}
	}

	public final SearchSummaryContext searchSummary() throws RecognitionException {
		SearchSummaryContext _localctx = new SearchSummaryContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_searchSummary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); match(NUMBER);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269); searchEngineResults();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 15) | (1L << 19) | (1L << 23) | (1L << 29) | (1L << 37))) != 0) );
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

	public static class SearchEngineResultsContext extends ParserRuleContext {
		public SearchEngineResultContext searchEngineResult(int i) {
			return getRuleContext(SearchEngineResultContext.class,i);
		}
		public SearchEngineTagsContext searchEngineTags(int i) {
			return getRuleContext(SearchEngineTagsContext.class,i);
		}
		public List<SearchEngineTagsContext> searchEngineTags() {
			return getRuleContexts(SearchEngineTagsContext.class);
		}
		public SearchEngineNameContext searchEngineName() {
			return getRuleContext(SearchEngineNameContext.class,0);
		}
		public List<SearchEngineResultContext> searchEngineResult() {
			return getRuleContexts(SearchEngineResultContext.class);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public SearchEngineResultsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEngineResults; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSearchEngineResults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSearchEngineResults(this);
		}
	}

	public final SearchEngineResultsContext searchEngineResults() throws RecognitionException {
		SearchEngineResultsContext _localctx = new SearchEngineResultsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_searchEngineResults);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); searchEngineName();
			setState(275); match(NUMBER);
			setState(276); match(21);
			{
			setState(277); searchEngineTags();
			setState(278); match(14);
			setState(279); searchEngineResult();
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281); match(COMMA);
				setState(282); searchEngineTags();
				setState(283); match(14);
				setState(284); searchEngineResult();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SearchEngineNameContext extends ParserRuleContext {
		public SearchEngineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEngineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSearchEngineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSearchEngineName(this);
		}
	}

	public final SearchEngineNameContext searchEngineName() throws RecognitionException {
		SearchEngineNameContext _localctx = new SearchEngineNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_searchEngineName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 15) | (1L << 19) | (1L << 23) | (1L << 29) | (1L << 37))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class SearchEngineTagsContext extends ParserRuleContext {
		public Token tag;
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public SearchEngineTagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEngineTags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSearchEngineTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSearchEngineTags(this);
		}
	}

	public final SearchEngineTagsContext searchEngineTags() throws RecognitionException {
		SearchEngineTagsContext _localctx = new SearchEngineTagsContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_searchEngineTags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293); ((SearchEngineTagsContext)_localctx).tag = match(STRINGLITERAL);
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

	public static class SearchEngineResultContext extends ParserRuleContext {
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public SearchEngineResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchEngineResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSearchEngineResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSearchEngineResult(this);
		}
	}

	public final SearchEngineResultContext searchEngineResult() throws RecognitionException {
		SearchEngineResultContext _localctx = new SearchEngineResultContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_searchEngineResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(295); match(NUMBER);
				}
				break;

			case 2:
				{
				setState(296); ratio();
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

	public static class SampleSpaceDescriptContext extends ParserRuleContext {
		public List<SampleCodeContext> sampleCode() {
			return getRuleContexts(SampleCodeContext.class);
		}
		public SampleCodeContext sampleCode(int i) {
			return getRuleContext(SampleCodeContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public SampleSpaceDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleSpaceDescript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSampleSpaceDescript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSampleSpaceDescript(this);
		}
	}

	public final SampleSpaceDescriptContext sampleSpaceDescript() throws RecognitionException {
		SampleSpaceDescriptContext _localctx = new SampleSpaceDescriptContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_sampleSpaceDescript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299); match(NUMBER);
			setState(302); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(300); match(SLASH);
				setState(301); sampleCode();
				}
				}
				setState(304); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
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

	public static class SampleCodeContext extends ParserRuleContext {
		public SampleNameContext sampleName() {
			return getRuleContext(SampleNameContext.class,0);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public SampleCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSampleCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSampleCode(this);
		}
	}

	public final SampleCodeContext sampleCode() throws RecognitionException {
		SampleCodeContext _localctx = new SampleCodeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_sampleCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); sampleName();
			setState(307); match(COMMA);
			setState(308); match(NUMBER);
			setState(309); match(COMMA);
			setState(310); match(NUMBER);
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

	public static class SampleNameContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> STRINGLITERAL() { return getTokens(NISTsimplifiedParserParser.STRINGLITERAL); }
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(NISTsimplifiedParserParser.STRINGLITERAL, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public SampleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterSampleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitSampleName(this);
		}
	}

	public final SampleNameContext sampleName() throws RecognitionException {
		SampleNameContext _localctx = new SampleNameContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sampleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRINGLITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNDERSCORE) {
				{
				{
				setState(313); match(UNDERSCORE);
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==STRINGLITERAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FlagsDescriptContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public FlagsDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flagsDescript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterFlagsDescript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitFlagsDescript(this);
		}
	}

	public final FlagsDescriptContext flagsDescript() throws RecognitionException {
		FlagsDescriptContext _localctx = new FlagsDescriptContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_flagsDescript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320); match(NUMBER);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(321); match(COMMA);
				setState(322); match(NUMBER);
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DuScorrDescriptContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public DuScorrDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duScorrDescript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterDuScorrDescript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitDuScorrDescript(this);
		}
	}

	public final DuScorrDescriptContext duScorrDescript() throws RecognitionException {
		DuScorrDescriptContext _localctx = new DuScorrDescriptContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_duScorrDescript);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(329); match(SLASH);
			setState(330);
			_la = _input.LA(1);
			if ( !(_la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(331); match(SLASH);
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NumPeaksContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public NumPeaksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numPeaks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterNumPeaks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitNumPeaks(this);
		}
	}

	public final NumPeaksContext numPeaks() throws RecognitionException {
		NumPeaksContext _localctx = new NumPeaksContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_numPeaks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334); match(NPEAKS);
			setState(335); match(NUMBER);

			            peakDataSection = true; 
			            // System.out.println("SETTING PEAK DATA SECTION: " + peakDataSection);
			        
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

	public static class PeakDataContext extends ParserRuleContext {
		public PeakContext peak(int i) {
			return getRuleContext(PeakContext.class,i);
		}
		public List<PeakContext> peak() {
			return getRuleContexts(PeakContext.class);
		}
		public PeakDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peakData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeakData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeakData(this);
		}
	}

	public final PeakDataContext peakData() throws RecognitionException {
		PeakDataContext _localctx = new PeakDataContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_peakData);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(338); peak();
				}
				}
				setState(341); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class PeakContext extends ParserRuleContext {
		public List<IonData> correspondingIons = new ArrayList<IonData>(3);
		public int numSpectraUsedForConsensus;
		public int numSpectraWithIon;
		public Token mz;
		public Token abundance;
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public IonsContext ions() {
			return getRuleContext(IonsContext.class,0);
		}
		public ConcensusSpectraNumMatchContext concensusSpectraNumMatch() {
			return getRuleContext(ConcensusSpectraNumMatchContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public ConcensusSpectraDeviationContext concensusSpectraDeviation() {
			return getRuleContext(ConcensusSpectraDeviationContext.class,0);
		}
		public PeakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_peak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPeak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPeak(this);
		}
	}

	public final PeakContext peak() throws RecognitionException {
		PeakContext _localctx = new PeakContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_peak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); ((PeakContext)_localctx).mz = match(NUMBER);
			setState(344); ((PeakContext)_localctx).abundance = match(NUMBER);
			setState(345); match(11);
			setState(346); ions();
			setState(347); concensusSpectraNumMatch();
			setState(348); concensusSpectraDeviation();
			setState(349); match(11);
			}

			// add all our peaks to the master peak list for this Peptide Spectra Match
			    /*Iterator<IonData> it = _localctx.correspondingIons.iterator();
			    while (it.hasNext()) {
			        IonData iData = (IonData)it.next(); */
			    for(IonData iData :_localctx.correspondingIons) {  
			         if (_localctx.numSpectraUsedForConsensus <  MIN_SPECTRA_FOR_CONSENSUS)
			            continue;
			        
			        iData.mz = Float.parseFloat((((PeakContext)_localctx).mz!=null?((PeakContext)_localctx).mz.getText():null));
			        iData.peakStrength = Integer.parseInt((((PeakContext)_localctx).abundance!=null?((PeakContext)_localctx).abundance.getText():null));
			        iData.numSpectraUsedForConsensus = _localctx.numSpectraUsedForConsensus;
			        iData.numSpectraWithIon = _localctx.numSpectraWithIon;
			        ((PeptideSpectraMatchContext)getInvokingContext(1)).peaks.add(iData);
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

	public static class IonsContext extends ParserRuleContext {
		public List<IonDescriptionContext> ionDescription() {
			return getRuleContexts(IonDescriptionContext.class);
		}
		public IonDescriptionContext ionDescription(int i) {
			return getRuleContext(IonDescriptionContext.class,i);
		}
		public IonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterIons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitIons(this);
		}
	}

	public final IonsContext ions() throws RecognitionException {
		IonsContext _localctx = new IonsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351); ionDescription();
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(352); match(COMMA);
					setState(353); ionDescription();
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class IonDescriptionContext extends ParserRuleContext {
		public IonData id;
		public AssignableIonContext assignableIon() {
			return getRuleContext(AssignableIonContext.class,0);
		}
		public UnknownIonContext unknownIon() {
			return getRuleContext(UnknownIonContext.class,0);
		}
		public IonDescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ionDescription; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterIonDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitIonDescription(this);
		}
	}

	public final IonDescriptionContext ionDescription() throws RecognitionException {
		IonDescriptionContext _localctx = new IonDescriptionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ionDescription);
		 ((IonDescriptionContext)_localctx).id =  new IonData(); 
		try {
			setState(361);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359); assignableIon();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360); unknownIon();
				}
				break;
			}
			 ((PeakContext)getInvokingContext(38)).correspondingIons.add(_localctx.id); 
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

	public static class UnknownIonContext extends ParserRuleContext {
		public UnknownIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterUnknownIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitUnknownIon(this);
		}
	}

	public final UnknownIonContext unknownIon() throws RecognitionException {
		UnknownIonContext _localctx = new UnknownIonContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unknownIon);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 24) | (1L << 28) | (1L << 36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			 
			        ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.UNKNOWN_ION; 
			        ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String(_input.getText(_localctx.start, _input.LT(-1)));
			        if (_input.getText(_localctx.start, _input.LT(-1)).charAt(_input.getText(_localctx.start, _input.LT(-1)).length()-1) == 'i') {
			            // if 'i' is present this was a heavy ion so we set the flag
			            ((IonDescriptionContext)getInvokingContext(40)).id.heavy = true;

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

	public static class AssignableIonContext extends ParserRuleContext {
		public ImmoniumOrInternalIonContext immoniumOrInternalIon() {
			return getRuleContext(ImmoniumOrInternalIonContext.class,0);
		}
		public KnownIonContext knownIon() {
			return getRuleContext(KnownIonContext.class,0);
		}
		public MzPeakTheoreticalDiffContext mzPeakTheoreticalDiff() {
			return getRuleContext(MzPeakTheoreticalDiffContext.class,0);
		}
		public AssignableIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignableIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterAssignableIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitAssignableIon(this);
		}
	}

	public final AssignableIonContext assignableIon() throws RecognitionException {
		AssignableIonContext _localctx = new AssignableIonContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignableIon);
		try {
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				if (!(getCurrentToken().getText().charAt(0) == 'I')) throw new FailedPredicateException(this, "getCurrentToken().getText().charAt(0) == 'I'");
				setState(367); immoniumOrInternalIon();
				setState(369);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(368); mzPeakTheoreticalDiff();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371); knownIon();
				setState(373);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(372); mzPeakTheoreticalDiff();
					}
					break;
				}
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

	public static class ImmoniumOrInternalIonContext extends ParserRuleContext {
		public InternalIonContext internalIon() {
			return getRuleContext(InternalIonContext.class,0);
		}
		public ImmoniumIonContext immoniumIon() {
			return getRuleContext(ImmoniumIonContext.class,0);
		}
		public ImmoniumOrInternalIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immoniumOrInternalIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterImmoniumOrInternalIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitImmoniumOrInternalIon(this);
		}
	}

	public final ImmoniumOrInternalIonContext immoniumOrInternalIon() throws RecognitionException {
		ImmoniumOrInternalIonContext _localctx = new ImmoniumOrInternalIonContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_immoniumOrInternalIon);
		try {
			setState(380);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				if (!(getCurrentToken().getText().contains("Int"))) throw new FailedPredicateException(this, "getCurrentToken().getText().contains(\"Int\")");
				setState(378); internalIon();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379); immoniumIon();
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

	public static class MzPeakTheoreticalDiffContext extends ParserRuleContext {
		public Token isHeavy;
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public MzPeakTheoreticalDiffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mzPeakTheoreticalDiff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterMzPeakTheoreticalDiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitMzPeakTheoreticalDiff(this);
		}
	}

	public final MzPeakTheoreticalDiffContext mzPeakTheoreticalDiff() throws RecognitionException {
		MzPeakTheoreticalDiffContext _localctx = new MzPeakTheoreticalDiffContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_mzPeakTheoreticalDiff);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); match(SLASH);
			setState(393);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				{
				setState(384);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(383);
					_la = _input.LA(1);
					if ( !(_la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(387);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(386); ((MzPeakTheoreticalDiffContext)_localctx).isHeavy = match(41);
					}
					break;
				}
				setState(390);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(389); match(5);
					}
					break;
				}
				}
				}
				break;

			case 2:
				{
				setState(392); match(ZeroI);
				}
				break;
			}
			}

			    if (((MzPeakTheoreticalDiffContext)_localctx).isHeavy != null) {
			        // check if this token was there, if so this was a heavy ion
			        // the MSP file syntax is weird and sticks the 'i' in different places depending
			        // on what kind of ion it is
			        ((IonDescriptionContext)getInvokingContext(40)).id.heavy = true;
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

	public static class KnownIonContext extends ParserRuleContext {
		public IonDataContext ionData() {
			return getRuleContext(IonDataContext.class,0);
		}
		public KnownIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_knownIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterKnownIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitKnownIon(this);
		}
	}

	public final KnownIonContext knownIon() throws RecognitionException {
		KnownIonContext _localctx = new KnownIonContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_knownIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); ionData();

			    char[] ionNameCharArray = ((IonDescriptionContext)getInvokingContext(40)).id.ionName.toCharArray();
			    switch (ionNameCharArray[0]) {
			        case 'b':
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.B_ION;        
			            break;
			        case 'y':
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.Y_ION;        
			            break;
			        case 'a':
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.A_ION;
			            break;
			        case 'p':
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.P_ION;
			            break;
			        case 'I':
			            // this is a bug, we shouldn't be here but for some reason
			            // the parser will interpret heavy immonium ions as regular
			            // ions, e.g. IQDx, IWGx, IRAi, etc.
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.IMMONIUM_ION;            
			            break;
			        default:
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.ERROR;
			            System.err.println("Found 'known ion' that could not be processed: " + ionNameCharArray);
			            // throw new IllegalArgumentException("Ion type is unknown: " + _input.getText(_localctx.start, _input.LT(-1)));
			    }
			    if (ionNameCharArray[ionNameCharArray.length-1] == 'i') {
			        // this is a heavy ion, so we set the flag
			        ((IonDescriptionContext)getInvokingContext(40)).id.heavy = true;
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

	public static class IonDataContext extends ParserRuleContext {
		public FragmentChargeStateContext fragmentChargeState;
		public IonNameContext ionName() {
			return getRuleContext(IonNameContext.class,0);
		}
		public List<FragmentChargeStateContext> fragmentChargeState() {
			return getRuleContexts(FragmentChargeStateContext.class);
		}
		public FragmentChargeStateContext fragmentChargeState(int i) {
			return getRuleContext(FragmentChargeStateContext.class,i);
		}
		public IonDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ionData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterIonData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitIonData(this);
		}
	}

	public final IonDataContext ionData() throws RecognitionException {
		IonDataContext _localctx = new IonDataContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ionData);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398); ionName();
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					setState(401);
					switch (_input.LA(1)) {
					case 5:
						{
						setState(399); match(5);
						}
						break;
					case 31:
						{
						setState(400); ((IonDataContext)_localctx).fragmentChargeState = fragmentChargeState();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}

			    ((IonDescriptionContext)getInvokingContext(40)).id.chargeState = ((IonDataContext)_localctx).fragmentChargeState != null
			                                        ? Integer.parseInt((((IonDataContext)_localctx).fragmentChargeState!=null?_input.getText(((IonDataContext)_localctx).fragmentChargeState.start,((IonDataContext)_localctx).fragmentChargeState.stop):null).substring(1)) 
			                                        : 1;
			  
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

	public static class IonNameContext extends ParserRuleContext {
		public NeutralLossIonContext neutralLossIon() {
			return getRuleContext(NeutralLossIonContext.class,0);
		}
		public NeutralGainIonContext neutralGainIon() {
			return getRuleContext(NeutralGainIonContext.class,0);
		}
		public NonLossIonContext nonLossIon() {
			return getRuleContext(NonLossIonContext.class,0);
		}
		public IonNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterIonName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitIonName(this);
		}
	}

	public final IonNameContext ionName() throws RecognitionException {
		IonNameContext _localctx = new IonNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ionName);
		try {
			setState(413);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				if (!(getCurrentToken().getText().contains("-"))) throw new FailedPredicateException(this, "getCurrentToken().getText().contains(\"-\")");
				setState(409); neutralLossIon();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				if (!(getCurrentToken().getText().contains("+"))) throw new FailedPredicateException(this, "getCurrentToken().getText().contains(\"+\")");
				setState(411); neutralGainIon();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(412); nonLossIon();
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

	public static class NonLossIonContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public NonLossIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonLossIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterNonLossIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitNonLossIon(this);
		}
	}

	public final NonLossIonContext nonLossIon() throws RecognitionException {
		NonLossIonContext _localctx = new NonLossIonContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nonLossIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(STRINGLITERAL);

			      ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String(_input.getText(_localctx.start, _input.LT(-1))); 
			      int length = _input.getText(_localctx.start, _input.LT(-1)).length();
			      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
			      // up until the end (if it isn't a heavy ion) or the end-1 if it is a heavy ion
			      // i.e. there's a 'i' at the end of the name
			        String fullIonName = _input.getText(_localctx.start, _input.LT(-1));
			        int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
			        // String integerPart = _input.getText(_localctx.start, _input.LT(-1)).substring(1, length - 1 - (_input.getText(_localctx.start, _input.LT(-1)).charAt(length-1) == 'i' ? 1 : 0));
			        String integerPart = fullIonName.substring(1, subStringEnd);
			        
			        // if the "integer part" of our ion name is empty, then we will assign the position as 0
			        // the most common case where this happens is when we have just the parent ion 'p'
			        int positionOfIonInSequence = -1;
			        try {
			            positionOfIonInSequence = (!integerPart.isEmpty()) ? Integer.parseInt(integerPart) : 0;
			        } catch (NumberFormatException e) {
			            System.err.println("Could not process ion position: " + fullIonName);
			            positionOfIonInSequence = -1;
			        }
			        ((IonDescriptionContext)getInvokingContext(40)).id.ionPosition = (byte) positionOfIonInSequence;
			        
			    
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

	public static class NeutralLossIonContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public NeutralLossIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neutralLossIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterNeutralLossIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitNeutralLossIon(this);
		}
	}

	public final NeutralLossIonContext neutralLossIon() throws RecognitionException {
		NeutralLossIonContext _localctx = new NeutralLossIonContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_neutralLossIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); match(STRINGLITERAL);

			      ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String(_input.getText(_localctx.start, _input.LT(-1))); 
			      ((IonDescriptionContext)getInvokingContext(40)).id.lossIon = true;

			      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
			      // up until the '-'
			      String fullIonName = _input.getText(_localctx.start, _input.LT(-1));
			      int minusSignPosition   = fullIonName.indexOf('-');
			      String integerPart = fullIonName.substring(1, minusSignPosition );
			      // if the "integer part" of our ion name is empty, then we will assign the position as 0
			      // the most common case where this happens is when we have just the parent ion 'p'
			        try {
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionPosition = (!integerPart.isEmpty()) ? (byte)Integer.parseInt(integerPart) : 0;
			            int length = fullIonName.length();
			            int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
			            ((IonDescriptionContext)getInvokingContext(40)).id.neutralFragmentMass = Integer.parseInt(fullIonName.substring(minusSignPosition+1, subStringEnd));
			        } catch (NumberFormatException e) {
			            System.err.println("Could not process ion position: " + fullIonName + " : " + e);
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

	public static class NeutralGainIonContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public NeutralGainIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neutralGainIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterNeutralGainIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitNeutralGainIon(this);
		}
	}

	public final NeutralGainIonContext neutralGainIon() throws RecognitionException {
		NeutralGainIonContext _localctx = new NeutralGainIonContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_neutralGainIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421); match(STRINGLITERAL);

			      ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String(_input.getText(_localctx.start, _input.LT(-1))); 
			      ((IonDescriptionContext)getInvokingContext(40)).id.gainIon = true;
			      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
			      // up until the '+'
			      String fullIonName = _input.getText(_localctx.start, _input.LT(-1));
			      int plusSignPosition   = fullIonName.indexOf('+');      
			      String integerPart = fullIonName.substring(1, plusSignPosition);
			      // if the "integer part" of our ion name is empty, then we will assign the position as 0
			      // the most common case where this happens is when we have just the parent ion 'p'        
			        try {
			            ((IonDescriptionContext)getInvokingContext(40)).id.ionPosition = (!integerPart.isEmpty()) ? (byte)Integer.parseInt(integerPart) : 0;
			            int length = fullIonName.length();
			            int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
			            ((IonDescriptionContext)getInvokingContext(40)).id.neutralFragmentMass = Integer.parseInt(fullIonName.substring(plusSignPosition+1, subStringEnd));            
			        } catch (NumberFormatException e) {
			            System.err.println("Could not process ion position: " + _input.getText(_localctx.start, _input.LT(-1)) + " : " + e);            
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

	public static class FragmentChargeStateContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public FragmentChargeStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentChargeState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterFragmentChargeState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitFragmentChargeState(this);
		}
	}

	public final FragmentChargeStateContext fragmentChargeState() throws RecognitionException {
		FragmentChargeStateContext _localctx = new FragmentChargeStateContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fragmentChargeState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(31);
			setState(425); match(NUMBER);
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

	public static class InternalIonContext extends ParserRuleContext {
		public InternalIonDescriptContext internalIonDescript() {
			return getRuleContext(InternalIonDescriptContext.class,0);
		}
		public InternalIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterInternalIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitInternalIon(this);
		}
	}

	public final InternalIonContext internalIon() throws RecognitionException {
		InternalIonContext _localctx = new InternalIonContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_internalIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); internalIonDescript();
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

	public static class InternalIonDescriptContext extends ParserRuleContext {
		public InternalIonSequenceContext internalIonSequence;
		public InternalIonSequenceContext internalIonSequence() {
			return getRuleContext(InternalIonSequenceContext.class,0);
		}
		public InternalIonNameContext internalIonName() {
			return getRuleContext(InternalIonNameContext.class,0);
		}
		public InternalIonDescriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalIonDescript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterInternalIonDescript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitInternalIonDescript(this);
		}
	}

	public final InternalIonDescriptContext internalIonDescript() throws RecognitionException {
		InternalIonDescriptContext _localctx = new InternalIonDescriptContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_internalIonDescript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429); internalIonName();
			setState(430); match(SLASH);
			setState(431); ((InternalIonDescriptContext)_localctx).internalIonSequence = internalIonSequence();

			       ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String((((InternalIonDescriptContext)_localctx).internalIonSequence!=null?_input.getText(((InternalIonDescriptContext)_localctx).internalIonSequence.start,((InternalIonDescriptContext)_localctx).internalIonSequence.stop):null));
			       ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.INTERNAL_ION;
			       
			       // remember there's an off by 1 error, an ion Position of '0' is reserved for the parent ion
			       int ionPosition = ((PeptideSpectraMatchContext)getInvokingContext(1)).peptideString.indexOf((((InternalIonDescriptContext)_localctx).internalIonSequence!=null?_input.getText(((InternalIonDescriptContext)_localctx).internalIonSequence.start,((InternalIonDescriptContext)_localctx).internalIonSequence.stop):null)) + 1;
			       ((IonDescriptionContext)getInvokingContext(40)).id.ionPosition = (byte)ionPosition;
			    
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

	public static class InternalIonNameContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public InternalIonNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalIonName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterInternalIonName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitInternalIonName(this);
		}
	}

	public final InternalIonNameContext internalIonName() throws RecognitionException {
		InternalIonNameContext _localctx = new InternalIonNameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_internalIonName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(STRINGLITERAL);
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

	public static class InternalIonSequenceContext extends ParserRuleContext {
		public TerminalNode STRINGLITERAL() { return getToken(NISTsimplifiedParserParser.STRINGLITERAL, 0); }
		public TerminalNode PEPTIDESTRING() { return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, 0); }
		public InternalIonSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalIonSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterInternalIonSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitInternalIonSequence(this);
		}
	}

	public final InternalIonSequenceContext internalIonSequence() throws RecognitionException {
		InternalIonSequenceContext _localctx = new InternalIonSequenceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_internalIonSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_la = _input.LA(1);
			if ( !(_la==PEPTIDESTRING || _la==STRINGLITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ImmoniumIonContext extends ParserRuleContext {
		public ImmoniumIonNameContext immoniumIonName;
		public ImmoniumIonNameContext immoniumIonName() {
			return getRuleContext(ImmoniumIonNameContext.class,0);
		}
		public ImmoniumIonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immoniumIon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterImmoniumIon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitImmoniumIon(this);
		}
	}

	public final ImmoniumIonContext immoniumIon() throws RecognitionException {
		ImmoniumIonContext _localctx = new ImmoniumIonContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_immoniumIon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); ((ImmoniumIonContext)_localctx).immoniumIonName = immoniumIonName();

			      ((IonDescriptionContext)getInvokingContext(40)).id.ionName = new String((((ImmoniumIonContext)_localctx).immoniumIonName!=null?_input.getText(((ImmoniumIonContext)_localctx).immoniumIonName.start,((ImmoniumIonContext)_localctx).immoniumIonName.stop):null));
			      ((IonDescriptionContext)getInvokingContext(40)).id.ionType = IonType.IMMONIUM_ION;
			      
			      // note we don't try to set the peptide position for an immonium ion,
			      // we just leave it at the default value of -1
			    
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

	public static class ImmoniumIonNameContext extends ParserRuleContext {
		public TerminalNode PEPTIDESTRING() { return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, 0); }
		public ImmoniumIonNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immoniumIonName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterImmoniumIonName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitImmoniumIonName(this);
		}
	}

	public final ImmoniumIonNameContext immoniumIonName() throws RecognitionException {
		ImmoniumIonNameContext _localctx = new ImmoniumIonNameContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_immoniumIonName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441); match(PEPTIDESTRING);
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

	public static class PrePepSummaryContext extends ParserRuleContext {
		public ModStrContext modStr() {
			return getRuleContext(ModStrContext.class,0);
		}
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public FullNameStrContext fullNameStr() {
			return getRuleContext(FullNameStrContext.class,0);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public PrePepSummaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prePepSummary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterPrePepSummary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitPrePepSummary(this);
		}
	}

	public final PrePepSummaryContext prePepSummary() throws RecognitionException {
		PrePepSummaryContext _localctx = new PrePepSummaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_prePepSummary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443); fullNameStr();
			setState(444); match(UNDERSCORE);
			setState(445); modStr();
			setState(446); match(UNDERSCORE);
			setState(447); match(22);
			setState(448); match(NUMBER);
			setState(449); match(COMMA);
			setState(450); match(NUMBER);
			setState(451); match(13);
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

	public static class RatioContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(NISTsimplifiedParserParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(NISTsimplifiedParserParser.NUMBER); }
		public RatioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ratio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterRatio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitRatio(this);
		}
	}

	public final RatioContext ratio() throws RecognitionException {
		RatioContext _localctx = new RatioContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ratio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			if (!(!inModSpec)) throw new FailedPredicateException(this, "!inModSpec");
			setState(454);
			_la = _input.LA(1);
			if ( !(_la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(455); match(SLASH);
			setState(456);
			_la = _input.LA(1);
			if ( !(_la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConcensusSpectraNumMatchContext extends ParserRuleContext {
		public RatioContext ratio;
		public RatioContext ratio() {
			return getRuleContext(RatioContext.class,0);
		}
		public ConcensusSpectraNumMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concensusSpectraNumMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterConcensusSpectraNumMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitConcensusSpectraNumMatch(this);
		}
	}

	public final ConcensusSpectraNumMatchContext concensusSpectraNumMatch() throws RecognitionException {
		ConcensusSpectraNumMatchContext _localctx = new ConcensusSpectraNumMatchContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_concensusSpectraNumMatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458); ((ConcensusSpectraNumMatchContext)_localctx).ratio = ratio();

			    ((PeakContext)getInvokingContext(38)).numSpectraUsedForConsensus =  Integer.parseInt(((ConcensusSpectraNumMatchContext)_localctx).ratio.NUMBER(0).getText());
			    ((PeakContext)getInvokingContext(38)).numSpectraWithIon =  Integer.parseInt(((ConcensusSpectraNumMatchContext)_localctx).ratio.NUMBER(1).getText());
			   
			  
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

	public static class ConcensusSpectraDeviationContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public ConcensusSpectraDeviationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concensusSpectraDeviation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterConcensusSpectraDeviation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitConcensusSpectraDeviation(this);
		}
	}

	public final ConcensusSpectraDeviationContext concensusSpectraDeviation() throws RecognitionException {
		ConcensusSpectraDeviationContext _localctx = new ConcensusSpectraDeviationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_concensusSpectraDeviation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(NUMBER);
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

	public static class HomologousPeptideMatchContext extends ParserRuleContext {
		public ModStrContext modStr() {
			return getRuleContext(ModStrContext.class,0);
		}
		public ChargeStateContext chargeState() {
			return getRuleContext(ChargeStateContext.class,0);
		}
		public HomologousPeptideMatchContext homologousPeptideMatch(int i) {
			return getRuleContext(HomologousPeptideMatchContext.class,i);
		}
		public List<HomologousPeptideMatchContext> homologousPeptideMatch() {
			return getRuleContexts(HomologousPeptideMatchContext.class);
		}
		public TerminalNode PEPTIDESTRING() { return getToken(NISTsimplifiedParserParser.PEPTIDESTRING, 0); }
		public TerminalNode NUMBER() { return getToken(NISTsimplifiedParserParser.NUMBER, 0); }
		public HomologousPeptideMatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_homologousPeptideMatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).enterHomologousPeptideMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NISTsimplifiedParserListener ) ((NISTsimplifiedParserListener)listener).exitHomologousPeptideMatch(this);
		}
	}

	public final HomologousPeptideMatchContext homologousPeptideMatch() throws RecognitionException {
		HomologousPeptideMatchContext _localctx = new HomologousPeptideMatchContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_homologousPeptideMatch);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463); match(PEPTIDESTRING);
			setState(464); match(SLASH);
			setState(465); chargeState();
			setState(466); match(UNDERSCORE);
			setState(467); modStr();
			setState(468); match(SLASH);
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==16 || _la==27) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(470); match(SLASH);
			setState(471); match(NUMBER);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(472); match(COMMA);
					setState(473); homologousPeptideMatch();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18: return modStr_sempred((ModStrContext)_localctx, predIndex);

		case 42: return assignableIon_sempred((AssignableIonContext)_localctx, predIndex);

		case 43: return immoniumOrInternalIon_sempred((ImmoniumOrInternalIonContext)_localctx, predIndex);

		case 47: return ionName_sempred((IonNameContext)_localctx, predIndex);

		case 59: return ratio_sempred((RatioContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean immoniumOrInternalIon_sempred(ImmoniumOrInternalIonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return getCurrentToken().getText().contains("Int");
		}
		return true;
	}
	private boolean modStr_sempred(ModStrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !inNreps;
		}
		return true;
	}
	private boolean ratio_sempred(RatioContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return !inModSpec;
		}
		return true;
	}
	private boolean assignableIon_sempred(AssignableIonContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return getCurrentToken().getText().charAt(0) == 'I';
		}
		return true;
	}
	private boolean ionName_sempred(IonNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return getCurrentToken().getText().contains("-");

		case 4: return getCurrentToken().getText().contains("+");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\u0084\u01e2\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\6\2\u0082\n\2\r\2\16\2\u0083\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\6\t\u009f\n\t\r\t\16\t\u00a0\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b9"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00ca\n\20\3\21\3\21\3\21\7\21\u00cf\n\21\f\21\16\21\u00d2\13\21"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u00d9\n\23\3\24\3\24\3\24\3\24\7\24\u00df"+
		"\n\24\f\24\16\24\u00e2\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\27\3\27\3\30\3\30\3\31\6\31\u00f1\n\31\r\31\16\31\u00f2\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0101\n\32\r\32\16"+
		"\32\u0102\3\32\6\32\u0106\n\32\r\32\16\32\u0107\3\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\6\34\u0111\n\34\r\34\16\34\u0112\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0121\n\35\f\35\16\35\u0124\13"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \5 \u012c\n \3!\3!\3!\6!\u0131\n!\r!\16!"+
		"\u0132\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\7#\u013e\n#\f#\16#\u0141\13#\3"+
		"$\3$\3$\7$\u0146\n$\f$\16$\u0149\13$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'"+
		"\6\'\u0156\n\'\r\'\16\'\u0157\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\7)\u0165"+
		"\n)\f)\16)\u0168\13)\3*\3*\5*\u016c\n*\3+\3+\3+\3,\3,\3,\5,\u0174\n,\3"+
		",\3,\5,\u0178\n,\5,\u017a\n,\3-\3-\3-\5-\u017f\n-\3.\3.\5.\u0183\n.\3"+
		".\5.\u0186\n.\3.\5.\u0189\n.\3.\5.\u018c\n.\3/\3/\3/\3\60\3\60\3\60\7"+
		"\60\u0194\n\60\f\60\16\60\u0197\13\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u01a0\n\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3;"+
		"\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u01dd\n@\f@\16@\u01e0\13@\3@\2A\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`bdfhjlnprtvxz|~\2\22\7\2\t\t\16\16((,,Mk\4\2\63\63~~\3\2\668\4\2"+
		"9>AA\3\2?@\3\2<=\5\2\n\13))lz\n\2\4\4\f\f\26\26\33\34  \"\"$$**\b\2\23"+
		"\23\27\27\64\64}}\177\177\u0082\u0082\5\2%%}~\u0082\u0082\t\2\5\5\b\b"+
		"\21\21\25\25\31\31\37\37\'\'\4\2\177\177\u0082\u0082\3\2\177\177\6\2\3"+
		"\3\32\32\36\36&&\4\2}}\u0082\u0082\4\2\22\22\35\35\u01d6\2\u0081\3\2\2"+
		"\2\4\u0085\3\2\2\2\6\u008b\3\2\2\2\b\u0091\3\2\2\2\n\u0093\3\2\2\2\f\u0096"+
		"\3\2\2\2\16\u0099\3\2\2\2\20\u009c\3\2\2\2\22\u00a2\3\2\2\2\24\u00a7\3"+
		"\2\2\2\26\u00b8\3\2\2\2\30\u00ba\3\2\2\2\32\u00c2\3\2\2\2\34\u00c4\3\2"+
		"\2\2\36\u00c6\3\2\2\2 \u00cb\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&\u00da"+
		"\3\2\2\2(\u00e3\3\2\2\2*\u00e9\3\2\2\2,\u00eb\3\2\2\2.\u00ed\3\2\2\2\60"+
		"\u00f0\3\2\2\2\62\u0105\3\2\2\2\64\u0109\3\2\2\2\66\u010e\3\2\2\28\u0114"+
		"\3\2\2\2:\u0125\3\2\2\2<\u0127\3\2\2\2>\u012b\3\2\2\2@\u012d\3\2\2\2B"+
		"\u0134\3\2\2\2D\u013a\3\2\2\2F\u0142\3\2\2\2H\u014a\3\2\2\2J\u0150\3\2"+
		"\2\2L\u0155\3\2\2\2N\u0159\3\2\2\2P\u0161\3\2\2\2R\u016b\3\2\2\2T\u016d"+
		"\3\2\2\2V\u0179\3\2\2\2X\u017e\3\2\2\2Z\u0180\3\2\2\2\\\u018d\3\2\2\2"+
		"^\u0190\3\2\2\2`\u019f\3\2\2\2b\u01a1\3\2\2\2d\u01a4\3\2\2\2f\u01a7\3"+
		"\2\2\2h\u01aa\3\2\2\2j\u01ad\3\2\2\2l\u01af\3\2\2\2n\u01b4\3\2\2\2p\u01b6"+
		"\3\2\2\2r\u01b8\3\2\2\2t\u01bb\3\2\2\2v\u01bd\3\2\2\2x\u01c7\3\2\2\2z"+
		"\u01cc\3\2\2\2|\u01cf\3\2\2\2~\u01d1\3\2\2\2\u0080\u0082\5\4\3\2\u0081"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2"+
		"\2\2\u0084\3\3\2\2\2\u0085\u0086\5\6\4\2\u0086\u0087\5\f\7\2\u0087\u0088"+
		"\5\20\t\2\u0088\u0089\5J&\2\u0089\u008a\5L\'\2\u008a\5\3\2\2\2\u008b\u008c"+
		"\7-\2\2\u008c\u008d\5\b\5\2\u008d\u008e\7\61\2\2\u008e\u008f\5\n\6\2\u008f"+
		"\u0090\b\4\1\2\u0090\7\3\2\2\2\u0091\u0092\7}\2\2\u0092\t\3\2\2\2\u0093"+
		"\u0094\7\177\2\2\u0094\u0095\b\6\1\2\u0095\13\3\2\2\2\u0096\u0097\7.\2"+
		"\2\u0097\u0098\5\16\b\2\u0098\r\3\2\2\2\u0099\u009a\7\177\2\2\u009a\u009b"+
		"\b\b\1\2\u009b\17\3\2\2\2\u009c\u009e\7/\2\2\u009d\u009f\5\22\n\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\21\3\2\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\20\2\2\u00a4"+
		"\u00a5\5\26\f\2\u00a5\u00a6\b\n\1\2\u00a6\23\3\2\2\2\u00a7\u00a8\t\2\2"+
		"\2\u00a8\u00a9\b\13\1\2\u00a9\25\3\2\2\2\u00aa\u00b9\7\177\2\2\u00ab\u00b9"+
		"\7\u0082\2\2\u00ac\u00b9\5x=\2\u00ad\u00b9\5.\30\2\u00ae\u00b9\5\30\r"+
		"\2\u00af\u00b9\5&\24\2\u00b0\u00b9\5,\27\2\u00b1\u00b9\5\66\34\2\u00b2"+
		"\u00b9\5@!\2\u00b3\u00b9\5F$\2\u00b4\u00b9\5\36\20\2\u00b5\u00b9\5H%\2"+
		"\u00b6\u00b9\5~@\2\u00b7\u00b9\5v<\2\u00b8\u00aa\3\2\2\2\u00b8\u00ab\3"+
		"\2\2\2\u00b8\u00ac\3\2\2\2\u00b8\u00ad\3\2\2\2\u00b8\u00ae\3\2\2\2\u00b8"+
		"\u00af\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\5\32\16"+
		"\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7}\2\2\u00bd\u00be\7#\2\2\u00be\u00bf"+
		"\5\34\17\2\u00bf\u00c0\7\61\2\2\u00c0\u00c1\7\177\2\2\u00c1\31\3\2\2\2"+
		"\u00c2\u00c3\t\3\2\2\u00c3\33\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5\35\3\2"+
		"\2\2\u00c6\u00c9\5 \21\2\u00c7\u00c8\7\61\2\2\u00c8\u00ca\5$\23\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\37\3\2\2\2\u00cb\u00d0\t\4\2"+
		"\2\u00cc\u00cd\7\64\2\2\u00cd\u00cf\5\"\22\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1!\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4#\3\2\2\2\u00d5\u00d8\t"+
		"\6\2\2\u00d6\u00d7\7\64\2\2\u00d7\u00d9\t\7\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9%\3\2\2\2\u00da\u00db\6\24\2\2\u00db\u00e0\7\177\2"+
		"\2\u00dc\u00dd\7\61\2\2\u00dd\u00df\5(\25\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\'\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4\u00e5\7\62\2\2\u00e5"+
		"\u00e6\7~\2\2\u00e6\u00e7\7\62\2\2\u00e7\u00e8\5*\26\2\u00e8)\3\2\2\2"+
		"\u00e9\u00ea\t\b\2\2\u00ea+\3\2\2\2\u00eb\u00ec\t\t\2\2\u00ec-\3\2\2\2"+
		"\u00ed\u00ee\7|\2\2\u00ee/\3\2\2\2\u00ef\u00f1\t\n\2\2\u00f0\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\61\3\2\2\2\u00f4\u0106\7V\2\2\u00f5\u0106\7\61\2\2\u00f6\u0106\7\u0082"+
		"\2\2\u00f7\u0106\7}\2\2\u00f8\u0106\7~\2\2\u00f9\u0106\7\177\2\2\u00fa"+
		"\u0106\7\62\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\7\u0082\2\2\u00fd\u0106"+
		"\7\24\2\2\u00fe\u0100\7\30\2\2\u00ff\u0101\t\13\2\2\u0100\u00ff\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0106\7\17\2\2\u0105\u00f4\3\2\2\2\u0105\u00f5\3\2\2\2"+
		"\u0105\u00f6\3\2\2\2\u0105\u00f7\3\2\2\2\u0105\u00f8\3\2\2\2\u0105\u00f9"+
		"\3\2\2\2\u0105\u00fa\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fe\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\63\3\2\2"+
		"\2\u0109\u010a\7\6\2\2\u010a\u010b\7\u0082\2\2\u010b\u010c\7\u0082\2\2"+
		"\u010c\u010d\7\24\2\2\u010d\65\3\2\2\2\u010e\u0110\7\177\2\2\u010f\u0111"+
		"\58\35\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\67\3\2\2\2\u0114\u0115\5:\36\2\u0115\u0116\7\177"+
		"\2\2\u0116\u0117\7\27\2\2\u0117\u0118\5<\37\2\u0118\u0119\7\20\2\2\u0119"+
		"\u011a\5> \2\u011a\u0122\3\2\2\2\u011b\u011c\7\62\2\2\u011c\u011d\5<\37"+
		"\2\u011d\u011e\7\20\2\2\u011e\u011f\5> \2\u011f\u0121\3\2\2\2\u0120\u011b"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"9\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\t\f\2\2\u0126;\3\2\2\2\u0127"+
		"\u0128\7\u0082\2\2\u0128=\3\2\2\2\u0129\u012c\7\177\2\2\u012a\u012c\5"+
		"x=\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c?\3\2\2\2\u012d\u0130"+
		"\7\177\2\2\u012e\u012f\7\61\2\2\u012f\u0131\5B\"\2\u0130\u012e\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133A\3"+
		"\2\2\2\u0134\u0135\5D#\2\u0135\u0136\7\62\2\2\u0136\u0137\7\177\2\2\u0137"+
		"\u0138\7\62\2\2\u0138\u0139\7\177\2\2\u0139C\3\2\2\2\u013a\u013f\t\r\2"+
		"\2\u013b\u013c\7\64\2\2\u013c\u013e\t\r\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140E\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\u0142\u0147\7\177\2\2\u0143\u0144\7\62\2\2\u0144"+
		"\u0146\7\177\2\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3"+
		"\2\2\2\u0147\u0148\3\2\2\2\u0148G\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b"+
		"\t\16\2\2\u014b\u014c\7\61\2\2\u014c\u014d\t\16\2\2\u014d\u014e\7\61\2"+
		"\2\u014e\u014f\t\16\2\2\u014fI\3\2\2\2\u0150\u0151\7\60\2\2\u0151\u0152"+
		"\7\177\2\2\u0152\u0153\b&\1\2\u0153K\3\2\2\2\u0154\u0156\5N(\2\u0155\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"M\3\2\2\2\u0159\u015a\7\177\2\2\u015a\u015b\7\177\2\2\u015b\u015c\7\r"+
		"\2\2\u015c\u015d\5P)\2\u015d\u015e\5z>\2\u015e\u015f\5|?\2\u015f\u0160"+
		"\7\r\2\2\u0160O\3\2\2\2\u0161\u0166\5R*\2\u0162\u0163\7\62\2\2\u0163\u0165"+
		"\5R*\2\u0164\u0162\3\2\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167Q\3\2\2\2\u0168\u0166\3\2\2\2\u0169\u016c\5V,\2\u016a"+
		"\u016c\5T+\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cS\3\2\2\2\u016d"+
		"\u016e\t\17\2\2\u016e\u016f\b+\1\2\u016fU\3\2\2\2\u0170\u0171\6,\3\2\u0171"+
		"\u0173\5X-\2\u0172\u0174\5Z.\2\u0173\u0172\3\2\2\2\u0173\u0174\3\2\2\2"+
		"\u0174\u017a\3\2\2\2\u0175\u0177\5\\/\2\u0176\u0178\5Z.\2\u0177\u0176"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0170\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u017aW\3\2\2\2\u017b\u017c\6-\4\2\u017c\u017f\5j\66\2\u017d"+
		"\u017f\5r:\2\u017e\u017b\3\2\2\2\u017e\u017d\3\2\2\2\u017fY\3\2\2\2\u0180"+
		"\u018b\7\61\2\2\u0181\u0183\t\16\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3"+
		"\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7+\2\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0189\7\7\2\2\u0188\u0187\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u018c\7{\2\2\u018b"+
		"\u0182\3\2\2\2\u018b\u018a\3\2\2\2\u018c[\3\2\2\2\u018d\u018e\5^\60\2"+
		"\u018e\u018f\b/\1\2\u018f]\3\2\2\2\u0190\u0195\5`\61\2\u0191\u0194\7\7"+
		"\2\2\u0192\u0194\5h\65\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\b\60\1\2\u0199_\3\2\2\2\u019a\u019b"+
		"\6\61\5\2\u019b\u01a0\5d\63\2\u019c\u019d\6\61\6\2\u019d\u01a0\5f\64\2"+
		"\u019e\u01a0\5b\62\2\u019f\u019a\3\2\2\2\u019f\u019c\3\2\2\2\u019f\u019e"+
		"\3\2\2\2\u01a0a\3\2\2\2\u01a1\u01a2\7\u0082\2\2\u01a2\u01a3\b\62\1\2\u01a3"+
		"c\3\2\2\2\u01a4\u01a5\7\u0082\2\2\u01a5\u01a6\b\63\1\2\u01a6e\3\2\2\2"+
		"\u01a7\u01a8\7\u0082\2\2\u01a8\u01a9\b\64\1\2\u01a9g\3\2\2\2\u01aa\u01ab"+
		"\7!\2\2\u01ab\u01ac\7\177\2\2\u01aci\3\2\2\2\u01ad\u01ae\5l\67\2\u01ae"+
		"k\3\2\2\2\u01af\u01b0\5n8\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\5p9\2\u01b2"+
		"\u01b3\b\67\1\2\u01b3m\3\2\2\2\u01b4\u01b5\7\u0082\2\2\u01b5o\3\2\2\2"+
		"\u01b6\u01b7\t\20\2\2\u01b7q\3\2\2\2\u01b8\u01b9\5t;\2\u01b9\u01ba\b:"+
		"\1\2\u01bas\3\2\2\2\u01bb\u01bc\7}\2\2\u01bcu\3\2\2\2\u01bd\u01be\5\30"+
		"\r\2\u01be\u01bf\7\64\2\2\u01bf\u01c0\5&\24\2\u01c0\u01c1\7\64\2\2\u01c1"+
		"\u01c2\7\30\2\2\u01c2\u01c3\7\177\2\2\u01c3\u01c4\7\62\2\2\u01c4\u01c5"+
		"\7\177\2\2\u01c5\u01c6\7\17\2\2\u01c6w\3\2\2\2\u01c7\u01c8\6=\7\2\u01c8"+
		"\u01c9\t\16\2\2\u01c9\u01ca\7\61\2\2\u01ca\u01cb\t\16\2\2\u01cby\3\2\2"+
		"\2\u01cc\u01cd\5x=\2\u01cd\u01ce\b>\1\2\u01ce{\3\2\2\2\u01cf\u01d0\7\177"+
		"\2\2\u01d0}\3\2\2\2\u01d1\u01d2\7}\2\2\u01d2\u01d3\7\61\2\2\u01d3\u01d4"+
		"\5\n\6\2\u01d4\u01d5\7\64\2\2\u01d5\u01d6\5&\24\2\u01d6\u01d7\7\61\2\2"+
		"\u01d7\u01d8\t\21\2\2\u01d8\u01d9\7\61\2\2\u01d9\u01de\7\177\2\2\u01da"+
		"\u01db\7\62\2\2\u01db\u01dd\5~@\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2"+
		"\2\2\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\177\3\2\2\2\u01e0\u01de"+
		"\3\2\2\2\"\u0083\u00a0\u00b8\u00c9\u00d0\u00d8\u00e0\u00f2\u0102\u0105"+
		"\u0107\u0112\u0122\u012b\u0132\u013f\u0147\u0157\u0166\u016b\u0173\u0177"+
		"\u0179\u017e\u0182\u0185\u0188\u018b\u0193\u0195\u019f\u01de";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}