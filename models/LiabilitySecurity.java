package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LiabilitySecurity {
    private String mortgageNumber;
    private SecurityPriorityList priority;
    private Double priorityAmount;
    private YesNoList requiresOriginalMortgageDocument;
    private YesNoList signedDocumentsRequired;
    private String uniqueID;
    private String xSecurity;
    private List<MortgagorDetail> mortgagorDetails;
    private SecurityAgreementType securityAgreement;
}
