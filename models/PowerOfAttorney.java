package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PowerOfAttorney {
    private PowerOfAttorneyTypeList type;
    private String xPOAHolder;
    private List<DealingNumberType> dealingNumber;
}
