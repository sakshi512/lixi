package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CompanyApplicantFinancialAnalysis {
    private Double annualPaymentOnCommitments;
    private YesNoList completeFinancialAnalysis;
    private List<PurpleCompanyFinancial> companyFinancials;
}
