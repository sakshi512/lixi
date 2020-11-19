package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ProposedRepaymentCreditCard {
    private String cardHolderName;
    private MmMonthList expiryMonth;
    private YyYearList expiryYear;
    private String number;
    private CreditCardTypeList type;
}
