package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PlanTypeList {
    BUILDING_UNIT_PLAN, BUILDING_UNIT_PLAN_OF_AMALGAMATION, BUILDING_UNIT_PLAN_OF_RESUBDIVISION, COMMUNITY_PLAN, CROWN_PLAN, DEPOSITED_PLAN, DIAGRAM, FILED_PLAN, GROUP_TITLE_PLAN, GROUP_TITLE_PLAN_OF_AMALGAMATION, GROUP_TITLE_PLAN_OF_RESUBDIVISION, LEASEHOLD_BUILDING_UNIT_PLAN_SOUTH_BANK, LOWER_BUILDING_UNIT_PLAN, MIXED_COMMUNITY_PLAN, MIXED_PRECINCT_PLAN, MIXED_STRATUM_PLAN, PLAN, PLAN_OF_SUBDIVISION, REGISTERED_PLAN, STRATA_PLAN, STRATUM_PLAN_OF_AMALGAMATION_SOUTH_BANK, STRATUM_PLAN_OF_SUBDIVISION_SOUTH_BANK, STRATUM_PLAN_SOUTH_BANK, SURVEY_PLAN, SURVEY_STRATA_PLAN, UPPER_BUILDING_UNIT_PLAN;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BUILDING_UNIT_PLAN: return "Building Unit Plan";
            case BUILDING_UNIT_PLAN_OF_AMALGAMATION: return "Building Unit Plan of Amalgamation";
            case BUILDING_UNIT_PLAN_OF_RESUBDIVISION: return "Building Unit Plan of Resubdivision";
            case COMMUNITY_PLAN: return "Community Plan";
            case CROWN_PLAN: return "Crown Plan";
            case DEPOSITED_PLAN: return "Deposited Plan";
            case DIAGRAM: return "Diagram";
            case FILED_PLAN: return "Filed Plan";
            case GROUP_TITLE_PLAN: return "Group Title Plan";
            case GROUP_TITLE_PLAN_OF_AMALGAMATION: return "Group Title Plan of Amalgamation";
            case GROUP_TITLE_PLAN_OF_RESUBDIVISION: return "Group Title Plan of Resubdivision";
            case LEASEHOLD_BUILDING_UNIT_PLAN_SOUTH_BANK: return "Leasehold Building Unit Plan (South Bank)";
            case LOWER_BUILDING_UNIT_PLAN: return "Lower Building Unit Plan";
            case MIXED_COMMUNITY_PLAN: return "Mixed Community Plan";
            case MIXED_PRECINCT_PLAN: return "Mixed Precinct Plan";
            case MIXED_STRATUM_PLAN: return "Mixed Stratum Plan";
            case PLAN: return "Plan";
            case PLAN_OF_SUBDIVISION: return "Plan of Subdivision";
            case REGISTERED_PLAN: return "Registered Plan";
            case STRATA_PLAN: return "Strata Plan";
            case STRATUM_PLAN_OF_AMALGAMATION_SOUTH_BANK: return "Stratum Plan of Amalgamation (South Bank)";
            case STRATUM_PLAN_OF_SUBDIVISION_SOUTH_BANK: return "Stratum Plan of Subdivision (South Bank)";
            case STRATUM_PLAN_SOUTH_BANK: return "Stratum Plan (South Bank)";
            case SURVEY_PLAN: return "Survey Plan";
            case SURVEY_STRATA_PLAN: return "Survey Strata Plan";
            case UPPER_BUILDING_UNIT_PLAN: return "Upper Building Unit Plan";
        }
        return null;
    }

    @JsonCreator
    public static PlanTypeList forValue(String value) throws IOException {
        if (value.equals("Building Unit Plan")) return BUILDING_UNIT_PLAN;
        if (value.equals("Building Unit Plan of Amalgamation")) return BUILDING_UNIT_PLAN_OF_AMALGAMATION;
        if (value.equals("Building Unit Plan of Resubdivision")) return BUILDING_UNIT_PLAN_OF_RESUBDIVISION;
        if (value.equals("Community Plan")) return COMMUNITY_PLAN;
        if (value.equals("Crown Plan")) return CROWN_PLAN;
        if (value.equals("Deposited Plan")) return DEPOSITED_PLAN;
        if (value.equals("Diagram")) return DIAGRAM;
        if (value.equals("Filed Plan")) return FILED_PLAN;
        if (value.equals("Group Title Plan")) return GROUP_TITLE_PLAN;
        if (value.equals("Group Title Plan of Amalgamation")) return GROUP_TITLE_PLAN_OF_AMALGAMATION;
        if (value.equals("Group Title Plan of Resubdivision")) return GROUP_TITLE_PLAN_OF_RESUBDIVISION;
        if (value.equals("Leasehold Building Unit Plan (South Bank)")) return LEASEHOLD_BUILDING_UNIT_PLAN_SOUTH_BANK;
        if (value.equals("Lower Building Unit Plan")) return LOWER_BUILDING_UNIT_PLAN;
        if (value.equals("Mixed Community Plan")) return MIXED_COMMUNITY_PLAN;
        if (value.equals("Mixed Precinct Plan")) return MIXED_PRECINCT_PLAN;
        if (value.equals("Mixed Stratum Plan")) return MIXED_STRATUM_PLAN;
        if (value.equals("Plan")) return PLAN;
        if (value.equals("Plan of Subdivision")) return PLAN_OF_SUBDIVISION;
        if (value.equals("Registered Plan")) return REGISTERED_PLAN;
        if (value.equals("Strata Plan")) return STRATA_PLAN;
        if (value.equals("Stratum Plan of Amalgamation (South Bank)")) return STRATUM_PLAN_OF_AMALGAMATION_SOUTH_BANK;
        if (value.equals("Stratum Plan of Subdivision (South Bank)")) return STRATUM_PLAN_OF_SUBDIVISION_SOUTH_BANK;
        if (value.equals("Stratum Plan (South Bank)")) return STRATUM_PLAN_SOUTH_BANK;
        if (value.equals("Survey Plan")) return SURVEY_PLAN;
        if (value.equals("Survey Strata Plan")) return SURVEY_STRATA_PLAN;
        if (value.equals("Upper Building Unit Plan")) return UPPER_BUILDING_UNIT_PLAN;
        throw new IOException("Cannot deserialize PlanTypeList");
    }
}
