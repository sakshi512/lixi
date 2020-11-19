package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CurrentAddress {
    private HousingStatusList housingStatus;
    private String startDate;
    private String xLandlord;
    private String xMailingAddress;
    private String xResidentialAddress;
    private DurationType duration;
}
