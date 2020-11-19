package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum CollateralClassList {
    ACCOUNT, AGRICULTURE, AIRCRAFT, AIRCRAFT_ENGINE, AIRFRAME, ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITHOUT_EXCEPTION, ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITH_EXCEPTION, CHATTEL_PAPER, CIRCUIT_LAYOUT, COPYRIGHT, CROPS, CURRENCY, DESIGN, DOCUMENT_OF_TITLE, GENERAL_INTANGIBLE, HELICOPTER, INTELLECTUAL_PROPERTY, INTERMEDIATE_SECURITY, INVESTMENT_INSTRUMENT, LIVESTOCK, MOTOR_VEHICLE, NEGOTIABLE_INSTRUMENT, OTHER_GOODS, PATENT, PLANT_BREEDERS_RIGHT, SMALL_AIRCRAFT, TRADE_MARK, UNKNOWN, UNSUPPORTED, WATERCRAFT;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ACCOUNT: return "Account";
            case AGRICULTURE: return "Agriculture";
            case AIRCRAFT: return "Aircraft";
            case AIRCRAFT_ENGINE: return "Aircraft Engine";
            case AIRFRAME: return "Airframe";
            case ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITHOUT_EXCEPTION: return "All Present and After Acquired Property Without Exception";
            case ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITH_EXCEPTION: return "All Present and After Acquired Property With Exception";
            case CHATTEL_PAPER: return "Chattel Paper";
            case CIRCUIT_LAYOUT: return "Circuit Layout";
            case COPYRIGHT: return "Copyright";
            case CROPS: return "Crops";
            case CURRENCY: return "Currency";
            case DESIGN: return "Design";
            case DOCUMENT_OF_TITLE: return "Document of Title";
            case GENERAL_INTANGIBLE: return "General Intangible";
            case HELICOPTER: return "Helicopter";
            case INTELLECTUAL_PROPERTY: return "Intellectual Property";
            case INTERMEDIATE_SECURITY: return "Intermediate Security";
            case INVESTMENT_INSTRUMENT: return "Investment Instrument";
            case LIVESTOCK: return "Livestock";
            case MOTOR_VEHICLE: return "Motor Vehicle";
            case NEGOTIABLE_INSTRUMENT: return "Negotiable Instrument";
            case OTHER_GOODS: return "Other Goods";
            case PATENT: return "Patent";
            case PLANT_BREEDERS_RIGHT: return "Plant Breeders Right";
            case SMALL_AIRCRAFT: return "Small Aircraft";
            case TRADE_MARK: return "Trade Mark";
            case UNKNOWN: return "Unknown";
            case UNSUPPORTED: return "Unsupported";
            case WATERCRAFT: return "Watercraft";
        }
        return null;
    }

    @JsonCreator
    public static CollateralClassList forValue(String value) throws IOException {
        if (value.equals("Account")) return ACCOUNT;
        if (value.equals("Agriculture")) return AGRICULTURE;
        if (value.equals("Aircraft")) return AIRCRAFT;
        if (value.equals("Aircraft Engine")) return AIRCRAFT_ENGINE;
        if (value.equals("Airframe")) return AIRFRAME;
        if (value.equals("All Present and After Acquired Property Without Exception")) return ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITHOUT_EXCEPTION;
        if (value.equals("All Present and After Acquired Property With Exception")) return ALL_PRESENT_AND_AFTER_ACQUIRED_PROPERTY_WITH_EXCEPTION;
        if (value.equals("Chattel Paper")) return CHATTEL_PAPER;
        if (value.equals("Circuit Layout")) return CIRCUIT_LAYOUT;
        if (value.equals("Copyright")) return COPYRIGHT;
        if (value.equals("Crops")) return CROPS;
        if (value.equals("Currency")) return CURRENCY;
        if (value.equals("Design")) return DESIGN;
        if (value.equals("Document of Title")) return DOCUMENT_OF_TITLE;
        if (value.equals("General Intangible")) return GENERAL_INTANGIBLE;
        if (value.equals("Helicopter")) return HELICOPTER;
        if (value.equals("Intellectual Property")) return INTELLECTUAL_PROPERTY;
        if (value.equals("Intermediate Security")) return INTERMEDIATE_SECURITY;
        if (value.equals("Investment Instrument")) return INVESTMENT_INSTRUMENT;
        if (value.equals("Livestock")) return LIVESTOCK;
        if (value.equals("Motor Vehicle")) return MOTOR_VEHICLE;
        if (value.equals("Negotiable Instrument")) return NEGOTIABLE_INSTRUMENT;
        if (value.equals("Other Goods")) return OTHER_GOODS;
        if (value.equals("Patent")) return PATENT;
        if (value.equals("Plant Breeders Right")) return PLANT_BREEDERS_RIGHT;
        if (value.equals("Small Aircraft")) return SMALL_AIRCRAFT;
        if (value.equals("Trade Mark")) return TRADE_MARK;
        if (value.equals("Unknown")) return UNKNOWN;
        if (value.equals("Unsupported")) return UNSUPPORTED;
        if (value.equals("Watercraft")) return WATERCRAFT;
        throw new IOException("Cannot deserialize CollateralClassList");
    }
}
