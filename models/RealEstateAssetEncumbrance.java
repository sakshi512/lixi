package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class RealEstateAssetEncumbrance {
    private String description;
    private RealEstateAssetEncumbranceList encumbranceType;
    private SecurityPriorityList priority;
    private String registeredNumber;
    private String registrationDate;
    private String uniqueID;
    private List<FluffyInFavourOf> inFavourOf;
}
