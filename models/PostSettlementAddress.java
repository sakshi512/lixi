package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PostSettlementAddress {
    private HousingStatusList housingStatus;
    private String xMailingAddress;
    private String xResidentialAddress;
}
