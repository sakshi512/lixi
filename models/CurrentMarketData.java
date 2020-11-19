package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CurrentMarketData {
    private Double valueOfCommonEquity;
    private Double valueOfMinorityInterests;
    private Double valueOfPreferredEquity;
}
