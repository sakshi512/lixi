package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ApplicantTypeList {
    BORROWER, BORROWER_AND_GUARANTOR, GUARANTOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BORROWER: return "Borrower";
            case BORROWER_AND_GUARANTOR: return "Borrower and Guarantor";
            case GUARANTOR: return "Guarantor";
        }
        return null;
    }

    @JsonCreator
    public static ApplicantTypeList forValue(String value) throws IOException {
        if (value.equals("Borrower")) return BORROWER;
        if (value.equals("Borrower and Guarantor")) return BORROWER_AND_GUARANTOR;
        if (value.equals("Guarantor")) return GUARANTOR;
        throw new IOException("Cannot deserialize ApplicantTypeList");
    }
}
