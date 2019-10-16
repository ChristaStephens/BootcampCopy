package co.grandcircus.jdbcintro.entity;

public class Room {

	private Long id;
	private String name;
	private Integer capacity;
	private Boolean available;
	
	public Room() {
	}
	
	public Room(Long id, String name, Integer capacity, Boolean available) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.available = available;
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
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Boolean getAvailable() {
		return available;
	}
	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
}
