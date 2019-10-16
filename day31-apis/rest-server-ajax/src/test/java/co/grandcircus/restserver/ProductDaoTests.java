package co.grandcircus.restserver;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.grandcircus.restserver.dao.ProductDao;
import co.grandcircus.restserver.entity.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductDaoTests {
	
	@Autowired
	ProductDao productDao;

	@Test
	public void findAllReturnsResults() {
		List<Product> results = productDao.findAll();
		
		assertFalse(results.isEmpty());
		assertEquals(Product.class, results.get(0).getClass());
	}
	
//	@Test
//	public void findByIdReturnsResult() {
//		Product result = productDao.findById(1L);
//		assertNotNull(result);
//		assertEquals("LEGO Hogwarts", result.getName());
//		assertTrue(99.98 < result.getPrice() && result.getPrice() < 100.00);
//		assertEquals(true, result.getTaxable());
//	}
	
	/*@Test
	public void findByNameReturnsExactResult() {
		List<Product> results = productDao.findByName("Bread");
		
		assertEquals(1, results.size());
		assertEquals(Product.class, results.get(0).getClass());
		assertEquals("Bread", results.get(0).getName());
	}
	
	@Test
	public void findByNameReturnsPartialMatches() {
		List<Product> results = productDao.findByName("LEGO");
		
		assertEquals(1, results.size());
		assertEquals(Product.class, results.get(0).getClass());
		assertEquals("LEGO Hogwarts", results.get(0).getName());
	}
	
	@Test
	public void findByNameIgnoresCase() {
		List<Product> results = productDao.findByName("jurassic");
		
		assertEquals(1, results.size());
		assertEquals(Product.class, results.get(0).getClass());
		assertEquals("The Jurassic Park Power Wheels Jeep Wrangler", results.get(0).getName());
	}*/

}
