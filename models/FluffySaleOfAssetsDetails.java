package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FluffySaleOfAssetsDetails {
    private YesNoList lenderHeldSecurity;
    private String lenderHeldSecurityDescription;
    private YesNoList otherAssets;
    private String otherAssetsDescription;
    private YesNoList otherLenderHeldProperty;
    private String otherLenderHeldPropertyDescription;
    private YesNoList otherLenderHeldSecurity;
    private String otherLenderHeldSecurityDescription;
    private YesNoList shares;
    private String sharesDescription;
}
