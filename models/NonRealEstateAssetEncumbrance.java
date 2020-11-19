package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class NonRealEstateAssetEncumbrance {
    private String description;
    private NonRealEstateAssetEncumbranceList encumbranceType;
    private NonRealEstateSecurityPriorityList priority;
    private String registeredNumber;
    private String registrationDate;
    private String uniqueID;
    private List<PurpleInFavourOf> inFavourOf;
}
