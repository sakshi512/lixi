package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ChangeLoanTerm {
    private String actionDate;
    private Long newFixedLoanTerm;
    private Long newTotalLoanTerm;
}
