package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OwnerBuilderExperience {
    private YesNoList completedSimilarProjectInLast2Years;
    private YesNoList minimalExperience;
    private String otherExperience;
    private YesNoList worksInBuildingIndustry;
}
