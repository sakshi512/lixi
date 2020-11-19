package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Privacy {
    private YesNoList allowApplicationStatusUpdates;
    private YesNoList allowCreditBureauIdentityCheck;
    private YesNoList allowCreditCheck;
    private YesNoList allowDirectMarketing;
    private YesNoList allowElectronicIdentityCheck;
    private YesNoList allowTelemarketing;
    private YesNoList allowThirdPartyDisclosure;
    private YesNoList creditAuthoritySigned;
    private String dateSigned;
    private YesNoList privacyActConsentSigned;
}
