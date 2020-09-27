package com.university.units;

public enum PropertyType {
    PRIVATE, STATE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

