package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class NonRealEstateAssetEstimatedValue {
    private Double balloonRVAmount;
    private BalloonRVInputPatternList balloonRVInputPattern;
    private Double balloonRVPercent;
    private EstimateBasisNonRealEstateAssetList estimateBasis;
    private Double estimatedCGTLiability;
    private Double minimumResidualValue;
    private TaxDepreciationMethodList taxDepreciationMethod;
    private Double taxDepreciationRate;
    private Double value;
}
