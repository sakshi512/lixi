package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SurplusFundsDisbursementMethodList {
    BANK_CHEQUE, BPAY, EXISTING_DIRECT_DEBIT_ACCOUNT, EXISTING_OTHER_ACCOUNT, NEW_ACCOUNT, REDRAW;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BANK_CHEQUE: return "Bank Cheque";
            case BPAY: return "Bpay";
            case EXISTING_DIRECT_DEBIT_ACCOUNT: return "Existing Direct Debit Account";
            case EXISTING_OTHER_ACCOUNT: return "Existing Other Account";
            case NEW_ACCOUNT: return "New Account";
            case REDRAW: return "Redraw";
        }
        return null;
    }

    @JsonCreator
    public static SurplusFundsDisbursementMethodList forValue(String value) throws IOException {
        if (value.equals("Bank Cheque")) return BANK_CHEQUE;
        if (value.equals("Bpay")) return BPAY;
        if (value.equals("Existing Direct Debit Account")) return EXISTING_DIRECT_DEBIT_ACCOUNT;
        if (value.equals("Existing Other Account")) return EXISTING_OTHER_ACCOUNT;
        if (value.equals("New Account")) return NEW_ACCOUNT;
        if (value.equals("Redraw")) return REDRAW;
        throw new IOException("Cannot deserialize SurplusFundsDisbursementMethodList");
    }
}
