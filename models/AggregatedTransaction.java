package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AggregatedTransaction {
    private Double amount;
    private Double amountOnMonthlyBasis;
    private AggregatedTransactionsCategoryTypeList category;
    private String otherCategory;
    private String otherCategoryCode;
    private TransactionTypeList type;
    private String uniqueID;
}
