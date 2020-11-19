package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CompanyApplicantContact {
    private String email;
    private PreferredContactCompanyList preferredContact;
    private String previousRegisteredAddressEndDate;
    private String previousRegisteredAddressStartDate;
    private String principalTradingAddressStartDate;
    private String registeredAddressStartDate;
    private String webAddress;
    private String xMailingAddress;
    private String xPreviousRegisteredAddress;
    private String xPrincipalTradingAddress;
    private String xRegisteredAddress;
    private FluffyContactPerson contactPerson;
    private PhoneType officeFax;
    private PhoneType officePhone;
    private DurationType previousRegisteredAddressDuration;
    private DurationType principalTradingAddressDuration;
    private DurationType registeredAddressDuration;
}
