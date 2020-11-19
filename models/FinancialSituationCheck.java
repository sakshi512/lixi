package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FinancialSituationCheck {
    private String dataSource;
    private String referenceNumber;
}
