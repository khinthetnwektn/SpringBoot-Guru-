package com.test.recipeProject.repositories;

import org.springframework.data.repository.CrudRepository;

import com.test.recipeProject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
