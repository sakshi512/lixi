package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class TrustApplicantFinancialAnalysis {
    private Double annualPaymentOnCommitments;
    private YesNoList completeFinancialAnalysis;
    private List<StickyCompanyFinancial> companyFinancials;
}
