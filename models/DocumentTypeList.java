package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum DocumentTypeList {
    AUSTRALIAN_BIRTH_CERTIFICATE, AUSTRALIAN_CITIZENSHIP_CERTIFICATE, AUSTRALIAN_DRIVERS_LICENCE, AUSTRALIAN_PASSPORT, AUSTRALIAN_PHOTO_FIREARMS_LICENCE, AUSTRALIAN_TAXATION_OFFICE_CORRESPONDENCE_WITH_TFN, BANK_STATEMENT, CENTRELINK_OR_SOCIAL_SECURITY_CARD, CREDIT_CARD, DEED_POLL, DEPARTMENT_OF_VETERANS_AFFAIRS_CARD, ELECTORAL_ROLL_ACKNOWLEDGEMENT, ELECTRICITY_BILL, GAS_BILL, GOVERNMENT_BENEFITS_NOTICE, HEALTH_CARE_CARD, INTERNATIONAL_PASSPORT, INTERNET_SERVICE_PROVIDER_BILL, LANDLINE_PHONE_BILL, MARRIAGE_CERTIFICATE, MEDICARE_CARD, MOTOR_VEHICLE_REGISTRATION_OR_INSURANCE_PAPERS, NATIONAL_IDENTITY_CARD, OTHER, PENSION_CARD, PROFESSIONAL_OR_TRADE_ASSOCIATION_CARD, PROOF_OF_AGE_CARD, PROPERTY_INSURANCE_PAPERS, PROPERTY_LEASE_OR_RENTAL_AGREEMENT, RATES_NOTICE, STATE_OR_FEDERAL_GOVERNMENT_EMPLOYEE_PHOTO_IDENTITY_CARD, TAX_ASSESSMENT, TERTIARY_EDUCATION_INSTITUTION_PHOTO_IDENTITY_CARD, VERIFICATION_OF_IDENTITY_DOCUMENT, WATER_UTILITY_BILL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case AUSTRALIAN_BIRTH_CERTIFICATE: return "Australian Birth Certificate";
            case AUSTRALIAN_CITIZENSHIP_CERTIFICATE: return "Australian Citizenship Certificate";
            case AUSTRALIAN_DRIVERS_LICENCE: return "Australian Drivers Licence";
            case AUSTRALIAN_PASSPORT: return "Australian Passport";
            case AUSTRALIAN_PHOTO_FIREARMS_LICENCE: return "Australian Photo Firearms Licence";
            case AUSTRALIAN_TAXATION_OFFICE_CORRESPONDENCE_WITH_TFN: return "Australian Taxation Office Correspondence (with TFN)";
            case BANK_STATEMENT: return "Bank Statement";
            case CENTRELINK_OR_SOCIAL_SECURITY_CARD: return "Centrelink or Social Security Card";
            case CREDIT_CARD: return "Credit Card";
            case DEED_POLL: return "Deed Poll";
            case DEPARTMENT_OF_VETERANS_AFFAIRS_CARD: return "Department of Veterans Affairs Card";
            case ELECTORAL_ROLL_ACKNOWLEDGEMENT: return "Electoral Roll Acknowledgement";
            case ELECTRICITY_BILL: return "Electricity Bill";
            case GAS_BILL: return "Gas Bill";
            case GOVERNMENT_BENEFITS_NOTICE: return "Government Benefits Notice";
            case HEALTH_CARE_CARD: return "Health Care Card";
            case INTERNATIONAL_PASSPORT: return "International Passport";
            case INTERNET_SERVICE_PROVIDER_BILL: return "Internet Service Provider Bill";
            case LANDLINE_PHONE_BILL: return "Landline Phone Bill";
            case MARRIAGE_CERTIFICATE: return "Marriage Certificate";
            case MEDICARE_CARD: return "Medicare Card";
            case MOTOR_VEHICLE_REGISTRATION_OR_INSURANCE_PAPERS: return "Motor Vehicle Registration or Insurance Papers";
            case NATIONAL_IDENTITY_CARD: return "National Identity Card";
            case OTHER: return "Other";
            case PENSION_CARD: return "Pension Card";
            case PROFESSIONAL_OR_TRADE_ASSOCIATION_CARD: return "Professional or Trade Association Card";
            case PROOF_OF_AGE_CARD: return "Proof of Age Card";
            case PROPERTY_INSURANCE_PAPERS: return "Property Insurance Papers";
            case PROPERTY_LEASE_OR_RENTAL_AGREEMENT: return "Property Lease or Rental Agreement";
            case RATES_NOTICE: return "Rates Notice";
            case STATE_OR_FEDERAL_GOVERNMENT_EMPLOYEE_PHOTO_IDENTITY_CARD: return "State or Federal Government Employee Photo Identity Card";
            case TAX_ASSESSMENT: return "Tax Assessment";
            case TERTIARY_EDUCATION_INSTITUTION_PHOTO_IDENTITY_CARD: return "Tertiary Education Institution Photo Identity Card";
            case VERIFICATION_OF_IDENTITY_DOCUMENT: return "Verification of Identity Document";
            case WATER_UTILITY_BILL: return "Water Utility Bill";
        }
        return null;
    }

    @JsonCreator
    public static DocumentTypeList forValue(String value) throws IOException {
        if (value.equals("Australian Birth Certificate")) return AUSTRALIAN_BIRTH_CERTIFICATE;
        if (value.equals("Australian Citizenship Certificate")) return AUSTRALIAN_CITIZENSHIP_CERTIFICATE;
        if (value.equals("Australian Drivers Licence")) return AUSTRALIAN_DRIVERS_LICENCE;
        if (value.equals("Australian Passport")) return AUSTRALIAN_PASSPORT;
        if (value.equals("Australian Photo Firearms Licence")) return AUSTRALIAN_PHOTO_FIREARMS_LICENCE;
        if (value.equals("Australian Taxation Office Correspondence (with TFN)")) return AUSTRALIAN_TAXATION_OFFICE_CORRESPONDENCE_WITH_TFN;
        if (value.equals("Bank Statement")) return BANK_STATEMENT;
        if (value.equals("Centrelink or Social Security Card")) return CENTRELINK_OR_SOCIAL_SECURITY_CARD;
        if (value.equals("Credit Card")) return CREDIT_CARD;
        if (value.equals("Deed Poll")) return DEED_POLL;
        if (value.equals("Department of Veterans Affairs Card")) return DEPARTMENT_OF_VETERANS_AFFAIRS_CARD;
        if (value.equals("Electoral Roll Acknowledgement")) return ELECTORAL_ROLL_ACKNOWLEDGEMENT;
        if (value.equals("Electricity Bill")) return ELECTRICITY_BILL;
        if (value.equals("Gas Bill")) return GAS_BILL;
        if (value.equals("Government Benefits Notice")) return GOVERNMENT_BENEFITS_NOTICE;
        if (value.equals("Health Care Card")) return HEALTH_CARE_CARD;
        if (value.equals("International Passport")) return INTERNATIONAL_PASSPORT;
        if (value.equals("Internet Service Provider Bill")) return INTERNET_SERVICE_PROVIDER_BILL;
        if (value.equals("Landline Phone Bill")) return LANDLINE_PHONE_BILL;
        if (value.equals("Marriage Certificate")) return MARRIAGE_CERTIFICATE;
        if (value.equals("Medicare Card")) return MEDICARE_CARD;
        if (value.equals("Motor Vehicle Registration or Insurance Papers")) return MOTOR_VEHICLE_REGISTRATION_OR_INSURANCE_PAPERS;
        if (value.equals("National Identity Card")) return NATIONAL_IDENTITY_CARD;
        if (value.equals("Other")) return OTHER;
        if (value.equals("Pension Card")) return PENSION_CARD;
        if (value.equals("Professional or Trade Association Card")) return PROFESSIONAL_OR_TRADE_ASSOCIATION_CARD;
        if (value.equals("Proof of Age Card")) return PROOF_OF_AGE_CARD;
        if (value.equals("Property Insurance Papers")) return PROPERTY_INSURANCE_PAPERS;
        if (value.equals("Property Lease or Rental Agreement")) return PROPERTY_LEASE_OR_RENTAL_AGREEMENT;
        if (value.equals("Rates Notice")) return RATES_NOTICE;
        if (value.equals("State or Federal Government Employee Photo Identity Card")) return STATE_OR_FEDERAL_GOVERNMENT_EMPLOYEE_PHOTO_IDENTITY_CARD;
        if (value.equals("Tax Assessment")) return TAX_ASSESSMENT;
        if (value.equals("Tertiary Education Institution Photo Identity Card")) return TERTIARY_EDUCATION_INSTITUTION_PHOTO_IDENTITY_CARD;
        if (value.equals("Verification of Identity Document")) return VERIFICATION_OF_IDENTITY_DOCUMENT;
        if (value.equals("Water Utility Bill")) return WATER_UTILITY_BILL;
        throw new IOException("Cannot deserialize DocumentTypeList");
    }
}
