package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SplitLoanComponent {
    private String xLiability;
    private String xLoanDetails;
}
