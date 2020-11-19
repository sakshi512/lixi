package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class StructuredPayments {
    private FrequencyFullList baseFrequency;
    private List<Payment> payment;
}
