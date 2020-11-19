package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ExpenseDetails {
    private List<LivingExpense> livingExpense;
    private List<OtherCommitment> otherCommitment;
}
