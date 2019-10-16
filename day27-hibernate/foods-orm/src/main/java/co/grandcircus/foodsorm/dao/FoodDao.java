package co.grandcircus.foodsorm.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.foodsorm.entity.Food;

@Repository
// DAOs must be transactional in order to use the EntityManager to write.
// This means that a transaction is created every time a method runs here.
@Transactional
public class FoodDao {
	
	// Use this annotation to have Spring inject the Hibernate entity manager
	@PersistenceContext
	private EntityManager em;

	public List<Food> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Food", Food.class).getResultList();
	}
	
	public Food findById(Long id) {
		return em.find(Food.class, id);
	}
	
	public List<Food> findByCategory(String category) {
		// HQL queries can have named parameters, such as :regex here.
		// HQL queries use Java class and property names, not SQL table & column names.
		return em.createQuery("FROM Food WHERE category = :category", Food.class)
				.setParameter("category", category)
				.getResultList();
	}
	
	public List<Food> findByKeyword(String keyword) {
		return em.createQuery("FROM Food WHERE LOWER(name) LIKE :regex", Food.class)
				.setParameter("regex", "%" + keyword.toLowerCase() + "%")
				.getResultList();
	}
	
	public void create(Food food) {
		em.persist(food);
	}
	
	public void update(Food food) {
		em.merge(food);
	}
	
	public void delete(Long id) {
		// Deleting with Hibernate entity manager requires fetching a reference first.
		Food food = em.getReference(Food.class, id);
		em.remove(food);
	}
	
	public Set<String> findAllCategories() {
		// This query returns a list of Strings, so I give it String.class
		List<String> categoryList = em.createQuery("SELECT DISTINCT category FROM Food", String.class)
				.getResultList();
		// Convert the List to a Set.
		return new TreeSet<>(categoryList);
	}
}
