package io.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum UnitTypeList {
    ANTENNA, APARTMENT, AUTOMATED_TELLER_MACHINE, AUTOMATIC_TELLER, BARBECUE, BOATSHED, BUILDING, BUNGALOW, CAGE, CARPARK, CARSPACE, CLUB, CONDOMINIUM, COOLROOM, COTTAGE, DUPLEX, FACTORY, FLAT, GARAGE, HALL, HOUSE, KIOSK, LEASE, LOBBY, LOFT, LOT, MAISONETTE, MARINE_BERTH, OFFICE, PENTHOUSE, RESERVE, ROOM, SHED, SHOP, SHOWROOM, SIGN, SITE, STALL, STORE, STRATA_UNIT, STUDIO_STUDIO_APARTMENT, SUBSTATION, SUITE, TENANCY, TOWER, TOWNHOUSE, UNIT, VAULT, VILLA, WARD, WAREHOUSE, WORKSHOP;

    @JsonValue
    public String toValue() {
        switch (this) {
            case ANTENNA: return "Antenna";
            case APARTMENT: return "Apartment";
            case AUTOMATED_TELLER_MACHINE: return "Automated Teller Machine";
            case AUTOMATIC_TELLER: return "Automatic Teller";
            case BARBECUE: return "Barbecue";
            case BOATSHED: return "Boatshed";
            case BUILDING: return "Building";
            case BUNGALOW: return "Bungalow";
            case CAGE: return "Cage";
            case CARPARK: return "Carpark";
            case CARSPACE: return "Carspace";
            case CLUB: return "Club";
            case CONDOMINIUM: return "Condominium";
            case COOLROOM: return "Coolroom";
            case COTTAGE: return "Cottage";
            case DUPLEX: return "Duplex";
            case FACTORY: return "Factory";
            case FLAT: return "Flat";
            case GARAGE: return "Garage";
            case HALL: return "Hall";
            case HOUSE: return "House";
            case KIOSK: return "Kiosk";
            case LEASE: return "Lease";
            case LOBBY: return "Lobby";
            case LOFT: return "Loft";
            case LOT: return "Lot";
            case MAISONETTE: return "Maisonette";
            case MARINE_BERTH: return "Marine Berth";
            case OFFICE: return "Office";
            case PENTHOUSE: return "Penthouse";
            case RESERVE: return "Reserve";
            case ROOM: return "Room";
            case SHED: return "Shed";
            case SHOP: return "Shop";
            case SHOWROOM: return "Showroom";
            case SIGN: return "Sign";
            case SITE: return "Site";
            case STALL: return "Stall";
            case STORE: return "Store";
            case STRATA_UNIT: return "Strata Unit";
            case STUDIO_STUDIO_APARTMENT: return "Studio / Studio Apartment";
            case SUBSTATION: return "Substation";
            case SUITE: return "Suite";
            case TENANCY: return "Tenancy";
            case TOWER: return "Tower";
            case TOWNHOUSE: return "Townhouse";
            case UNIT: return "Unit";
            case VAULT: return "Vault";
            case VILLA: return "Villa";
            case WARD: return "Ward";
            case WAREHOUSE: return "Warehouse";
            case WORKSHOP: return "Workshop";
        }
        return null;
    }

    @JsonCreator
    public static UnitTypeList forValue(String value) throws IOException {
        if (value.equals("Antenna")) return ANTENNA;
        if (value.equals("Apartment")) return APARTMENT;
        if (value.equals("Automated Teller Machine")) return AUTOMATED_TELLER_MACHINE;
        if (value.equals("Automatic Teller")) return AUTOMATIC_TELLER;
        if (value.equals("Barbecue")) return BARBECUE;
        if (value.equals("Boatshed")) return BOATSHED;
        if (value.equals("Building")) return BUILDING;
        if (value.equals("Bungalow")) return BUNGALOW;
        if (value.equals("Cage")) return CAGE;
        if (value.equals("Carpark")) return CARPARK;
        if (value.equals("Carspace")) return CARSPACE;
        if (value.equals("Club")) return CLUB;
        if (value.equals("Condominium")) return CONDOMINIUM;
        if (value.equals("Coolroom")) return COOLROOM;
        if (value.equals("Cottage")) return COTTAGE;
        if (value.equals("Duplex")) return DUPLEX;
        if (value.equals("Factory")) return FACTORY;
        if (value.equals("Flat")) return FLAT;
        if (value.equals("Garage")) return GARAGE;
        if (value.equals("Hall")) return HALL;
        if (value.equals("House")) return HOUSE;
        if (value.equals("Kiosk")) return KIOSK;
        if (value.equals("Lease")) return LEASE;
        if (value.equals("Lobby")) return LOBBY;
        if (value.equals("Loft")) return LOFT;
        if (value.equals("Lot")) return LOT;
        if (value.equals("Maisonette")) return MAISONETTE;
        if (value.equals("Marine Berth")) return MARINE_BERTH;
        if (value.equals("Office")) return OFFICE;
        if (value.equals("Penthouse")) return PENTHOUSE;
        if (value.equals("Reserve")) return RESERVE;
        if (value.equals("Room")) return ROOM;
        if (value.equals("Shed")) return SHED;
        if (value.equals("Shop")) return SHOP;
        if (value.equals("Showroom")) return SHOWROOM;
        if (value.equals("Sign")) return SIGN;
        if (value.equals("Site")) return SITE;
        if (value.equals("Stall")) return STALL;
        if (value.equals("Store")) return STORE;
        if (value.equals("Strata Unit")) return STRATA_UNIT;
        if (value.equals("Studio / Studio Apartment")) return STUDIO_STUDIO_APARTMENT;
        if (value.equals("Substation")) return SUBSTATION;
        if (value.equals("Suite")) return SUITE;
        if (value.equals("Tenancy")) return TENANCY;
        if (value.equals("Tower")) return TOWER;
        if (value.equals("Townhouse")) return TOWNHOUSE;
        if (value.equals("Unit")) return UNIT;
        if (value.equals("Vault")) return VAULT;
        if (value.equals("Villa")) return VILLA;
        if (value.equals("Ward")) return WARD;
        if (value.equals("Warehouse")) return WAREHOUSE;
        if (value.equals("Workshop")) return WORKSHOP;
        throw new IOException("Cannot deserialize UnitTypeList");
    }
}
