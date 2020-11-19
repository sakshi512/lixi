package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class EquityRelease {
    private YesNoList protectedEquity;
    private Double protectedEquityPercentage;
    private AccommodationBond accommodationBond;
    private Amount amount;
    private Instalments instalments;
}
