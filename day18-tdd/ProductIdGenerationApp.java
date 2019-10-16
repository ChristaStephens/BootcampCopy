
public class ProductIdGenerationApp {

	public static void main(String[] apps) {
		
		// products automatically generate their own IDs
		Product product1 = new Product("Socks");
		Product product2 = new Product("T-Shirt");
		Product product3 = new Product("Jeans");
		
		System.out.println(product1.getId()); // should be 1
		System.out.println(product2.getId()); // should be 2
		System.out.println(product3.getId()); // should be 3
		// IDs don't change
		System.out.println(product2.getId()); // should still be 2
	}

}
