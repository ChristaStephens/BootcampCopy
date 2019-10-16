package numberpicker;

import java.util.Scanner;

/**
 * This number picker returns numbers in sequence starting with
 * a specified number.
 */
public class ConsoleNumberPicker implements NumberPicker {

	private Scanner scnr;

	/**
	 * This constructor requires a scanner to be passed in.
	 * @param scanner
	 */
	public ConsoleNumberPicker(Scanner scanner) {
		this.scnr = scanner;
	}

	@Override
	public int pickNumber() {
		System.out.print("Enter a number: ");
		return scnr.nextInt();
	}

}
