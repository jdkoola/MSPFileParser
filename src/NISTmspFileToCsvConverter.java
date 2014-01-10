
import java.io.*;
import org.antlr.v4.runtime.*;
import java.util.*;

// "chicken_consensus_final_true_lib.msp" "chicken_consensus_final_true_lib_parser.output"
// "yeast_consensus_final_true_lib_byparts-0.msp" "yeast_consensus_final_true_lib_byparts-0-output.csv"
// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/one-peptide-b2mg.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/one-peptide-b2mg-output.csv"
// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/seven-peptide-b2mg.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/seven-peptide-b2mg-output.csv"
// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/chicken_consensus_final_true_lib.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/chicken_consensus_final_true_lib-output.csv"
// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/yeast/yeast_consensus_final_true_lib_byparts-15.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/yeast/yeast_consensus_final_true_lib_byparts-15.parser.csv"
// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/yeast/yeast_consensus_final_true_lib_byparts-16.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/yeast/yeast_consensus_final_true_lib_byparts-16.parser.csv"

// "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/sigmaups/sigmaups1_consensus_final_true_lib.msp" "/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/sigmaups/sigmaups1_consensus_final_true_lib.parser.csv"
public class NISTmspFileToCsvConverter {

    private static final String[] mspTestFiles = new String[]{
       // "3000-peptide-yeast0.msp",
       //  "seven-peptide-b2mg.msp",
       //  "one-peptide-chicken.msp", 
    //    "human_b2mg_consensus_final_true_lib.msp"
     //       "one-peptide-immonium-with-unknown-isotope.msp"
     //   "chicken_consensus_final_true_lib.msp"
    };
    private static String mspTestFileBaseName = // "yeast_consensus_final_true_lib_byparts-";
                                                "seven-peptide-b2mg.msp";
    private static void writeOutput(BufferedWriter writer, String output) throws IOException {
        if (writer != null)
            writer.write(output);
        else
            System.out.print( output);
    }
    
