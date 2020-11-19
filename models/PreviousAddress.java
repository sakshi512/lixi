package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PreviousAddress {
    private String endDate;
    private HousingStatusList housingStatus;
    private String startDate;
    private String xResidentialAddress;
    private DurationType duration;
}
