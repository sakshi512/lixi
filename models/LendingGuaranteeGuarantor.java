package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LendingGuaranteeGuarantor {
    private GuarantorAccessList accessType;
    private YesNoList advisedToSeekIndependentAdvice;
    private YesNoList confirmNotUnderPressure;
    private YesNoList demonstratesReadingEnglish;
    private IndependentAdviceTypeRequiredList independentAdviceTypeRequired;
    private YesNoList isUnderPowerOfAttorney;
    private YesNoList suspectDifficultyUnderstandingEnglish;
    private YesNoList suspectDifficultyUnderstandingObligations;
    private YesNoList suspectMisrepresentation;
    private YesNoList suspectUnderBorrowerInfluence;
    private YesNoList suspectUnderPressure;
    private YesNoList suspectUnfairConduct;
    private YesNoList understandsGuarantorObligations;
    private String xGuarantor;
    private GuarantorInterview interview;
    private LoanWriterConfirmations loanWriterConfirmations;
    private SecurityGuarantee securityGuarantee;
    private ServicingGuarantee servicingGuarantee;
}
