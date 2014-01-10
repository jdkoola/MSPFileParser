grammar NISTsimplifiedParser;

@header {
         import java.util.*;
}

@parser::members {
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

         }
         
          

mspFile : peptideSpectraMatch+;
peptideSpectraMatch locals [
    List<IonData> peaks = new ArrayList<IonData>(50),
    String peptideString,
    float parentMass,
    float parentMZ,
    int parentCharge,
    byte numAminoAcids,
    int nRepsInConsensus,
    String proteinNameString
    
] 
@after {
    if ($nRepsInConsensus >= MIN_SPECTRA_FOR_CONSENSUS)
        allSpectra.add(new PSM($peaks, $peptideString, $parentMass, $parentMZ, 
                               $parentCharge, $numAminoAcids, $nRepsInConsensus, $proteinNameString));
} 
  : peptideName peptideWeight comment numPeaks peakData 
;


peptideName : 'Name:' peptideSequence '/' chargeState 
{
    peakDataSection = false;
    $peptideSpectraMatch::peptideString = $peptideSequence.text;

};
peptideSequence : PEPTIDESTRING;
chargeState : NUMBER {$peptideSpectraMatch::parentCharge = $NUMBER.int;};
peptideWeight: 'MW:' molecularWeight;
molecularWeight : NUMBER {$peptideSpectraMatch::parentMass = Float.parseFloat($NUMBER.text);};

comment : 'Comment:' keyValuePair+;
keyValuePair

  : key '=' keyValue
  
{
    switch($key.start.getType()) {
      case NUMBER_AMINO_ACIDS:
        // we're going to get number of amino acids, should be of form: "Naa=17"
        // this assumes that the keyValue is an integer; if it isn't Java will throw
        // an exception!
        $peptideSpectraMatch::numAminoAcids = (byte)Integer.parseInt($keyValue.text);
        break;
      case PARENT_MZ:
        $peptideSpectraMatch::parentMZ = Float.parseFloat($keyValue.text);
        break;
      case NREPS:
        $peptideSpectraMatch::nRepsInConsensus = Integer.parseInt($keyValue.ctx.ratio().NUMBER(0).getText());
        break;
      case PROTEIN_NAME:
        $peptideSpectraMatch::proteinNameString = $keyValue.text;
        break;
    }
};

/* tokens */
NAME: 'Name:';
MW: 'MW:';
COMMENT: 'Comment:';
NPEAKS: 'Num peaks:';
SLASH: '/';
COMMA: ',';
HYPHEN: '-';
UNDERSCORE: '_';

OXIDIZEDMETHIONINE : 'M(O)';

/* PEPTIDE CLASS TOKENS */
TRYPTIC : 'Tryptic';
SEMI_C : 'C-Semitryp';
SEMI_N : 'N-Semitryp';
INSOURCE : 'insource';
INSAMPLE : 'insample';
INOTHERPEP : 'inotherpep';
CONFIRMED : 'confirmed';
UNCONFIRMED : 'unconfirmed';
IRREG : 'irreg';
MISSGOOD : 'miss_good';
MISSBAD : 'miss_bad';
OK : 'ok';

/* END: PEPTIDE CLASS TOKENS */

/* DATABASE NAMES */

IPI : 'IPI';

/* END DATABASE NAMES */


/* UNIPROT TOKENS */

UNIPROT_SP : 'sp';
UNIPROT_TR : 'tr';
// SWISSPROT : 'SWISS-PROT';
CHICK : 'CHICK';
ECOLI : 'ECOLI';
BOVINE : 'BOVIN';
HUMAN : 'HUMAN';
MOUSE : 'MOUSE';
HORSE : 'HORSE';
YEAST : 'YEAST';
RAT : 'RAT';

/* END UNIPROT TOKENS */

Spec : 'Spec';
Pep : 'Pep';
Fullname : 'Fullname';
Mods : 'Mods';
PARENT_MZ : 'Parent';
Inst : 'Inst';

MzExact : 'Mz_exact';
MzDiff : 'Mz_diff';
Mz_av : 'Mz_av';
PROTEIN_NAME : 'Protein';
Pseq : 'Pseq';
Organism : 'Organism';
Se : 'Se';

