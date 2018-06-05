package com.ration.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@ToString
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
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private HealthFeature healthFeature;
}
