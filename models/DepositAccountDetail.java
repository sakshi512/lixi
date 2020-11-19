package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class DepositAccountDetail {
    private Double initialDepositAmount;
    private String originatorReferenceID;
    private String productCode;
    private String productName;
    private Double proposedAnnualInterestRate;
    private StatementCycleList statementCycle;
    private DepositAccountTypeList type;
    private String uniqueID;
    private PercentOwnedType accountOwners;
    private DepositAccountDetailCommission commission;
    private DocumentationInstructionsType documentationInstructions;
    private List<FeaturesSelectedElement> featuresSelected;
    private DepositAccountDetailPackage depositAccountDetailPackage;
    private List<SourceOfInitialDeposit> sourceOfInitialDeposit;
}
