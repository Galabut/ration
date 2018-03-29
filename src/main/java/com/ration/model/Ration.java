package model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Getter
public class Ration {

    Long id;

    String name;

    BigDecimal requiredAmount;

    String age;

    String sex;

    List<String> specialFeatures;
}
