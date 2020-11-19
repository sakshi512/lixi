package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ProofCodePAYGList {
    EMPLOYMENT_CONTRACT, GROUP_CERTIFICATE, LETTER_FROM_EMPLOYER, PAYSLIP, TAX_RETURN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case EMPLOYMENT_CONTRACT: return "Employment Contract";
            case GROUP_CERTIFICATE: return "Group Certificate";
            case LETTER_FROM_EMPLOYER: return "Letter from Employer";
            case PAYSLIP: return "Payslip";
            case TAX_RETURN: return "Tax Return";
        }
        return null;
    }

    @JsonCreator
    public static ProofCodePAYGList forValue(String value) throws IOException {
        if (value.equals("Employment Contract")) return EMPLOYMENT_CONTRACT;
        if (value.equals("Group Certificate")) return GROUP_CERTIFICATE;
        if (value.equals("Letter from Employer")) return LETTER_FROM_EMPLOYER;
        if (value.equals("Payslip")) return PAYSLIP;
        if (value.equals("Tax Return")) return TAX_RETURN;
        throw new IOException("Cannot deserialize ProofCodePAYGList");
    }
}
