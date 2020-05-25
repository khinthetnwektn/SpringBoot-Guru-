package com.test.recipeProject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.test.recipeProject.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
	
	Optional<UnitOfMeasure> findByDescription(String description);
}
