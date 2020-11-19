package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TinNotProvidedReasonList {
    COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_ISSUE_A_TIN, COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_REQUIRE_TIN_TO_BE_DISCLOSED, ENTITY_IS_OTHERWISE_UNABLE_TO_OBTAIN_A_TIN_OR_EQUIVALENT_NUMBER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_ISSUE_A_TIN: return "Country of Tax Association Does Not Issue a TIN";
            case COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_REQUIRE_TIN_TO_BE_DISCLOSED: return "Country of Tax Association Does Not Require TIN to Be Disclosed";
            case ENTITY_IS_OTHERWISE_UNABLE_TO_OBTAIN_A_TIN_OR_EQUIVALENT_NUMBER: return "Entity Is Otherwise Unable to Obtain a TIN or Equivalent Number";
        }
        return null;
    }

    @JsonCreator
    public static TinNotProvidedReasonList forValue(String value) throws IOException {
        if (value.equals("Country of Tax Association Does Not Issue a TIN")) return COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_ISSUE_A_TIN;
        if (value.equals("Country of Tax Association Does Not Require TIN to Be Disclosed")) return COUNTRY_OF_TAX_ASSOCIATION_DOES_NOT_REQUIRE_TIN_TO_BE_DISCLOSED;
        if (value.equals("Entity Is Otherwise Unable to Obtain a TIN or Equivalent Number")) return ENTITY_IS_OTHERWISE_UNABLE_TO_OBTAIN_A_TIN_OR_EQUIVALENT_NUMBER;
        throw new IOException("Cannot deserialize TinNotProvidedReasonList");
    }
}
