package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Detail {
    private CountryCodeList country;
    private ForeignTaxAssociationStatusList status;
    private String taxIdentificationNumber;
    private TinNotProvidedReasonList tinNotProvidedReason;
    private String tinNotProvidedReasonDetail;
}
