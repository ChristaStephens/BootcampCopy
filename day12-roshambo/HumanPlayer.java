import java.util.Scanner;

/**
 * This player asks the user what to pick.
 */
public class HumanPlayer extends Player {

	private Scanner scnr;
	
	public HumanPlayer(Scanner scnr) {
		this(scnr, "The human");
	}
	
	public HumanPlayer(Scanner scnr, String name) {
		super(name);
		this.scnr = scnr;
	}
	
	@Override
	public Roshambo generateRoshambo() {
		System.out.println("What would you like to play Rock, Paper, or Scissors?");
		String choice = scnr.next();
		if (choice.toLowerCase().startsWith("r")) {
			return Roshambo.ROCK;
		} else if (choice.toLowerCase().startsWith("p")) {
			return Roshambo.PAPER;
		} else {
			return Roshambo.SCISSORS;
		}
	}
	
}
