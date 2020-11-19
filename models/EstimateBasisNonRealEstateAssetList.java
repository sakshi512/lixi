package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum EstimateBasisNonRealEstateAssetList {
    APPLICANT_ESTIMATE, CERTIFIED_VALUATION;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICANT_ESTIMATE: return "Applicant Estimate";
            case CERTIFIED_VALUATION: return "Certified Valuation";
        }
        return null;
    }

    @JsonCreator
    public static EstimateBasisNonRealEstateAssetList forValue(String value) throws IOException {
        if (value.equals("Applicant Estimate")) return APPLICANT_ESTIMATE;
        if (value.equals("Certified Valuation")) return CERTIFIED_VALUATION;
        throw new IOException("Cannot deserialize EstimateBasisNonRealEstateAssetList");
    }
}
