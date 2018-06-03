package com.ration.dto;

import com.ration.model.HealthFeature;
import com.ration.model.Ration;
import com.ration.model.Sex;

import java.math.BigDecimal;

public class DtoConverterFactory {

    private final static Integer KID_AGE_LIMIT = 18;

    public static Ration fromRationDto(RationDto dto) {
        if (dto != null) {
            return Ration.builder()
                    .name(dto.getName())
                    .sex(kidAge(dto.getEndAge()) ? Sex.KID : Sex.getSex(dto.getSex()))
                    .requiredAmount(new BigDecimal(dto.getRequiredAmount()))
                    .startAge(dto.getStartAge())
                    .endAge(dto.getEndAge())
                    .healthFeature(HealthFeature.getFeature(dto.getHealthFeature()))
                    .build();
        } else return null;
    }

    private static boolean kidAge(Integer endAge) {
        return endAge < KID_AGE_LIMIT;
    }
}
