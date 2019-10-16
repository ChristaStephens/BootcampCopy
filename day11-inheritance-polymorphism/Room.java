
public class Room extends Rectangle {

	private String name;
	
	public Room() {}
	
	public Room(String name, double length, double width) {
		super(length, width);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Room [name=" + name + "]";
	}
	
}
