import java.util.Scanner;

public class RegExEx {

	// \d{4}-\d{4}-\d{4}-\d{4}       16 digit credit card
	// https?://(www\.)?[\w\-\.]+\w  website
	// [a-zA-Z_$][\w$]*              Java identifier
	// \(\d{3}\) \d{3}-\d{4}         Phone number (313) 222-3333
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a valid Java identifier.");
		String input = scnr.nextLine();
		// .matches checks for complete match with whole string.
		//   Notice that we have to double \s.
		//                 [a-zA-Z_$][\w$]*
		if (input.matches("[a-zA-Z_$][\\w$]*")) {
			System.out.println("It's good.");
		} else {
			System.out.println("It's not good.");
		}

		scnr.close();
	}
}