Sample : 'Sample';
NREPS : 'Nreps';
Missing : 'Missing';
ParentMed : 'Parent_med';
Max2medOrig : 'Max2med_orig';

Dotfull : 'Dotfull';
DotCons : 'Dot_cons';
UnassignAll : 'Unassign_all';
Unassigned : 'Unassigned';

Dotbest : 'Dotbest';
Flags : 'Flags';
NUMBER_AMINO_ACIDS : 'Naa';
DUScorr : 'DUScorr';
Dottheory : 'Dottheory';

Pfin : 'Pfin';
Probcorr : 'Probcorr';
Tfratio : 'Tfratio';
Pfract : 'Pfract';

Oxidation : 'Oxidation';
Carbamidomethyl : 'Carbamidomethyl';
ICATLight : 'ICAT_light';

ICATHeavy : 'ICAT_heavy';
ABOldICATd0 : 'AB_old_ICATd0';
ABOldICATd8 : 'AB_old_ICATd8';

Acetyl : 'Acetyl';
Deamidation : 'Deamidation';
PyroCmC : 'Pyro-cmC';
PyroGlu : 'Pyro-glu';

Pyro_glu : 'Pyro_glu';
Amide : 'Amide';
Phospho : 'Phospho';
Methyl : 'Methyl';

Carbamyl : 'Carbamyl';
ZeroI : '0i';
/* END OF TOKENS */

key : k=( 'Hom' | 'Spec' | 'Pep' | 'Fullname' | 'Mods' | PARENT_MZ | 'Inst' |
        'Mz_exact' | 'Mz_diff' | 'Mz_av'| PROTEIN_NAME| 'Pseq' | 'Organism' | 'Se' | 
        'Sample' | NREPS |  'Missing' | 'Parent_med' | 'Max2med_orig' | 
        'Dotfull' | 'Dot_cons' | 'Unassign_all' | 'Unassigned' | 
        'Dotbest' | 'Flags' | NUMBER_AMINO_ACIDS | 'DUScorr' | 'Dottheory' | 
        'Pfin' | 'Hipks_removed' |  'Probcorr' | 'Tfratio' | 'Pfract' | 'PrePep' | 
        'Unassigned_corrected' ) 
        { if ($k.text.equals("Mods")) { 
            // System.out.println("FOUND MODS STR.");
            inModSpec = true;
          }else if ($k.text.equals("Sample")) { 
            inSampleSpec = true;
          }
          else if ($k.text.equals("Nreps")) {
            inNreps = true;
          }
          else { 
              inModSpec = false;
              inNreps = false;
              inSampleSpec = false;
          };
        };
keyValue 
         :  NUMBER | STRINGLITERAL | ratio | proteinID |
            fullNameStr | modStr | organismName | searchSummary |
            sampleSpaceDescript |  flagsDescript | peptideClass |
            duScorrDescript | homologousPeptideMatch | prePepSummary; 


fullNameStr : leftFlankingAA '.' PEPTIDESTRING '.' rightFlankingAA '/' NUMBER;
leftFlankingAA :(AA | '-'); 
rightFlankingAA : (AA | '-'); 
peptideClass : terminusDescription ('/' missedClevageDescription)?;
terminusDescription : (TRYPTIC | SEMI_C | SEMI_N) ('_' terminusModifiers)*;
terminusModifiers : INSOURCE | INOTHERPEP | CONFIRMED | INSAMPLE |  UNCONFIRMED | IRREG | OK;
missedClevageDescription : (MISSGOOD | MISSBAD) ('_' (CONFIRMED | UNCONFIRMED))?;

modStr :  {!inNreps}? NUMBER ('/' modIdentifier)*; 
modIdentifier : NUMBER ',' AA ',' modName;
modName : ( 'Oxidation' | 'Carbamidomethyl' | 'ICAT_light' | 
            'ICAT_heavy' | 'AB_old_ICATd0' | 'AB_old_ICATd8' |
            'Acetyl' | 'Deamidation' | 'Pyro-cmC' | 'Pyro-glu' |
            'Pyro_glu' | 'Amide' | 'Phospho' | 'Methyl' | 
            'Carbamyl' | 'Glu->pyro-Glu' | 'Gln->pyro-Glu' | 'Pyro-carbamidomethyl' );
