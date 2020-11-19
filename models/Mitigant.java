package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Mitigant {
    private String description;
    private MitigantFactorList factor;
    private String uniqueID;
    private SaleOfAssets saleOfAssets;
    private SavingsOrSuperannuation savingsOrSuperannuation;
}
