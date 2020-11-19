package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AccommodationBond {
    private String expectedAdmissionDate;
    private String serviceProviderName;
    private String serviceProviderNumber;
}