organismName : ( '"Protein"'  | '"human"' | '"c_elegans"' |
                 '"drosophila"' | '"e_coli"' | '"mouse"' |
                 '"rat"' | '"yeast"' | '"chicken"' );


// proteinID : '"' databaseDescript proteinName scientificOrganismName? '"';
proteinID : QUOTEDSTRINGLITERAL;
//databaseDescript : (fastaDatabase  | swissProt | sigmaDatabase | ensemblDatabase 
//                   | ipiDatabase | refSeqDatabase) ('|' databaseDescript);
databaseDescript : (PEPTIDESTRING | STRINGLITERAL | ':' | '|' | '_' | NUMBER )+;


proteinName : ('Protein' | '/' |  STRINGLITERAL | PEPTIDESTRING | AA | NUMBER | ',' 
                         | '[' STRINGLITERAL ']' | '(' (AA | '+' | STRINGLITERAL | PEPTIDESTRING)+ ')')+;
scientificOrganismName : '[' STRINGLITERAL STRINGLITERAL']';

searchSummary : NUMBER searchEngineResults+;
searchEngineResults :  searchEngineName NUMBER ':' 
                        (searchEngineTags '=' searchEngineResult)
                        (',' searchEngineTags '=' searchEngineResult)*;
searchEngineName : ('^M' | '^O' | '^S' | '^X' | '^I' | '^P' | '^C'  );


searchEngineTags : tag = STRINGLITERAL; //  { {System.out.println("Line: " + $tag.line + "FOUND SEARCH ENGINE TAG: " + $tag.text);} ; };
                      
searchEngineResult : ( NUMBER | ratio );
sampleSpaceDescript : NUMBER ('/' sampleCode)+;
// sampleCode : sampleName ',' NUMBER ',' NUMBER;
sampleCode : sampleName ',' NUMBER ',' NUMBER;
sampleName : (NUMBER | STRINGLITERAL) ('_' (NUMBER | STRINGLITERAL))*;
// sampleName : (NUMBER | STRINGLITERAL) '_'? sampleName*;
// nrepsDescript : ratio;
flagsDescript : NUMBER (',' NUMBER)*;
duScorrDescript : (NUMBER|NUMBER) '/' 
                  (NUMBER|NUMBER) '/' 
                  (NUMBER|NUMBER);


numPeaks : 'Num peaks:' NUMBER {
            peakDataSection = true; 
            // System.out.println("SETTING PEAK DATA SECTION: " + peakDataSection);
        };

peakData : peak+;
peak locals [
    List<IonData> correspondingIons = new ArrayList<IonData>(3),
    int numSpectraUsedForConsensus,
    int numSpectraWithIon
    
]
@after {
// add all our peaks to the master peak list for this Peptide Spectra Match
    /*Iterator<IonData> it = $correspondingIons.iterator();
    while (it.hasNext()) {
        IonData iData = (IonData)it.next(); */
    for(IonData iData :$correspondingIons) {  
         if ($numSpectraUsedForConsensus <  MIN_SPECTRA_FOR_CONSENSUS)
            continue;
        
        iData.mz = Float.parseFloat($mz.text);
        iData.peakStrength = Integer.parseInt($abundance.text);
        iData.numSpectraUsedForConsensus = $numSpectraUsedForConsensus;
        iData.numSpectraWithIon = $numSpectraWithIon;
        $peptideSpectraMatch::peaks.add(iData);
    }
}: mz=NUMBER abundance=NUMBER '"' ions concensusSpectraNumMatch concensusSpectraDeviation '"'
;

ions : ionDescription (',' ionDescription)*;

ionDescription locals 
[  IonData id ] 
@init  { $id = new IonData(); }
@after { $peak::correspondingIons.add($id); }
   : assignableIon | unknownIon ;

unknownIon : ('?' | '?i' | '?*' | '?*i') 
    { 
        $ionDescription::id.ionType = IonType.UNKNOWN_ION; 
        $ionDescription::id.ionName = new String($text);
        if ($text.charAt($text.length()-1) == 'i') {
            // if 'i' is present this was a heavy ion so we set the flag
            $ionDescription::id.heavy = true;

        }
     } ;

