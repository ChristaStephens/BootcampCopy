import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		Player one = new HumanPlayer(scnr);
		Player two = new Jack();
		
		Roshambo oneChoice = one.generateRoshambo();
		Roshambo twoChoice = two.generateRoshambo();
		
		System.out.println(one.getName() + " plays " + oneChoice);
		System.out.println(two.getName() + " plays " + twoChoice);
		
		if (oneChoice.beats(twoChoice)) {
			System.out.println(one.getName() + " wins.");
		} else if (oneChoice.ties(twoChoice)) {
			System.out.println("It's a tie.");
		} else {
			System.out.println(two.getName() + " wins.");
		}

		scnr.close();
	}

}
