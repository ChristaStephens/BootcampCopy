package co.grandcircus.foodsorm.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Mark all entity classes with @Entity so that Hibernate knows about them.
@Entity
@Table(name="food_items") // name of SQL table
public class Food {
	
	// Mark the ID, and designate that it is auto-generated
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="food_id") // name of SQL column
	private Long id;
	private String name;
	// The @Column annotation can be used to adjust many things about the SQL column
	// associated with a property.
	@Column(name="cat", length=40)
	private String category;
	@Column(name="short_description")
	private String description;
	
	// With Hibernate, you'll generally want to make sure you have a no-arg constructor
	public Food() {}
	
	public Food(Long id, String name, String category, String description) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public Food(String name, String category, String description) {
		super();
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", category=" + category + ", description=" + description + "]";
	}
	
}
