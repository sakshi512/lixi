package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LoanToValuationRatio {
    private Double applicationLVR;
    private Double peakDebtLVR;
    private String uniqueID;
    private List<ContributingValuation> contributingValuation;
}
