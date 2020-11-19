package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class FutureRentalIncome {
    private Double grossRentalAmount;
    private FrequencyFullList grossRentalFrequency;
    private Double netRentalAmount;
    private FrequencyFullList netRentalFrequency;
    private String startDate;
    private List<FutureRentalIncomePropertyPart> propertyPart;
}
