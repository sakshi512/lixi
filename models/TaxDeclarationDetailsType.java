package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TaxDeclarationDetailsType {
    private YesNoList alreadyProvided;
    private TaxDeclarationExemptionCategoryList exemptionCategory;
    private YesNoList undeclared;
}
