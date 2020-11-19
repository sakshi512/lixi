package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ProofOfIdentity {
    private AuStateList australianStateOfIssue;
    private YesNoList certifiedCopy;
    private CountryCodeList countryOfIssue;
    private String dateDocumentVerified;
    private String dateOfIssue;
    private YesNoList dobVerified;
    private DocumentCategoryList documentCategory;
    private String documentNumber;
    private DocumentTypeList documentType;
    private String expiryDate;
    private YesNoList isPreviousNameIdentification;
    private String issuingOrganisation;
    private String middleNameOnDocument;
    private String nameOnDocument;
    private YesNoList nameVerified;
    private YesNoList original;
    private String otherDescription;
    private YesNoList photographVerified;
    private String placeOfIssue;
    private YesNoList residentialAddressVerified;
    private YesNoList signatureVerified;
    private String uniqueID;
    private String xLocationDocumentVerified;
    private MedicareCard medicareCard;
}
