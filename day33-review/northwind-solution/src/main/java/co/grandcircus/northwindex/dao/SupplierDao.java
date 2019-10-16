package co.grandcircus.northwindex.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.northwindex.entity.Supplier;

@Repository
// DAOs must be transactional in order to use the EntityManager to write.
// This means that a transaction is created every time a method runs here.
@Transactional
public class SupplierDao {
	
	// Use this annotation to have Spring inject the Hibernate entity manager
	@PersistenceContext
	private EntityManager em;

	public List<Supplier> findAll() {
		// The SELECT clause is optional in HQL. If omitted, it's basically SELECT *.
		// When creating a a query specify the type of the results: Food.class
		return em.createQuery("FROM Supplier", Supplier.class).getResultList();
	}
}