    static String[] columnHeaders = {"ION_TYPE", "BOND_POSITION", "PEAK_MZ", "PEAK_STRENGTH", 
                                     "NUM_SPECTRA_WITH_ION",  "NUM_SPECTRA_IN_CONSENSUS", "ION_CHARGE",
                                     "LEFT_AA", "RIGHT_AA",
                                      "P_CHARGE", "P_NAA",  "P_MASS", "P_MZ" , "PROTEIN_NAME"};
    final static int NUM_COLUMNS_IN_DATA_MATRIX = columnHeaders.length;
    final static int NUM_IONS_MODELED = 9;
    public static void main(String[] args) throws Exception {
        BufferedWriter writer = null;
     
        try {
            // FIRST ARGUMENT IS THE INPUT FILE
            // SECOND ARGUMENT IS THE OUTPUT FILE
            
            String mspFileDirectory = 
                    "C:\\Users\\koolajd\\Documents\\NetBeansProjects\\MSP File Parser\\MSP Files\\";
                                     
            
            if (args.length > 1) {
                 writer = new BufferedWriter(new FileWriter(args[1]));                   
            }
            else {
                writer = new BufferedWriter(new FileWriter(mspFileDirectory + mspTestFileBaseName + "-output.csv"));
            }

            // int numRuns = 31; // args.length > 0 ? 1 : mspTestFiles.length;
            int numRuns = 1;
            for (int j=0;j<(columnHeaders.length-1);j++) {
                writeOutput(writer, columnHeaders[j] + ",");
            };
            writeOutput(writer, columnHeaders[columnHeaders.length-1]); // dont put a comma after the last one
               writeOutput(writer, "\n");
            for (int i = 0; i < numRuns; i++) {
                String mspFilePath;
                if (args.length > 0) {
                    mspFilePath = args[0];
                }
                else {
                    mspFilePath =mspFileDirectory + mspTestFileBaseName;
                }
                // mspFilePath = // mspFileDirectory + mspTestFileBaseName + i + ".msp";
                              // mspFileDirectory + mspTestFileBaseName;
                System.err.println("PROCESSING: " + mspFilePath);
                ANTLRFileStream inputFile = new ANTLRFileStream(mspFilePath);
                NISTsimplifiedParserLexer lexer = new NISTsimplifiedParserLexer((CharStream) inputFile);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                NISTsimplifiedParserParser parser = new NISTsimplifiedParserParser(tokens); 
                parser.MIN_SPECTRA_FOR_CONSENSUS = 0;
                NISTsimplifiedParserParser.MspFileContext rootNode = parser.mspFile();    
                



                for (NISTsimplifiedParserParser.PSM psm : parser.allSpectra) {  
                   //     writeOutput(writer, "PEPTIDE: " + psm.peptideSequence  + ", LENGTH: " + psm.numAminoAcids);
                   // writeOutput (writer, "B IONS: " +  psm.bIons() + "\n");
                    for (NISTsimplifiedParserParser.IonData id : psm.peakList ) {
                        int fragmentSize = id.neutralFragmentMass;
                        if (id.ionPosition > 0 && id.ionType != NISTsimplifiedParserParser.IonType.INTERNAL_ION &&
                                (fragmentSize == -1 || fragmentSize == NISTsimplifiedParserParser.PSM.AMMONIA_FRAGMENT_MASS ||
                                fragmentSize == NISTsimplifiedParserParser.PSM.WATER_FRAGMENT_MASS))
                            writeOutput(writer, buildTableRowByIon(id, psm) + "\n");
                    };
                   
//                    boolean[][] ionsAtPosition = new boolean[psm.numAminoAcids-1][NUM_IONS_MODELED];
//                    char[][] flankingAAatPosition = new char[psm.numAminoAcids-1][2];
//                    buildTableOfIonsByPosition(psm, flankingAAatPosition, ionsAtPosition);
//                    writeTableIonsByPosition(psm, writer, ionsAtPosition, flankingAAatPosition);                    
                }
                writeOutput(writer, "NUM SPECTRA: " + parser.allSpectra.size());
            }

        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        if (writer != null)
            writer.close();

    }
    private static String buildTableRowByIon(NISTsimplifiedParserParser.IonData id,
                                              NISTsimplifiedParserParser.PSM psm) {
        String ionName;
        switch(id.neutralFragmentMass) {
            case -1:
                ionName = id.ionType.toString();
                break;
            case 17:
            case 18:
                ionName = String.format("%s_%d", id.ionType.toString(), id.neutralFragmentMass);
                break;
            default:
                ionName = "ERROR";
        }
        return String.format("%s,%d,%f, %d,%d, %d, %d, %c,%c,%d,%d, %f,%f, %s", ionName, id.ionPosition, id.mz, id.peakStrength,
                   id.numSpectraWithIon, id.numSpectraUsedForConsensus,  id.chargeState,
                   psm.getLeftFlankingAAatPosition(id.ionPosition), psm.getRightFlankingAAatPosition(id.ionPosition),
                   psm.parentCharge, psm.numAminoAcids , psm.parentMass, psm.parentMZ, psm.proteinName);
                
    }

    private static void buildTableOfIonsByPosition(NISTsimplifiedParserParser.PSM psm, char[][] flankingAAatPosition, boolean[][] ionsAtPosition) {
        for (int j = 1; j<psm.numAminoAcids;j++) {
          
          flankingAAatPosition[j-1][0] = psm.getLeftFlankingAAatPosition(j); 
          
          flankingAAatPosition[j-1][1] = psm.getRightFlankingAAatPosition(j);
          List<NISTsimplifiedParserParser.IonData> ionsAtPos = psm.getIonsByPosition(j);
          
          ionsAtPosition[j-1][0] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.B_ION,
                                                                               -1,
                                                                               ionsAtPos);
          ionsAtPosition[j-1][1] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.Y_ION,
                                                                               -1,
                                                                               ionsAtPos);                      
          ionsAtPosition[j-1][2] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.A_ION,
                                                                               -1,
                                                                               ionsAtPos);   
          ionsAtPosition[j-1][3] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.B_ION,
                                                   NISTsimplifiedParserParser.PSM.WATER_FRAGMENT_MASS,
                                                   ionsAtPos);                        
          ionsAtPosition[j-1][4] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.Y_ION,
                                                   NISTsimplifiedParserParser.PSM.WATER_FRAGMENT_MASS,
                                                   ionsAtPos);                        
          ionsAtPosition[j-1][5] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.A_ION,
                                                   NISTsimplifiedParserParser.PSM.WATER_FRAGMENT_MASS,
                                                   ionsAtPos);   
          ionsAtPosition[j-1][6] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.B_ION,
                                                   NISTsimplifiedParserParser.PSM.AMMONIA_FRAGMENT_MASS,
                                                   ionsAtPos);   
          ionsAtPosition[j-1][7] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.B_ION,
                                                   NISTsimplifiedParserParser.PSM.AMMONIA_FRAGMENT_MASS,
                                                   ionsAtPos);                        
          ionsAtPosition[j-1][8] = 
                  psm.listContainsIonOfTypeAndLoss(NISTsimplifiedParserParser.IonType.B_ION,
                                                   NISTsimplifiedParserParser.PSM.AMMONIA_FRAGMENT_MASS,
                                                   ionsAtPos);  
          
        };
    }

    private static void writeTableIonsByPosition(NISTsimplifiedParserParser.PSM psm, BufferedWriter writer, boolean[][] ionsAtPosition, char[][] flankingAAatPosition) throws IOException {
        for (int j=0;j<psm.numAminoAcids-1;j++) {
          //  writeOutput(writer, "[");
            for (int k=0;k<NUM_IONS_MODELED;k++) {
               writeOutput(writer, ionsAtPosition[j][k] + ",");
               
            }
            writeOutput(writer, ""+ (j+1));
            writeOutput(writer, "," + flankingAAatPosition[j][0]);
            writeOutput(writer, "," + flankingAAatPosition[j][1]);
            writeOutput(writer, "," + psm.parentCharge);
            int discretizedMass = (int)Math.floor(psm.parentMass/100);
            if (discretizedMass > 100) 
                discretizedMass = 100;
            writeOutput(writer, "," + discretizedMass);
            
            int discretizedMZ = (int)Math.floor(psm.parentMZ/25);
            if (discretizedMZ > 100)
                discretizedMZ = 100;
            writeOutput (writer, "," + discretizedMZ);
            
            writeOutput(writer, "\n");
        }
    }
}
