package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SendDocumentsToList {
    ACCOUNTANT, ALL, APPLICANT, BRANCH, LOAN_WRITER, OTHER, SOLICITOR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNTANT: return "Accountant";
            case ALL: return "All";
            case APPLICANT: return "Applicant";
            case BRANCH: return "Branch";
            case LOAN_WRITER: return "Loan Writer";
            case OTHER: return "Other";
            case SOLICITOR: return "Solicitor";
        }
        return null;
    }

    @JsonCreator
    public static SendDocumentsToList forValue(String value) throws IOException {
        if (value.equals("Accountant")) return ACCOUNTANT;
        if (value.equals("All")) return ALL;
        if (value.equals("Applicant")) return APPLICANT;
        if (value.equals("Branch")) return BRANCH;
        if (value.equals("Loan Writer")) return LOAN_WRITER;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Solicitor")) return SOLICITOR;
        throw new IOException("Cannot deserialize SendDocumentsToList");
    }
}
