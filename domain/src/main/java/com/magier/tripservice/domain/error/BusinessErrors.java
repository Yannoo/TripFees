package com.magier.tripservice.domain.error;

public enum BusinessErrors {

    MISSING_DESTINATION("error.destination.missing");

    private final String code;

    BusinessErrors(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
