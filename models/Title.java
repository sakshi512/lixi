package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Title {
    private String autoConsol;
    private String block;
    private String county;
    private String district;
    private YesNoList duplicateTitleIssued;
    private String extent;
    private String folio;
    private String location;
    private String lot;
    private String lotPlan;
    private String otherDetails;
    private String parcel;
    private String parish;
    private String plan;
    private PlanTypeList planType;
    private String realPropertyDescriptor;
    private String register;
    private String section;
    private TenureTypeList tenureType;
    private String titleReference;
    private TitleSystemList titleSystem;
    private String unit;
    private YesNoList unregisteredLand;
    private YesNoList unregisteredPlan;
    private String volume;
    private List<RegisteredProprietor> registeredProprietor;
}
