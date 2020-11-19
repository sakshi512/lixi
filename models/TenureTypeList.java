package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TenureTypeList {
    COMMUNITY_TITLE, COMPANY_TITLE, CROWN_LAND, CROWN_LEASE, FREEHOLD, GROUP_TITLES_PLAN, LEASEHOLD, MOIETY_TITLE, NONE, OTHER_TITLE, PURPLE_TITLE, STRATA_TITLE, STRATUM_TITLE, SURVEY_STRATA_TITLE, UNIT_TITLE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COMMUNITY_TITLE: return "Community Title";
            case COMPANY_TITLE: return "Company Title";
            case CROWN_LAND: return "Crown Land";
            case CROWN_LEASE: return "Crown Lease";
            case FREEHOLD: return "Freehold";
            case GROUP_TITLES_PLAN: return "Group Titles Plan";
            case LEASEHOLD: return "Leasehold";
            case MOIETY_TITLE: return "Moiety Title";
            case NONE: return "None";
            case OTHER_TITLE: return "Other Title";
            case PURPLE_TITLE: return "Purple Title";
            case STRATA_TITLE: return "Strata Title";
            case STRATUM_TITLE: return "Stratum Title";
            case SURVEY_STRATA_TITLE: return "Survey Strata Title";
            case UNIT_TITLE: return "Unit Title";
        }
        return null;
    }

    @JsonCreator
    public static TenureTypeList forValue(String value) throws IOException {
        if (value.equals("Community Title")) return COMMUNITY_TITLE;
        if (value.equals("Company Title")) return COMPANY_TITLE;
        if (value.equals("Crown Land")) return CROWN_LAND;
        if (value.equals("Crown Lease")) return CROWN_LEASE;
        if (value.equals("Freehold")) return FREEHOLD;
        if (value.equals("Group Titles Plan")) return GROUP_TITLES_PLAN;
        if (value.equals("Leasehold")) return LEASEHOLD;
        if (value.equals("Moiety Title")) return MOIETY_TITLE;
        if (value.equals("None")) return NONE;
        if (value.equals("Other Title")) return OTHER_TITLE;
        if (value.equals("Purple Title")) return PURPLE_TITLE;
        if (value.equals("Strata Title")) return STRATA_TITLE;
        if (value.equals("Stratum Title")) return STRATUM_TITLE;
        if (value.equals("Survey Strata Title")) return SURVEY_STRATA_TITLE;
        if (value.equals("Unit Title")) return UNIT_TITLE;
        throw new IOException("Cannot deserialize TenureTypeList");
    }
}
