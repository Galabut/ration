package model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import lombok.Getter;

@Component
@Getter
public class Ration {

    Long id;

    String name;

    BigDecimal requiredAmount;

    String age;

    String sex;
}
