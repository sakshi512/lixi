package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherCommitment {
    private Double amount;
    private OtherCommitmentCategoryList category;
    private String description;
    private String endDate;
    private FrequencyFullList frequency;
    private String startDate;
    private String uniqueID;
    private PercentOwnedType percentResponsible;
}
