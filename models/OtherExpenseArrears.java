package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherExpenseArrears {
    private Double amount;
    private Long numberOfMissedPayments;
    private YesNoList toBePaidOut;
}
