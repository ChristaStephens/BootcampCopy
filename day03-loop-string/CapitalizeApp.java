package gcdemos;

import java.util.Scanner;

public class CapitalizeApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Tell me something.");
		String phrase = scnr.nextLine();
		
		// 1. get the first letter and capitalize it.
		String firstLetter = phrase.substring(0, 1);
		firstLetter = firstLetter.toUpperCase();
		System.out.println(firstLetter);
		
		// 2. get the rest of the letters and lowercase them.
		String otherLetters = phrase.substring(1);
		otherLetters = otherLetters.toLowerCase();
		System.out.println(otherLetters);
		
		// 3. bring it back together
		System.out.println(firstLetter + otherLetters);

		scnr.close();
	}

}
