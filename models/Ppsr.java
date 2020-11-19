package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Ppsr {
    private CollateralClassList collateralClass;
    private CollateralTypeList collateralType;
    private String descriptionOfProceeds;
    private YesNoList pmsi;
    private YesNoList ppsRegistrable;
    private YesNoList proceedsToBeClaimed;
    private YesNoList subjectToControl;
    private YesNoList subordinateRegistration;
    private String subordinateToNumber;
    private List<Registration> registration;
}
