package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class RetirementDetails {
    private List<RetirementDetailsApplicant> applicant;
    private RetirementDetailsRepaymentOptions repaymentOptions;
}
