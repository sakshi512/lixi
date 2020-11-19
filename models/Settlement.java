package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Settlement {
    private Double payoutFigure;
    private String settlementBookingDateTime;
    private String settlementReferenceNumber;
    private String xSettlementBookingAddress;
    private List<SettlementSecurity> security;
}
