package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Company {
    private String abn;
    private String accreditationNumber;
    private String bsb;
    private String companyName;
    private String licenceNumber;
    private LicenceTypeList licenceType;
    private String otherIdentifier;
    private String uniqueID;
    private CompanyContact contact;
}
