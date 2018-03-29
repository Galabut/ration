package com.ration.repository;

import org.springframework.data.repository.CrudRepository;

import model.Ration;

public interface RationRepository extends CrudRepository<Ration, Long> {

}
