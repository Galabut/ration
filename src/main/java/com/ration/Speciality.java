package com.ration;

public enum Speciality {
    PREGNANT("беременная"),
    LACTATING("кормящая");

    private String inputName;

    Speciality(String inputName) {
        this.inputName = inputName;
    }
}
