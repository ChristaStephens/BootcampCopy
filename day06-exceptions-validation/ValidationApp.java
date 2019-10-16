import java.util.Scanner;

public class ValidationApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int age = getInt("Please enter your age.", scnr);
		System.out.println("You picked " + age);
		
		int pets = getInt("How many pets do you have?", scnr);
		System.out.println("You picked " + pets);

		scnr.close();
	}
	
	public static int getInt(String prompt, Scanner scnr) {
		boolean isValid = false;
		int num = 0;
		
		while (!isValid) {
			System.out.println(prompt);
			if (scnr.hasNextInt()) {
				num = scnr.nextInt();
				isValid = true;
			} else {
				System.out.println("That was not a whole number. Please, try again.");
				isValid = false;
			}
			scnr.nextLine(); // clear the line for the next input
		}
		return num;
	}

}