assignableIon :
                {getCurrentToken().getText().charAt(0) == 'I'}?  immoniumOrInternalIon  mzPeakTheoreticalDiff?           
              | knownIon mzPeakTheoreticalDiff? 
              ;

immoniumOrInternalIon : {getCurrentToken().getText().contains("Int")}? internalIon 
                        | immoniumIon
                        ;
              
mzPeakTheoreticalDiff 
@after {
    if ($isHeavy != null) {
        // check if this token was there, if so this was a heavy ion
        // the MSP file syntax is weird and sticks the 'i' in different places depending
        // on what kind of ion it is
        $ionDescription::id.heavy = true;
    }
}
   : '/' (((NUMBER|NUMBER)? isHeavy='i'? '*'?) | '0i') ;

knownIon : ionData 
  {
    char[] ionNameCharArray = $ionDescription::id.ionName.toCharArray();
    switch (ionNameCharArray[0]) {
        case 'b':
            $ionDescription::id.ionType = IonType.B_ION;        
            break;
        case 'y':
            $ionDescription::id.ionType = IonType.Y_ION;        
            break;
        case 'a':
            $ionDescription::id.ionType = IonType.A_ION;
            break;
        case 'p':
            $ionDescription::id.ionType = IonType.P_ION;
            break;
        case 'I':
            // this is a bug, we shouldn't be here but for some reason
            // the parser will interpret heavy immonium ions as regular
            // ions, e.g. IQDx, IWGx, IRAi, etc.
            $ionDescription::id.ionType = IonType.IMMONIUM_ION;            
            break;
        default:
            $ionDescription::id.ionType = IonType.ERROR;
            System.err.println("Found 'known ion' that could not be processed: " + ionNameCharArray);
            // throw new IllegalArgumentException("Ion type is unknown: " + $text);
    }
    if (ionNameCharArray[ionNameCharArray.length-1] == 'i') {
        // this is a heavy ion, so we set the flag
        $ionDescription::id.heavy = true;
    }
    
  };
ionData : ionName ('*' | fragmentChargeState)* 
  {
    $ionDescription::id.chargeState = $fragmentChargeState.ctx != null
                                        ? Integer.parseInt($fragmentChargeState.text.substring(1)) 
                                        : 1;
  };
ionName : {getCurrentToken().getText().contains("-")}? neutralLossIon |
          {getCurrentToken().getText().contains("+")}? neutralGainIon |
                                                       nonLossIon ;
nonLossIon     :  STRINGLITERAL 
    {
      $ionDescription::id.ionName = new String($text); 
      int length = $text.length();
      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
      // up until the end (if it isn't a heavy ion) or the end-1 if it is a heavy ion
      // i.e. there's a 'i' at the end of the name
        String fullIonName = $text;
        int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
        // String integerPart = $text.substring(1, length - 1 - ($text.charAt(length-1) == 'i' ? 1 : 0));
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
        $ionDescription::id.ionPosition = (byte) positionOfIonInSequence;
        
    }; 
neutralLossIon : STRINGLITERAL  
    {
      $ionDescription::id.ionName = new String($text); 
      $ionDescription::id.lossIon = true;

      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
      // up until the '-'
      String fullIonName = $text;
      int minusSignPosition   = fullIonName.indexOf('-');
      String integerPart = fullIonName.substring(1, minusSignPosition );
      // if the "integer part" of our ion name is empty, then we will assign the position as 0
      // the most common case where this happens is when we have just the parent ion 'p'
        try {
            $ionDescription::id.ionPosition = (!integerPart.isEmpty()) ? (byte)Integer.parseInt(integerPart) : 0;
            int length = fullIonName.length();
            int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
            $ionDescription::id.neutralFragmentMass = Integer.parseInt(fullIonName.substring(minusSignPosition+1, subStringEnd));
        } catch (NumberFormatException e) {
            System.err.println("Could not process ion position: " + fullIonName + " : " + e);
        }
      
    }; 
