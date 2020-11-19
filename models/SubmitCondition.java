package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SubmitCondition {
    private String conditionResponseDescription;
    private ConditionResponseStatusList conditionResponseStatus;
    private String loanConditionText;
    private String xSupportingDocument;
}
