package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CustomerTransactionAnalysis {
    private String analysisID;
    private String dataAggregator;
    private String endDate;
    private String startDate;
    private String uniqueID;
    private List<CategorySet> categorySet;
    private Result result;
}
