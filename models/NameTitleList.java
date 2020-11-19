package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum NameTitleList {
    DR, HON, LADY, MISS, MR, MRS, MS, OTHER, PROF, REV, R_HON, SIR;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DR: return "Dr";
            case HON: return "Hon";
            case LADY: return "Lady";
            case MISS: return "Miss";
            case MR: return "Mr";
            case MRS: return "Mrs";
            case MS: return "Ms";
            case OTHER: return "Other";
            case PROF: return "Prof";
            case REV: return "Rev";
            case R_HON: return "R Hon";
            case SIR: return "Sir";
        }
        return null;
    }

    @JsonCreator
    public static NameTitleList forValue(String value) throws IOException {
        if (value.equals("Dr")) return DR;
        if (value.equals("Hon")) return HON;
        if (value.equals("Lady")) return LADY;
        if (value.equals("Miss")) return MISS;
        if (value.equals("Mr")) return MR;
        if (value.equals("Mrs")) return MRS;
        if (value.equals("Ms")) return MS;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Prof")) return PROF;
        if (value.equals("Rev")) return REV;
        if (value.equals("R Hon")) return R_HON;
        if (value.equals("Sir")) return SIR;
        throw new IOException("Cannot deserialize NameTitleList");
    }
}
