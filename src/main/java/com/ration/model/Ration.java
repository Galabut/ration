package com.ration.model;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Builder
@Entity
@Table
public class Ration {

    @GeneratedValue
    @Id
    private Long id;


    private String name;

    @Column(name = "MKG")
    private BigDecimal requiredAmount;

    private Integer startAge;

    private Integer endAge;

    @Enumerated(EnumType.STRING)
    private Enum sex;

    @Enumerated(EnumType.STRING)
    private Enum healthFeature;
}
