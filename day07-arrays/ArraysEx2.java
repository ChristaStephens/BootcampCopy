import java.util.Scanner;

public class ArraysEx2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String[] countries = new String[4];
		countries[0] = "China";
		countries[1] = "India";
		countries[2] = "USA";
		countries[3] = "Indonesia";
		
		for (int i = 0; i < countries.length; i++) {
			System.out.println("Index: " + i);
			System.out.println("Value: " + countries[i]);
		}
		
		// Enhanced for only gives you values, but is simpler
		for (String country : countries) {
			System.out.println("Value: " + country);
		}
		
		// Print array in reverse. Count down indexes from last down to 0.
		for (int i = countries.length - 1; i >= 0; i--) {
			System.out.println(countries[i]);
		}
		
		
		
		System.out.println("Pick a country (1-3)");
		int userSelection = scnr.nextInt();
		
		System.out.println( countries[ userSelection - 1 ] );
		
		
		int[] numbers = new int[4];
		numbers[0] = 1;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
		
		

		

		scnr.close();
	}
}
