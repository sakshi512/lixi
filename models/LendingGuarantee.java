package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LendingGuarantee {
    private Double limit;
    private YesNoList limited;
    private YesNoList limitedToFacilityAmount;
    private LendingGuaranteeTypeList type;
    private String uniqueID;
    private List<LendingGuaranteeAssociatedLoanAccount> associatedLoanAccount;
    private List<LendingGuaranteeGuarantor> guarantor;
    private List<LendingGuaranteeSecurity> security;
}
