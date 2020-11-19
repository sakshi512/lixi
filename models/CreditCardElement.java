package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CreditCardElement {
    private AccountStatusList inclusionType;
    private String number;
    private String uniqueID;
    private String xCreditCard;
    private Features features;
}
