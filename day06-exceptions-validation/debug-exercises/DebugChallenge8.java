import java.util.Scanner;

/**
 * This program should print the cube of the integer entered.
 */
public class DebugChallenge8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = scnr.nextInt();
		int answer = cube(input);
		System.out.println(answer);

		scnr.close();
	}
	
	private static int cube(int num) {
		int answer = num * num * num;
	}
}
