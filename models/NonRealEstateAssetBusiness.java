package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NonRealEstateAssetBusiness {
    private String businessName;
    private String mainBusinessActivity;
    private BusinessFinancialAnalysis financialAnalysis;
}
