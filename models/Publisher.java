package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Publisher {
    private String companyName;
    private String contactName;
    private String email;
    private String lixiCode;
    private String publishedDateTime;
    private PhoneType phoneNumber;
    private List<RelatedSoftware> relatedSoftware;
    private PublisherSoftware software;
}
