package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherExpense {
    private Double amount;
    private OtherExpenseCategoryList category;
    private String description;
    private String endDate;
    private FrequencyShortList frequency;
    private YesNoList hasArrears;
    private String startDate;
    private OtherExpenseTypeList type;
    private String uniqueID;
    private OtherExpenseArrears arrears;
    private PercentOwnedType percentOwned;
}
