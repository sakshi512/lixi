package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PAYGIncome {
    private Double bonusAmount;
    private FrequencyShortList bonusFrequency;
    private Double carAllowanceAmount;
    private FrequencyShortList carAllowanceFrequency;
    private Double commissionAmount;
    private FrequencyShortList commissionFrequency;
    private Double grossRegularOvertimeAmount;
    private FrequencyShortList grossRegularOvertimeFrequency;
    private Double grossSalaryAmount;
    private FrequencyShortList grossSalaryFrequency;
    private Double netBonusAmount;
    private FrequencyShortList netBonusFrequency;
    private Double netCarAllowanceAmount;
    private FrequencyShortList netCarAllowanceFrequency;
    private Double netCommissionAmount;
    private FrequencyShortList netCommissionFrequency;
    private Double netRegularOvertimeAmount;
    private FrequencyShortList netRegularOvertimeFrequency;
    private Double netSalaryAmount;
    private FrequencyShortList netSalaryFrequency;
    private Double netWorkAllowanceAmount;
    private FrequencyShortList netWorkAllowanceFrequency;
    private Double netWorkersCompensationAmount;
    private FrequencyShortList netWorkersCompensationFrequency;
    private ProofCodePAYGList proofCode;
    private YesNoList proofSighted;
    private Double workAllowanceAmount;
    private FrequencyShortList workAllowanceFrequency;
    private Double workersCompensationAmount;
    private FrequencyShortList workersCompensationFrequency;
}
