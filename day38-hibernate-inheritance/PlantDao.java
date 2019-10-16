package co.grandcircus.foodsorm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.foodsorm.entity.Plant;
import co.grandcircus.foodsorm.entity.Tree;

@Repository
@Transactional
public class PlantDao {
	
	@PersistenceContext
	private EntityManager em;

	public List<Plant> findAll() {
		return em.createQuery("FROM Plant", Plant.class).getResultList();
	}
	
	public List<Tree> findTrees() {
		return em.createQuery("FROM Tree", Tree.class).getResultList();
	}
	
	public void create(Plant plant) {
		em.persist(plant);
	}

}
