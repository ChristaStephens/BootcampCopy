package co.grandcircus.foodsorm.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.foodsorm.entity.Food;

public class FoodDao_CodeAlong {

	public List<Food> findAll() {
		return null;
	}
	
	public Food findById(Long id) {
		return null;
	}
	
	public List<Food> findByCategory(String category) {
		return null;
	}
	
	public List<Food> findByKeyword(String keyword) {
		return null;
//		return em.createQuery("FROM Food WHERE LOWER(name) LIKE :regex", Food.class)
//				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
//				.getResultList();
	}
	
	public void create(Food food) {
		
	}
	
	public void update(Food food) {
		
	}
	
	public void delete(Long id) {
		
	}
	
	public Set<String> findAllCategories() {
		// This query returns a list of Strings, so I give it String.class
		List<String> categoryList = null;
		// Convert the List to a Set.
		return new TreeSet<>(categoryList);
	}
}
