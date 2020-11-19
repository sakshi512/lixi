package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NotEmployedIncome {
    private Double governmentBenefitsAmount;
    private FrequencyShortList governmentBenefitsFrequency;
    private Double netGovernmentBenefitsAmount;
    private FrequencyShortList netGovernmentBenefitsFrequency;
    private Double netNewstartAllowanceAmount;
    private FrequencyShortList netNewstartAllowanceFrequency;
    private Double netOtherIncomeAmount;
    private FrequencyShortList netOtherIncomeFrequency;
    private Double netPrivatePensionAmount;
    private FrequencyShortList netPrivatePensionFrequency;
    private Double netSuperannuationAmount;
    private FrequencyShortList netSuperannuationFrequency;
    private Double newstartAllowanceAmount;
    private FrequencyShortList newstartAllowanceFrequency;
    private Double otherIncomeAmount;
    private String otherIncomeDescription;
    private FrequencyShortList otherIncomeFrequency;
    private Double privatePensionAmount;
    private FrequencyShortList privatePensionFrequency;
    private ProofCodeNotEmployedList proofCode;
    private YesNoList proofSighted;
    private YesNoList smsf;
    private Double superannuationAmount;
    private FrequencyShortList superannuationFrequency;
}
