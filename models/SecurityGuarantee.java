package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SecurityGuarantee {
    private YesNoList confirmCouldMeetLoanRepayments;
    private YesNoList confirmWouldSellFamilyHome;
    private YesNoList understandsSecurityGuarantee;
}
