package io.model;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LoanWriterConfirmations {
    private YesNoList advisedDocumentsImminentIfSuccessful;
    private YesNoList advisedIdentificationProcessRequired;
    private YesNoList advisedInformationUsedInAssessment;
    private YesNoList advisedOfWithdrawalInstructions;
    private YesNoList completedStatementOfPosition;
    private YesNoList obtainedAgreementForJointStatementOfPosition;
    private YesNoList obtainedSignedDeclaration;
    private YesNoList verifiedGuarantorIncome;
}
