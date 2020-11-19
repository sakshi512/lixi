package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NrasConsortiumList {
    ACCELERATED_WEALTH_SYSTEMS_QUANTUM, AFFORDABLE_HOUSING_CONSULTING_PTY_LTD, AFFORDABLE_MANAGEMENT_CORPORATION_PTY_LTD, ASPIRE_HOUSING_GROUP, BRISBANE_HOUSING_COMPANY_LTD, COMMUNITY_HOUSING_CANBERRA_LTD, ETHAN_AFFORDABLE_HOUSING, PROVIDENCE_HOUSING_PTY_LTD, QUANTUM_HOUSING_GROUP, QUEENSLAND_AFFORDABLE_HOUSING_CONSORTIUM, QUESTUS_FUNDS_MANAGEMENT_PTY_LTD, THE_4_WALLS_LTD, URBAN_AFFORDABLE_HOUSING_CORPORATION, YARAN_RESIDENTIAL_INVESTMENTS_PTY_LTD;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCELERATED_WEALTH_SYSTEMS_QUANTUM: return "Accelerated Wealth Systems (Quantum)";
            case AFFORDABLE_HOUSING_CONSULTING_PTY_LTD: return "Affordable Housing Consulting Pty Ltd";
            case AFFORDABLE_MANAGEMENT_CORPORATION_PTY_LTD: return "Affordable Management Corporation Pty Ltd";
            case ASPIRE_HOUSING_GROUP: return "Aspire Housing Group";
            case BRISBANE_HOUSING_COMPANY_LTD: return "Brisbane Housing Company Ltd";
            case COMMUNITY_HOUSING_CANBERRA_LTD: return "Community Housing Canberra Ltd";
            case ETHAN_AFFORDABLE_HOUSING: return "Ethan Affordable Housing";
            case PROVIDENCE_HOUSING_PTY_LTD: return "Providence Housing Pty Ltd";
            case QUANTUM_HOUSING_GROUP: return "Quantum Housing Group";
            case QUEENSLAND_AFFORDABLE_HOUSING_CONSORTIUM: return "Queensland Affordable Housing Consortium";
            case QUESTUS_FUNDS_MANAGEMENT_PTY_LTD: return "Questus Funds Management Pty Ltd";
            case THE_4_WALLS_LTD: return "4 Walls Ltd";
            case URBAN_AFFORDABLE_HOUSING_CORPORATION: return "Urban Affordable Housing Corporation";
            case YARAN_RESIDENTIAL_INVESTMENTS_PTY_LTD: return "Yaran Residential Investments Pty Ltd";
        }
        return null;
    }

    @JsonCreator
    public static NrasConsortiumList forValue(String value) throws IOException {
        if (value.equals("Accelerated Wealth Systems (Quantum)")) return ACCELERATED_WEALTH_SYSTEMS_QUANTUM;
        if (value.equals("Affordable Housing Consulting Pty Ltd")) return AFFORDABLE_HOUSING_CONSULTING_PTY_LTD;
        if (value.equals("Affordable Management Corporation Pty Ltd")) return AFFORDABLE_MANAGEMENT_CORPORATION_PTY_LTD;
        if (value.equals("Aspire Housing Group")) return ASPIRE_HOUSING_GROUP;
        if (value.equals("Brisbane Housing Company Ltd")) return BRISBANE_HOUSING_COMPANY_LTD;
        if (value.equals("Community Housing Canberra Ltd")) return COMMUNITY_HOUSING_CANBERRA_LTD;
        if (value.equals("Ethan Affordable Housing")) return ETHAN_AFFORDABLE_HOUSING;
        if (value.equals("Providence Housing Pty Ltd")) return PROVIDENCE_HOUSING_PTY_LTD;
        if (value.equals("Quantum Housing Group")) return QUANTUM_HOUSING_GROUP;
        if (value.equals("Queensland Affordable Housing Consortium")) return QUEENSLAND_AFFORDABLE_HOUSING_CONSORTIUM;
        if (value.equals("Questus Funds Management Pty Ltd")) return QUESTUS_FUNDS_MANAGEMENT_PTY_LTD;
        if (value.equals("4 Walls Ltd")) return THE_4_WALLS_LTD;
        if (value.equals("Urban Affordable Housing Corporation")) return URBAN_AFFORDABLE_HOUSING_CORPORATION;
        if (value.equals("Yaran Residential Investments Pty Ltd")) return YARAN_RESIDENTIAL_INVESTMENTS_PTY_LTD;
        throw new IOException("Cannot deserialize NrasConsortiumList");
    }
}
