package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ServicingGuarantee {
    private YesNoList confirmIsBenefitToFamily;
    private YesNoList confirmRelationshipToBorrower;
    private YesNoList confirmUnderstandsBorrowerReliance;
    private YesNoList confirmUnderstandsRepaymentsRequired;
}
