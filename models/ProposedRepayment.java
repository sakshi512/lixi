package io.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ProposedRepayment {
    private String anniversaryDate;
    private String description;
    private ProposedRepaymentMethodList method;
    private PaymentTimingList paymentTiming;
    private Double perDiemPaymentAmount;
    private String perDiemPaymentDate;
    private Double perDiemPaymentGSTAmount;
    private Double perDiemPaymentStampDutyAmount;
    private YesNoList regular;
    private ProposedRepaymentCreditCard creditCard;
    private FinancialAccountType fromAccount;
    private List<RegularRepayment> regularRepayment;
    private StructuredPayments structuredPayments;
}
