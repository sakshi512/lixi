package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum ReasonForDifferentNameList {
    ABBREVIATION, AMALGAMATION, AMALGAMATION_EVIDENCE, CHANGE_INCORPORATED_NAME, DEED_POLL, ERROR_IN_REGISTER, LEGISLATIVE_CHANGE_COMPANY, LEGISLATIVE_CHANGE_COMPANY_EVIDENCE, LEGISLATIVE_CHANGE_NON_COMPANY, LEGISLATIVE_CHANGE_NON_COMPANY_EVIDENCE, MARRIAGE, MERGER_OR_TAKEOVER, MERGER_OR_TAKEOVER_EVIDENCE, NEW_NAME, RESUMPTION_OF_MAIDEN_NAME, SALE_OR_TRANSFER, SALE_OR_TRANSFER_EVIDENCE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ABBREVIATION: return "Abbreviation";
            case AMALGAMATION: return "Amalgamation";
            case AMALGAMATION_EVIDENCE: return "Amalgamation Evidence";
            case CHANGE_INCORPORATED_NAME: return "Change Incorporated Name";
            case DEED_POLL: return "Deed Poll";
            case ERROR_IN_REGISTER: return "Error in Register";
            case LEGISLATIVE_CHANGE_COMPANY: return "Legislative Change Company";
            case LEGISLATIVE_CHANGE_COMPANY_EVIDENCE: return "Legislative Change Company Evidence";
            case LEGISLATIVE_CHANGE_NON_COMPANY: return "Legislative Change Non Company";
            case LEGISLATIVE_CHANGE_NON_COMPANY_EVIDENCE: return "Legislative Change Non Company Evidence";
            case MARRIAGE: return "Marriage";
            case MERGER_OR_TAKEOVER: return "Merger or Takeover";
            case MERGER_OR_TAKEOVER_EVIDENCE: return "Merger or Takeover Evidence";
            case NEW_NAME: return "New Name";
            case RESUMPTION_OF_MAIDEN_NAME: return "Resumption of Maiden Name";
            case SALE_OR_TRANSFER: return "Sale or Transfer";
            case SALE_OR_TRANSFER_EVIDENCE: return "Sale or Transfer Evidence";
        }
        return null;
    }

    @JsonCreator
    public static ReasonForDifferentNameList forValue(String value) throws IOException {
        if (value.equals("Abbreviation")) return ABBREVIATION;
        if (value.equals("Amalgamation")) return AMALGAMATION;
        if (value.equals("Amalgamation Evidence")) return AMALGAMATION_EVIDENCE;
        if (value.equals("Change Incorporated Name")) return CHANGE_INCORPORATED_NAME;
        if (value.equals("Deed Poll")) return DEED_POLL;
        if (value.equals("Error in Register")) return ERROR_IN_REGISTER;
        if (value.equals("Legislative Change Company")) return LEGISLATIVE_CHANGE_COMPANY;
        if (value.equals("Legislative Change Company Evidence")) return LEGISLATIVE_CHANGE_COMPANY_EVIDENCE;
        if (value.equals("Legislative Change Non Company")) return LEGISLATIVE_CHANGE_NON_COMPANY;
        if (value.equals("Legislative Change Non Company Evidence")) return LEGISLATIVE_CHANGE_NON_COMPANY_EVIDENCE;
        if (value.equals("Marriage")) return MARRIAGE;
        if (value.equals("Merger or Takeover")) return MERGER_OR_TAKEOVER;
        if (value.equals("Merger or Takeover Evidence")) return MERGER_OR_TAKEOVER_EVIDENCE;
        if (value.equals("New Name")) return NEW_NAME;
        if (value.equals("Resumption of Maiden Name")) return RESUMPTION_OF_MAIDEN_NAME;
        if (value.equals("Sale or Transfer")) return SALE_OR_TRANSFER;
        if (value.equals("Sale or Transfer Evidence")) return SALE_OR_TRANSFER_EVIDENCE;
        throw new IOException("Cannot deserialize ReasonForDifferentNameList");
    }
}
