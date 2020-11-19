package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SourceOfFundsTypeList {
    BUSINESS_OWNERSHIP, BUSINESS_SOURCED_INCOME, COMPANY_SALE_OR_EARNINGS, DIRECTORSHIP, DIVORCE_SETTLEMENT, EMPLOYMENT_INCOME, GIFT, GOVERNMENT_BENEFIT, GRANT, INHERITANCE, INSURANCE_SETTLEMENT_PROCEEDS, INVESTMENT_INCOME, LOTTERY, OTHER, PARENTAL_SUPPORT, PAYROLL, PENSION, PERSONAL_SAVINGS, RENTAL_INCOME, ROYALTIES, SALE_OF_ASSET, SALE_OF_REAL_ESTATE_ASSET, SCHOLARSHIP, SIGNIFICANT_OTHER, TOP_EXECUTIVE, TRUST_FUND;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BUSINESS_OWNERSHIP: return "Business Ownership";
            case BUSINESS_SOURCED_INCOME: return "Business Sourced Income";
            case COMPANY_SALE_OR_EARNINGS: return "Company Sale or Earnings";
            case DIRECTORSHIP: return "Directorship";
            case DIVORCE_SETTLEMENT: return "Divorce Settlement";
            case EMPLOYMENT_INCOME: return "Employment Income";
            case GIFT: return "Gift";
            case GOVERNMENT_BENEFIT: return "Government Benefit";
            case GRANT: return "Grant";
            case INHERITANCE: return "Inheritance";
            case INSURANCE_SETTLEMENT_PROCEEDS: return "Insurance Settlement Proceeds";
            case INVESTMENT_INCOME: return "Investment Income";
            case LOTTERY: return "Lottery";
            case OTHER: return "Other";
            case PARENTAL_SUPPORT: return "Parental Support";
            case PAYROLL: return "Payroll";
            case PENSION: return "Pension";
            case PERSONAL_SAVINGS: return "Personal Savings";
            case RENTAL_INCOME: return "Rental Income";
            case ROYALTIES: return "Royalties";
            case SALE_OF_ASSET: return "Sale of Asset";
            case SALE_OF_REAL_ESTATE_ASSET: return "Sale of Real Estate Asset";
            case SCHOLARSHIP: return "Scholarship";
            case SIGNIFICANT_OTHER: return "Significant Other";
            case TOP_EXECUTIVE: return "Top Executive";
            case TRUST_FUND: return "Trust Fund";
        }
        return null;
    }

    @JsonCreator
    public static SourceOfFundsTypeList forValue(String value) throws IOException {
        if (value.equals("Business Ownership")) return BUSINESS_OWNERSHIP;
        if (value.equals("Business Sourced Income")) return BUSINESS_SOURCED_INCOME;
        if (value.equals("Company Sale or Earnings")) return COMPANY_SALE_OR_EARNINGS;
        if (value.equals("Directorship")) return DIRECTORSHIP;
        if (value.equals("Divorce Settlement")) return DIVORCE_SETTLEMENT;
        if (value.equals("Employment Income")) return EMPLOYMENT_INCOME;
        if (value.equals("Gift")) return GIFT;
        if (value.equals("Government Benefit")) return GOVERNMENT_BENEFIT;
        if (value.equals("Grant")) return GRANT;
        if (value.equals("Inheritance")) return INHERITANCE;
        if (value.equals("Insurance Settlement Proceeds")) return INSURANCE_SETTLEMENT_PROCEEDS;
        if (value.equals("Investment Income")) return INVESTMENT_INCOME;
        if (value.equals("Lottery")) return LOTTERY;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Parental Support")) return PARENTAL_SUPPORT;
        if (value.equals("Payroll")) return PAYROLL;
        if (value.equals("Pension")) return PENSION;
        if (value.equals("Personal Savings")) return PERSONAL_SAVINGS;
        if (value.equals("Rental Income")) return RENTAL_INCOME;
        if (value.equals("Royalties")) return ROYALTIES;
        if (value.equals("Sale of Asset")) return SALE_OF_ASSET;
        if (value.equals("Sale of Real Estate Asset")) return SALE_OF_REAL_ESTATE_ASSET;
        if (value.equals("Scholarship")) return SCHOLARSHIP;
        if (value.equals("Significant Other")) return SIGNIFICANT_OTHER;
        if (value.equals("Top Executive")) return TOP_EXECUTIVE;
        if (value.equals("Trust Fund")) return TRUST_FUND;
        throw new IOException("Cannot deserialize SourceOfFundsTypeList");
    }
}
