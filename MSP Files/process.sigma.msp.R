filename.mspoutput<-"/Users/johndoe/NetBeansProjects/MSP File Parser/MSP Files/sigmaups/sigmaups1_consensus_final_true_lib.parser.csv";

sigma.data<-read.csv(filename.mspoutput, colClasses=c("factor", "numeric", "numeric", "numeric", 
                                                        "numeric", "numeric", "numeric", "factor", "factor", 
                                                        "numeric", "numeric", "numeric", "numeric", "character"))
sigma.data<-sigma.data[!is.na(sigma.data$P_MZ), ];
numUnprocessed<-length(sigma.data[,1]);
sigma.data<-sigma.data[sigma.data$NUM_SPECTRA_IN_CONSENSUS>= 50,]

quantileBondPos<-cut(sigma.data$BOND_POSITION / sigma.data$P_NAA, breaks=44)
quantilePeakMZ<-cut(sigma.data$PEAK_MZ, breaks=c(86.1,489,800,1260,2000))
quantilePeakStrength<-cut(sigma.data$PEAK_STRENGTH, breaks=c(0,96,288,528,11000))
factoredProteinName<-factor(sigma.data$PROTEIN_NAME)
numProteins<-length(levels(factoredProteinName))
sigma.data$P_MASS<-cut(sigma.data$P_MASS, breaks=c(544,1250,1610,1880,4900))
sigma.data$P_MZ<-cut(sigma.data$P_MZ, breaks=c(256,626,804,943,1790))
sigma.data$BOND_POSITION<-quantileBondPos
sigma.data$PEAK_MZ<-quantilePeakMZ
sigma.data$PEAK_STRENGTH<-quantilePeakStrength
sigma.data$P_CHARGE<-factor(sigma.data$P_CHARGE)
sigma.data$ION_CHARGE<-factor(sigma.data$ION_CHARGE)
sigma.data<-cbind(sigma.data[,1:3], sigma.data[,6:9], sigma.data[,11:12])
# 
# factored.sigma.data<-cbind(sigma.data$ION_TYPE, sigma.data$quantileBondPos, sigma.data$quantilePeakMZ,
#                              sigma.data$quantilePeakStrength, sigma.data$ION_CHARGE, sigma.data$LEFT_AA,
#                              sigma.data$RIGHT_AA, sigma.data$P_CHARGE, sigma.data$P_MASS,
#                              sigma.data$P_MZ)
