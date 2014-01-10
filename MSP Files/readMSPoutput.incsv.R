filename.mspoutput<-"yeast_consensus_final.parser.output.csv";

chicken.data<-read.csv(filename.mspoutput, colClasses=c("factor", "numeric", "numeric", "numeric", 
                                                        "numeric", "numeric", "factor", "factor", "factor", 
                                                        "factor", "numeric", "numeric", "numeric", "character"))
chicken.data<-chicken.data[!is.na(chicken.data$P_MZ), ];
numUnprocessed<-length(chicken.data[,1]);
chicken.data<-chicken.data[chicken.data$NUM_SPECTRA_IN_CONSENSUS>= 50,]

quantileBondPos<-cut(chicken.data$BOND_POSITION / chicken.data$P_NAA, breaks=100)
quantilePeakMZ<-cut(chicken.data$PEAK_MZ, breaks=200)
quantilePeakStrength<-cut(chicken.data$PEAK_STRENGTH, 1000)
factoredProteinName<-factor(chicken.data$PROTEIN_NAME)
numProteins<-length(levels(factoredProteinName))
chicken.data$P_MASS<-factor(cut(chicken.data$P_MASS, 50, ordered_result=TRUE, labels=FALSE))
chicken.data$P_MZ<-factor(cut(chicken.data$P_MZ, 50, ordered_result=TRUE, labels=FALSE))
chicken.data$BOND_POSITION<-chicken.data$quantileBondPos
chicken.data$PEAK_MZ<-quantilePeakMZ
chicken.data$PEAK_STRENGTH<-quantilePeakStrength
chicken.data<-cbind(chicken.data[,1:3], chicken.data[,6:9], chicken.data[,11:12])
# 
# factored.chicken.data<-cbind(chicken.data$ION_TYPE, chicken.data$quantileBondPos, chicken.data$quantilePeakMZ,
#                              chicken.data$quantilePeakStrength, chicken.data$ION_CHARGE, chicken.data$LEFT_AA,
#                              chicken.data$RIGHT_AA, chicken.data$P_CHARGE, chicken.data$P_MASS,
#                              chicken.data$P_MZ)
