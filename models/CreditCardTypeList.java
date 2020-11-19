package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CreditCardTypeList {
    AMERICAN_EXPRESS, BANK_CARD, DINERS_CLUB, MASTER_CARD, OTHER_CREDIT_CARD, VISA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AMERICAN_EXPRESS: return "American Express";
            case BANK_CARD: return "Bank Card";
            case DINERS_CLUB: return "Diners Club";
            case MASTER_CARD: return "MasterCard";
            case OTHER_CREDIT_CARD: return "Other Credit Card";
            case VISA: return "Visa";
        }
        return null;
    }

    @JsonCreator
    public static CreditCardTypeList forValue(String value) throws IOException {
        if (value.equals("American Express")) return AMERICAN_EXPRESS;
        if (value.equals("Bank Card")) return BANK_CARD;
        if (value.equals("Diners Club")) return DINERS_CLUB;
        if (value.equals("MasterCard")) return MASTER_CARD;
        if (value.equals("Other Credit Card")) return OTHER_CREDIT_CARD;
        if (value.equals("Visa")) return VISA;
        throw new IOException("Cannot deserialize CreditCardTypeList");
    }
}
