package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ConditionOwnerApplicationInstructionsList {
    APPLICANT, BORROWER_S_SOLICITOR, BRANCH, BROKER, LOAN_OFFICER, SETTLEMENT_AGENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICANT: return "Applicant";
            case BORROWER_S_SOLICITOR: return "Borrower's Solicitor";
            case BRANCH: return "Branch";
            case BROKER: return "Broker";
            case LOAN_OFFICER: return "Loan Officer";
            case SETTLEMENT_AGENT: return "Settlement Agent";
        }
        return null;
    }

    @JsonCreator
    public static ConditionOwnerApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Applicant")) return APPLICANT;
        if (value.equals("Borrower's Solicitor")) return BORROWER_S_SOLICITOR;
        if (value.equals("Branch")) return BRANCH;
        if (value.equals("Broker")) return BROKER;
        if (value.equals("Loan Officer")) return LOAN_OFFICER;
        if (value.equals("Settlement Agent")) return SETTLEMENT_AGENT;
        throw new IOException("Cannot deserialize ConditionOwnerApplicationInstructionsList");
    }
}
