package com.ration.dto;

import com.ration.model.HealthFeature;
import com.ration.model.Ration;
import com.ration.model.Sex;

import java.math.BigDecimal;

public class DtoConverterFactory {

    private final static Integer KID_AGE_LIMIT = 18;

    public static Ration fromRationDto(RationDto dto) {
        if (dto != null) {
            Ration ration = new Ration();
            ration.setName(dto.getName());
            ration.setSex(kidAge(dto.getEndAge()) ? Sex.KID : Sex.getSex(dto.getSex()));
            ration.setRequiredAmount(new BigDecimal(dto.getRequiredAmount()));
            ration.setStartAge(dto.getStartAge());
            ration.setEndAge(dto.getEndAge());
            ration.setHealthFeature(HealthFeature.getFeature(dto.getHealthFeature()));
            return ration;
        } else return null;
    }

    private static boolean kidAge(Integer endAge) {
        return endAge < KID_AGE_LIMIT;
    }
}
