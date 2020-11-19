package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BusinessChannel {
    private String abn;
    private String acn;
    private String companyName;
    private String lenderID;
    private String licenceNumber;
    private LicenceTypeList licenceType;
    private String otherIdentifier;
    private BusinessChannelTypeList type;
    private String uniqueID;
    private BusinessChannelContact contact;
}
