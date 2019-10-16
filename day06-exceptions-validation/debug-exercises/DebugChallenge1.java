import java.util.Scanner;

/**
 * This program should prompt for a name, then respond "Hello ___", filling in the provided name.
 */
public class DebugChallenge1 {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scnr.nextLine();
		greet(name);

		scnr.close();
	}
	
	private static void greet() {
		System.out.println("Hello " + name);
	}
	
}
