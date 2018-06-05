package com.ration.model;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum AgeGroup {
    Child(3, 6),
    Beginner(7, 10),
    Preteen(11, 13),
    Teen(14, 17),
    Adult(18, 59),
    Aged(60, 90);

    private int startAge;
    private int endAge;

    AgeGroup(int startAge, int endAge) {
        this.startAge = startAge;
        this.endAge = endAge;
    }

    public static AgeGroup getAgeGroup(int age) {

        for (AgeGroup group : AgeGroup.values()) {
            if (group.startAge <= age && group.endAge >= age) {
                return group;
            }
        }
        log.info("Unknown AgeGroup for age: " + age);
        return null;
    }
}
