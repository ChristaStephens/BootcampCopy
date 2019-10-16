package co.grandcircus.foodsorm.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.grandcircus.foodsorm.entity.Food;

// By extending JpaRepository, we automatically get all basic CRUD methods we could want.
// We don't even need to annotate this interface.
public interface FoodRepository extends JpaRepository<Food, Long> {

	// We can add specific query methods.
	// Simply by the method name, Spring knows what JPQL query to use.
	List<Food> findByNameContainingIgnoreCase(String keyword);
	
	List<Food> findByCategory(String category);
	
	// We can also specify query methods manually with HQL.
	@Query("SELECT DISTINCT category FROM Food")
	Set<String> findAllCategories();
}
