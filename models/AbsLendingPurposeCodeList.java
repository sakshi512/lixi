package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum AbsLendingPurposeCodeList {
    ABS_121, ABS_123, ABS_125, ABS_127, ABS_129, ABS_131, ABS_133, ABS_143, ABS_221, ABS_223, ABS_225, ABS_227, ABS_229, ABS_231, ABS_233, ABS_235, ABS_237, ABS_239, ABS_241, ABS_243, ABS_245, ABS_247, ABS_248, ABS_249, ABS_320, ABS_321, ABS_322, ABS_323, ABS_324, ABS_326, ABS_327, ABS_329, ABS_330, ABS_331, ABS_332, ABS_333, ABS_335, ABS_336, ABS_337, ABS_340, ABS_341, ABS_342, ABS_343, ABS_348, ABS_349;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ABS_121: return "ABS-121";
            case ABS_123: return "ABS-123";
            case ABS_125: return "ABS-125";
            case ABS_127: return "ABS-127";
            case ABS_129: return "ABS-129";
            case ABS_131: return "ABS-131";
            case ABS_133: return "ABS-133";
            case ABS_143: return "ABS-143";
            case ABS_221: return "ABS-221";
            case ABS_223: return "ABS-223";
            case ABS_225: return "ABS-225";
            case ABS_227: return "ABS-227";
            case ABS_229: return "ABS-229";
            case ABS_231: return "ABS-231";
            case ABS_233: return "ABS-233";
            case ABS_235: return "ABS-235";
            case ABS_237: return "ABS-237";
            case ABS_239: return "ABS-239";
            case ABS_241: return "ABS-241";
            case ABS_243: return "ABS-243";
            case ABS_245: return "ABS-245";
            case ABS_247: return "ABS-247";
            case ABS_248: return "ABS-248";
            case ABS_249: return "ABS-249";
            case ABS_320: return "ABS-320";
            case ABS_321: return "ABS-321";
            case ABS_322: return "ABS-322";
            case ABS_323: return "ABS-323";
            case ABS_324: return "ABS-324";
            case ABS_326: return "ABS-326";
            case ABS_327: return "ABS-327";
            case ABS_329: return "ABS-329";
            case ABS_330: return "ABS-330";
            case ABS_331: return "ABS-331";
            case ABS_332: return "ABS-332";
            case ABS_333: return "ABS-333";
            case ABS_335: return "ABS-335";
            case ABS_336: return "ABS-336";
            case ABS_337: return "ABS-337";
            case ABS_340: return "ABS-340";
            case ABS_341: return "ABS-341";
            case ABS_342: return "ABS-342";
            case ABS_343: return "ABS-343";
            case ABS_348: return "ABS-348";
            case ABS_349: return "ABS-349";
        }
        return null;
    }

    @JsonCreator
    public static AbsLendingPurposeCodeList forValue(String value) throws IOException {
        if (value.equals("ABS-121")) return ABS_121;
        if (value.equals("ABS-123")) return ABS_123;
        if (value.equals("ABS-125")) return ABS_125;
        if (value.equals("ABS-127")) return ABS_127;
        if (value.equals("ABS-129")) return ABS_129;
        if (value.equals("ABS-131")) return ABS_131;
        if (value.equals("ABS-133")) return ABS_133;
        if (value.equals("ABS-143")) return ABS_143;
        if (value.equals("ABS-221")) return ABS_221;
        if (value.equals("ABS-223")) return ABS_223;
        if (value.equals("ABS-225")) return ABS_225;
        if (value.equals("ABS-227")) return ABS_227;
        if (value.equals("ABS-229")) return ABS_229;
        if (value.equals("ABS-231")) return ABS_231;
        if (value.equals("ABS-233")) return ABS_233;
        if (value.equals("ABS-235")) return ABS_235;
        if (value.equals("ABS-237")) return ABS_237;
        if (value.equals("ABS-239")) return ABS_239;
        if (value.equals("ABS-241")) return ABS_241;
        if (value.equals("ABS-243")) return ABS_243;
        if (value.equals("ABS-245")) return ABS_245;
        if (value.equals("ABS-247")) return ABS_247;
        if (value.equals("ABS-248")) return ABS_248;
        if (value.equals("ABS-249")) return ABS_249;
        if (value.equals("ABS-320")) return ABS_320;
        if (value.equals("ABS-321")) return ABS_321;
        if (value.equals("ABS-322")) return ABS_322;
        if (value.equals("ABS-323")) return ABS_323;
        if (value.equals("ABS-324")) return ABS_324;
        if (value.equals("ABS-326")) return ABS_326;
        if (value.equals("ABS-327")) return ABS_327;
        if (value.equals("ABS-329")) return ABS_329;
        if (value.equals("ABS-330")) return ABS_330;
        if (value.equals("ABS-331")) return ABS_331;
        if (value.equals("ABS-332")) return ABS_332;
        if (value.equals("ABS-333")) return ABS_333;
        if (value.equals("ABS-335")) return ABS_335;
        if (value.equals("ABS-336")) return ABS_336;
        if (value.equals("ABS-337")) return ABS_337;
        if (value.equals("ABS-340")) return ABS_340;
        if (value.equals("ABS-341")) return ABS_341;
        if (value.equals("ABS-342")) return ABS_342;
        if (value.equals("ABS-343")) return ABS_343;
        if (value.equals("ABS-348")) return ABS_348;
        if (value.equals("ABS-349")) return ABS_349;
        throw new IOException("Cannot deserialize AbsLendingPurposeCodeList");
    }
}
