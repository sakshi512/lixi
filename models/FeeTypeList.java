package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum FeeTypeList {
    ACCEPTANCE_FEE, ADDITIONAL_SECURITY_FEE, ANNUAL_FEE, APPLICATION_FEE, BROKERAGE_FEE, CASH_BENEFIT_INSURANCE, CONSTRUCTION_PROGRESS_INSPECTION_FEE, CONSUMER_CREDIT_INSURANCE, DOCUMENTATION_FEE, EARLY_REPAYMENT_ADMIN_FEE, ESTABLISHMENT_FEE, EXTENDED_WARRANTY_INSURANCE, GUARANTEE_ASSET_PROTECTION_INSURANCE, LAND_TITLES_OFFICE_FINAL_SEARCH_FEE, LAND_TITLES_OFFICE_SEARCH_FEE, LEGAL_FEE, LMI, LOAN_FEE, MORTGAGE_REGISTRATION, MOTOR_VEHICLE_INSURANCE, OTHER, PACKAGE_FEE, RATE_LOCK_FEE, REDUCED_EQUITY_FEE, RE_DOCUMENTATION_FEE, RISK_FEE, ROLLOVER_FEE, SECURITY_GUARANTEE_FEE, SECURITY_RELEASE_FEE, SERVICE_PLAN, SETTLEMENT_FEE, STAMP_DUTY_ON_MORTGAGE, STAMP_DUTY_ON_TRANSFER_OF_PROPERTY, SUBSTITUTE_SECURITY_FEE, SWITCH_FEE, THIRD_PARTY_DOCUMENT_PRODUCTION_FEE, TITLE_TRANSFER_FEE, TYRE_AND_RIM_INSURANCE, UNUSED_FACILITY_FEE, VALUATION_FEE, WITHDRAWAL_OF_CAVEAT_FEE, WITHDRAWAL_OF_WRIT_FEE;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCEPTANCE_FEE: return "Acceptance Fee";
            case ADDITIONAL_SECURITY_FEE: return "Additional Security Fee";
            case ANNUAL_FEE: return "Annual Fee";
            case APPLICATION_FEE: return "Application Fee";
            case BROKERAGE_FEE: return "Brokerage Fee";
            case CASH_BENEFIT_INSURANCE: return "Cash Benefit Insurance";
            case CONSTRUCTION_PROGRESS_INSPECTION_FEE: return "Construction Progress Inspection Fee";
            case CONSUMER_CREDIT_INSURANCE: return "Consumer Credit Insurance";
            case DOCUMENTATION_FEE: return "Documentation Fee";
            case EARLY_REPAYMENT_ADMIN_FEE: return "Early Repayment Admin Fee";
            case ESTABLISHMENT_FEE: return "Establishment Fee";
            case EXTENDED_WARRANTY_INSURANCE: return "Extended Warranty Insurance";
            case GUARANTEE_ASSET_PROTECTION_INSURANCE: return "Guarantee Asset Protection Insurance";
            case LAND_TITLES_OFFICE_FINAL_SEARCH_FEE: return "Land Titles Office Final Search Fee";
            case LAND_TITLES_OFFICE_SEARCH_FEE: return "Land Titles Office Search Fee";
            case LEGAL_FEE: return "Legal Fee";
            case LMI: return "LMI";
            case LOAN_FEE: return "Loan Fee";
            case MORTGAGE_REGISTRATION: return "Mortgage Registration";
            case MOTOR_VEHICLE_INSURANCE: return "Motor Vehicle Insurance";
            case OTHER: return "Other";
            case PACKAGE_FEE: return "Package Fee";
            case RATE_LOCK_FEE: return "Rate Lock Fee";
            case REDUCED_EQUITY_FEE: return "Reduced Equity Fee";
            case RE_DOCUMENTATION_FEE: return "Re-documentation Fee";
            case RISK_FEE: return "Risk Fee";
            case ROLLOVER_FEE: return "Rollover Fee";
            case SECURITY_GUARANTEE_FEE: return "Security Guarantee Fee";
            case SECURITY_RELEASE_FEE: return "Security Release Fee";
            case SERVICE_PLAN: return "Service Plan";
            case SETTLEMENT_FEE: return "Settlement Fee";
            case STAMP_DUTY_ON_MORTGAGE: return "Stamp Duty on Mortgage";
            case STAMP_DUTY_ON_TRANSFER_OF_PROPERTY: return "Stamp Duty on Transfer of Property";
            case SUBSTITUTE_SECURITY_FEE: return "Substitute Security Fee";
            case SWITCH_FEE: return "Switch Fee";
            case THIRD_PARTY_DOCUMENT_PRODUCTION_FEE: return "Third Party Document Production Fee";
            case TITLE_TRANSFER_FEE: return "Title Transfer Fee";
            case TYRE_AND_RIM_INSURANCE: return "Tyre and Rim Insurance";
            case UNUSED_FACILITY_FEE: return "Unused Facility Fee";
            case VALUATION_FEE: return "Valuation Fee";
            case WITHDRAWAL_OF_CAVEAT_FEE: return "Withdrawal of Caveat Fee";
            case WITHDRAWAL_OF_WRIT_FEE: return "Withdrawal of Writ Fee";
        }
        return null;
    }

    @JsonCreator
    public static FeeTypeList forValue(String value) throws IOException {
        if (value.equals("Acceptance Fee")) return ACCEPTANCE_FEE;
        if (value.equals("Additional Security Fee")) return ADDITIONAL_SECURITY_FEE;
        if (value.equals("Annual Fee")) return ANNUAL_FEE;
        if (value.equals("Application Fee")) return APPLICATION_FEE;
        if (value.equals("Brokerage Fee")) return BROKERAGE_FEE;
        if (value.equals("Cash Benefit Insurance")) return CASH_BENEFIT_INSURANCE;
        if (value.equals("Construction Progress Inspection Fee")) return CONSTRUCTION_PROGRESS_INSPECTION_FEE;
        if (value.equals("Consumer Credit Insurance")) return CONSUMER_CREDIT_INSURANCE;
        if (value.equals("Documentation Fee")) return DOCUMENTATION_FEE;
        if (value.equals("Early Repayment Admin Fee")) return EARLY_REPAYMENT_ADMIN_FEE;
        if (value.equals("Establishment Fee")) return ESTABLISHMENT_FEE;
        if (value.equals("Extended Warranty Insurance")) return EXTENDED_WARRANTY_INSURANCE;
        if (value.equals("Guarantee Asset Protection Insurance")) return GUARANTEE_ASSET_PROTECTION_INSURANCE;
        if (value.equals("Land Titles Office Final Search Fee")) return LAND_TITLES_OFFICE_FINAL_SEARCH_FEE;
        if (value.equals("Land Titles Office Search Fee")) return LAND_TITLES_OFFICE_SEARCH_FEE;
        if (value.equals("Legal Fee")) return LEGAL_FEE;
        if (value.equals("LMI")) return LMI;
        if (value.equals("Loan Fee")) return LOAN_FEE;
        if (value.equals("Mortgage Registration")) return MORTGAGE_REGISTRATION;
        if (value.equals("Motor Vehicle Insurance")) return MOTOR_VEHICLE_INSURANCE;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Package Fee")) return PACKAGE_FEE;
        if (value.equals("Rate Lock Fee")) return RATE_LOCK_FEE;
        if (value.equals("Reduced Equity Fee")) return REDUCED_EQUITY_FEE;
        if (value.equals("Re-documentation Fee")) return RE_DOCUMENTATION_FEE;
        if (value.equals("Risk Fee")) return RISK_FEE;
        if (value.equals("Rollover Fee")) return ROLLOVER_FEE;
        if (value.equals("Security Guarantee Fee")) return SECURITY_GUARANTEE_FEE;
        if (value.equals("Security Release Fee")) return SECURITY_RELEASE_FEE;
        if (value.equals("Service Plan")) return SERVICE_PLAN;
        if (value.equals("Settlement Fee")) return SETTLEMENT_FEE;
        if (value.equals("Stamp Duty on Mortgage")) return STAMP_DUTY_ON_MORTGAGE;
        if (value.equals("Stamp Duty on Transfer of Property")) return STAMP_DUTY_ON_TRANSFER_OF_PROPERTY;
        if (value.equals("Substitute Security Fee")) return SUBSTITUTE_SECURITY_FEE;
        if (value.equals("Switch Fee")) return SWITCH_FEE;
        if (value.equals("Third Party Document Production Fee")) return THIRD_PARTY_DOCUMENT_PRODUCTION_FEE;
        if (value.equals("Title Transfer Fee")) return TITLE_TRANSFER_FEE;
        if (value.equals("Tyre and Rim Insurance")) return TYRE_AND_RIM_INSURANCE;
        if (value.equals("Unused Facility Fee")) return UNUSED_FACILITY_FEE;
        if (value.equals("Valuation Fee")) return VALUATION_FEE;
        if (value.equals("Withdrawal of Caveat Fee")) return WITHDRAWAL_OF_CAVEAT_FEE;
        if (value.equals("Withdrawal of Writ Fee")) return WITHDRAWAL_OF_WRIT_FEE;
        throw new IOException("Cannot deserialize FeeTypeList");
    }
}
