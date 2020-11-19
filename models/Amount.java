package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Amount {
    private Double calculateAsPercentage;
    private Double cashReserve;
    private Double instalmentsAmount;
    private Double lumpSum;
    private VaryOnValuationList varyOnValuation;
}
