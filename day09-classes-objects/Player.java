
public class Player {
	
	public String name;
	public int jerseyNumber;
	// the static keyword makes this a class variable,
	// belonging to the class rather than the objects
	public static int maxJerseyNumber = 99;
	
	// no-arg constructor
	// constructor is a method that runs when a new object is created
	public Player() {
		name = "No Name";
		jerseyNumber = 1;
	}
	
	public Player(String name, int jerseyNumber) {
		if (jerseyNumber > maxJerseyNumber) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.jerseyNumber = jerseyNumber;
	}
	
	// the static keyword makes this a class method,
	// belonging to the class rather than the objects
	public static boolean isValidJerseyNumber(int num) {
		if (num > 0 && num <= maxJerseyNumber) {
			return true;
		} else {
			return false;
		}
	}

}
