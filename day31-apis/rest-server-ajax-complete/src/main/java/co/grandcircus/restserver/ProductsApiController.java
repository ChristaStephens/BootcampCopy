package co.grandcircus.restserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.grandcircus.restserver.dao.ProductDao;
import co.grandcircus.restserver.entity.Product;

@RestController
public class ProductsApiController {
	
	@Autowired
	private ProductDao productDao;

	@GetMapping("/products")
	public List<Product> listProducts(
			@RequestParam(name="name", required=false) String name) {
		if (name == null || name.isEmpty()) {
			return productDao.findAll();
		} else {
			return productDao.findByName(name);
		}
	}
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return productDao.findById(id);
	}
}
