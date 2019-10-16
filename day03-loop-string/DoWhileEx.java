package gcdemos;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
				
//		 Do While Example
		String userResponse;
		
		do {
			System.out.println("Hello");
			
			System.out.println("Do you want to continue?");
			userResponse = scnr.next();
		} while (userResponse.equals("yes"));
		
		

		scnr.close();
	}

}
