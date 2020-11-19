package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ChangeRepaymentFrequency {
    private FrequencyFullList repaymentFrequency;
}
