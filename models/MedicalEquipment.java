package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MedicalEquipment {
    private ConditionList condition;
    private String description;
    private String make;
    private String model;
    private MedicalEquipmentTypeList type;
}
