package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class FutureCircumstances {
    private List<FutureCircumstancesApplicant> applicant;
    private ResponsibleLendingType responsibleLending;
}
