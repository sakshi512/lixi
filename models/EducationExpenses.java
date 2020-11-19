package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class EducationExpenses {
    private Long numberOfAdultsInFullTimeStudy;
    private Long numberOfAdultsInPartTimeStudy;
    private Long numberOfChildrenInPrivateSchool;
    private Long numberOfChildrenInPublicSchool;
}
