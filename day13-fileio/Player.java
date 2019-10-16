
public class Player {

	private String name;
	private int jerseyNumber;

	public Player() {
	}

	public Player(String name, int jerseyNumber) {
		super();
		this.name = name;
		this.jerseyNumber = jerseyNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jerseyNumber=" + jerseyNumber + "]";
	}

}
