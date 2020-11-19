package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanDetailPackage {
    private String category;
    private String code;
    private String memberID;
    private String name;
    private String optionCode;
    private String organisation;
}
