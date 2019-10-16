package day22;

public class Product {
	
	private int nextId = 1;
	
	private int id;
	private String name;

	public Product(String name) {
		this.name = name;
		this.id = nextId;
		nextId++;
	}

	// There is intentionally no setter for id. It cannot be changed.
	// id must be set in the constructor
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}
	
	

}
