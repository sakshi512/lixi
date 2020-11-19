package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PreConditionToStageApplicationInstructionsList {
    CONDITIONAL_APPROVAL, PRE_APPROVAL, REFERRED_TO_ASSESSOR, SETTLEMENT, UNCONDITIONAL_APPROVAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONDITIONAL_APPROVAL: return "Conditional Approval";
            case PRE_APPROVAL: return "PreApproval";
            case REFERRED_TO_ASSESSOR: return "Referred to Assessor";
            case SETTLEMENT: return "Settlement";
            case UNCONDITIONAL_APPROVAL: return "Unconditional Approval";
        }
        return null;
    }

    @JsonCreator
    public static PreConditionToStageApplicationInstructionsList forValue(String value) throws IOException {
        if (value.equals("Conditional Approval")) return CONDITIONAL_APPROVAL;
        if (value.equals("PreApproval")) return PRE_APPROVAL;
        if (value.equals("Referred to Assessor")) return REFERRED_TO_ASSESSOR;
        if (value.equals("Settlement")) return SETTLEMENT;
        if (value.equals("Unconditional Approval")) return UNCONDITIONAL_APPROVAL;
        throw new IOException("Cannot deserialize PreConditionToStageApplicationInstructionsList");
    }
}
