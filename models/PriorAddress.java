package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PriorAddress {
    private String endDate;
    private HousingStatusList housingStatus;
    private String startDate;
    private String xResidentialAddress;
    private DurationType duration;
}
