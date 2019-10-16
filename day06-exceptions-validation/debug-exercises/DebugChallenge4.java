import java.util.Scanner;

/**
 * This program should print "DO THE THING." Then repeatedly
 * print DO THE THING as long as the user enters "yes".
 */
public class DebugChallenge4 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String input = "";
		do {
			System.out.println("DO THE THING.");
		} while (input.equals("yes"));
		System.out.println("Would you like to do the thing again?");
		input = scnr.next();
		
		System.out.println("Goodbye.");

		scnr.close();
	}
	
	private static double square(int num) {
		return num * num;
	}
}
