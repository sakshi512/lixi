package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RealEstateAssetEstimatedValue {
    private EstimateBasisRealEstateAssetList estimateBasis;
    private Double estimatedCGTLiability;
    private EstimateMethodologyList estimateMethodology;
    private Double value;
    private String valuedDate;
    private String xValuer;
}
