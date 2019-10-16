package numberpicker;

import java.util.Scanner;

/**
 * This app lets the user select from 3 different number picking strategies.
 * Each strategy is implemented in a different class, but they all have
 * the same interface so they are interchangeable.
 */
public class NumberPickerApp {

	public static void main(String[] args) {
		NumberPicker numberPicker;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("What'll it be? sequence, random, or human?");
		String choice = scnr.nextLine();
		if (choice.startsWith("s")) {
			System.out.println("Enter a starting number.");
			int start = scnr.nextInt();
			numberPicker = new SequenceNumberPicker(start);
		} else if (choice.startsWith("r")) {
			System.out.println("Enter the minimum number.");
			int min = scnr.nextInt();
			System.out.println("Enter the minimum number.");
			int max = scnr.nextInt();
			numberPicker = new RandomNumberPicker(min, max);
		} else {
			System.out.println("You're up!");
			numberPicker = new ConsoleNumberPicker(scnr);
		}
		
		int sum = 0;
		while (sum < 100) {
			int num = numberPicker.pickNumber();
			sum += num;
			System.out.println("Picked: " + num);
			System.out.println("New sum: " + sum);
		}
		System.out.println("Goodbye.");

		scnr.close();
	}

}
