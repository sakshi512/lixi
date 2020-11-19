package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class PersonApplicantContact {
    private PreferredContactPersonList preferredContact;
    private CurrentAddress currentAddress;
    private List<EmailAddress> emailAddress;
    private PhoneType faxNumber;
    private PhoneType homePhone;
    private PhoneType mobile;
    private PostSettlementAddress postSettlementAddress;
    private PreviousAddress previousAddress;
    private List<PriorAddress> priorAddress;
    private PhoneType workPhone;
}
