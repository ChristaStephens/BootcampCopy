import java.util.Scanner;

/**
 * This program should take user input. If it's an integer, it prints the square of the number.
 * If it is not an integer it's prints "___ is not an integer." 
 */
public class DebugChallenge7 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		try {
			System.out.print("Enter something: ");
			int number = scnr.nextInt();
			System.out.println(number + " is an integer. It's square is " + (number * number) + ".");
		
		} catch (NullPointerException ex) {
			System.out.println("That's is not an integer.");
		}

		scnr.close();
	}
}
