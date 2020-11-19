package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RelatedPerson {
    private String dateOfBirth;
    private String uniqueID;
    private RelatedPersonContact contact;
    private ForeignTaxAssociationType foreignTaxAssociation;
    private PersonNameType personName;
    private TaxDeclarationDetailsType taxDeclarationDetails;
}
