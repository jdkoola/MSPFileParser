filename.mspoutput<-"/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/yeast/yeast_consensus_final.parser.output.csv";

yeast.data<-read.csv(filename.mspoutput, colClasses=c("factor", "numeric", "numeric", "numeric", 
                                                        "numeric", "numeric", "numeric", "factor", "factor", 
                                                        "numeric", "numeric", "numeric", "numeric", "character"))
yeast.data<-yeast.data[!is.na(yeast.data$P_MZ), ];
numUnprocessed<-length(yeast.data[,1]);
yeast.data<-yeast.data[yeast.data$NUM_SPECTRA_IN_CONSENSUS>= 50,]

#change the quantile function to map onto 44 breaks (the largest peptide length) instead of [0,1 by 0.01]
quantileBondPos<-cut(yeast.data$BOND_POSITION / yeast.data$P_NAA, breaks=44)
quantilePeakMZ<-cut(yeast.data$PEAK_MZ, breaks=5)
quantilePeakStrength<-cut(yeast.data$PEAK_STRENGTH, breaks=seq(0,10000,100))
factoredProteinName<-factor(yeast.data$PROTEIN_NAME)
numProteins<-length(levels(factoredProteinName))
yeast.data$P_MASS<-cut(yeast.data$P_MASS, breaks=c(0,1100,1300,1600,1900,2400,10000))
yeast.data$P_MZ<-cut(yeast.data$P_MZ, breaks=5)
yeast.data$BOND_POSITION<-yeast.data$quantileBondPos
yeast.data$PEAK_MZ<-quantilePeakMZ
yeast.data$PEAK_STRENGTH<-quantilePeakStrength
yeast.data$P_CHARGE<-factor(yeast.data$P_CHARGE)


yeast.data$ION_CHARGE<-factor(yeast.data$ION_CHARGE)
yeast.data<-cbind(yeast.data[,1:3], yeast.data[,6:9], yeast.data[,11:12])
yeast.data<-cbind(yeast.data, quantileBondPos);
# 
# factored.yeast.data<-cbind(yeast.data$ION_TYPE, yeast.data$quantileBondPos, yeast.data$quantilePeakMZ,
#                              yeast.data$quantilePeakStrength, yeast.data$ION_CHARGE, yeast.data$LEFT_AA,
#                              yeast.data$RIGHT_AA, yeast.data$P_CHARGE, yeast.data$P_MASS,
#                              yeast.data$P_MZ)
