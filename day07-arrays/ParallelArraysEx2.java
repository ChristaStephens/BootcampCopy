import java.util.Scanner;

public class ParallelArraysEx2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] names = { "Mike", "Curry", "Stafford", "Joe" };
		int[] jerseys = { 23, 30, 16, 16 };
		
		// System.out.println(names[1] + " wears " + jerseys[1]);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " wears " + jerseys[i]);
		}
		
		System.out.println("Pick a person (1-4)");
		int userSelection = scnr.nextInt();
		
		// just make sure you're using same index for names and jerseys
		System.out.println(names[userSelection - 1] + " wears " + jerseys[userSelection - 1]);
		

		scnr.close();
	}
}
