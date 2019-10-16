import java.util.Scanner;

public class DebugChallenge2 {

	private static void increase(int num) {
		return num + 1;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = scnr.nextInt();
		int bigger = increase(input);
		System.out.println(bigger);

		scnr.close();
	}
}
