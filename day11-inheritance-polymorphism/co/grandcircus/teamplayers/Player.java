package co.grandcircus.teamplayers;

public class Player {
	
	private String name;
	private int jersey;
	
	public void score() {
		System.out.println("Score!!!!!");
	}
	
	public Player(String name, int jersey) {
		super();
		this.name = name;
		this.jersey = jersey;
	}
	
	public Player() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersey() {
		return jersey;
	}

	public void setJersey(int jersey) {
		this.jersey = jersey;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", jersey=" + jersey + "]";
	}
	
}
