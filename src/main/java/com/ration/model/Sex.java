package com.ration.model;

public enum Sex {
    F("f"),
    M("m"),
    KID("k");

    private String inputSex;


    public String getInputSex() {
        return inputSex;
    }

    Sex(String inputSex) {
        this.inputSex = inputSex;
    }

    public static Sex getSex(String inputSex) {
        for (Sex sex : Sex.values()) {
            if (sex.getInputSex().equals(inputSex)) {
                return sex;
            }
        }
        return null;
    }
}
