
public abstract class Player {

	private String name;
	
	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// This is how we ask the player to select what they want to play
	public abstract Roshambo generateRoshambo();
	
}
