package com.test.recipeProject.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.test.recipeProject.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Optional<Category> findByDescription(String Description);
}
