// Generated from C:\Users\koolajd\Documents\NetBeansProjects\MSP File Parser\src\NISTsimplifiedParser.g4 by ANTLR 4.1

         import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NISTsimplifiedParserParser}.
 */
public interface NISTsimplifiedParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#immoniumOrInternalIon}.
	 * @param ctx the parse tree
	 */
	void enterImmoniumOrInternalIon(@NotNull NISTsimplifiedParserParser.ImmoniumOrInternalIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#immoniumOrInternalIon}.
	 * @param ctx the parse tree
	 */
	void exitImmoniumOrInternalIon(@NotNull NISTsimplifiedParserParser.ImmoniumOrInternalIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#nonLossIon}.
	 * @param ctx the parse tree
	 */
	void enterNonLossIon(@NotNull NISTsimplifiedParserParser.NonLossIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#nonLossIon}.
	 * @param ctx the parse tree
	 */
	void exitNonLossIon(@NotNull NISTsimplifiedParserParser.NonLossIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#fullNameStr}.
	 * @param ctx the parse tree
	 */
	void enterFullNameStr(@NotNull NISTsimplifiedParserParser.FullNameStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#fullNameStr}.
	 * @param ctx the parse tree
	 */
	void exitFullNameStr(@NotNull NISTsimplifiedParserParser.FullNameStrContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peakData}.
	 * @param ctx the parse tree
	 */
	void enterPeakData(@NotNull NISTsimplifiedParserParser.PeakDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peakData}.
	 * @param ctx the parse tree
	 */
	void exitPeakData(@NotNull NISTsimplifiedParserParser.PeakDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#assignableIon}.
	 * @param ctx the parse tree
	 */
	void enterAssignableIon(@NotNull NISTsimplifiedParserParser.AssignableIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#assignableIon}.
	 * @param ctx the parse tree
	 */
	void exitAssignableIon(@NotNull NISTsimplifiedParserParser.AssignableIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#molecularWeight}.
	 * @param ctx the parse tree
	 */
	void enterMolecularWeight(@NotNull NISTsimplifiedParserParser.MolecularWeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#molecularWeight}.
	 * @param ctx the parse tree
	 */
	void exitMolecularWeight(@NotNull NISTsimplifiedParserParser.MolecularWeightContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#ions}.
	 * @param ctx the parse tree
	 */
	void enterIons(@NotNull NISTsimplifiedParserParser.IonsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#ions}.
	 * @param ctx the parse tree
	 */
	void exitIons(@NotNull NISTsimplifiedParserParser.IonsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peptideName}.
	 * @param ctx the parse tree
	 */
	void enterPeptideName(@NotNull NISTsimplifiedParserParser.PeptideNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peptideName}.
	 * @param ctx the parse tree
	 */
	void exitPeptideName(@NotNull NISTsimplifiedParserParser.PeptideNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#prePepSummary}.
	 * @param ctx the parse tree
	 */
	void enterPrePepSummary(@NotNull NISTsimplifiedParserParser.PrePepSummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#prePepSummary}.
	 * @param ctx the parse tree
	 */
	void exitPrePepSummary(@NotNull NISTsimplifiedParserParser.PrePepSummaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peptideSequence}.
	 * @param ctx the parse tree
	 */
	void enterPeptideSequence(@NotNull NISTsimplifiedParserParser.PeptideSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peptideSequence}.
	 * @param ctx the parse tree
	 */
	void exitPeptideSequence(@NotNull NISTsimplifiedParserParser.PeptideSequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#proteinID}.
	 * @param ctx the parse tree
	 */
	void enterProteinID(@NotNull NISTsimplifiedParserParser.ProteinIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#proteinID}.
	 * @param ctx the parse tree
	 */
	void exitProteinID(@NotNull NISTsimplifiedParserParser.ProteinIDContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineResult}.
	 * @param ctx the parse tree
	 */
	void enterSearchEngineResult(@NotNull NISTsimplifiedParserParser.SearchEngineResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineResult}.
	 * @param ctx the parse tree
	 */
	void exitSearchEngineResult(@NotNull NISTsimplifiedParserParser.SearchEngineResultContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#concensusSpectraDeviation}.
	 * @param ctx the parse tree
	 */
	void enterConcensusSpectraDeviation(@NotNull NISTsimplifiedParserParser.ConcensusSpectraDeviationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#concensusSpectraDeviation}.
	 * @param ctx the parse tree
	 */
	void exitConcensusSpectraDeviation(@NotNull NISTsimplifiedParserParser.ConcensusSpectraDeviationContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineName}.
	 * @param ctx the parse tree
	 */
	void enterSearchEngineName(@NotNull NISTsimplifiedParserParser.SearchEngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineName}.
	 * @param ctx the parse tree
	 */
	void exitSearchEngineName(@NotNull NISTsimplifiedParserParser.SearchEngineNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#sampleName}.
	 * @param ctx the parse tree
	 */
	void enterSampleName(@NotNull NISTsimplifiedParserParser.SampleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#sampleName}.
	 * @param ctx the parse tree
	 */
	void exitSampleName(@NotNull NISTsimplifiedParserParser.SampleNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(@NotNull NISTsimplifiedParserParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(@NotNull NISTsimplifiedParserParser.KeyContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#neutralLossIon}.
	 * @param ctx the parse tree
	 */
	void enterNeutralLossIon(@NotNull NISTsimplifiedParserParser.NeutralLossIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#neutralLossIon}.
	 * @param ctx the parse tree
	 */
	void exitNeutralLossIon(@NotNull NISTsimplifiedParserParser.NeutralLossIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#duScorrDescript}.
	 * @param ctx the parse tree
	 */
	void enterDuScorrDescript(@NotNull NISTsimplifiedParserParser.DuScorrDescriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#duScorrDescript}.
	 * @param ctx the parse tree
	 */
	void exitDuScorrDescript(@NotNull NISTsimplifiedParserParser.DuScorrDescriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#internalIonDescript}.
	 * @param ctx the parse tree
	 */
	void enterInternalIonDescript(@NotNull NISTsimplifiedParserParser.InternalIonDescriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#internalIonDescript}.
	 * @param ctx the parse tree
	 */
	void exitInternalIonDescript(@NotNull NISTsimplifiedParserParser.InternalIonDescriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#scientificOrganismName}.
	 * @param ctx the parse tree
	 */
	void enterScientificOrganismName(@NotNull NISTsimplifiedParserParser.ScientificOrganismNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#scientificOrganismName}.
	 * @param ctx the parse tree
	 */
	void exitScientificOrganismName(@NotNull NISTsimplifiedParserParser.ScientificOrganismNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#flagsDescript}.
	 * @param ctx the parse tree
	 */
	void enterFlagsDescript(@NotNull NISTsimplifiedParserParser.FlagsDescriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#flagsDescript}.
	 * @param ctx the parse tree
	 */
	void exitFlagsDescript(@NotNull NISTsimplifiedParserParser.FlagsDescriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#numPeaks}.
	 * @param ctx the parse tree
	 */
	void enterNumPeaks(@NotNull NISTsimplifiedParserParser.NumPeaksContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#numPeaks}.
	 * @param ctx the parse tree
	 */
	void exitNumPeaks(@NotNull NISTsimplifiedParserParser.NumPeaksContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#ratio}.
	 * @param ctx the parse tree
	 */
	void enterRatio(@NotNull NISTsimplifiedParserParser.RatioContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#ratio}.
	 * @param ctx the parse tree
	 */
	void exitRatio(@NotNull NISTsimplifiedParserParser.RatioContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#terminusDescription}.
	 * @param ctx the parse tree
	 */
	void enterTerminusDescription(@NotNull NISTsimplifiedParserParser.TerminusDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#terminusDescription}.
	 * @param ctx the parse tree
	 */
	void exitTerminusDescription(@NotNull NISTsimplifiedParserParser.TerminusDescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#ionDescription}.
	 * @param ctx the parse tree
	 */
	void enterIonDescription(@NotNull NISTsimplifiedParserParser.IonDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#ionDescription}.
	 * @param ctx the parse tree
	 */
	void exitIonDescription(@NotNull NISTsimplifiedParserParser.IonDescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull NISTsimplifiedParserParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull NISTsimplifiedParserParser.CommentContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#sampleSpaceDescript}.
	 * @param ctx the parse tree
	 */
	void enterSampleSpaceDescript(@NotNull NISTsimplifiedParserParser.SampleSpaceDescriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#sampleSpaceDescript}.
	 * @param ctx the parse tree
	 */
	void exitSampleSpaceDescript(@NotNull NISTsimplifiedParserParser.SampleSpaceDescriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#chargeState}.
	 * @param ctx the parse tree
	 */
	void enterChargeState(@NotNull NISTsimplifiedParserParser.ChargeStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#chargeState}.
	 * @param ctx the parse tree
	 */
	void exitChargeState(@NotNull NISTsimplifiedParserParser.ChargeStateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(@NotNull NISTsimplifiedParserParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(@NotNull NISTsimplifiedParserParser.KeyValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#internalIonName}.
	 * @param ctx the parse tree
	 */
	void enterInternalIonName(@NotNull NISTsimplifiedParserParser.InternalIonNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#internalIonName}.
	 * @param ctx the parse tree
	 */
	void exitInternalIonName(@NotNull NISTsimplifiedParserParser.InternalIonNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peak}.
	 * @param ctx the parse tree
	 */
	void enterPeak(@NotNull NISTsimplifiedParserParser.PeakContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peak}.
	 * @param ctx the parse tree
	 */
	void exitPeak(@NotNull NISTsimplifiedParserParser.PeakContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peptideSpectraMatch}.
	 * @param ctx the parse tree
	 */
	void enterPeptideSpectraMatch(@NotNull NISTsimplifiedParserParser.PeptideSpectraMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peptideSpectraMatch}.
	 * @param ctx the parse tree
	 */
	void exitPeptideSpectraMatch(@NotNull NISTsimplifiedParserParser.PeptideSpectraMatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#unknownIon}.
	 * @param ctx the parse tree
	 */
	void enterUnknownIon(@NotNull NISTsimplifiedParserParser.UnknownIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#unknownIon}.
	 * @param ctx the parse tree
	 */
	void exitUnknownIon(@NotNull NISTsimplifiedParserParser.UnknownIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#mspFile}.
	 * @param ctx the parse tree
	 */
	void enterMspFile(@NotNull NISTsimplifiedParserParser.MspFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#mspFile}.
	 * @param ctx the parse tree
	 */
	void exitMspFile(@NotNull NISTsimplifiedParserParser.MspFileContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#knownIon}.
	 * @param ctx the parse tree
	 */
	void enterKnownIon(@NotNull NISTsimplifiedParserParser.KnownIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#knownIon}.
	 * @param ctx the parse tree
	 */
	void exitKnownIon(@NotNull NISTsimplifiedParserParser.KnownIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peptideWeight}.
	 * @param ctx the parse tree
	 */
	void enterPeptideWeight(@NotNull NISTsimplifiedParserParser.PeptideWeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peptideWeight}.
	 * @param ctx the parse tree
	 */
	void exitPeptideWeight(@NotNull NISTsimplifiedParserParser.PeptideWeightContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#modStr}.
	 * @param ctx the parse tree
	 */
	void enterModStr(@NotNull NISTsimplifiedParserParser.ModStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#modStr}.
	 * @param ctx the parse tree
	 */
	void exitModStr(@NotNull NISTsimplifiedParserParser.ModStrContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#immoniumIonName}.
	 * @param ctx the parse tree
	 */
	void enterImmoniumIonName(@NotNull NISTsimplifiedParserParser.ImmoniumIonNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#immoniumIonName}.
	 * @param ctx the parse tree
	 */
	void exitImmoniumIonName(@NotNull NISTsimplifiedParserParser.ImmoniumIonNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#searchSummary}.
	 * @param ctx the parse tree
	 */
	void enterSearchSummary(@NotNull NISTsimplifiedParserParser.SearchSummaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#searchSummary}.
	 * @param ctx the parse tree
	 */
	void exitSearchSummary(@NotNull NISTsimplifiedParserParser.SearchSummaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#modIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterModIdentifier(@NotNull NISTsimplifiedParserParser.ModIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#modIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitModIdentifier(@NotNull NISTsimplifiedParserParser.ModIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#mzPeakTheoreticalDiff}.
	 * @param ctx the parse tree
	 */
	void enterMzPeakTheoreticalDiff(@NotNull NISTsimplifiedParserParser.MzPeakTheoreticalDiffContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#mzPeakTheoreticalDiff}.
	 * @param ctx the parse tree
	 */
	void exitMzPeakTheoreticalDiff(@NotNull NISTsimplifiedParserParser.MzPeakTheoreticalDiffContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineTags}.
	 * @param ctx the parse tree
	 */
	void enterSearchEngineTags(@NotNull NISTsimplifiedParserParser.SearchEngineTagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineTags}.
	 * @param ctx the parse tree
	 */
	void exitSearchEngineTags(@NotNull NISTsimplifiedParserParser.SearchEngineTagsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#fragmentChargeState}.
	 * @param ctx the parse tree
	 */
	void enterFragmentChargeState(@NotNull NISTsimplifiedParserParser.FragmentChargeStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#fragmentChargeState}.
	 * @param ctx the parse tree
	 */
	void exitFragmentChargeState(@NotNull NISTsimplifiedParserParser.FragmentChargeStateContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#neutralGainIon}.
	 * @param ctx the parse tree
	 */
	void enterNeutralGainIon(@NotNull NISTsimplifiedParserParser.NeutralGainIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#neutralGainIon}.
	 * @param ctx the parse tree
	 */
	void exitNeutralGainIon(@NotNull NISTsimplifiedParserParser.NeutralGainIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#missedClevageDescription}.
	 * @param ctx the parse tree
	 */
	void enterMissedClevageDescription(@NotNull NISTsimplifiedParserParser.MissedClevageDescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#missedClevageDescription}.
	 * @param ctx the parse tree
	 */
	void exitMissedClevageDescription(@NotNull NISTsimplifiedParserParser.MissedClevageDescriptionContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#sampleCode}.
	 * @param ctx the parse tree
	 */
	void enterSampleCode(@NotNull NISTsimplifiedParserParser.SampleCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#sampleCode}.
	 * @param ctx the parse tree
	 */
	void exitSampleCode(@NotNull NISTsimplifiedParserParser.SampleCodeContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(@NotNull NISTsimplifiedParserParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(@NotNull NISTsimplifiedParserParser.KeyValuePairContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineResults}.
	 * @param ctx the parse tree
	 */
	void enterSearchEngineResults(@NotNull NISTsimplifiedParserParser.SearchEngineResultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#searchEngineResults}.
	 * @param ctx the parse tree
	 */
	void exitSearchEngineResults(@NotNull NISTsimplifiedParserParser.SearchEngineResultsContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#internalIonSequence}.
	 * @param ctx the parse tree
	 */
	void enterInternalIonSequence(@NotNull NISTsimplifiedParserParser.InternalIonSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#internalIonSequence}.
	 * @param ctx the parse tree
	 */
	void exitInternalIonSequence(@NotNull NISTsimplifiedParserParser.InternalIonSequenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#databaseDescript}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseDescript(@NotNull NISTsimplifiedParserParser.DatabaseDescriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#databaseDescript}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseDescript(@NotNull NISTsimplifiedParserParser.DatabaseDescriptContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#homologousPeptideMatch}.
	 * @param ctx the parse tree
	 */
	void enterHomologousPeptideMatch(@NotNull NISTsimplifiedParserParser.HomologousPeptideMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#homologousPeptideMatch}.
	 * @param ctx the parse tree
	 */
	void exitHomologousPeptideMatch(@NotNull NISTsimplifiedParserParser.HomologousPeptideMatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#concensusSpectraNumMatch}.
	 * @param ctx the parse tree
	 */
	void enterConcensusSpectraNumMatch(@NotNull NISTsimplifiedParserParser.ConcensusSpectraNumMatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#concensusSpectraNumMatch}.
	 * @param ctx the parse tree
	 */
	void exitConcensusSpectraNumMatch(@NotNull NISTsimplifiedParserParser.ConcensusSpectraNumMatchContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#leftFlankingAA}.
	 * @param ctx the parse tree
	 */
	void enterLeftFlankingAA(@NotNull NISTsimplifiedParserParser.LeftFlankingAAContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#leftFlankingAA}.
	 * @param ctx the parse tree
	 */
	void exitLeftFlankingAA(@NotNull NISTsimplifiedParserParser.LeftFlankingAAContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#internalIon}.
	 * @param ctx the parse tree
	 */
	void enterInternalIon(@NotNull NISTsimplifiedParserParser.InternalIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#internalIon}.
	 * @param ctx the parse tree
	 */
	void exitInternalIon(@NotNull NISTsimplifiedParserParser.InternalIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#rightFlankingAA}.
	 * @param ctx the parse tree
	 */
	void enterRightFlankingAA(@NotNull NISTsimplifiedParserParser.RightFlankingAAContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#rightFlankingAA}.
	 * @param ctx the parse tree
	 */
	void exitRightFlankingAA(@NotNull NISTsimplifiedParserParser.RightFlankingAAContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#peptideClass}.
	 * @param ctx the parse tree
	 */
	void enterPeptideClass(@NotNull NISTsimplifiedParserParser.PeptideClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#peptideClass}.
	 * @param ctx the parse tree
	 */
	void exitPeptideClass(@NotNull NISTsimplifiedParserParser.PeptideClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#ionData}.
	 * @param ctx the parse tree
	 */
	void enterIonData(@NotNull NISTsimplifiedParserParser.IonDataContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#ionData}.
	 * @param ctx the parse tree
	 */
	void exitIonData(@NotNull NISTsimplifiedParserParser.IonDataContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#proteinName}.
	 * @param ctx the parse tree
	 */
	void enterProteinName(@NotNull NISTsimplifiedParserParser.ProteinNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#proteinName}.
	 * @param ctx the parse tree
	 */
	void exitProteinName(@NotNull NISTsimplifiedParserParser.ProteinNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#terminusModifiers}.
	 * @param ctx the parse tree
	 */
	void enterTerminusModifiers(@NotNull NISTsimplifiedParserParser.TerminusModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#terminusModifiers}.
	 * @param ctx the parse tree
	 */
	void exitTerminusModifiers(@NotNull NISTsimplifiedParserParser.TerminusModifiersContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#organismName}.
	 * @param ctx the parse tree
	 */
	void enterOrganismName(@NotNull NISTsimplifiedParserParser.OrganismNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#organismName}.
	 * @param ctx the parse tree
	 */
	void exitOrganismName(@NotNull NISTsimplifiedParserParser.OrganismNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#immoniumIon}.
	 * @param ctx the parse tree
	 */
	void enterImmoniumIon(@NotNull NISTsimplifiedParserParser.ImmoniumIonContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#immoniumIon}.
	 * @param ctx the parse tree
	 */
	void exitImmoniumIon(@NotNull NISTsimplifiedParserParser.ImmoniumIonContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#ionName}.
	 * @param ctx the parse tree
	 */
	void enterIonName(@NotNull NISTsimplifiedParserParser.IonNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#ionName}.
	 * @param ctx the parse tree
	 */
	void exitIonName(@NotNull NISTsimplifiedParserParser.IonNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link NISTsimplifiedParserParser#modName}.
	 * @param ctx the parse tree
	 */
	void enterModName(@NotNull NISTsimplifiedParserParser.ModNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NISTsimplifiedParserParser#modName}.
	 * @param ctx the parse tree
	 */
	void exitModName(@NotNull NISTsimplifiedParserParser.ModNameContext ctx);
}