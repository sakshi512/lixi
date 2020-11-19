package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OtherCommitmentCategoryList {
    BOARD, CHILD_MAINTENANCE, OTHER, RENT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BOARD: return "Board";
            case CHILD_MAINTENANCE: return "Child Maintenance";
            case OTHER: return "Other";
            case RENT: return "Rent";
        }
        return null;
    }

    @JsonCreator
    public static OtherCommitmentCategoryList forValue(String value) throws IOException {
        if (value.equals("Board")) return BOARD;
        if (value.equals("Child Maintenance")) return CHILD_MAINTENANCE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Rent")) return RENT;
        throw new IOException("Cannot deserialize OtherCommitmentCategoryList");
    }
}
