package com.ration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RationDto {

    private String name;

    private String requiredAmount;

    private Integer startAge;

    private Integer endAge;

    private String sex;

    private String healthFeature;

}
