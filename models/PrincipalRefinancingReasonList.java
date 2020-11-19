package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PrincipalRefinancingReasonList {
    CONSOLIDATING_OR_RESTRUCTURING_FINANCES, CONVENIENCE_FLEXIBILITY, DISSATISFACTION_WITH_SERVICE_AT_CURRENT_LENDER, MORE_COMPETITIVE_PRICING, SPECIFIC_PRODUCT_OR_FEATURE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONSOLIDATING_OR_RESTRUCTURING_FINANCES: return "Consolidating or Restructuring Finances";
            case CONVENIENCE_FLEXIBILITY: return "Convenience / Flexibility";
            case DISSATISFACTION_WITH_SERVICE_AT_CURRENT_LENDER: return "Dissatisfaction with Service at Current Lender";
            case MORE_COMPETITIVE_PRICING: return "More Competitive Pricing";
            case SPECIFIC_PRODUCT_OR_FEATURE: return "Specific Product or Feature";
        }
        return null;
    }

    @JsonCreator
    public static PrincipalRefinancingReasonList forValue(String value) throws IOException {
        if (value.equals("Consolidating or Restructuring Finances")) return CONSOLIDATING_OR_RESTRUCTURING_FINANCES;
        if (value.equals("Convenience / Flexibility")) return CONVENIENCE_FLEXIBILITY;
        if (value.equals("Dissatisfaction with Service at Current Lender")) return DISSATISFACTION_WITH_SERVICE_AT_CURRENT_LENDER;
        if (value.equals("More Competitive Pricing")) return MORE_COMPETITIVE_PRICING;
        if (value.equals("Specific Product or Feature")) return SPECIFIC_PRODUCT_OR_FEATURE;
        throw new IOException("Cannot deserialize PrincipalRefinancingReasonList");
    }
}
