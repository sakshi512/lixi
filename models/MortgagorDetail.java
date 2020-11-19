package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class MortgagorDetail {
    private YesNoList changeNameFormRequired;
    private String name;
    private ReasonForDifferentNameList reasonForDifferentName;
    private String xMortgagor;
}
