package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PurposeOfApplicationList {
    BRIDGING_INTEREST, BUSINESS, COMMERCIAL_DEVELOPMENT, COMPUTER, CONSTRUCTION, CONSUMER_GOODS, CREDIT_CARD, DEBT_CONSOLIDATION, DENTAL_EXPENSES, DEPOSIT_ACCOUNT, EDUCATION_EXPENSES, HOLIDAY_EXPENSES, HOME_DEPOSIT, HOME_EQUITY, HOME_IMPROVEMENTS, HOUSEHOLD_ITEMS, LEGAL_FEES, MARINE, MARITAL_SETTLEMENT, MEDICAL_EXPENSES, OTHER, OVERDRAFT, PAY_TAXES, PERSONAL_USE, PLANT_AND_EQUIPMENT, PROPERTY_SETTLEMENT, PURCHASE_CARAVAN, PURCHASE_LAND_AND_BUILD, PURCHASE_REAL_ESTATE, PURCHASE_SHARES, PURCHASE_VEHICLE, RECREATION_EXPENSES, REFINANCE_HOME_LOAN, REFINANCE_OTHER, REFINANCE_VEHICLE_LOAN, TRAVEL_REQUIREMENTS, VEHICLE_EXPENSES, WEDDING_EXPENSES;

    @JsonValue
    public String toValue() {
        switch (this) {
            case BRIDGING_INTEREST: return "Bridging Interest";
            case BUSINESS: return "Business";
            case COMMERCIAL_DEVELOPMENT: return "Commercial Development";
            case COMPUTER: return "Computer";
            case CONSTRUCTION: return "Construction";
            case CONSUMER_GOODS: return "Consumer Goods";
            case CREDIT_CARD: return "Credit Card";
            case DEBT_CONSOLIDATION: return "Debt Consolidation";
            case DENTAL_EXPENSES: return "Dental Expenses";
            case DEPOSIT_ACCOUNT: return "Deposit Account";
            case EDUCATION_EXPENSES: return "Education Expenses";
            case HOLIDAY_EXPENSES: return "Holiday Expenses";
            case HOME_DEPOSIT: return "Home Deposit";
            case HOME_EQUITY: return "Home Equity";
            case HOME_IMPROVEMENTS: return "Home Improvements";
            case HOUSEHOLD_ITEMS: return "Household Items";
            case LEGAL_FEES: return "Legal Fees";
            case MARINE: return "Marine";
            case MARITAL_SETTLEMENT: return "Marital Settlement";
            case MEDICAL_EXPENSES: return "Medical Expenses";
            case OTHER: return "Other";
            case OVERDRAFT: return "Overdraft";
            case PAY_TAXES: return "Pay Taxes";
            case PERSONAL_USE: return "Personal Use";
            case PLANT_AND_EQUIPMENT: return "Plant and Equipment";
            case PROPERTY_SETTLEMENT: return "Property Settlement";
            case PURCHASE_CARAVAN: return "Purchase Caravan";
            case PURCHASE_LAND_AND_BUILD: return "Purchase Land and Build";
            case PURCHASE_REAL_ESTATE: return "Purchase Real Estate";
            case PURCHASE_SHARES: return "Purchase Shares";
            case PURCHASE_VEHICLE: return "Purchase Vehicle";
            case RECREATION_EXPENSES: return "Recreation Expenses";
            case REFINANCE_HOME_LOAN: return "Refinance Home Loan";
            case REFINANCE_OTHER: return "Refinance Other";
            case REFINANCE_VEHICLE_LOAN: return "Refinance Vehicle Loan";
            case TRAVEL_REQUIREMENTS: return "Travel Requirements";
            case VEHICLE_EXPENSES: return "Vehicle Expenses";
            case WEDDING_EXPENSES: return "Wedding Expenses";
        }
        return null;
    }

    @JsonCreator
    public static PurposeOfApplicationList forValue(String value) throws IOException {
        if (value.equals("Bridging Interest")) return BRIDGING_INTEREST;
        if (value.equals("Business")) return BUSINESS;
        if (value.equals("Commercial Development")) return COMMERCIAL_DEVELOPMENT;
        if (value.equals("Computer")) return COMPUTER;
        if (value.equals("Construction")) return CONSTRUCTION;
        if (value.equals("Consumer Goods")) return CONSUMER_GOODS;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("Debt Consolidation")) return DEBT_CONSOLIDATION;
        if (value.equals("Dental Expenses")) return DENTAL_EXPENSES;
        if (value.equals("Deposit Account")) return DEPOSIT_ACCOUNT;
        if (value.equals("Education Expenses")) return EDUCATION_EXPENSES;
        if (value.equals("Holiday Expenses")) return HOLIDAY_EXPENSES;
        if (value.equals("Home Deposit")) return HOME_DEPOSIT;
        if (value.equals("Home Equity")) return HOME_EQUITY;
        if (value.equals("Home Improvements")) return HOME_IMPROVEMENTS;
        if (value.equals("Household Items")) return HOUSEHOLD_ITEMS;
        if (value.equals("Legal Fees")) return LEGAL_FEES;
        if (value.equals("Marine")) return MARINE;
        if (value.equals("Marital Settlement")) return MARITAL_SETTLEMENT;
        if (value.equals("Medical Expenses")) return MEDICAL_EXPENSES;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Overdraft")) return OVERDRAFT;
        if (value.equals("Pay Taxes")) return PAY_TAXES;
        if (value.equals("Personal Use")) return PERSONAL_USE;
        if (value.equals("Plant and Equipment")) return PLANT_AND_EQUIPMENT;
        if (value.equals("Property Settlement")) return PROPERTY_SETTLEMENT;
        if (value.equals("Purchase Caravan")) return PURCHASE_CARAVAN;
        if (value.equals("Purchase Land and Build")) return PURCHASE_LAND_AND_BUILD;
        if (value.equals("Purchase Real Estate")) return PURCHASE_REAL_ESTATE;
        if (value.equals("Purchase Shares")) return PURCHASE_SHARES;
        if (value.equals("Purchase Vehicle")) return PURCHASE_VEHICLE;
        if (value.equals("Recreation Expenses")) return RECREATION_EXPENSES;
        if (value.equals("Refinance Home Loan")) return REFINANCE_HOME_LOAN;
        if (value.equals("Refinance Other")) return REFINANCE_OTHER;
        if (value.equals("Refinance Vehicle Loan")) return REFINANCE_VEHICLE_LOAN;
        if (value.equals("Travel Requirements")) return TRAVEL_REQUIREMENTS;
        if (value.equals("Vehicle Expenses")) return VEHICLE_EXPENSES;
        if (value.equals("Wedding Expenses")) return WEDDING_EXPENSES;
        throw new IOException("Cannot deserialize PurposeOfApplicationList");
    }
}
