package com.seam.api.types;

import com.fasterxml.jackson.annotation.JsonValue;

public enum AccessCodesCreateResponseAccessCodeStatus {
    SETTING("setting"),

    SET("set"),

    UNSET("unset"),

    REMOVING("removing"),

    UNKNOWN("unknown");

    private final String value;

    AccessCodesCreateResponseAccessCodeStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
