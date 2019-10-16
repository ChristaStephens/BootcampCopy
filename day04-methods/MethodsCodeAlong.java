import java.util.Scanner;

public class MethodsCodeAlong {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What the length?");
		double length = scnr.nextDouble();
		System.out.println("What the width?");
		double width = scnr.nextDouble();
		
		System.out.println("The area is: " + calcArea(length, width) );
		
		System.out.println("What's your name?");
		String yourName = scnr.nextLine();
		
		greet(yourName);
		
		scnr.close();
	}
	
	private static void greet(String name) {
		System.out.println("Hello " + name);
	}
	
	private static double calcArea(double length, double width) {
		return length * width;
	}

}
