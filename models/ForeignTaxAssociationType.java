package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ForeignTaxAssociationType {
    private YesNoList selfCertificationDeclaration;
    private ForeignTaxAssociationStatusList status;
    private List<Detail> detail;
}
