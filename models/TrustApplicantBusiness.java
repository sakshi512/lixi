package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantBusiness {
    private String australianBIC;
    private String customIndustryCode;
    private String gicsCode;
    private String industry;
    private AnzsicIndustryCodeList industryCode;
    private String mainBusinessActivity;
}
