package com.ration.model;

public enum HealthFeature {
    PREGNANT("беременная"),
    LACTATING("кормящая");

    private String healthFeature;


    public String getHealthFeature() {
        return healthFeature;
    }

    HealthFeature(String healthFeature) {
        this.healthFeature = healthFeature;
    }

    public static HealthFeature getFeature(String healthFeature) {
        for (HealthFeature feature : HealthFeature.values()) {
            if (feature.getHealthFeature().equals(healthFeature)) {
                return feature;
            }
        }
        return null;
    }
}
