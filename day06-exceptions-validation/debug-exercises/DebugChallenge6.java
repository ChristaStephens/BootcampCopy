import java.util.Scanner;

/**
 * This program should take user input. If it's an integer, it prints the square of the number.
 * If it is not an integer it's prints "___ is not an integer." 
 */
public class DebugChallenge6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter something: ");
		String input = scnr.next();
		
		int number = Integer.parseInt(input);
		System.out.println(number + " is an integer. It's square is " + (number * number) + ".");
		
		try {
		} catch (NumberFormatException ex) {
			System.out.println(input + " is not an integer.");
		}

		scnr.close();
	}
}
