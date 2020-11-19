package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ChangeRepaymentType {
    private PaymentTypeList repaymentType;
}
