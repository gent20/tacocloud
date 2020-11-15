package spring.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import spring.tacocloud.model.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient,String> {
}