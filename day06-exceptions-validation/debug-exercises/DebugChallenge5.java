import java.util.Scanner;

/**
 * This program should take a word with any casing, and return it with only the
 * first letter capitalized. For example APPLE -> Apple, debug -> Debug.
 */
public class DebugChallenge5 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String input = scnr.next();
		
		String firstLetter = input.substring(1, 1);
		String otherLetters = input.substring(2);
		
		System.out.println(firstLetter.toUpperCase() + otherLetters.toLowerCase());

		scnr.close();
	}
}
