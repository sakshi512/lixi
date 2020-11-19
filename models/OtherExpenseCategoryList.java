package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum OtherExpenseCategoryList {
    BASIC_LIVING_EXPENSES, DISCRETIONARY_LIVING_EXPENSES, OTHER;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BASIC_LIVING_EXPENSES: return "Basic Living Expenses";
            case DISCRETIONARY_LIVING_EXPENSES: return "Discretionary Living Expenses";
            case OTHER: return "Other";
        }
        return null;
    }

    @JsonCreator
    public static OtherExpenseCategoryList forValue(String value) throws IOException {
        if (value.equals("Basic Living Expenses")) return BASIC_LIVING_EXPENSES;
        if (value.equals("Discretionary Living Expenses")) return DISCRETIONARY_LIVING_EXPENSES;
        if (value.equals("Other")) return OTHER;
        throw new IOException("Cannot deserialize OtherExpenseCategoryList");
    }
}
