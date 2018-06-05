package com.ration.repository;

import com.ration.model.Ration;
import com.ration.model.Sex;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RationRepository extends JpaRepository<Ration, Long> {

    List<Ration> findBySexAndStartAgeIsLessThanEqualAndEndAgeIsGreaterThanEqualAndHealthFeature
            (Sex sex, Integer startAge, Integer endAge, String healthFeature);

    List<Ration> findAllBySexAndStartAgeAndEndAgeAndHealthFeatureIsNull
            (Sex sex, Integer startAge, Integer endAge);

}
