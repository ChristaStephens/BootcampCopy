import java.util.Scanner;

/**
 * This program should print the square of the integer entered.
 */
public class DebugChallenge3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = scnr.nextInt();
		int answer = square(input);
		System.out.println(answer);

		scnr.close();
	}
	
	private static double square(int num) {
		return num * num;
	}
}
