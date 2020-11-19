package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class SelfEmployedFinancialAnalysis {
    private Double annualPaymentOnCommitments;
    private YesNoList completeFinancialAnalysis;
    private List<TentacledCompanyFinancial> companyFinancials;
}
