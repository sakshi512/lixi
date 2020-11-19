package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LivingExpense {
    private Double amount;
    private LivingExpenseCategoryList category;
    private String description;
    private String endDate;
    private FrequencyFullList frequency;
    private String startDate;
    private String uniqueID;
    private PercentOwnedType percentResponsible;
}
