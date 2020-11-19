package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Submit {
    private AssessmentTypeApplicationInstructionsList assessmentType;
    private YesNoList isAccountVariation;
    private YesNoList isResubmission;
    private YesNoList isSubmissionDocuments;
    private YesNoList isSupportingDocuments;
    private List<SubmitCondition> condition;
}
