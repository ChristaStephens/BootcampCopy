package day7;
import java.util.Scanner;

public class ArraysEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		// Create an array that holds 4 strings.
		String[] countries = new String[4];
		// Fill in the array, one element at a time.
		countries[0] = "China";
		countries[1] = "India";
		countries[2] = "USA";
		countries[3] = "Indonesia";
		
		System.out.println("The length of the array: " + countries.length);
		
		// Print out the array in reverse
		for (int i = countries.length - 1; i >= 0; i--) {
			System.out.println(countries[i]);
		}
		
		// Iterate and print the array element via for loop
		for (int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);
		}
		
		// Same: Iterate and print the array element via "enhanced" for loop
		for (String country : countries) {
			System.out.println(country);
		}
		
		System.out.println("Which Country would you like to see? (1-3)");
		int countryChoice = scnr.nextInt();
		
		System.out.println(countries[countryChoice - 1]);
		
		scnr.close();
	}

}
