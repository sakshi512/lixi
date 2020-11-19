package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Residential {
    private ResidentialTypeList type;
    private YesNoList willOwn25PercentOfComplex;
    private YesNoList willOwn3UnitsInComplex;
}
