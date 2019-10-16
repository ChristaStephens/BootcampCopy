package co.grandcircus.restserver.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.restserver.entity.Product;

@Repository
@Transactional
public class ProductDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Product> findAll() {
		return em.createQuery("FROM Product", Product.class).getResultList();
	}
	
	public List<Product> findByName(String name) {
		return em.createQuery("FROM Product WHERE lower(name) LIKE :name", Product.class)
				.setParameter("name", "%" + name.toLowerCase() + "%")
				.getResultList();
	}
	
	public Product findById(Long id) {
		return em.find(Product.class, id);
	}
}
