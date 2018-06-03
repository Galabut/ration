package com.ration.repository;

import com.ration.model.Ration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RationRepository extends JpaRepository<Ration, Long> {

}
