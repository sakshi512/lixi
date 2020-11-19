package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum LoanPaymentScheduleTypeList {
    EVEN_PRINCIPAL_PAYMENTS, EVEN_TOTAL_PAYMENTS, OUTSTANDING_BALANCE_BASED_PAYMENTS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EVEN_PRINCIPAL_PAYMENTS: return "Even Principal Payments";
            case EVEN_TOTAL_PAYMENTS: return "Even Total Payments";
            case OUTSTANDING_BALANCE_BASED_PAYMENTS: return "Outstanding Balance Based Payments";
        }
        return null;
    }

    @JsonCreator
    public static LoanPaymentScheduleTypeList forValue(String value) throws IOException {
        if (value.equals("Even Principal Payments")) return EVEN_PRINCIPAL_PAYMENTS;
        if (value.equals("Even Total Payments")) return EVEN_TOTAL_PAYMENTS;
        if (value.equals("Outstanding Balance Based Payments")) return OUTSTANDING_BALANCE_BASED_PAYMENTS;
        throw new IOException("Cannot deserialize LoanPaymentScheduleTypeList");
    }
}
