package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ToolsOfTrade {
    private ConditionList condition;
    private String description;
    private String make;
    private String model;
    private ToolsOfTradeTypeList type;
}
