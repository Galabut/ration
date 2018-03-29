package com.ration.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RationDto {

    String name;

    String requiredAmount;

    String age;

    String sex;

    List<String> specialFeatures = new ArrayList<>();

}
