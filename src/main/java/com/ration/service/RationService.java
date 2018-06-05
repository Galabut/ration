package com.ration.service;

import com.ration.dto.RationReqParams;
import com.ration.model.AgeGroup;
import com.ration.model.Ration;
import com.ration.model.Sex;
import com.ration.repository.RationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RationService {

    private RationRepository rationRepository;

    public RationService(RationRepository rationRepository) {
        this.rationRepository = rationRepository;
    }

    public String getRation(RationReqParams params) {
        List<Ration> rations = null;
        AgeGroup group = AgeGroup.getAgeGroup(params.getAge());
        if (group != null) {
            if (params.getHealthFeature() != null) {
                rations = rationRepository.findBySexAndStartAgeIsLessThanEqualAndEndAgeIsGreaterThanEqualAndHealthFeature(
                        Sex.getSex(params.getSex()),
                        group.getStartAge(),
                        group.getEndAge(),
                        params.getHealthFeature());
            } else {
                rations = rationRepository.findAllBySexAndStartAgeAndEndAgeAndHealthFeatureIsNull(
                        Sex.getSex(params.getSex()),
                        group.getStartAge(),
                        group.getEndAge());
            }
            System.out.println(rations.size());
            return rations.toString();
        }
        return "Unknown group age";
    }

}
