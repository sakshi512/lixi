package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class StatusCondition {
    private ConditionOwnerApplicationInstructionsList conditionOwner;
    private ConditionStatusApplicationInstructionsList conditionStatus;
    private String conditionType;
    private String createdDateTime;
    private YesNoList docRequirement;
    private String loanConditionText;
    private PreConditionToStageApplicationInstructionsList preconditionToStage;
    private String uniqueID;
    private String updatedDateTime;
    private String xSupportingDocument;
    private List<ConditionProduct> product;
}
