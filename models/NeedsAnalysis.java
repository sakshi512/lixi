package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class NeedsAnalysis {
    private Double loanAmountSought;
    private PrimaryPurposeLoanPurposeList primaryApplicationPurpose;
    private String productSelection;
    private String purposeSummary;
    private String uniqueID;
    private BenefitToApplicants benefitToApplicants;
    private FutureCircumstances futureCircumstances;
    private NeedsAnalysisInterview interview;
    private DurationType loanTermSought;
    private Preferences preferences;
    private List<PurposeOfApplication> purposeOfApplication;
    private RefinancingAndConsolidation refinancingAndConsolidation;
    private RetirementDetails retirementDetails;
}
