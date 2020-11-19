package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SelfEmployedBusiness {
    private String australianBIC;
    private String customIndustryCode;
    private String gicsCode;
    private String industry;
    private AnzsicIndustryCodeList industryCode;
    private YesNoList isAFranchise;
    private String mainBusinessActivity;
    private Long numberOfEmployees;
    private Long numberOfLocations;
    private YesNoList ownPremises;
    private String startDate;
}
