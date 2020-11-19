package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RelatedCompanyPartner {
    private PartnerTypeList partnerType;
    private Double percentOwned;
    private String xPartner;
}
