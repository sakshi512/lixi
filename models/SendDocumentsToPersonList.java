package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SendDocumentsToPersonList {
    ACCOUNTANT, BRANCH, LOAN_WRITER, MYSELF, OTHER, SOLICITOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNTANT: return "Accountant";
            case BRANCH: return "Branch";
            case LOAN_WRITER: return "Loan Writer";
            case MYSELF: return "Myself";
            case OTHER: return "Other";
            case SOLICITOR: return "Solicitor";
        }
        return null;
    }

    @JsonCreator
    public static SendDocumentsToPersonList forValue(String value) throws IOException {
        if (value.equals("Accountant")) return ACCOUNTANT;
        if (value.equals("Branch")) return BRANCH;
        if (value.equals("Loan Writer")) return LOAN_WRITER;
        if (value.equals("Myself")) return MYSELF;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Solicitor")) return SOLICITOR;
        throw new IOException("Cannot deserialize SendDocumentsToPersonList");
    }
}
