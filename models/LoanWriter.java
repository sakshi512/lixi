package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanWriter {
    private String accreditationNumber;
    private String department;
    private String firstName;
    private String licenceNumber;
    private LicenceTypeList licenceType;
    private String managerName;
    private NameTitleList nameTitle;
    private String otherIdentifier;
    private String personRole;
    private String surname;
    private String uniqueID;
    private LoanWriterContact contact;
}
