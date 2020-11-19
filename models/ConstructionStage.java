package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ConstructionStage {
    private Double stageAmount;
    private String stageDescription;
    private String uniqueID;
}
