package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BenefitToApplicants {
    private YesNoList allApplicantsBenefit;
    private String benefitEnquiries;
}
