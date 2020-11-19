package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Household {
    private String name;
    private Long numberOfAdults;
    private Long numberOfDependants;
    private String uniqueID;
    private List<Dependant> dependant;
    private EducationExpenses educationExpenses;
    private ExpenseDetails expenseDetails;
}
