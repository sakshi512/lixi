package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum MitigantFactorList {
    APPLICATION_REFLECTS_CHANGES, CO_APPLICANT_S_INCOME, DOWNSIZE_OF_PRINCIPAL_RESIDENCE, OTHER, REDUCING_EXPENDITURE, SALE_OF_ASSETS, SAVINGS_OR_SUPERANNUATION, SECURING_ADDITIONAL_INCOME, USING_SAVINGS;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICATION_REFLECTS_CHANGES: return "Application Reflects Changes";
            case CO_APPLICANT_S_INCOME: return "Co-Applicant's Income";
            case DOWNSIZE_OF_PRINCIPAL_RESIDENCE: return "Downsize of Principal Residence";
            case OTHER: return "Other";
            case REDUCING_EXPENDITURE: return "Reducing Expenditure";
            case SALE_OF_ASSETS: return "Sale of Assets";
            case SAVINGS_OR_SUPERANNUATION: return "Savings or Superannuation";
            case SECURING_ADDITIONAL_INCOME: return "Securing Additional Income";
            case USING_SAVINGS: return "Using Savings";
        }
        return null;
    }

    @JsonCreator
    public static MitigantFactorList forValue(String value) throws IOException {
        if (value.equals("Application Reflects Changes")) return APPLICATION_REFLECTS_CHANGES;
        if (value.equals("Co-Applicant's Income")) return CO_APPLICANT_S_INCOME;
        if (value.equals("Downsize of Principal Residence")) return DOWNSIZE_OF_PRINCIPAL_RESIDENCE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Reducing Expenditure")) return REDUCING_EXPENDITURE;
        if (value.equals("Sale of Assets")) return SALE_OF_ASSETS;
        if (value.equals("Savings or Superannuation")) return SAVINGS_OR_SUPERANNUATION;
        if (value.equals("Securing Additional Income")) return SECURING_ADDITIONAL_INCOME;
        if (value.equals("Using Savings")) return USING_SAVINGS;
        throw new IOException("Cannot deserialize MitigantFactorList");
    }
}
