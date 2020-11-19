package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EstimateBasisRealEstateAssetList {
    APPLICANT_ESTIMATE, BANK_ASSESSMENT, CERTIFIED_VALUATION, ELECTRONIC_VALUATION, RATES_NOTICE, RP_DATA;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICANT_ESTIMATE: return "Applicant Estimate";
            case BANK_ASSESSMENT: return "Bank Assessment";
            case CERTIFIED_VALUATION: return "Certified Valuation";
            case ELECTRONIC_VALUATION: return "Electronic Valuation";
            case RATES_NOTICE: return "Rates Notice";
            case RP_DATA: return "RP Data";
        }
        return null;
    }

    @JsonCreator
    public static EstimateBasisRealEstateAssetList forValue(String value) throws IOException {
        if (value.equals("Applicant Estimate")) return APPLICANT_ESTIMATE;
        if (value.equals("Bank Assessment")) return BANK_ASSESSMENT;
        if (value.equals("Certified Valuation")) return CERTIFIED_VALUATION;
        if (value.equals("Electronic Valuation")) return ELECTRONIC_VALUATION;
        if (value.equals("Rates Notice")) return RATES_NOTICE;
        if (value.equals("RP Data")) return RP_DATA;
        throw new IOException("Cannot deserialize EstimateBasisRealEstateAssetList");
    }
}
