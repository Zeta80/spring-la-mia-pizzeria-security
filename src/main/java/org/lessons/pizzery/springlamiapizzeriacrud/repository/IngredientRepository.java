package org.lessons.pizzery.springlamiapizzeriacrud.repository;

import org.lessons.pizzery.springlamiapizzeriacrud.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
}
