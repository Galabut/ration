package com.ration.dto;

public enum Sex {
    F("ж"),
    M("м"),
    KID("д");

    private String inputName;

    Sex(String inputName) {
        this.inputName = inputName;
    }
}
