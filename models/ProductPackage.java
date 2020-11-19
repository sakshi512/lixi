package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ProductPackage {
    private YesNoList existingPackage;
    private String uniqueID;
    private List<CreditCardElement> creditCard;
    private List<DepositAccount> depositAccount;
    private List<ProductPackageLiability> liability;
    private List<ProductPackageLoanDetail> loanDetails;
}
