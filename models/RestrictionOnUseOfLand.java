package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RestrictionOnUseOfLand {
    private String description;
    private String registrationNumber;
    private YesNoList restrictionExists;
}
