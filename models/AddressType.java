package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AddressType {
    private String australianPostCode;
    private AuStateList australianState;
    private String city;
    private CountryCodeList country;
    private String gnafID;
    private Double latitude;
    private String lgaName;
    private Double longitude;
    private String overseasPostCode;
    private String overseasState;
    private String suburb;
    private YesNoList tbaAddress;
    private AddressTypeList type;
    private String uniqueID;
    private DeliveryPoint deliveryPoint;
    private DXBox dxBox;
    private NonStandard nonStandard;
    private POBox poBox;
    private Standard standard;
}
