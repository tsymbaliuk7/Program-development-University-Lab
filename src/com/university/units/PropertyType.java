package com.university.units;

public enum PropertyType {
    PRIVATE_UNIVERSITY, STATE_UNIVERSITY;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}

