package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum PoBoxTypeList {
    CARE_OF_POST_OFFICE, COMMUNITY_MAIL_AGENT, COMMUNITY_MAIL_BAG, COMMUNITY_POSTAL_AGENT, FREEPOST, GPO_BOX, LOCKED_BAG, MAIL_BAG, MAIL_SERVICE, POSTAL_MAIL_BAG, POSTE_RESTANTE, PO_BOX, PRIVATE_BAG, ROADSIDE_DELIVERY, ROADSIDE_MAIL_BAG, ROADSIDE_MAIL_BOX, ROADSIDE_MAIL_SERVICE, RURAL_MAIL_BAG;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CARE_OF_POST_OFFICE: return "Care of Post Office";
            case COMMUNITY_MAIL_AGENT: return "Community Mail Agent";
            case COMMUNITY_MAIL_BAG: return "Community Mail Bag";
            case COMMUNITY_POSTAL_AGENT: return "Community Postal Agent";
            case FREEPOST: return "Freepost";
            case GPO_BOX: return "GPO Box";
            case LOCKED_BAG: return "Locked Bag";
            case MAIL_BAG: return "Mail Bag";
            case MAIL_SERVICE: return "Mail Service";
            case POSTAL_MAIL_BAG: return "Postal Mail Bag";
            case POSTE_RESTANTE: return "Poste Restante";
            case PO_BOX: return "PO Box";
            case PRIVATE_BAG: return "Private Bag";
            case ROADSIDE_DELIVERY: return "Roadside Delivery";
            case ROADSIDE_MAIL_BAG: return "Roadside Mail Bag";
            case ROADSIDE_MAIL_BOX: return "Roadside Mail Box";
            case ROADSIDE_MAIL_SERVICE: return "Roadside Mail Service";
            case RURAL_MAIL_BAG: return "Rural Mail Bag";
        }
        return null;
    }

    @JsonCreator
    public static PoBoxTypeList forValue(String value) throws IOException {
        if (value.equals("Care of Post Office")) return CARE_OF_POST_OFFICE;
        if (value.equals("Community Mail Agent")) return COMMUNITY_MAIL_AGENT;
        if (value.equals("Community Mail Bag")) return COMMUNITY_MAIL_BAG;
        if (value.equals("Community Postal Agent")) return COMMUNITY_POSTAL_AGENT;
        if (value.equals("Freepost")) return FREEPOST;
        if (value.equals("GPO Box")) return GPO_BOX;
        if (value.equals("Locked Bag")) return LOCKED_BAG;
        if (value.equals("Mail Bag")) return MAIL_BAG;
        if (value.equals("Mail Service")) return MAIL_SERVICE;
        if (value.equals("Postal Mail Bag")) return POSTAL_MAIL_BAG;
        if (value.equals("Poste Restante")) return POSTE_RESTANTE;
        if (value.equals("PO Box")) return PO_BOX;
        if (value.equals("Private Bag")) return PRIVATE_BAG;
        if (value.equals("Roadside Delivery")) return ROADSIDE_DELIVERY;
        if (value.equals("Roadside Mail Bag")) return ROADSIDE_MAIL_BAG;
        if (value.equals("Roadside Mail Box")) return ROADSIDE_MAIL_BOX;
        if (value.equals("Roadside Mail Service")) return ROADSIDE_MAIL_SERVICE;
        if (value.equals("Rural Mail Bag")) return RURAL_MAIL_BAG;
        throw new IOException("Cannot deserialize PoBoxTypeList");
    }
}
