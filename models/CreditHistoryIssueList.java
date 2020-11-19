package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CreditHistoryIssueList {
    APPLICATION_FOR_HARDSHIP_WITH_EXISTING_LENDER, ARREARS, BANKRUPTCY, DEFAULT, FINANCIAL_STRESS_FROM_CURRENT_COMMITMENTS, INSOLVENCY, JUDGEMENT, LEGAL_PROCEEDING, OTHER, SCHEME_OF_ARRANGEMENT, WRIT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICATION_FOR_HARDSHIP_WITH_EXISTING_LENDER: return "Application for Hardship with Existing Lender";
            case ARREARS: return "Arrears";
            case BANKRUPTCY: return "Bankruptcy";
            case DEFAULT: return "Default";
            case FINANCIAL_STRESS_FROM_CURRENT_COMMITMENTS: return "Financial Stress from Current Commitments";
            case INSOLVENCY: return "Insolvency";
            case JUDGEMENT: return "Judgement";
            case LEGAL_PROCEEDING: return "Legal Proceeding";
            case OTHER: return "Other";
            case SCHEME_OF_ARRANGEMENT: return "Scheme of Arrangement";
            case WRIT: return "Writ";
        }
        return null;
    }

    @JsonCreator
    public static CreditHistoryIssueList forValue(String value) throws IOException {
        if (value.equals("Application for Hardship with Existing Lender")) return APPLICATION_FOR_HARDSHIP_WITH_EXISTING_LENDER;
        if (value.equals("Arrears")) return ARREARS;
        if (value.equals("Bankruptcy")) return BANKRUPTCY;
        if (value.equals("Default")) return DEFAULT;
        if (value.equals("Financial Stress from Current Commitments")) return FINANCIAL_STRESS_FROM_CURRENT_COMMITMENTS;
        if (value.equals("Insolvency")) return INSOLVENCY;
        if (value.equals("Judgement")) return JUDGEMENT;
        if (value.equals("Legal Proceeding")) return LEGAL_PROCEEDING;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Scheme of Arrangement")) return SCHEME_OF_ARRANGEMENT;
        if (value.equals("Writ")) return WRIT;
        throw new IOException("Cannot deserialize CreditHistoryIssueList");
    }
}
