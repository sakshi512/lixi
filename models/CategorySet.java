package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CategorySet {
    private String categorySetName;
    private String uniqueID;
    private List<AggregatedTransaction> aggregatedTransactions;
}
