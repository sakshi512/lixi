package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantPartner {
    private PartnerTypeList partnerType;
    private Double percentOwned;
    private String xPartner;
}
