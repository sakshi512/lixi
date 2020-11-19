package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TrustApplicantContact {
    private String email;
    private PreferredContactCompanyList preferredContact;
    private String principalTradingAddressStartDate;
    private String registeredAddressStartDate;
    private String webAddress;
    private String xMailingAddress;
    private String xPrincipalTradingAddress;
    private String xRegisteredAddress;
    private StickyContactPerson contactPerson;
    private PhoneType officeFax;
    private PhoneType officePhone;
    private DurationType principalTradingAddressDuration;
    private DurationType registeredAddressDuration;
}
