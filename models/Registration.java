package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Registration {
    private String givingOfNoticeIdentifier;
    private YesNoList purchaseMoneySecurityInterest;
    private String registrationEndDateTime;
    private String registrationNumber;
    private String registrationStartDateTime;
    private String registrationToken;
    private String securedPartyGroupNumber;
    private List<RegistrationEvent> registrationEvent;
}
