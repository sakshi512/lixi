package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SalesChannel {
    private SalesChannelTypeList type;
    private Aggregator aggregator;
    private SalesChannelCommission commission;
    private Company company;
    private Introducer introducer;
    private LoanWriter loanWriter;
}