neutralGainIon : STRINGLITERAL  
    {
      $ionDescription::id.ionName = new String($text); 
      $ionDescription::id.gainIon = true;
      // the substring we want is from position 1, i.e. skip the 'b', 'y', etc. part
      // up until the '+'
      String fullIonName = $text;
      int plusSignPosition   = fullIonName.indexOf('+');      
      String integerPart = fullIonName.substring(1, plusSignPosition);
      // if the "integer part" of our ion name is empty, then we will assign the position as 0
      // the most common case where this happens is when we have just the parent ion 'p'        
        try {
            $ionDescription::id.ionPosition = (!integerPart.isEmpty()) ? (byte)Integer.parseInt(integerPart) : 0;
            int length = fullIonName.length();
            int subStringEnd   = length -  (fullIonName.charAt(length-1) == 'i' ? 1 : 0);
            $ionDescription::id.neutralFragmentMass = Integer.parseInt(fullIonName.substring(plusSignPosition+1, subStringEnd));            
        } catch (NumberFormatException e) {
            System.err.println("Could not process ion position: " + $text + " : " + e);            
        }
    }; 
fragmentChargeState : '^' NUMBER;

         

internalIon: internalIonDescript;
internalIonDescript : internalIonName '/' internalIonSequence
    {
       $ionDescription::id.ionName = new String($internalIonSequence.text);
       $ionDescription::id.ionType = IonType.INTERNAL_ION;
       
       // remember there's an off by 1 error, an ion Position of '0' is reserved for the parent ion
       int ionPosition = $peptideSpectraMatch::peptideString.indexOf($internalIonSequence.text) + 1;
       $ionDescription::id.ionPosition = (byte)ionPosition;
    };
internalIonName : STRINGLITERAL;
internalIonSequence : PEPTIDESTRING | STRINGLITERAL ;

immoniumIon : immoniumIonName
    {
      $ionDescription::id.ionName = new String($immoniumIonName.text);
      $ionDescription::id.ionType = IonType.IMMONIUM_ION;
      
      // note we don't try to set the peptide position for an immonium ion,
      // we just leave it at the default value of -1
    };
immoniumIonName : PEPTIDESTRING;

prePepSummary : fullNameStr '_' modStr '_' '(' NUMBER ',' NUMBER ')';

ratio : {!inModSpec}? ( NUMBER | NUMBER ) '/' (NUMBER | NUMBER );

concensusSpectraNumMatch : ratio          // num spectra where this peak was found
  {
    $peak::numSpectraUsedForConsensus = Integer.parseInt($ratio.ctx.NUMBER(0).getText());
    $peak::numSpectraWithIon = Integer.parseInt($ratio.ctx.NUMBER(1).getText());
   
  };
concensusSpectraDeviation: NUMBER;   // the median deviation of m/z of all the concensus spectra
                                           // used for this assignment

homologousPeptideMatch : PEPTIDESTRING '/' chargeState '_' modStr '/' ('SameProtein' | 'DiffProtein')
                         '/' NUMBER (',' homologousPeptideMatch)*;




QUOTEDSTRINGLITERAL : {_tokenStartCharPositionInLine >20}? '"' ~["\r\n]+? '"';

PEPTIDESTRING : AA AA+;

AA : [A-Z] | 'M(O)';


NUMBER : SIGN? 
         (INTLITERAL | FLOATLITERAL);

FLOATLITERAL :                               // '.' DIGIT | ('-'? DIGIT+ ('.' DIGIT+)? EXPONENT?) | DIGIT '.';
        FRACTIONALCONSTANT EXPONENT?
    |   INTLITERAL EXPONENT;

fragment FRACTIONALCONSTANT 
    : INTLITERAL? '.' INTLITERAL
    | INTLITERAL '.';

INTLITERAL : DIGIT+;
fragment DIGIT : [0-9];
fragment EXPONENT : 'e' SIGN? INTLITERAL;
fragment SIGN : '+' | '-';


STRINGLITERAL : ( CHAR | '-' | '+' | DIGIT  )+;
fragment CHAR : [A-Za-z];

WS : [ \t]+ 
     -> skip;
NEWLINE : ( '\r' '\n'? 
          | '\n'
          ) 
          -> skip;

