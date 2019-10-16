package gcdemos;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		// Both of the below solutions loop as long as the user
		// types yes to continue.
		
		// Approach 1
		boolean shouldContinue = true;
		
		while (shouldContinue) {
			System.out.println("Hello");
			
			System.out.println("Do you want to continue?");
			String userResponse = scnr.next();
			shouldContinue = userResponse.equals("yes");
		}
		
		
		// Approach 2
		String userResponse = "yes";
		
		while (userResponse.equals("yes")) {
			System.out.println("Hello");
			
			System.out.println("Do you want to continue?");
			userResponse = scnr.next();
		}
		
		// This one asks the user first if they want to play.
//		System.out.println("Do you want to play?");
//		String userResponse = scnr.next();
//		
//		while (userResponse.equals("yes")) {
//			System.out.println("Hello");
//			
//			System.out.println("Do you want to play again?");
//			userResponse = scnr.next();
//		}
//		
//		System.out.println("Thanks for playing.");
		
		
		scnr.close();
	}

}
