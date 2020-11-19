package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class RelatedCompany {
    private String abn;
    private YesNoList abnVerified;
    private String acn;
    private String businessName;
    private YesNoList businessNameSameAsCompanyName;
    private BusinessStructureFullList businessStructure;
    private String companyName;
    private String dateRegistered;
    private String gstRegisteredDate;
    private Long numberOfPartners;
    private YesNoList registeredForGST;
    private CountryCodeList registeredInCountry;
    private String uniqueID;
    private RelatedCompanyContact contact;
    private List<RelatedCompanyPartner> partner;
}
